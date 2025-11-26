package com.learning.algorithms.searching;

/**
 * Exercise 3: Search in Rotated Sorted Array
 * Difficulty: Medium
 *
 * A sorted array has been rotated at an unknown pivot point. Find the index of a target element.
 * You may assume no duplicates exist in the array.
 *
 * Example:
 * Input: arr = [4, 5, 6, 7, 0, 1, 2], target = 0
 * Output: 4
 *
 * Input: arr = [4, 5, 6, 7, 0, 1, 2], target = 3
 * Output: -1
 *
 * Input: arr = [1], target = 0
 * Output: -1
 *
 * Explanation:
 * The array was originally [0, 1, 2, 4, 5, 6, 7] and was rotated at index 4.
 *
 * Time Complexity: O(log n) - modified binary search
 * Space Complexity: O(1)
 */
public class ex3_SearchRotatedArray {

    /**
     * Searches for a target in a rotated sorted array.
     *
     * @param arr the rotated sorted array
     * @param target the element to find
     * @return the index of the target element, or -1 if not found
     */
    public static int search(int[] arr, int target) {
        // TODO: Implement search in rotated sorted array
        // Hint: Use binary search, but determine which half is sorted
        // If left half is sorted (arr[left] <= arr[mid]):
        //   - Check if target is in left half range
        // Otherwise right half is sorted:
        //   - Check if target is in right half range
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Finds the index of the minimum element (rotation point).
     * This can be useful for understanding the rotation.
     *
     * @param arr the rotated sorted array
     * @return the index of the minimum element
     */
    public static int findRotationPoint(int[] arr) {
        // TODO: Optional - implement finding the rotation point
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
