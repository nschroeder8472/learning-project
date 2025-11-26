package com.learning.algorithms.dynamicprogramming;

/**
 * Exercise 5: House Robber
 * Difficulty: Medium
 *
 * You are a robber planning to rob houses along a street.
 * Each house has a certain amount of money.
 * Adjacent houses have security systems connected, so you cannot rob
 * two adjacent houses on the same night.
 *
 * Given an array of non-negative integers representing the amount of money
 * in each house, determine the maximum amount you can rob tonight.
 *
 * Example:
 * Input: nums = [1, 2, 3, 1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and house 3 (money = 3). Total = 4
 *
 * Input: nums = [2, 7, 9, 3, 1]
 * Output: 12
 * Explanation: Rob houses 1, 3, and 5 (2 + 9 + 1 = 12)
 *
 * Input: nums = [2, 1, 1, 2]
 * Output: 4
 * Explanation: Rob houses 1 and 4 (2 + 2 = 4)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) with DP array, O(1) with optimization
 */
public class ex5_HouseRobber {

    /**
     * Find maximum amount that can be robbed.
     *
     * @param nums array of money in each house
     * @return maximum amount that can be robbed
     */
    public static int rob(int[] nums) {
        // TODO: Implement house robber
        // dp[i] = max money robbing up to house i
        // dp[i] = max(nums[i] + dp[i-2], dp[i-1])
        // Either rob current house + skip previous, or skip current
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Space-optimized approach using only two variables.
     *
     * @param nums array of money in each house
     * @return maximum amount that can be robbed
     */
    public static int robOptimized(int[] nums) {
        // TODO: Implement space-optimized version
        // Only need to track last two values
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
