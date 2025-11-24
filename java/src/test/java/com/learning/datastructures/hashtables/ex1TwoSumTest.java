package com.learning.datastructures.hashtables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex1TwoSumTest {

    private ex1_TwoSum solution;

    @BeforeEach
    void setUp() {
        solution = new ex1_TwoSum();
    }

    @Test
    void testBasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        assertEquals(2, result.length);
        assertEquals(9, nums[result[0]] + nums[result[1]]);
    }

    @Test
    void testDifferentOrder() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        assertEquals(2, result.length);
        assertEquals(6, nums[result[0]] + nums[result[1]]);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] result = solution.twoSum(nums, target);
        assertEquals(2, result.length);
        assertEquals(-8, nums[result[0]] + nums[result[1]]);
    }

    @Test
    void testWithZero() {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] result = solution.twoSum(nums, target);
        assertEquals(2, result.length);
        assertEquals(0, nums[result[0]] + nums[result[1]]);
    }

    @Test
    void testTwoElements() {
        int[] nums = {1, 2};
        int target = 3;
        int[] result = solution.twoSum(nums, target);
        assertEquals(2, result.length);
        assertEquals(3, nums[result[0]] + nums[result[1]]);
    }

    @Test
    void testLargeNumbers() {
        int[] nums = {1000000, 2000000, 3000000};
        int target = 5000000;
        int[] result = solution.twoSum(nums, target);
        assertEquals(2, result.length);
        assertEquals(5000000, nums[result[0]] + nums[result[1]]);
    }
}
