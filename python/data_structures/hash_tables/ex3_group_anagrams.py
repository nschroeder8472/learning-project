"""
Exercise: Group Anagrams (Medium)

Given a list of strings strs, group the anagrams together.
You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a
different word or phrase, typically using all the original letters exactly once.

Example:
Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Time Complexity: O(n * k log k) where n is the number of strings and k is the max length
Space Complexity: O(n * k)
"""

from typing import List
from collections import defaultdict


def group_anagrams(strs: List[str]) -> List[List[str]]:
    """
    Group strings that are anagrams of each other.

    Args:
        strs: List of strings

    Returns:
        List of groups, where each group contains anagrams
    """
    # TODO: Implement this function
    # Hint: Sort each string to use as a key in a dictionary
    # Strings with the same sorted form are anagrams
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    result = group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
    print(result)  # Should output groups of anagrams
