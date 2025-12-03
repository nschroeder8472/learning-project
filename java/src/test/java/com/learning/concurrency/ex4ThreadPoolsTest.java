package com.learning.concurrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.concurrent.*;
import static org.junit.jupiter.api.Assertions.*;

class ex4ThreadPoolsTest {

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testExecuteTasksWithFixedPool() throws InterruptedException {
        List<Runnable> tasks = new ArrayList<>();
        Set<String> threadNames = Collections.synchronizedSet(new HashSet<>());

        for (int i = 0; i < 20; i++) {
            tasks.add(() -> threadNames.add(Thread.currentThread().getName()));
        }

        ex4ThreadPools.executeTasksWithFixedPool(tasks, 4);

        // With 4 threads, we should see at most 4 different thread names
        assertTrue(threadNames.size() <= 4, "Should use at most 4 threads");
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testParallelSumWithFuture() throws InterruptedException, ExecutionException {
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        long expectedSum = 1000L * 1001 / 2;

        long result = ex4ThreadPools.parallelSumWithFuture(numbers, 4);
        assertEquals(expectedSum, result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testFetchDataAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = ex4ThreadPools.DataProcessor.fetchDataAsync("test-source");
        String result = future.get();
        assertNotNull(result);
        assertTrue(result.contains("test-source"));
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testFetchProcessAndSave() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = ex4ThreadPools.DataProcessor.fetchProcessAndSave("data");
        String result = future.get();
        assertNotNull(result);
        assertTrue(result.contains("[saved]") || result.contains("saved"));
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testProcessAndCombine() throws InterruptedException, ExecutionException {
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5);
        int result = ex4ThreadPools.processAndCombine(items);
        // Each multiplied by 2: 2, 4, 6, 8, 10 = 30
        assertEquals(30, result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testExecuteWithTimeout() {
        // Fast task should complete
        Callable<String> fastTask = () -> {
            Thread.sleep(100);
            return "DONE";
        };
        String result1 = ex4ThreadPools.executeWithTimeout(fastTask, 1000);
        assertEquals("DONE", result1);

        // Slow task should timeout
        Callable<String> slowTask = () -> {
            Thread.sleep(2000);
            return "DONE";
        };
        String result2 = ex4ThreadPools.executeWithTimeout(slowTask, 100);
        assertEquals("TIMEOUT", result2);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testExecuteManyShortTasks() throws InterruptedException {
        int result = ex4ThreadPools.executeManyShortTasks(1000);
        assertEquals(1000, result, "Should execute all 1000 tasks");
    }
}
