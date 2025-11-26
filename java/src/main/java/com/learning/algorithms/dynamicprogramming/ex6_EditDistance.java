package com.learning.algorithms.dynamicprogramming;

/**
 * Exercise 6: Edit Distance (Levenshtein Distance)
 * Difficulty: Hard
 *
 * Given two strings word1 and word2, find the minimum number of operations
 * required to convert word1 to word2.
 *
 * You have the following three operations:
 * 1. Insert a character
 * 2. Delete a character
 * 3. Replace a character
 *
 * Example:
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation:
 *   horse -> rorse (replace 'h' with 'r')
 *   rorse -> rose (remove 'r')
 *   rose -> ros (remove 'e')
 *
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation:
 *   intention -> inention (remove 't')
 *   inention -> enention (replace 'i' with 'e')
 *   enention -> exention (replace 'n' with 'x')
 *   exention -> exection (replace 'n' with 'c')
 *   exection -> execution (insert 'u')
 *
 * Time Complexity: O(m × n) where m, n are string lengths
 * Space Complexity: O(m × n) for DP table
 */
public class ex6_EditDistance {

    /**
     * Find minimum edit distance between two strings.
     *
     * @param word1 the first string
     * @param word2 the second string
     * @return minimum number of operations
     */
    public static int minDistance(String word1, String word2) {
        // TODO: Implement edit distance using 2D DP
        // Create 2D array dp[m+1][n+1]
        // dp[i][j] = min operations to convert word1[0..i-1] to word2[0..j-1]
        //
        // Base cases:
        //   dp[0][j] = j (insert j characters)
        //   dp[i][0] = i (delete i characters)
        //
        // If word1[i-1] == word2[j-1]:
        //   dp[i][j] = dp[i-1][j-1] (no operation needed)
        // Else:
        //   dp[i][j] = 1 + min(
        //     dp[i-1][j],    // delete from word1
        //     dp[i][j-1],    // insert into word1
        //     dp[i-1][j-1]   // replace in word1
        //   )
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Space-optimized version using only O(n) space.
     *
     * @param word1 the first string
     * @param word2 the second string
     * @return minimum number of operations
     */
    public static int minDistanceOptimized(String word1, String word2) {
        // TODO: Optional - implement space-optimized version
        // Use only two rows of the DP table
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
