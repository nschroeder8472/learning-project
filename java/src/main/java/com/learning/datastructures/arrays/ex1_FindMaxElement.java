package com.learning.datastructures.arrays;

/**
 * Exercise: Find Maximum Element (Easy)
 *
 * Given an array of integers, find and return the maximum element.
 *
 * Example:
 * Input: [3, 7, 2, 9, 1]
 * Output: 9
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ex1_FindMaxElement {

    public int findMax(int[] arr) {
        // TODO: Implement this method
        // Edge case: handle empty or null array
        // Hint: Keep track of the maximum value seen so far while iterating
        if(arr == null || arr.length == 0)
            throw new RuntimeException("array is null or empty");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}