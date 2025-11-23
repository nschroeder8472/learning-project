package com.learning.datastructures.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class MaxSlidingWindowTest {

    private MaxSlidingWindow slider;

    @BeforeEach
    void setUp() {
        slider = new MaxSlidingWindow();
    }

    @Test
    void testBasicCase() {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] expected = {3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, slider.maxSlidingWindow(arr, 3));
    }

    @Test
    void testWindowSizeOne() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, slider.maxSlidingWindow(arr, 1));
    }

    @Test
    void testWindowSizeEqualsArrayLength() {
        int[] arr = {1, 3, 5, 2, 4};
        int[] expected = {5};
        assertArrayEquals(expected, slider.maxSlidingWindow(arr, 5));
    }

    @Test
    void testDecreasingArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {5, 4, 3};
        assertArrayEquals(expected, slider.maxSlidingWindow(arr, 3));
    }

    @Test
    void testIncreasingArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5};
        assertArrayEquals(expected, slider.maxSlidingWindow(arr, 3));
    }

    @Test
    void testDuplicateValues() {
        int[] arr = {1, 3, 3, 3, 5};
        int[] expected = {3, 3, 5};
        assertArrayEquals(expected, slider.maxSlidingWindow(arr, 3));
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-7, -8, -1, -5, -3};
        int[] expected = {-1, -1, -1};
        assertArrayEquals(expected, slider.maxSlidingWindow(arr, 3));
    }
}
