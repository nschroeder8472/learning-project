package com.learning.algorithms.searching;

/**
 * Exercise: Median of Two Sorted Arrays (Hard)
 *
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log(min(m,n))).
 *
 * Example 1:
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.0
 * Explanation: merged array = [1,2,3] and median is 2
 *
 * Example 2:
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.5
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
 *
 * Example 3:
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.0
 *
 * Time Complexity: O(log(min(m,n))) - binary search on smaller array
 * Space Complexity: O(1)
 */
public class ex5_MedianOfTwoSortedArrays {

    /**
     * Finds the median of two sorted arrays.
     *
     * @param nums1 First sorted array
     * @param nums2 Second sorted array
     * @return The median of the combined arrays
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // TODO: Implement median of two sorted arrays
        // Hint 1: Ensure nums1 is the smaller array (swap if necessary)
        // Hint 2: Use binary search on the smaller array to partition both arrays
        // Hint 3: Partition such that left half has (m+n+1)/2 elements
        // Hint 4: Find partition points partitionX and partitionY where:
        //         partitionX + partitionY = (m + n + 1) / 2
        // Hint 5: Check if partition is correct: maxLeftX <= minRightY && maxLeftY <= minRightX
        // Hint 6: If maxLeftX > minRightY, move partition left in nums1
        // Hint 7: If maxLeftY > minRightX, move partition right in nums1
        // Hint 8: When found, median is:
        //         - For odd total: max(maxLeftX, maxLeftY)
        //         - For even total: (max(maxLeftX, maxLeftY) + min(minRightX, minRightY)) / 2.0
        // Hint 9: Handle edge cases with Integer.MIN_VALUE and Integer.MAX_VALUE
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
