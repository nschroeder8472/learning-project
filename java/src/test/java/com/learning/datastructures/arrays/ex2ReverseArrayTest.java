package com.learning.datastructures.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex2ReverseArrayTest {

    private ex2_ReverseArray reverser;

    @BeforeEach
    void setUp() {
        reverser = new ex2_ReverseArray();
    }

    @Test
    void testBasicCase() {
        int[] arr = {1, 2, 3, 4, 5};
        reverser.reverse(arr);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr);
    }

    @Test
    void testEvenLength() {
        int[] arr = {1, 2, 3, 4};
        reverser.reverse(arr);
        assertArrayEquals(new int[]{4, 3, 2, 1}, arr);
    }

    @Test
    void testOddLength() {
        int[] arr = {1, 2, 3};
        reverser.reverse(arr);
        assertArrayEquals(new int[]{3, 2, 1}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        reverser.reverse(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testTwoElements() {
        int[] arr = {1, 2};
        reverser.reverse(arr);
        assertArrayEquals(new int[]{2, 1}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        reverser.reverse(arr);
        assertArrayEquals(new int[]{}, arr);
    }
}
