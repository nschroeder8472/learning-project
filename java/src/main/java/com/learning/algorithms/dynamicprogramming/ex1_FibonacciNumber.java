package com.learning.algorithms.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 1: Fibonacci Number
 * Difficulty: Easy
 *
 * Calculate the nth Fibonacci number using dynamic programming.
 * The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2) for n > 1
 *
 * Example:
 * Input: n = 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3
 *
 * Input: n = 10
 * Output: 55
 *
 * Time Complexity:
 * - Naive recursion: O(2^n)
 * - Memoization: O(n)
 * - Tabulation: O(n)
 * - Space-optimized: O(1)
 *
 * Space Complexity:
 * - Memoization: O(n) for call stack + memo
 * - Tabulation: O(n) for array
 * - Space-optimized: O(1)
 */
public class ex1_FibonacciNumber {

    /**
     * Naive recursive approach (exponential time - DO NOT USE for large n).
     *
     * @param n the index in Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static long fibRecursive(int n) {
        // TODO: Implement naive recursive solution
        // Base cases: if n == 0 return 0, if n == 1 return 1
        // Recursive case: return fib(n-1) + fib(n-2)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Top-down approach with memoization.
     *
     * @param n the index in Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static long fibMemoization(int n) {
        Map<Integer, Long> memo = new HashMap<>();
        return fibMemoHelper(n, memo);
    }

    private static long fibMemoHelper(int n, Map<Integer, Long> memo) {
        // TODO: Implement memoization approach
        // Check if result is in memo
        // If not, compute recursively and store in memo
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Bottom-up approach with tabulation.
     *
     * @param n the index in Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static long fibTabulation(int n) {
        // TODO: Implement tabulation approach
        // Create array dp of size n+1
        // Initialize base cases: dp[0] = 0, dp[1] = 1
        // Fill array: dp[i] = dp[i-1] + dp[i-2]
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Space-optimized approach (only keep last two values).
     *
     * @param n the index in Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static long fibOptimized(int n) {
        // TODO: Implement space-optimized approach
        // Only need to track previous two values
        // Use two variables instead of array
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
