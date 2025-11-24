package com.learning.datastructures.hashtables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex2ContainsDuplicateTest {

    private ex2_ContainsDuplicate solution;

    @BeforeEach
    void setUp() {
        solution = new ex2_ContainsDuplicate();
    }

    @Test
    void testHasDuplicate() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    void testNoDuplicate() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    void testMultipleDuplicates() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    void testConsecutiveDuplicates() {
        int[] nums = {1, 2, 2, 3, 4};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    void testAllSameElements() {
        int[] nums = {5, 5, 5, 5, 5};
        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -1};
        assertTrue(solution.containsDuplicate(nums));
    }
}
