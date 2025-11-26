package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Median of Two Sorted Arrays.
 */
public class ex5MedianTwoArraysTest {

    private static final double DELTA = 0.00001;

    @Test
    public void testOddTotalLength() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testEvenTotalLength() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        assertEquals(2.5, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testFirstArrayEmpty() {
        int[] nums1 = {};
        int[] nums2 = {1};
        assertEquals(1.0, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testSecondArrayEmpty() {
        int[] nums1 = {2};
        int[] nums2 = {};
        assertEquals(2.0, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testBothArraysSingleElement() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        assertEquals(1.5, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testDifferentSizes() {
        int[] nums1 = {1, 3, 5, 7, 9};
        int[] nums2 = {2, 4, 6};
        // Merged: [1, 2, 3, 4, 5, 6, 7, 9]
        assertEquals(4.5, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testNoOverlap() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        // Merged: [1, 2, 3, 4, 5, 6]
        assertEquals(3.5, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testCompleteOverlap() {
        int[] nums1 = {1, 2};
        int[] nums2 = {1, 2};
        // Merged: [1, 1, 2, 2]
        assertEquals(1.5, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums1 = {-5, -3, -1};
        int[] nums2 = {-4, -2, 0};
        // Merged: [-5, -4, -3, -2, -1, 0]
        assertEquals(-2.5, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testLargeArrays() {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // Merged: [1..20], median = (10 + 11) / 2 = 10.5
        assertEquals(10.5, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    public void testOneElementInFirstArray() {
        int[] nums1 = {3};
        int[] nums2 = {1, 2, 4, 5};
        // Merged: [1, 2, 3, 4, 5]
        assertEquals(3.0, ex5_MedianTwoArrays.findMedianSortedArrays(nums1, nums2), DELTA);
    }
}
