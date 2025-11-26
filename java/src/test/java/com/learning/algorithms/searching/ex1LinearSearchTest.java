package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex1LinearSearchTest {

    private ex1_LinearSearch searcher;

    @BeforeEach
    void setUp() {
        searcher = new ex1_LinearSearch();
    }

    @Test
    void testElementFound() {
        int[] arr = {4, 2, 7, 1, 9, 5};
        assertEquals(2, searcher.linearSearch(arr, 7));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {4, 2, 7, 1, 9, 5};
        assertEquals(-1, searcher.linearSearch(arr, 10));
    }

    @Test
    void testFirstElement() {
        int[] arr = {4, 2, 7, 1, 9, 5};
        assertEquals(0, searcher.linearSearch(arr, 4));
    }

    @Test
    void testLastElement() {
        int[] arr = {4, 2, 7, 1, 9, 5};
        assertEquals(5, searcher.linearSearch(arr, 5));
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {42};
        assertEquals(0, searcher.linearSearch(arr, 42));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {42};
        assertEquals(-1, searcher.linearSearch(arr, 10));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, searcher.linearSearch(arr, 5));
    }

    @Test
    void testDuplicatesReturnsFirst() {
        int[] arr = {1, 3, 5, 3, 7};
        assertEquals(1, searcher.linearSearch(arr, 3));
    }
}
