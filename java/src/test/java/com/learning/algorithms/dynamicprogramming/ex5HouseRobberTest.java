package com.learning.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for House Robber implementation.
 */
public class ex5HouseRobberTest {

    @Test
    public void testBasicCase() {
        int[] nums = {1, 2, 3, 1};
        assertEquals(4, ex5_HouseRobber.rob(nums));
        // Rob house 1 (1) and house 3 (3) = 4
    }

    @Test
    public void testLongerArray() {
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(12, ex5_HouseRobber.rob(nums));
        // Rob houses 1, 3, 5 (2 + 9 + 1 = 12)
    }

    @Test
    public void testSingleHouse() {
        int[] nums = {5};
        assertEquals(5, ex5_HouseRobber.rob(nums));
    }

    @Test
    public void testTwoHouses() {
        int[] nums = {2, 3};
        assertEquals(3, ex5_HouseRobber.rob(nums));

        int[] nums2 = {5, 1};
        assertEquals(5, ex5_HouseRobber.rob(nums2));
    }

    @Test
    public void testThreeHouses() {
        int[] nums = {2, 1, 1, 2};
        assertEquals(4, ex5_HouseRobber.rob(nums));
        // Rob houses 1 and 4 (2 + 2 = 4)
    }

    @Test
    public void testAllSameValue() {
        int[] nums = {5, 5, 5, 5, 5};
        assertEquals(15, ex5_HouseRobber.rob(nums));
        // Rob houses 1, 3, 5 (5 + 5 + 5 = 15)
    }

    @Test
    public void testIncreasingValues() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(9, ex5_HouseRobber.rob(nums));
        // Rob houses 2, 4 (2 + 4 = 6) or 1, 3, 5 (1 + 3 + 5 = 9)
    }

    @Test
    public void testDecreasingValues() {
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(9, ex5_HouseRobber.rob(nums));
        // Rob houses 1, 3, 5 (5 + 3 + 1 = 9)
    }

    @Test
    public void testOptimizedMatchesRegular() {
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(
            ex5_HouseRobber.rob(nums),
            ex5_HouseRobber.robOptimized(nums)
        );
    }

    @Test
    public void testLargeArray() {
        int[] nums = {2, 1, 1, 2, 10, 1, 1, 10};
        assertEquals(22, ex5_HouseRobber.rob(nums));
        // Rob houses with 2, 10, 10 = 22
    }
}
