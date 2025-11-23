package com.learning.datastructures.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    private RemoveDuplicates remover;

    @BeforeEach
    void setUp() {
        remover = new RemoveDuplicates();
    }

    @Test
    void testBasicCase() {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = remover.removeDuplicates(arr);
        assertEquals(5, newLength);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(arr, newLength));
    }

    @Test
    void testNoDuplicates() {
        int[] arr = {1, 2, 3, 4, 5};
        int newLength = remover.removeDuplicates(arr);
        assertEquals(5, newLength);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, java.util.Arrays.copyOf(arr, newLength));
    }

    @Test
    void testAllDuplicates() {
        int[] arr = {5, 5, 5, 5, 5};
        int newLength = remover.removeDuplicates(arr);
        assertEquals(1, newLength);
        assertArrayEquals(new int[]{5}, java.util.Arrays.copyOf(arr, newLength));
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        int newLength = remover.removeDuplicates(arr);
        assertEquals(1, newLength);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int newLength = remover.removeDuplicates(arr);
        assertEquals(0, newLength);
    }

    @Test
    void testConsecutiveDuplicates() {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int newLength = remover.removeDuplicates(arr);
        assertEquals(3, newLength);
        assertArrayEquals(new int[]{1, 2, 3}, java.util.Arrays.copyOf(arr, newLength));
    }
}
