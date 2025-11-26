package com.learning.algorithms.searching;

/**
 * Exercise: Search in Rotated Sorted Array (Medium)
 *
 * A sorted array has been rotated at an unknown pivot. For example,
 * [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]. You are given a target
 * value to search. If found, return its index; otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: arr = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Example 2:
 * Input: arr = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 *
 * Example 3:
 * Input: arr = [1], target = 0
 * Output: -1
 *
 * Time Complexity: O(log n) - modified binary search
 * Space Complexity: O(1)
 */
public class ex3_SearchInRotatedSortedArray {

    /**
     * Searches for a target in a rotated sorted array.
     *
     * @param arr    The rotated sorted array
     * @param target The element to find
     * @return The index of the target if found, -1 otherwise
     */
    public int search(int[] arr, int target) {
        // TODO: Implement search in rotated sorted array
        // Hint 1: Use modified binary search with left and right pointers
        // Hint 2: At least one half (left or right) will always be sorted
        // Hint 3: Determine which half is sorted by comparing arr[left] with arr[mid]
        // Hint 4: If left half is sorted (arr[left] <= arr[mid]):
        //         - Check if target is in range [arr[left], arr[mid]]
        //         - If yes, search left half; otherwise search right half
        // Hint 5: If right half is sorted:
        //         - Check if target is in range [arr[mid+1], arr[right]]
        //         - If yes, search right half; otherwise search left half
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
