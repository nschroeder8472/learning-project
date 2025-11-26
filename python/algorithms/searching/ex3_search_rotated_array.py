"""
Exercise 3: Search in Rotated Sorted Array
Difficulty: Medium

A sorted array has been rotated at an unknown pivot point. Find the index of a target element.
You may assume no duplicates exist in the array.

Example:
    Input: arr = [4, 5, 6, 7, 0, 1, 2], target = 0
    Output: 4

    Input: arr = [4, 5, 6, 7, 0, 1, 2], target = 3
    Output: -1

    Input: arr = [1], target = 0
    Output: -1

Explanation:
    The array was originally [0, 1, 2, 4, 5, 6, 7] and was rotated at index 4.

Time Complexity: O(log n) - modified binary search
Space Complexity: O(1)
"""

from typing import List


def search(arr: List[int], target: int) -> int:
    """
    Searches for a target in a rotated sorted array.

    Args:
        arr: The rotated sorted array
        target: The element to find

    Returns:
        The index of the target element, or -1 if not found
    """
    # TODO: Implement search in rotated sorted array
    # Hint: Use binary search, but determine which half is sorted
    # If left half is sorted (arr[left] <= arr[mid]):
    #   - Check if target is in left half range
    # Otherwise right half is sorted:
    #   - Check if target is in right half range
    raise NotImplementedError("Not implemented yet")


def find_rotation_point(arr: List[int]) -> int:
    """
    Finds the index of the minimum element (rotation point).
    This can be useful for understanding the rotation.

    Args:
        arr: The rotated sorted array

    Returns:
        The index of the minimum element
    """
    # TODO: Optional - implement finding the rotation point
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    arr = [4, 5, 6, 7, 0, 1, 2]

    print("Array:", arr)
    print("Search for 0:", search(arr, 0))  # Expected: 4
    print("Search for 3:", search(arr, 3))  # Expected: -1
    print("Search for 5:", search(arr, 5))  # Expected: 1
