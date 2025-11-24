package com.learning.datastructures.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex5TrappingRainWaterTest {

    private ex5_TrappingRainWater trapper;

    @BeforeEach
    void setUp() {
        trapper = new ex5_TrappingRainWater();
    }

    @Test
    void testBasicCase() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, trapper.trap(height));
    }

    @Test
    void testNoWaterTrapped() {
        int[] height = {1, 2, 3, 4, 5};
        assertEquals(0, trapper.trap(height));
    }

    @Test
    void testSimpleCase() {
        int[] height = {3, 0, 2, 0, 4};
        assertEquals(7, trapper.trap(height));
    }

    @Test
    void testTwoBarriers() {
        int[] height = {4, 0, 0, 0, 4};
        assertEquals(12, trapper.trap(height));
    }

    @Test
    void testEmptyArray() {
        int[] height = {};
        assertEquals(0, trapper.trap(height));
    }

    @Test
    void testSingleElement() {
        int[] height = {5};
        assertEquals(0, trapper.trap(height));
    }

    @Test
    void testTwoElements() {
        int[] height = {3, 2};
        assertEquals(0, trapper.trap(height));
    }

    @Test
    void testDescendingThenAscending() {
        int[] height = {5, 2, 1, 2, 1, 5};
        assertEquals(14, trapper.trap(height));
    }
}
