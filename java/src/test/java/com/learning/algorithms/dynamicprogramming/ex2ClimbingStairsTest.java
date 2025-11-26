package com.learning.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Climbing Stairs implementation.
 */
public class ex2ClimbingStairsTest {

    @Test
    public void testOneStair() {
        assertEquals(1, ex2_ClimbingStairs.climbStairs(1));
    }

    @Test
    public void testTwoStairs() {
        assertEquals(2, ex2_ClimbingStairs.climbStairs(2));
        // Two ways: 1+1, or 2
    }

    @Test
    public void testThreeStairs() {
        assertEquals(3, ex2_ClimbingStairs.climbStairs(3));
        // Three ways: 1+1+1, 1+2, or 2+1
    }

    @Test
    public void testFourStairs() {
        assertEquals(5, ex2_ClimbingStairs.climbStairs(4));
        // Five ways: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2
    }

    @Test
    public void testFiveStairs() {
        assertEquals(8, ex2_ClimbingStairs.climbStairs(5));
    }

    @Test
    public void testMediumStairs() {
        assertEquals(89, ex2_ClimbingStairs.climbStairs(10));
    }

    @Test
    public void testLargeStairs() {
        assertEquals(10946, ex2_ClimbingStairs.climbStairs(20));
    }

    @Test
    public void testOptimizedMatchesRegular() {
        // Both methods should give same results
        for (int i = 1; i <= 15; i++) {
            assertEquals(
                ex2_ClimbingStairs.climbStairs(i),
                ex2_ClimbingStairs.climbStairsOptimized(i)
            );
        }
    }

    @Test
    public void testVeryLargeStairs() {
        // Should handle large inputs efficiently
        int result = ex2_ClimbingStairs.climbStairs(35);
        assertTrue(result > 0); // Should complete without timeout
    }
}
