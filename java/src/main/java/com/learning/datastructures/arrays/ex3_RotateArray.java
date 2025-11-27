package com.learning.datastructures.arrays;

import java.util.Arrays;

/**
 * Exercise: Rotate Array (Medium)
 *
 * Rotate an array to the right by k positions.
 *
 * Example:
 * Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
 * Output: [5, 6, 7, 1, 2, 3, 4]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ex3_RotateArray {

    public void rotate(int[] arr, int k) {
        if (arr == null || arr.length == 0)
            return;

        k = k % arr.length;

        if (k == 0)
            return;

        System.out.println(Arrays.toString(arr));

        reverseArraySegment(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        reverseArraySegment(arr, 0, k - 1);
        System.out.println(Arrays.toString(arr));

        reverseArraySegment(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private void reverseArraySegment(int[] arr, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
