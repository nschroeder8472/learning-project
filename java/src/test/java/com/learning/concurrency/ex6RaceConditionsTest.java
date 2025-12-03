package com.learning.concurrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class ex6RaceConditionsTest {

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testAtomicCounter() throws InterruptedException {
        ex6RaceConditions.AtomicCounter counter = new ex6RaceConditions.AtomicCounter();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(10000, counter.getCount(), "Atomic counter should be exactly 10000");
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testLazyInitializer() throws InterruptedException {
        ex6RaceConditions.LazyInitializer initializer = new ex6RaceConditions.LazyInitializer();
        String[] resources = new String[10];

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                resources[index] = initializer.getResourceFixed();
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        // All should get the same resource instance
        for (int i = 1; i < resources.length; i++) {
            assertEquals(resources[0], resources[i], "Should get same resource instance");
        }
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testReadWriteCache() throws InterruptedException {
        ex6RaceConditions.ReadWriteCache cache = new ex6RaceConditions.ReadWriteCache();

        // Multiple readers in parallel
        Thread[] readers = new Thread[5];
        for (int i = 0; i < readers.length; i++) {
            readers[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    cache.read();
                }
            });
            readers[i].start();
        }

        // One writer
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                cache.write("data" + i);
            }
        });
        writer.start();

        for (Thread reader : readers) {
            reader.join();
        }
        writer.join();

        // Should complete without deadlock
        assertNotNull(cache.read());
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testDeadlockFree() throws InterruptedException {
        ex6RaceConditions.DeadlockFree obj = new ex6RaceConditions.DeadlockFree();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                obj.method1();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                obj.method2();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Should complete without deadlock
        assertTrue(true);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testVisibilityFixed() throws InterruptedException {
        ex6RaceConditions.VisibilityFixed obj = new ex6RaceConditions.VisibilityFixed();

        Thread writer = new Thread(obj::writer);
        Thread reader = new Thread(() -> {
            int value = obj.reader();
            assertEquals(42, value, "Reader should see written value");
        });

        writer.start();
        reader.start();
        writer.join();
        reader.join();
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testThreadSafeList() throws InterruptedException {
        ex6RaceConditions.ThreadSafeList list = new ex6RaceConditions.ThreadSafeList();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    list.addIfNotPresentFixed(j);
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        assertEquals(100, list.size(), "List should contain exactly 100 unique items");
    }
}
