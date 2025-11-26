package com.learning.algorithms.searching;

/**
 * Exercise: Binary Search (Easy)
 *
 * Implement binary search to find the index of a target element in a sorted array.
 * Binary search works by repeatedly dividing the search interval in half. If the
 * target is less than the middle element, search the left half; otherwise search
 * the right half.
 *
 * Example:
 * Input: arr = [1, 3, 5, 7, 9, 11, 13], target = 7
 * Output: 3
 *
 * Example (not found):
 * Input: arr = [1, 3, 5, 7, 9, 11, 13], target = 6
 * Output: -1
 *
 * Time Complexity: O(log n) - eliminates half the search space each iteration
 * Space Complexity: O(1) iterative, O(log n) recursive (call stack)
 * Prerequisite: Array must be sorted
 */
public class ex2_BinarySearch {

    /**
     * Searches for a target element in a sorted array using binary search.
     *
     * @param arr    The sorted array to search
     * @param target The element to find
     * @return The index of the target if found, -1 otherwise
     */
    public int binarySearch(int[] arr, int target) {
        // TODO: Implement iterative binary search
        // Hint 1: Use two pointers - left (0) and right (arr.length - 1)
        // Hint 2: While left <= right, calculate mid = left + (right - left) / 2
        // Hint 3: If arr[mid] == target, return mid
        // Hint 4: If arr[mid] < target, search right half (left = mid + 1)
        // Hint 5: If arr[mid] > target, search left half (right = mid - 1)
        // Hint 6: Return -1 if not found
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Recursive implementation of binary search (optional).
     *
     * @param arr    The sorted array to search
     * @param target The element to find
     * @return The index of the target if found, -1 otherwise
     */
    public int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursiveHelper(arr, target, 0, arr.length - 1);
    }

    private int binarySearchRecursiveHelper(int[] arr, int target, int left, int right) {
        // TODO: Implement recursive binary search
        // Hint 1: Base case - if left > right, return -1
        // Hint 2: Calculate mid = left + (right - left) / 2
        // Hint 3: If arr[mid] == target, return mid
        // Hint 4: If arr[mid] < target, recursively search right half
        // Hint 5: If arr[mid] > target, recursively search left half
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
