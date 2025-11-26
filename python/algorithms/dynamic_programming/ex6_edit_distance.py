"""
Exercise 6: Edit Distance (Levenshtein Distance)
Difficulty: Hard

Given two strings word1 and word2, find the minimum number of operations
required to convert word1 to word2.

You have the following three operations:
1. Insert a character
2. Delete a character
3. Replace a character

Example:
    Input: word1 = "horse", word2 = "ros"
    Output: 3
    Explanation:
        horse -> rorse (replace 'h' with 'r')
        rorse -> rose (remove 'r')
        rose -> ros (remove 'e')

    Input: word1 = "intention", word2 = "execution"
    Output: 5
    Explanation:
        intention -> inention (remove 't')
        inention -> enention (replace 'i' with 'e')
        enention -> exention (replace 'n' with 'x')
        exention -> exection (replace 'n' with 'c')
        exection -> execution (insert 'u')

Time Complexity: O(m × n) where m, n are string lengths
Space Complexity: O(m × n) for DP table
"""

from typing import List


def min_distance(word1: str, word2: str) -> int:
    """
    Find minimum edit distance between two strings.

    Args:
        word1: The first string
        word2: The second string

    Returns:
        Minimum number of operations
    """
    # TODO: Implement edit distance using 2D DP
    # Create 2D list dp[m+1][n+1]
    # dp[i][j] = min operations to convert word1[0..i-1] to word2[0..j-1]
    #
    # Base cases:
    #   dp[0][j] = j (insert j characters)
    #   dp[i][0] = i (delete i characters)
    #
    # If word1[i-1] == word2[j-1]:
    #   dp[i][j] = dp[i-1][j-1] (no operation needed)
    # Else:
    #   dp[i][j] = 1 + min(
    #     dp[i-1][j],    # delete from word1
    #     dp[i][j-1],    # insert into word1
    #     dp[i-1][j-1]   # replace in word1
    #   )
    raise NotImplementedError("Not implemented yet")


def min_distance_optimized(word1: str, word2: str) -> int:
    """
    Space-optimized version using only O(n) space.

    Args:
        word1: The first string
        word2: The second string

    Returns:
        Minimum number of operations
    """
    # TODO: Optional - implement space-optimized version
    # Use only two rows of the DP table
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    word1 = "horse"
    word2 = "ros"
    result = min_distance(word1, word2)
    print(f"Edit distance from '{word1}' to '{word2}': {result}")  # Expected: 3
