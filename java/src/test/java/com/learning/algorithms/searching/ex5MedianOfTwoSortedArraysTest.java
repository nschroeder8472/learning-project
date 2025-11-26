package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex5MedianOfTwoSortedArraysTest {

    private ex5_MedianOfTwoSortedArrays searcher;
    private static final double DELTA = 0.00001;

    @BeforeEach
    void setUp() {
        searcher = new ex5_MedianOfTwoSortedArrays();
    }

    @Test
    void testOddLengthCombined() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    void testEvenLengthCombined() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        assertEquals(2.5, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    void testFirstArrayEmpty() {
        int[] nums1 = {};
        int[] nums2 = {1};
        assertEquals(1.0, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    void testSecondArrayEmpty() {
        int[] nums1 = {2};
        int[] nums2 = {};
        assertEquals(2.0, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    void testBothArraysSingleElement() {
        int[] nums1 = {1};
        int[] nums2 = {2};
        assertEquals(1.5, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    void testDifferentSizes() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 7, 9, 10};
        assertEquals(5.0, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    void testNoOverlap() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 5};
        assertEquals(3.0, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums1 = {-5, -3, -1};
        int[] nums2 = {-4, -2};
        assertEquals(-3.0, searcher.findMedianSortedArrays(nums1, nums2), DELTA);
    }
}
