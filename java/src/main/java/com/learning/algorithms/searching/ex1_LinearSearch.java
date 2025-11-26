package com.learning.algorithms.searching;

/**
 * Exercise 1: Linear Search
 * Difficulty: Easy
 *
 * Implement linear search to find the index of a target element in an array.
 * Linear search checks each element sequentially until the target is found or
 * the array is exhausted.
 *
 * Example:
 * Input: arr = [5, 2, 8, 1, 9], target = 8
 * Output: 2
 *
 * Input: arr = [5, 2, 8, 1, 9], target = 7
 * Output: -1
 *
 * Time Complexity: O(n) - must potentially check every element
 * Space Complexity: O(1) - only uses a constant amount of extra space
 */
public class ex1_LinearSearch {

    /**
     * Performs linear search on the array to find the target element.
     *
     * @param arr the array to search
     * @param target the element to find
     * @return the index of the target element, or -1 if not found
     */
    public static int linearSearch(int[] arr, int target) {
        // TODO: Implement linear search
        // Hint: Iterate through the array and check each element
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Alternative signature that searches within a specific range.
     *
     * @param arr the array to search
     * @param target the element to find
     * @param start the starting index (inclusive)
     * @param end the ending index (exclusive)
     * @return the index of the target element, or -1 if not found
     */
    public static int linearSearch(int[] arr, int target, int start, int end) {
        // TODO: Implement ranged linear search
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
