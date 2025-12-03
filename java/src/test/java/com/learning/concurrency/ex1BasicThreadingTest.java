package com.learning.concurrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class ex1BasicThreadingTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testNumberPrinterThread() throws InterruptedException {
        ex1BasicThreading.NumberPrinterThread thread = new ex1BasicThreading.NumberPrinterThread();
        thread.start();
        thread.join();
        // Thread should complete without errors
        assertFalse(thread.isAlive());
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testCountdownTask() throws InterruptedException {
        ex1BasicThreading.CountdownTask task = new ex1BasicThreading.CountdownTask(5);
        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        assertFalse(thread.isAlive());
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testRunParallelThreads() throws InterruptedException {
        List<String> threadNames = ex1BasicThreading.runParallelThreads(3);
        assertEquals(3, threadNames.size(), "Should return 3 thread names");
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testParallelSum() throws InterruptedException {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        long expected = 1000L * 1001 / 2; // Sum of 1 to 1000

        long result = ex1BasicThreading.parallelSum(arr, 4);
        assertEquals(expected, result, "Parallel sum should match sequential sum");
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testParallelSumSingleThread() throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5};
        long result = ex1BasicThreading.parallelSum(arr, 1);
        assertEquals(15, result);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testWorkerThread() throws InterruptedException {
        List<Runnable> tasks = List.of(
            () -> System.out.println("Task 1"),
            () -> System.out.println("Task 2"),
            () -> System.out.println("Task 3")
        );

        ex1BasicThreading.WorkerThread worker = new ex1BasicThreading.WorkerThread(tasks);
        worker.start();
        Thread.sleep(100); // Give it time to process
        worker.shutdown();
        worker.join(1000); // Wait up to 1 second
        assertFalse(worker.isAlive(), "Worker should terminate after shutdown");
    }
}
