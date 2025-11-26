package com.learning.algorithms.searching;

/**
 * Exercise 5: Median of Two Sorted Arrays
 * Difficulty: Hard
 *
 * Given two sorted arrays, find the median of the combined sorted array.
 * The overall run time complexity should be O(log(min(m, n))).
 *
 * Example 1:
 * Input: nums1 = [1, 3], nums2 = [2]
 * Output: 2.0
 * Explanation: merged array = [1, 2, 3], median = 2
 *
 * Example 2:
 * Input: nums1 = [1, 2], nums2 = [3, 4]
 * Output: 2.5
 * Explanation: merged array = [1, 2, 3, 4], median = (2 + 3) / 2 = 2.5
 *
 * Example 3:
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.0
 *
 * Time Complexity: O(log(min(m, n))) - binary search on smaller array
 * Space Complexity: O(1)
 */
public class ex5_MedianTwoArrays {

    /**
     * Finds the median of two sorted arrays.
     *
     * @param nums1 the first sorted array
     * @param nums2 the second sorted array
     * @return the median of the combined arrays
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO: Implement median finder using binary search
        // Hint: Perform binary search on the smaller array
        // Goal: Partition both arrays such that:
        //   1. Left partition has same number of elements as right partition
        //   2. All elements in left partition <= all elements in right partition
        //
        // For partition at position i in nums1 and j in nums2:
        //   j = (m + n + 1) / 2 - i
        //
        // Valid partition when:
        //   nums1[i-1] <= nums2[j] && nums2[j-1] <= nums1[i]
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Naive approach: merge arrays and find median (for comparison).
     * Time: O(m + n), Space: O(m + n)
     *
     * @param nums1 the first sorted array
     * @param nums2 the second sorted array
     * @return the median of the combined arrays
     */
    public static double findMedianNaive(int[] nums1, int[] nums2) {
        // TODO: Optional - implement naive O(m+n) solution for comparison
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
