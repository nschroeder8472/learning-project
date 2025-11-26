package com.learning.algorithms.dynamicprogramming;

import java.util.Arrays;

/**
 * Exercise 3: Coin Change
 * Difficulty: Medium
 *
 * Given coins of different denominations and a total amount,
 * find the minimum number of coins needed to make that amount.
 * If the amount cannot be made, return -1.
 *
 * Example:
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Explanation: Cannot make 3 with only coins of 2
 *
 * Input: coins = [1], amount = 0
 * Output: 0
 *
 * Time Complexity: O(amount × coins.length)
 * Space Complexity: O(amount)
 */
public class ex3_CoinChange {

    /**
     * Find minimum number of coins to make the amount.
     *
     * @param coins array of coin denominations
     * @param amount the target amount
     * @return minimum number of coins needed, or -1 if impossible
     */
    public static int coinChange(int[] coins, int amount) {
        // TODO: Implement coin change
        // Create dp array of size amount + 1
        // Initialize dp[0] = 0, others = amount + 1 (infinity)
        // For each amount i from 1 to amount:
        //   For each coin:
        //     If coin <= i:
        //       dp[i] = min(dp[i], dp[i - coin] + 1)
        // Return dp[amount] if valid, else -1
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method to check if amount can be made with given coins.
     *
     * @param coins array of coin denominations
     * @param amount the target amount
     * @return true if amount can be made, false otherwise
     */
    public static boolean canMakeAmount(int[] coins, int amount) {
        return coinChange(coins, amount) != -1;
    }
}
