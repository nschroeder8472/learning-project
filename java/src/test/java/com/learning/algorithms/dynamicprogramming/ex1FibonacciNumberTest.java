package com.learning.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Fibonacci Number implementation.
 */
public class ex1FibonacciNumberTest {

    @Test
    public void testFibBaseCase0() {
        assertEquals(0, ex1_FibonacciNumber.fibTabulation(0));
        assertEquals(0, ex1_FibonacciNumber.fibMemoization(0));
        assertEquals(0, ex1_FibonacciNumber.fibOptimized(0));
    }

    @Test
    public void testFibBaseCase1() {
        assertEquals(1, ex1_FibonacciNumber.fibTabulation(1));
        assertEquals(1, ex1_FibonacciNumber.fibMemoization(1));
        assertEquals(1, ex1_FibonacciNumber.fibOptimized(1));
    }

    @Test
    public void testFibSmallNumbers() {
        assertEquals(1, ex1_FibonacciNumber.fibTabulation(2));
        assertEquals(2, ex1_FibonacciNumber.fibTabulation(3));
        assertEquals(3, ex1_FibonacciNumber.fibTabulation(4));
        assertEquals(5, ex1_FibonacciNumber.fibTabulation(5));
    }

    @Test
    public void testFibMediumNumbers() {
        assertEquals(55, ex1_FibonacciNumber.fibMemoization(10));
        assertEquals(6765, ex1_FibonacciNumber.fibMemoization(20));
    }

    @Test
    public void testFibConsistency() {
        // All methods should give same results
        for (int i = 0; i <= 15; i++) {
            long memo = ex1_FibonacciNumber.fibMemoization(i);
            long tab = ex1_FibonacciNumber.fibTabulation(i);
            long opt = ex1_FibonacciNumber.fibOptimized(i);
            assertEquals(memo, tab);
            assertEquals(tab, opt);
        }
    }

    @Test
    public void testFibLargeNumber() {
        // Test with larger number (memoization and tabulation should handle this)
        assertEquals(832040, ex1_FibonacciNumber.fibTabulation(30));
    }

    @Test
    public void testFibRecursiveSmall() {
        // Only test recursive with small numbers (exponential time!)
        assertEquals(0, ex1_FibonacciNumber.fibRecursive(0));
        assertEquals(1, ex1_FibonacciNumber.fibRecursive(1));
        assertEquals(5, ex1_FibonacciNumber.fibRecursive(5));
    }

    @Test
    public void testFibOptimizedSpace() {
        // Optimized version should handle larger numbers efficiently
        assertEquals(102334155, ex1_FibonacciNumber.fibOptimized(40));
    }
}
