package com.learning.bigoanalysis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class ex6OptimizeCodeTest {

    @Test
    void testHasDuplicatesOptimized() {
        assertTrue(ex6OptimizeCode.hasDuplicatesOptimized(new int[]{1, 2, 3, 1}));
        assertFalse(ex6OptimizeCode.hasDuplicatesOptimized(new int[]{1, 2, 3, 4}));
        assertEquals("O(n)", ex6OptimizeCode.getComplexityHasDuplicates());
    }

    @Test
    void testTwoSumOptimized() {
        int[] result = ex6OptimizeCode.twoSumOptimized(new int[]{2, 7, 11, 15}, 9);
        assertTrue((result[0] == 0 && result[1] == 1) || (result[0] == 1 && result[1] == 0));

        int[] result2 = ex6OptimizeCode.twoSumOptimized(new int[]{3, 2, 4}, 6);
        assertTrue((result2[0] == 1 && result2[1] == 2) || (result2[0] == 2 && result2[1] == 1));

        assertEquals("O(n)", ex6OptimizeCode.getComplexityTwoSum());
    }

    @Test
    void testFirstNonRepeatingOptimized() {
        assertEquals('b', ex6OptimizeCode.firstNonRepeatingOptimized("aabbc"));
        assertEquals('h', ex6OptimizeCode.firstNonRepeatingOptimized("hello"));
        assertEquals('\0', ex6OptimizeCode.firstNonRepeatingOptimized("aabbcc"));
        assertEquals("O(n)", ex6OptimizeCode.getComplexityFirstNonRepeating());
    }

    @Test
    void testFindCommonOptimized() {
        List<Integer> result = ex6OptimizeCode.findCommonOptimized(
            new int[]{1, 2, 3, 4, 5},
            new int[]{3, 4, 5, 6, 7}
        );
        assertEquals(List.of(3, 4, 5), result);

        List<Integer> result2 = ex6OptimizeCode.findCommonOptimized(
            new int[]{1, 3, 5},
            new int[]{2, 4, 6}
        );
        assertTrue(result2.isEmpty());

        assertEquals("O(n + m)", ex6OptimizeCode.getComplexityFindCommon());
    }

    @Test
    void testFibonacciOptimized() {
        assertEquals(0, ex6OptimizeCode.fibonacciOptimized(0));
        assertEquals(1, ex6OptimizeCode.fibonacciOptimized(1));
        assertEquals(1, ex6OptimizeCode.fibonacciOptimized(2));
        assertEquals(2, ex6OptimizeCode.fibonacciOptimized(3));
        assertEquals(5, ex6OptimizeCode.fibonacciOptimized(5));
        assertEquals(55, ex6OptimizeCode.fibonacciOptimized(10));
        assertEquals("O(n)", ex6OptimizeCode.getComplexityFibonacci());
    }

    @Test
    void testMaxSubarraySumOptimized() {
        assertEquals(6, ex6OptimizeCode.maxSubarraySumOptimized(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, ex6OptimizeCode.maxSubarraySumOptimized(new int[]{1}));
        assertEquals(23, ex6OptimizeCode.maxSubarraySumOptimized(new int[]{5, 4, -1, 7, 8}));
        assertEquals("O(n)", ex6OptimizeCode.getComplexityMaxSubarraySum());
    }
}
