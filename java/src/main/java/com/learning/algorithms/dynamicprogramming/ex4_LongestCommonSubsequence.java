package com.learning.algorithms.dynamicprogramming;

/**
 * Exercise 4: Longest Common Subsequence (LCS)
 * Difficulty: Medium
 *
 * Given two strings, find the length of their longest common subsequence.
 * A subsequence is a sequence that appears in the same relative order,
 * but not necessarily contiguous.
 *
 * Example:
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: LCS is "ace" with length 3
 *
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 *
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: No common subsequence
 *
 * Time Complexity: O(m × n) where m, n are string lengths
 * Space Complexity: O(m × n) for DP table
 */
public class ex4_LongestCommonSubsequence {

    /**
     * Find length of longest common subsequence.
     *
     * @param text1 the first string
     * @param text2 the second string
     * @return the length of LCS
     */
    public static int longestCommonSubsequence(String text1, String text2) {
        // TODO: Implement LCS using 2D DP
        // Create 2D array dp[m+1][n+1]
        // dp[i][j] = LCS length of text1[0..i-1] and text2[0..j-1]
        // If text1[i-1] == text2[j-1]:
        //   dp[i][j] = dp[i-1][j-1] + 1
        // Else:
        //   dp[i][j] = max(dp[i-1][j], dp[i][j-1])
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Find the actual LCS string (not just length).
     *
     * @param text1 the first string
     * @param text2 the second string
     * @return the LCS string
     */
    public static String findLCS(String text1, String text2) {
        // TODO: Optional - reconstruct the actual LCS string
        // Build DP table, then backtrack to find the sequence
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
