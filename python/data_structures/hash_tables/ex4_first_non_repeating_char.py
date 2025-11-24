"""
Exercise: First Non-Repeating Character (Medium)

Given a string s, find the first non-repeating character in it and return its index.
If it does not exist, return -1.

Example:
Input: s = "leetcode"
Output: 0
Explanation: 'l' is the first character that does not repeat

Example 2:
Input: s = "loveleetcode"
Output: 2
Explanation: 'v' is the first non-repeating character

Example 3:
Input: s = "aabb"
Output: -1

Time Complexity: O(n)
Space Complexity: O(1) - at most 26 lowercase English letters
"""

from collections import Counter


def first_uniq_char(s: str) -> int:
    """
    Find the index of the first non-repeating character.

    Args:
        s: Input string

    Returns:
        Index of first non-repeating character, or -1 if none exists
    """
    # TODO: Implement this function
    # Hint: First pass - count character frequencies using a dictionary
    # Second pass - find the first character with count 1
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    print(first_uniq_char("leetcode"))  # Should output 0
    print(first_uniq_char("loveleetcode"))  # Should output 2
    print(first_uniq_char("aabb"))  # Should output -1
