package com.learning.concurrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.concurrent.*;
import static org.junit.jupiter.api.Assertions.*;

class ex5AsyncAwaitTest {

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testGetAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = ex5AsyncAwait.AsyncHttpClient.getAsync("http://example.com");
        String result = future.get();
        assertTrue(result.contains("example.com"));
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testGetAllAsync() throws ExecutionException, InterruptedException {
        List<String> urls = Arrays.asList("url1", "url2", "url3");
        CompletableFuture<List<String>> future = ex5AsyncAwait.AsyncHttpClient.getAllAsync(urls);
        List<String> results = future.get();
        assertEquals(3, results.size());
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testGetFirstAsync() throws ExecutionException, InterruptedException {
        List<String> urls = Arrays.asList("url1", "url2", "url3");
        CompletableFuture<String> future = ex5AsyncAwait.AsyncHttpClient.getFirstAsync(urls);
        String result = future.get();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testRiskyOperation() {
        // Should succeed for normal input
        assertDoesNotThrow(() -> {
            ex5AsyncAwait.AsyncWithErrorHandling.riskyOperation("success").get();
        });

        // Should fail for "fail" input
        assertThrows(ExecutionException.class, () -> {
            ex5AsyncAwait.AsyncWithErrorHandling.riskyOperation("fail").get();
        });
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testWithFallback() throws ExecutionException, InterruptedException {
        String result = ex5AsyncAwait.AsyncWithErrorHandling.withFallback("fail", "fallback-value").get();
        assertEquals("fallback-value", result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testExecuteWorkflow() throws ExecutionException, InterruptedException {
        CompletableFuture<List<String>> future = ex5AsyncAwait.AsyncWorkflow.executeWorkflow("testuser");
        List<String> posts = future.get();
        assertEquals(3, posts.size());
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testProcessDataInParallel() throws ExecutionException, InterruptedException {
        List<String> items = Arrays.asList("hello", "world", "test");
        CompletableFuture<Map<String, Integer>> future = ex5AsyncAwait.processDataInParallel(items);
        Map<String, Integer> result = future.get();
        assertEquals(5, result.get("hello"));
        assertEquals(5, result.get("world"));
        assertEquals(4, result.get("test"));
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testAsyncCache() throws ExecutionException, InterruptedException {
        ex5AsyncAwait.AsyncCache cache = new ex5AsyncAwait.AsyncCache();

        long start1 = System.currentTimeMillis();
        String result1 = cache.get("key1").get();
        long time1 = System.currentTimeMillis() - start1;

        long start2 = System.currentTimeMillis();
        String result2 = cache.get("key1").get();
        long time2 = System.currentTimeMillis() - start2;

        assertEquals(result1, result2);
        assertTrue(time2 < time1 / 2, "Cached retrieval should be much faster");
    }
}
