package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex3SearchInRotatedSortedArrayTest {

    private ex3_SearchInRotatedSortedArray searcher;

    @BeforeEach
    void setUp() {
        searcher = new ex3_SearchInRotatedSortedArray();
    }

    @Test
    void testTargetInRotatedPart() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, searcher.search(arr, 0));
    }

    @Test
    void testTargetNotFound() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(-1, searcher.search(arr, 3));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {1};
        assertEquals(-1, searcher.search(arr, 0));
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {1};
        assertEquals(0, searcher.search(arr, 1));
    }

    @Test
    void testNoRotation() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, searcher.search(arr, 3));
    }

    @Test
    void testRotatedAtEnd() {
        int[] arr = {2, 3, 4, 5, 1};
        assertEquals(4, searcher.search(arr, 1));
        assertEquals(3, searcher.search(arr, 5));
    }

    @Test
    void testTargetAtPivot() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, searcher.search(arr, 4));
        assertEquals(6, searcher.search(arr, 2));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, searcher.search(arr, 5));
    }
}
