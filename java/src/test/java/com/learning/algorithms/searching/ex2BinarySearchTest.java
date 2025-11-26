package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex2BinarySearchTest {

    private ex2_BinarySearch searcher;

    @BeforeEach
    void setUp() {
        searcher = new ex2_BinarySearch();
    }

    @Test
    void testElementFound() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(3, searcher.binarySearch(arr, 7));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(-1, searcher.binarySearch(arr, 6));
    }

    @Test
    void testFirstElement() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(0, searcher.binarySearch(arr, 1));
    }

    @Test
    void testLastElement() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(6, searcher.binarySearch(arr, 13));
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {42};
        assertEquals(0, searcher.binarySearch(arr, 42));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {42};
        assertEquals(-1, searcher.binarySearch(arr, 10));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, searcher.binarySearch(arr, 5));
    }

    @Test
    void testTwoElements() {
        int[] arr = {1, 3};
        assertEquals(0, searcher.binarySearch(arr, 1));
        assertEquals(1, searcher.binarySearch(arr, 3));
        assertEquals(-1, searcher.binarySearch(arr, 2));
    }
}
