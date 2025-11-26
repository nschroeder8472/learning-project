package com.learning.algorithms.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex2SelectionSortTest {

    private ex2_SelectionSort sorter;

    @BeforeEach
    void setUp() {
        sorter = new ex2_SelectionSort();
    }

    @Test
    void testBasicCase() {
        int[] arr = {64, 25, 12, 22, 11};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{11, 12, 22, 25, 64}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    void testAllSame() {
        int[] arr = {5, 5, 5, 5, 5};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-5, 2, -8, 1, 9};
        sorter.selectionSort(arr);
        assertArrayEquals(new int[]{-8, -5, 1, 2, 9}, arr);
    }
}
