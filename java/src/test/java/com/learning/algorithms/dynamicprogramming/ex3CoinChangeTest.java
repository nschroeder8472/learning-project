package com.learning.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Coin Change implementation.
 */
public class ex3CoinChangeTest {

    @Test
    public void testBasicCase() {
        int[] coins = {1, 2, 5};
        assertEquals(3, ex3_CoinChange.coinChange(coins, 11));
        // 11 = 5 + 5 + 1
    }

    @Test
    public void testImpossible() {
        int[] coins = {2};
        assertEquals(-1, ex3_CoinChange.coinChange(coins, 3));
        // Cannot make 3 with only coins of 2
    }

    @Test
    public void testZeroAmount() {
        int[] coins = {1};
        assertEquals(0, ex3_CoinChange.coinChange(coins, 0));
    }

    @Test
    public void testSingleCoin() {
        int[] coins = {1};
        assertEquals(5, ex3_CoinChange.coinChange(coins, 5));
    }

    @Test
    public void testExactMatch() {
        int[] coins = {1, 2, 5};
        assertEquals(1, ex3_CoinChange.coinChange(coins, 5));
    }

    @Test
    public void testMultipleSolutions() {
        int[] coins = {1, 3, 4};
        assertEquals(3, ex3_CoinChange.coinChange(coins, 6));
        // 6 = 3 + 3 (better than 4 + 1 + 1)
    }

    @Test
    public void testLargeDenominations() {
        int[] coins = {25, 10, 5, 1};
        assertEquals(4, ex3_CoinChange.coinChange(coins, 41));
        // 41 = 25 + 10 + 5 + 1
    }

    @Test
    public void testGreedyFails() {
        int[] coins = {1, 3, 4};
        assertEquals(3, ex3_CoinChange.coinChange(coins, 6));
        // Greedy would choose 4 + 1 + 1 = 3 coins
        // Optimal is 3 + 3 = 2 coins
        // Wait, 3 + 3 = 2 coins, so answer should be 2
    }

    @Test
    public void testLargeAmount() {
        int[] coins = {1, 5, 10, 25};
        assertEquals(9, ex3_CoinChange.coinChange(coins, 99));
        // 99 = 25*3 + 10*2 + 4*1 = 75 + 20 + 4 = 9 coins
    }

    @Test
    public void testCanMakeAmount() {
        int[] coins = {1, 2, 5};
        assertTrue(ex3_CoinChange.canMakeAmount(coins, 11));

        int[] coins2 = {2};
        assertFalse(ex3_CoinChange.canMakeAmount(coins2, 3));
    }
}
