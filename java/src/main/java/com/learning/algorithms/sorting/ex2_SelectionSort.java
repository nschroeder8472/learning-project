package com.learning.algorithms.sorting;

/**
 * Exercise: Selection Sort (Easy)
 *
 * Implement the selection sort algorithm to sort an array of integers in ascending order.
 * Selection sort works by repeatedly finding the minimum element from the unsorted portion
 * and moving it to the beginning. The algorithm divides the array into sorted and unsorted
 * portions, growing the sorted portion by one element in each iteration.
 *
 * Example:
 * Input: [64, 25, 12, 22, 11]
 * Output: [11, 12, 22, 25, 64]
 *
 * Example (already sorted):
 * Input: [1, 2, 3, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 *
 * Time Complexity: O(n²) for all cases (best, average, worst)
 * Space Complexity: O(1) - sorts in place
 * Stability: No - may change relative order of equal elements
 */
public class ex2_SelectionSort {

    /**
     * Sorts an array using the selection sort algorithm.
     *
     * @param arr The array to be sorted (modified in place)
     */
    public void selectionSort(int[] arr) {
        // TODO: Implement selection sort
        // Hint 1: Outer loop tracks the boundary between sorted and unsorted portions
        // Hint 2: For each position i, find the minimum element in arr[i..n-1]
        // Hint 3: Swap the minimum element with arr[i]
        // Hint 4: After each iteration, one more element is in its final sorted position
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
