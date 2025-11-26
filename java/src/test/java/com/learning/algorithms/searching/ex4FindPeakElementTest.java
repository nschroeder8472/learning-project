package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex4FindPeakElementTest {

    private ex4_FindPeakElement searcher;

    @BeforeEach
    void setUp() {
        searcher = new ex4_FindPeakElement();
    }

    @Test
    void testPeakAtEnd() {
        int[] arr = {1, 2, 3, 1};
        assertEquals(2, searcher.findPeakElement(arr));
    }

    @Test
    void testMultiplePeaks() {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int peakIdx = searcher.findPeakElement(arr);
        // Either index 1 (value 2) or index 5 (value 6) is valid
        assertTrue(peakIdx == 1 || peakIdx == 5);
    }

    @Test
    void testSingleElement() {
        int[] arr = {1};
        assertEquals(0, searcher.findPeakElement(arr));
    }

    @Test
    void testAscendingArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, searcher.findPeakElement(arr));
    }

    @Test
    void testDescendingArray() {
        int[] arr = {5, 4, 3, 2, 1};
        assertEquals(0, searcher.findPeakElement(arr));
    }

    @Test
    void testTwoElementsAscending() {
        int[] arr = {1, 2};
        assertEquals(1, searcher.findPeakElement(arr));
    }

    @Test
    void testTwoElementsDescending() {
        int[] arr = {2, 1};
        assertEquals(0, searcher.findPeakElement(arr));
    }

    @Test
    void testPeakInMiddle() {
        int[] arr = {1, 5, 3};
        assertEquals(1, searcher.findPeakElement(arr));
    }
}
