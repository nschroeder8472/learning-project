package com.learning.datastructures.arrays;

/**
 * Exercise: Reverse Array (Easy)
 *
 * Reverse an array in-place (without using extra space for another array).
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ex2_ReverseArray {

    public void reverse(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
