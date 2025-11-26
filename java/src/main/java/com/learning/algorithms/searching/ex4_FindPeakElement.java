package com.learning.algorithms.searching;

/**
 * Exercise: Find Peak Element (Medium)
 *
 * A peak element is an element that is strictly greater than its neighbors.
 * Given an integer array, find a peak element and return its index.
 * If the array contains multiple peaks, return the index of any one of them.
 *
 * You may assume arr[-1] = arr[n] = -∞ (elements outside bounds are negative infinity).
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: arr = [1,2,3,1]
 * Output: 2 (element 3 is a peak)
 *
 * Example 2:
 * Input: arr = [1,2,1,3,5,6,4]
 * Output: 5 (element 6 is a peak, though element 2 is also a peak)
 *
 * Example 3:
 * Input: arr = [1]
 * Output: 0
 *
 * Time Complexity: O(log n) - binary search approach
 * Space Complexity: O(1)
 */
public class ex4_FindPeakElement {

    /**
     * Finds a peak element in the array.
     *
     * @param arr The array to search
     * @return The index of a peak element
     */
    public int findPeakElement(int[] arr) {
        // TODO: Implement find peak element
        // Hint 1: Use binary search with left and right pointers
        // Hint 2: Compare arr[mid] with arr[mid + 1]
        // Hint 3: If arr[mid] < arr[mid + 1], peak must be on the right (left = mid + 1)
        // Hint 4: Otherwise, peak must be on the left or at mid (right = mid)
        // Hint 5: When left == right, we've found a peak
        // Hint 6: Handle edge case of single element
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
