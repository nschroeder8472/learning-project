package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Linear Search implementation.
 */
public class ex1LinearSearchTest {

    @Test
    public void testElementFound() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(2, ex1_LinearSearch.linearSearch(arr, 8));
    }

    @Test
    public void testElementNotFound() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(-1, ex1_LinearSearch.linearSearch(arr, 7));
    }

    @Test
    public void testFirstElement() {
        int[] arr = {10, 20, 30, 40};
        assertEquals(0, ex1_LinearSearch.linearSearch(arr, 10));
    }

    @Test
    public void testLastElement() {
        int[] arr = {10, 20, 30, 40};
        assertEquals(3, ex1_LinearSearch.linearSearch(arr, 40));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        assertEquals(0, ex1_LinearSearch.linearSearch(arr, 42));
    }

    @Test
    public void testSingleElementNotFound() {
        int[] arr = {42};
        assertEquals(-1, ex1_LinearSearch.linearSearch(arr, 1));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, ex1_LinearSearch.linearSearch(arr, 5));
    }

    @Test
    public void testDuplicateElements() {
        int[] arr = {3, 5, 3, 7, 3};
        // Should return the first occurrence
        assertEquals(0, ex1_LinearSearch.linearSearch(arr, 3));
    }

    @Test
    public void testRangedSearch() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // Search for 5 between index 2 and 6
        assertEquals(4, ex1_LinearSearch.linearSearch(arr, 5, 2, 6));
    }

    @Test
    public void testRangedSearchNotInRange() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // Search for 7 between index 0 and 5 (7 is at index 6)
        assertEquals(-1, ex1_LinearSearch.linearSearch(arr, 7, 0, 5));
    }
}
