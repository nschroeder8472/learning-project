package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Binary Search implementation.
 */
public class ex2BinarySearchTest {

    @Test
    public void testIterativeElementFound() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        assertEquals(3, ex2_BinarySearch.binarySearchIterative(arr, 7));
    }

    @Test
    public void testIterativeElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        assertEquals(-1, ex2_BinarySearch.binarySearchIterative(arr, 4));
    }

    @Test
    public void testIterativeFirstElement() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(0, ex2_BinarySearch.binarySearchIterative(arr, 2));
    }

    @Test
    public void testIterativeLastElement() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(4, ex2_BinarySearch.binarySearchIterative(arr, 10));
    }

    @Test
    public void testIterativeSingleElement() {
        int[] arr = {5};
        assertEquals(0, ex2_BinarySearch.binarySearchIterative(arr, 5));
    }

    @Test
    public void testIterativeEmptyArray() {
        int[] arr = {};
        assertEquals(-1, ex2_BinarySearch.binarySearchIterative(arr, 1));
    }

    @Test
    public void testIterativeLargeArray() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2; // Even numbers: 0, 2, 4, ..., 1998
        }
        assertEquals(250, ex2_BinarySearch.binarySearchIterative(arr, 500));
        assertEquals(-1, ex2_BinarySearch.binarySearchIterative(arr, 501));
    }

    @Test
    public void testRecursiveElementFound() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        assertEquals(3, ex2_BinarySearch.binarySearchRecursive(arr, 7));
    }

    @Test
    public void testRecursiveElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        assertEquals(-1, ex2_BinarySearch.binarySearchRecursive(arr, 4));
    }

    @Test
    public void testRecursiveSingleElement() {
        int[] arr = {42};
        assertEquals(0, ex2_BinarySearch.binarySearchRecursive(arr, 42));
    }

    @Test
    public void testRecursiveEmptyArray() {
        int[] arr = {};
        assertEquals(-1, ex2_BinarySearch.binarySearchRecursive(arr, 1));
    }
}
