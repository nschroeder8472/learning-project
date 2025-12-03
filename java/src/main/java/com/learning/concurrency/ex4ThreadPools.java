package com.learning.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Exercise 4: Thread Pools (Medium)
 *
 * Learn to use thread pools to efficiently manage concurrent tasks.
 * This exercise covers:
 * - ExecutorService and thread pools
 * - Callable and Future for returning results
 * - CompletableFuture for async operations
 * - Thread pool sizing and configuration
 *
 * Difficulty: Medium
 * Topics: Thread Pools, ExecutorService, Future, CompletableFuture
 */
public class ex4ThreadPools {

    /**
     * Task 1: Execute multiple tasks using a fixed thread pool
     *
     * @param tasks List of tasks to execute
     * @param poolSize Number of threads in the pool
     */
    public static void executeTasksWithFixedPool(List<Runnable> tasks, int poolSize)
            throws InterruptedException {
        // TODO: Create a fixed thread pool and execute all tasks
        // Hint: Use Executors.newFixedThreadPool()
        // Hint: Don't forget to shutdown the executor
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 2: Calculate sum of numbers using callable and future
     *
     * @param numbers Array of numbers to sum
     * @param numThreads Number of threads to use
     * @return Sum of all numbers
     */
    public static long parallelSumWithFuture(int[] numbers, int numThreads)
            throws InterruptedException, ExecutionException {
        // TODO: Divide array into chunks and sum using Callable/Future
        // Hint 1: Create Callable tasks that return partial sums
        // Hint 2: Use executor.submit() which returns Future
        // Hint 3: Collect futures and call future.get() to get results
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 3: Process data with CompletableFuture
     */
    public static class DataProcessor {
        /**
         * Simulate fetching data asynchronously
         */
        public static CompletableFuture<String> fetchDataAsync(String source) {
            // TODO: Return a CompletableFuture that completes after simulated delay
            // Hint: Use CompletableFuture.supplyAsync()
            // Hint: Simulate delay with Thread.sleep()
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Process data asynchronously
         */
        public static CompletableFuture<String> processDataAsync(String data) {
            // TODO: Return a CompletableFuture that processes the data
            // Hint: Transform data in some way (e.g., convert to uppercase)
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Chain async operations: fetch -> process -> save
         */
        public static CompletableFuture<String> fetchProcessAndSave(String source) {
            // TODO: Chain fetchDataAsync -> processDataAsync using thenCompose or thenApply
            // Hint: Use thenCompose for chaining futures
            // Hint: Add a final step that "saves" the result (just append " [saved]")
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 4: Fan-out/Fan-in pattern
     * Process multiple items in parallel, then combine results
     */
    public static int processAndCombine(List<Integer> items) throws InterruptedException, ExecutionException {
        // TODO: Process each item in parallel (multiply by 2), then sum all results
        // Hint: Create CompletableFuture for each item
        // Hint: Use CompletableFuture.allOf() to wait for all
        // Hint: Combine all results
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 5: Timeout handling with Future
     *
     * @param timeoutMs Maximum time to wait in milliseconds
     * @return Result if completed in time, or "TIMEOUT" if timed out
     */
    public static String executeWithTimeout(Callable<String> task, long timeoutMs) {
        // TODO: Execute task with a timeout
        // Hint: Use Future.get(timeout, TimeUnit)
        // Hint: Catch TimeoutException and return "TIMEOUT"
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 6: Cached thread pool for many short-lived tasks
     */
    public static int executeManyShortTasks(int numTasks) throws InterruptedException {
        // TODO: Execute numTasks short tasks using a cached thread pool
        // Hint: Use Executors.newCachedThreadPool()
        // Hint: Each task should just increment a thread-safe counter
        // Hint: Return the final count
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Concurrency - Exercise 4: Thread Pools\n");

        // Example: Using ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            final int value = i;
            Future<Integer> future = executor.submit(() -> {
                Thread.sleep(100);
                return value * value;
            });
            futures.add(future);
        }

        System.out.println("Squares:");
        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("\nNow implement the TODO tasks!");
    }
}
