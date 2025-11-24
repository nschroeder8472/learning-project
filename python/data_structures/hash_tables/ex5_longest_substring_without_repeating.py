"""
Exercise: Longest Substring Without Repeating Characters (Medium)

Given a string s, find the length of the longest substring without repeating characters.

Example:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Time Complexity: O(n)
Space Complexity: O(min(m, n)) where m is the charset size
"""


def length_of_longest_substring(s: str) -> int:
    """
    Find the length of the longest substring without repeating characters.

    Args:
        s: Input string

    Returns:
        Length of longest substring without repeating characters
    """
    # TODO: Implement this function
    # Hint: Use sliding window technique with a set
    # Expand window by adding characters, shrink when you find a duplicate
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    print(length_of_longest_substring("abcabcbb"))  # Should output 3
    print(length_of_longest_substring("bbbbb"))  # Should output 1
    print(length_of_longest_substring("pwwkew"))  # Should output 3
