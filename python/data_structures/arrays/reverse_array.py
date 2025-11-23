"""
Exercise: Reverse Array (Easy)

Reverse a list in-place (without creating a new list).

Example:
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]

Time Complexity: O(n)
Space Complexity: O(1)
"""

from typing import List


def reverse(arr: List[int]) -> None:
    """
    Reverse the array in-place.

    Args:
        arr: List of integers to reverse (modified in-place)
    """
    # TODO: Implement this function
    # Hint: Use two pointers, one at start and one at end
    # Swap elements and move pointers toward center
    # Alternative: Use arr.reverse() or arr[:] = arr[::-1]
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [1, 2, 3, 4, 5]
    reverse(test_arr)
    print(f"Reversed array: {test_arr}")
