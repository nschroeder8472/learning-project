"""
Exercise: Find Maximum Element (Easy)

Given a list of integers, find and return the maximum element.

Example:
Input: [3, 7, 2, 9, 1]
Output: 9

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


def find_max(arr: List[int]) -> int:
    """
    Find and return the maximum element in the array.

    Args:
        arr: List of integers

    Returns:
        The maximum element in the list

    Raises:
        ValueError: If the list is empty
    """
    # TODO: Implement this function
    # Edge case: handle empty list (raise ValueError)
    # Hint: Keep track of the maximum value seen so far while iterating
    # Alternative: You can use the built-in max() function
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [3, 7, 2, 9, 1]
    print(f"Maximum element: {find_max(test_arr)}")
