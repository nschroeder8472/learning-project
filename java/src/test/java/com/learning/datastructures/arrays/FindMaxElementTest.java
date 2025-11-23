package com.learning.datastructures.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxElementTest {

    private FindMaxElement finder;

    @BeforeEach
    void setUp() {
        finder = new FindMaxElement();
    }

    @Test
    void testBasicCase() {
        int[] arr = {3, 7, 2, 9, 1};
        assertEquals(9, finder.findMax(arr));
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        assertEquals(42, finder.findMax(arr));
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-5, -2, -8, -1, -10};
        assertEquals(-1, finder.findMax(arr));
    }

    @Test
    void testAllSameElements() {
        int[] arr = {5, 5, 5, 5};
        assertEquals(5, finder.findMax(arr));
    }

    @Test
    void testMaxAtBeginning() {
        int[] arr = {10, 5, 3, 2, 1};
        assertEquals(10, finder.findMax(arr));
    }

    @Test
    void testMaxAtEnd() {
        int[] arr = {1, 2, 3, 4, 15};
        assertEquals(15, finder.findMax(arr));
    }
}
