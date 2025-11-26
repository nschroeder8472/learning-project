package com.learning.algorithms.searching;

/**
 * Exercise 4: Find Peak Element
 * Difficulty: Medium
 *
 * A peak element is an element that is strictly greater than its neighbors.
 * Given an array, find the index of any peak element.
 * You may assume that arr[-1] = arr[n] = -∞.
 *
 * Example:
 * Input: arr = [1, 2, 3, 1]
 * Output: 2 (element 3 is a peak)
 *
 * Input: arr = [1, 2, 1, 3, 5, 6, 4]
 * Output: 5 (element 6 is a peak) or 1 (element 2 is also a peak)
 *
 * Note: If there are multiple peaks, you can return any of them.
 *
 * Time Complexity: O(log n) - using binary search approach
 * Space Complexity: O(1)
 */
public class ex4_FindPeakElement {

    /**
     * Finds the index of a peak element using binary search.
     *
     * @param arr the input array
     * @return the index of any peak element
     */
    public static int findPeakElement(int[] arr) {
        // TODO: Implement peak element finder
        // Hint: Use binary search logic
        // If arr[mid] < arr[mid + 1], peak must be on the right
        // Otherwise, peak must be on the left (or mid itself)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Linear search approach to find a peak (for comparison).
     *
     * @param arr the input array
     * @return the index of any peak element
     */
    public static int findPeakLinear(int[] arr) {
        // TODO: Optional - implement linear O(n) solution for comparison
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
