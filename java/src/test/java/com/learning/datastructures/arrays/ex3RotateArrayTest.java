package com.learning.datastructures.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex3RotateArrayTest {

    private ex3_RotateArray rotator;

    @BeforeEach
    void setUp() {
        rotator = new ex3_RotateArray();
    }

    @Test
    void testBasicRotation() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(arr, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, arr);
    }

    @Test
    void testRotateByZero() {
        int[] arr = {1, 2, 3, 4, 5};
        rotator.rotate(arr, 0);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testRotateByLength() {
        int[] arr = {1, 2, 3, 4, 5};
        rotator.rotate(arr, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testRotateByMoreThanLength() {
        int[] arr = {1, 2, 3, 4, 5};
        rotator.rotate(arr, 7); // 7 % 5 = 2
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);
    }

    @Test
    void testRotateByOne() {
        int[] arr = {1, 2, 3, 4, 5};
        rotator.rotate(arr, 1);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {42};
        rotator.rotate(arr, 3);
        assertArrayEquals(new int[]{42}, arr);
    }
}
