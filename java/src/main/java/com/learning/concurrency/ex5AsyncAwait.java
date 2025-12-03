package com.learning.concurrency;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * Exercise 5: Async/Await Patterns (Hard)
 *
 * Master asynchronous programming with CompletableFuture.
 * This exercise covers:
 * - Async operations and composition
 * - Error handling in async code
 * - Combining multiple async operations
 * - Async retries and timeouts
 *
 * Difficulty: Hard
 * Topics: Async/Await, CompletableFuture, Error Handling
 */
public class ex5AsyncAwait {

    /**
     * Task 1: Async HTTP request simulator
     */
    public static class AsyncHttpClient {
        /**
         * Simulate an async HTTP GET request
         */
        public static CompletableFuture<String> getAsync(String url) {
            // TODO: Return a CompletableFuture that simulates fetching from URL
            // Hint: Use CompletableFuture.supplyAsync()
            // Hint: Simulate network delay (100-500ms)
            // Hint: Return "Response from: " + url
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Fetch multiple URLs in parallel and combine results
         */
        public static CompletableFuture<List<String>> getAllAsync(List<String> urls) {
            // TODO: Fetch all URLs in parallel and return combined list
            // Hint: Create a CompletableFuture for each URL
            // Hint: Use CompletableFuture.allOf()
            // Hint: Collect all results into a list
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Fetch first successful response from multiple URLs (race pattern)
         */
        public static CompletableFuture<String> getFirstAsync(List<String> urls) {
            // TODO: Return the first successful response
            // Hint: Use CompletableFuture.anyOf()
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 2: Async operations with error handling
     */
    public static class AsyncWithErrorHandling {
        /**
         * Async operation that might fail
         * Fails if input starts with "fail"
         */
        public static CompletableFuture<String> riskyOperation(String input) {
            // TODO: Return a future that fails for inputs starting with "fail"
            // Hint: Use CompletableFuture.supplyAsync()
            // Hint: Throw exception for "fail" inputs
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Handle errors gracefully with fallback value
         */
        public static CompletableFuture<String> withFallback(String input, String fallback) {
            // TODO: Call riskyOperation, return fallback on error
            // Hint: Use exceptionally() or handle()
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Retry operation on failure
         */
        public static CompletableFuture<String> withRetry(String input, int maxRetries) {
            // TODO: Retry riskyOperation up to maxRetries times
            // Hint: Use exceptionally() or handle() to check and retry
            // Hint: Keep track of retry count
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 3: Complex async workflow
     * Simulate: Login -> Fetch User Data -> Fetch User Posts -> Process Posts
     */
    public static class AsyncWorkflow {
        public static CompletableFuture<String> login(String username) {
            return CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                return "token_" + username;
            });
        }

        public static CompletableFuture<String> fetchUserData(String token) {
            return CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                return "user_data_for_" + token;
            });
        }

        public static CompletableFuture<List<String>> fetchUserPosts(String userData) {
            return CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                return Arrays.asList("post1", "post2", "post3");
            });
        }

        /**
         * Chain the entire workflow: login -> fetch data -> fetch posts
         */
        public static CompletableFuture<List<String>> executeWorkflow(String username) {
            // TODO: Chain login -> fetchUserData -> fetchUserPosts
            // Hint: Use thenCompose() for chaining futures
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 4: Parallel processing with aggregation
     */
    public static CompletableFuture<Map<String, Integer>> processDataInParallel(List<String> items) {
        // TODO: Process each item in parallel (count its length), return map
        // Hint: Create a future for each item
        // Hint: Use thenApply to create key-value pairs
        // Hint: Combine all futures and collect into a map
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 5: Async caching mechanism
     */
    public static class AsyncCache {
        private final Map<String, CompletableFuture<String>> cache = new HashMap<>();

        /**
         * Get value from cache or compute if absent
         */
        public CompletableFuture<String> get(String key) {
            // TODO: Return cached future if exists, otherwise compute
            // Hint: Use computeIfAbsent
            // Hint: Simulate expensive computation in CompletableFuture.supplyAsync()
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void clear() {
            cache.clear();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Concurrency - Exercise 5: Async/Await\n");

        // Example: Basic CompletableFuture usage
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Hello";
        }).thenApply(s -> s + " World");

        System.out.println("Result: " + future.get());

        // Example: Combining futures
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> combined = future1.thenCombine(future2, Integer::sum);
        System.out.println("Combined: " + combined.get());

        System.out.println("\nNow implement the TODO tasks!");
    }
}
