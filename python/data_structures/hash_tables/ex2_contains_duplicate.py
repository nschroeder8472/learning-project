"""
Exercise: Contains Duplicate (Easy)

Given an integer list nums, return True if any value appears at least twice
in the list, and return False if every element is distinct.

Example:
Input: nums = [1, 2, 3, 1]
Output: True

Example 2:
Input: nums = [1, 2, 3, 4]
Output: False

Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: True

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


def contains_duplicate(nums: List[int]) -> bool:
    """
    Check if the list contains any duplicate elements.

    Args:
        nums: List of integers

    Returns:
        True if duplicates exist, False otherwise
    """
    # TODO: Implement this function
    # Hint: Use a set to track elements you've seen
    # If you encounter an element already in the set, you've found a duplicate
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    print(contains_duplicate([1, 2, 3, 1]))  # Should output True
    print(contains_duplicate([1, 2, 3, 4]))  # Should output False
