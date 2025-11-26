package com.learning.algorithms.sorting;

/**
 * Exercise: Merge Sort (Medium)
 *
 * Implement the merge sort algorithm to sort an array of integers in ascending order.
 * Merge sort is a divide-and-conquer algorithm that recursively divides the array into
 * two halves, sorts each half, and then merges them back together.
 *
 * Example:
 * Input: [38, 27, 43, 3, 9, 82, 10]
 * Output: [3, 9, 10, 27, 38, 43, 82]
 *
 * Example (already sorted):
 * Input: [1, 2, 3, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 *
 * Time Complexity: O(n log n) for all cases (best, average, worst)
 * Space Complexity: O(n) - requires auxiliary array for merging
 * Stability: Yes - maintains relative order of equal elements
 */
public class ex3_MergeSort {

    /**
     * Sorts an array using the merge sort algorithm.
     *
     * @param arr The array to be sorted (modified in place)
     */
    public void mergeSort(int[] arr) {
        // TODO: Implement merge sort
        // Hint 1: Use a helper method that takes left and right indices
        // Hint 2: Base case - if left >= right, return (single element or empty)
        // Hint 3: Find the middle point and recursively sort left and right halves
        // Hint 4: Merge the two sorted halves using a merge helper method
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method to recursively sort a portion of the array.
     *
     * @param arr   The array to sort
     * @param left  Starting index
     * @param right Ending index
     */
    private void mergeSortHelper(int[] arr, int left, int right) {
        // TODO: Implement recursive merge sort logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Merges two sorted subarrays arr[left..mid] and arr[mid+1..right].
     *
     * @param arr   The array containing both subarrays
     * @param left  Starting index of left subarray
     * @param mid   Ending index of left subarray
     * @param right Ending index of right subarray
     */
    private void merge(int[] arr, int left, int mid, int right) {
        // TODO: Implement merge logic
        // Hint 1: Create temporary arrays for left and right halves
        // Hint 2: Copy data to temporary arrays
        // Hint 3: Merge temporary arrays back into arr[left..right]
        // Hint 4: Use three pointers - one for left array, one for right, one for main array
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
