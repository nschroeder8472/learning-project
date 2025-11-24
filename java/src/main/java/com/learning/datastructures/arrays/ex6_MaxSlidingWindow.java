package com.learning.datastructures.arrays;

/**
 * Exercise: Maximum Sliding Window (Hard)
 *
 * Given an array and a window size k, find the maximum element in each
 * sliding window as it moves from left to right.
 *
 * Example:
 * Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
 * Output: [3, 3, 5, 5, 6, 7]
 *
 * Explanation:
 * Window [1, 3, -1] -> max = 3
 * Window [3, -1, -3] -> max = 3
 * Window [-1, -3, 5] -> max = 5
 * Window [-3, 5, 3] -> max = 5
 * Window [5, 3, 6] -> max = 6
 * Window [3, 6, 7] -> max = 7
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */
public class ex6_MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] arr, int k) {
        // TODO: Implement this method
        // Edge cases: null array, k <= 0, k > array length
        // Hint: Use a deque to store indices of potential maximum elements
        // Maintain deque in decreasing order of values
        // Remove indices outside current window
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
