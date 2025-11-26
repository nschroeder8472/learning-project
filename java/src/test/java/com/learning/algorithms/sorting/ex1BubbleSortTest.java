package com.learning.algorithms.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex1BubbleSortTest {

    private ex1_BubbleSort sorter;

    @BeforeEach
    void setUp() {
        sorter = new ex1_BubbleSort();
    }

    @Test
    void testBasicCase() {
        int[] arr = {5, 2, 8, 1, 9};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 5, 8, 9}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    void testAllSame() {
        int[] arr = {5, 5, 5, 5, 5};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-5, 2, -8, 1, 9};
        sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{-8, -5, 1, 2, 9}, arr);
    }
}
