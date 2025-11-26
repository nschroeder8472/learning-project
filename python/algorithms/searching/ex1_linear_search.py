"""
Exercise 1: Linear Search
Difficulty: Easy

Implement linear search to find the index of a target element in an array.
Linear search checks each element sequentially until the target is found or
the array is exhausted.

Example:
    Input: arr = [5, 2, 8, 1, 9], target = 8
    Output: 2

    Input: arr = [5, 2, 8, 1, 9], target = 7
    Output: -1

Time Complexity: O(n) - must potentially check every element
Space Complexity: O(1) - only uses a constant amount of extra space
"""

from typing import List


def linear_search(arr: List[int], target: int) -> int:
    """
    Performs linear search on the array to find the target element.

    Args:
        arr: The array to search
        target: The element to find

    Returns:
        The index of the target element, or -1 if not found
    """
    # TODO: Implement linear search
    # Hint: Iterate through the array and check each element
    raise NotImplementedError("Not implemented yet")


def linear_search_range(arr: List[int], target: int, start: int, end: int) -> int:
    """
    Alternative signature that searches within a specific range.

    Args:
        arr: The array to search
        target: The element to find
        start: The starting index (inclusive)
        end: The ending index (exclusive)

    Returns:
        The index of the target element, or -1 if not found
    """
    # TODO: Implement ranged linear search
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    arr = [5, 2, 8, 1, 9]

    print("Array:", arr)
    print("Search for 8:", linear_search(arr, 8))  # Expected: 2
    print("Search for 7:", linear_search(arr, 7))  # Expected: -1
    print("Search for 9 in range [0, 3):", linear_search_range(arr, 9, 0, 3))  # Expected: -1
