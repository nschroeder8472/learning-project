"""
Exercise: Remove Duplicates from Sorted Array (Medium)

Given a sorted list, remove duplicates in-place and return the new length.
The first 'new_length' elements should contain unique values.

Example:
Input: [1, 1, 2, 2, 3, 4, 4, 5]
Output: 5 (list becomes [1, 2, 3, 4, 5, ...])

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


def remove_duplicates(arr: List[int]) -> int:
    """
    Remove duplicates from a sorted array in-place.

    Args:
        arr: Sorted list of integers (modified in-place)

    Returns:
        The new length with unique elements
    """
    # TODO: Implement this function
    # Edge case: handle empty list
    # Hint: Use two pointers - one for reading, one for writing
    # Only write when you find a different element
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [1, 1, 2, 2, 3, 4, 4, 5]
    new_length = remove_duplicates(test_arr)
    print(f"New length: {new_length}")
    print(f"Unique elements: {test_arr[:new_length]}")
