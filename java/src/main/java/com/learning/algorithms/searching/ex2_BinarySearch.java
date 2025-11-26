package com.learning.algorithms.searching;

/**
 * Exercise 2: Binary Search
 * Difficulty: Easy
 *
 * Implement binary search to find the index of a target element in a sorted array.
 * Binary search works by repeatedly dividing the search interval in half.
 *
 * Example:
 * Input: arr = [1, 3, 5, 7, 9, 11], target = 7
 * Output: 3
 *
 * Input: arr = [1, 3, 5, 7, 9, 11], target = 4
 * Output: -1
 *
 * Time Complexity: O(log n) - eliminates half of elements each iteration
 * Space Complexity: O(1) iterative, O(log n) recursive due to call stack
 *
 * Prerequisites: Array must be sorted in ascending order
 */
public class ex2_BinarySearch {

    /**
     * Performs iterative binary search on a sorted array.
     *
     * @param arr the sorted array to search
     * @param target the element to find
     * @return the index of the target element, or -1 if not found
     */
    public static int binarySearchIterative(int[] arr, int target) {
        // TODO: Implement iterative binary search
        // Hint: Use two pointers (left and right)
        // Compare middle element with target
        // Adjust pointers based on comparison
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Performs recursive binary search on a sorted array.
     *
     * @param arr the sorted array to search
     * @param target the element to find
     * @return the index of the target element, or -1 if not found
     */
    public static int binarySearchRecursive(int[] arr, int target) {
        // TODO: Implement recursive binary search
        // Hint: Call a helper method with left and right indices
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method for recursive binary search.
     *
     * @param arr the sorted array to search
     * @param target the element to find
     * @param left the left boundary index (inclusive)
     * @param right the right boundary index (inclusive)
     * @return the index of the target element, or -1 if not found
     */
    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        // TODO: Implement recursive helper
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
