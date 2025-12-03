package com.learning.concurrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class ex2SharedStateTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSynchronizedCounter() throws InterruptedException {
        ex2SharedState.SynchronizedCounter counter = new ex2SharedState.SynchronizedCounter();

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

        assertEquals(10000, counter.getCount(), "Counter should be exactly 10000 with proper synchronization");
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testLockedCounter() throws InterruptedException {
        ex2SharedState.LockedCounter counter = new ex2SharedState.LockedCounter();

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

        assertEquals(10000, counter.getCount(), "Counter should be exactly 10000 with proper locking");
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testBankAccount() throws InterruptedException {
        ex2SharedState.BankAccount account = new ex2SharedState.BankAccount(1000.0);

        // Multiple deposits and withdrawals
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                account.deposit(10.0);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                account.withdraw(5.0);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        double expected = 1000.0 + (100 * 10.0) - (100 * 5.0);
        assertEquals(expected, account.getBalance(), 0.01);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testBankAccountTransfer() throws InterruptedException {
        ex2SharedState.BankAccount account1 = new ex2SharedState.BankAccount(1000.0);
        ex2SharedState.BankAccount account2 = new ex2SharedState.BankAccount(1000.0);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                account1.transferTo(account2, 10.0);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                account2.transferTo(account1, 10.0);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        double totalBalance = account1.getBalance() + account2.getBalance();
        assertEquals(2000.0, totalBalance, 0.01, "Total money should remain constant");
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSharedBuffer() throws InterruptedException {
        ex2SharedState.SharedBuffer<Integer> buffer = new ex2SharedState.SharedBuffer<>();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    buffer.put(i);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    Integer value = buffer.take();
                    assertEquals(i, value);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testThreadSafeSingleton() throws InterruptedException {
        ex2SharedState.ThreadSafeSingleton[] instances = new ex2SharedState.ThreadSafeSingleton[10];

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                instances[index] = ex2SharedState.ThreadSafeSingleton.getInstance();
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        // All instances should be the same object
        for (int i = 1; i < instances.length; i++) {
            assertSame(instances[0], instances[i], "Singleton should return same instance");
        }
    }
}
