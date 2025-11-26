package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Search in Rotated Sorted Array.
 */
public class ex3SearchRotatedArrayTest {

    @Test
    public void testElementFound() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, ex3_SearchRotatedArray.search(arr, 0));
    }

    @Test
    public void testElementNotFound() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(-1, ex3_SearchRotatedArray.search(arr, 3));
    }

    @Test
    public void testNoRotation() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, ex3_SearchRotatedArray.search(arr, 3));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {1};
        assertEquals(0, ex3_SearchRotatedArray.search(arr, 1));
        assertEquals(-1, ex3_SearchRotatedArray.search(arr, 0));
    }

    @Test
    public void testTwoElements() {
        int[] arr = {3, 1};
        assertEquals(1, ex3_SearchRotatedArray.search(arr, 1));
        assertEquals(0, ex3_SearchRotatedArray.search(arr, 3));
    }

    @Test
    public void testTargetAtRotationPoint() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, ex3_SearchRotatedArray.search(arr, 4));
    }

    @Test
    public void testTargetInLeftHalf() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(1, ex3_SearchRotatedArray.search(arr, 5));
    }

    @Test
    public void testTargetInRightHalf() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(5, ex3_SearchRotatedArray.search(arr, 1));
    }

    @Test
    public void testLargeRotation() {
        int[] arr = {7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6};
        assertEquals(8, ex3_SearchRotatedArray.search(arr, 3));
    }

    @Test
    public void testRotatedByOne() {
        int[] arr = {2, 3, 4, 5, 1};
        assertEquals(4, ex3_SearchRotatedArray.search(arr, 1));
    }
}
