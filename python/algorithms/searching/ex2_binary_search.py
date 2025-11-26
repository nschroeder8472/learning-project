"""
Exercise 2: Binary Search
Difficulty: Easy

Implement binary search to find the index of a target element in a sorted array.
Binary search works by repeatedly dividing the search interval in half.

Example:
    Input: arr = [1, 3, 5, 7, 9, 11], target = 7
    Output: 3

    Input: arr = [1, 3, 5, 7, 9, 11], target = 4
    Output: -1

Time Complexity: O(log n) - eliminates half of elements each iteration
Space Complexity: O(1) iterative, O(log n) recursive due to call stack

Prerequisites: Array must be sorted in ascending order
"""

from typing import List


def binary_search_iterative(arr: List[int], target: int) -> int:
    """
    Performs iterative binary search on a sorted array.

    Args:
        arr: The sorted array to search
        target: The element to find

    Returns:
        The index of the target element, or -1 if not found
    """
    # TODO: Implement iterative binary search
    # Hint: Use two pointers (left and right)
    # Compare middle element with target
    # Adjust pointers based on comparison
    raise NotImplementedError("Not implemented yet")


def binary_search_recursive(arr: List[int], target: int) -> int:
    """
    Performs recursive binary search on a sorted array.

    Args:
        arr: The sorted array to search
        target: The element to find

    Returns:
        The index of the target element, or -1 if not found
    """
    # TODO: Implement recursive binary search
    # Hint: Call a helper function with left and right indices
    def helper(left: int, right: int) -> int:
        # TODO: Implement recursive helper
        raise NotImplementedError("Not implemented yet")

    return helper(0, len(arr) - 1)


if __name__ == "__main__":
    # Example usage
    arr = [1, 3, 5, 7, 9, 11]

    print("Array:", arr)
    print("Iterative search for 7:", binary_search_iterative(arr, 7))  # Expected: 3
    print("Iterative search for 4:", binary_search_iterative(arr, 4))  # Expected: -1
    print("Recursive search for 7:", binary_search_recursive(arr, 7))  # Expected: 3
    print("Recursive search for 4:", binary_search_recursive(arr, 4))  # Expected: -1
