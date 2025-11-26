"""
Exercise 4: Longest Common Subsequence (LCS)
Difficulty: Medium

Given two strings, find the length of their longest common subsequence.
A subsequence is a sequence that appears in the same relative order,
but not necessarily contiguous.

Example:
    Input: text1 = "abcde", text2 = "ace"
    Output: 3
    Explanation: LCS is "ace" with length 3

    Input: text1 = "abc", text2 = "abc"
    Output: 3

    Input: text1 = "abc", text2 = "def"
    Output: 0
    Explanation: No common subsequence

Time Complexity: O(m × n) where m, n are string lengths
Space Complexity: O(m × n) for DP table
"""

from typing import List


def longest_common_subsequence(text1: str, text2: str) -> int:
    """
    Find length of longest common subsequence.

    Args:
        text1: The first string
        text2: The second string

    Returns:
        The length of LCS
    """
    # TODO: Implement LCS using 2D DP
    # Create 2D list dp[m+1][n+1]
    # dp[i][j] = LCS length of text1[0..i-1] and text2[0..j-1]
    # If text1[i-1] == text2[j-1]:
    #   dp[i][j] = dp[i-1][j-1] + 1
    # Else:
    #   dp[i][j] = max(dp[i-1][j], dp[i][j-1])
    raise NotImplementedError("Not implemented yet")


def find_lcs(text1: str, text2: str) -> str:
    """
    Find the actual LCS string (not just length).

    Args:
        text1: The first string
        text2: The second string

    Returns:
        The LCS string
    """
    # TODO: Optional - reconstruct the actual LCS string
    # Build DP table, then backtrack to find the sequence
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    text1 = "abcde"
    text2 = "ace"
    result = longest_common_subsequence(text1, text2)
    print(f"LCS length of '{text1}' and '{text2}': {result}")  # Expected: 3
