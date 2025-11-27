package com.learning.datastructures.arrays;

import java.util.Arrays;

/**
 * Exercise: Remove Duplicates from Sorted Array (Medium)
 *
 * Given a sorted array, remove duplicates in-place and return the new length.
 * The first 'newLength' elements should contain unique values.
 *
 * Example:
 * Input: [1, 1, 2, 2, 3, 4, 4, 5]
 * Output: 5 (array becomes [1, 2, 3, 4, 5, ...])
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ex4_RemoveDuplicates {

    public int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        if (arr.length == 1)
            return 1;

        int writeIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
