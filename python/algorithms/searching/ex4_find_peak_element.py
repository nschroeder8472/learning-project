"""
Exercise 4: Find Peak Element
Difficulty: Medium

A peak element is an element that is strictly greater than its neighbors.
Given an array, find the index of any peak element.
You may assume that arr[-1] = arr[n] = -∞.

Example:
    Input: arr = [1, 2, 3, 1]
    Output: 2 (element 3 is a peak)

    Input: arr = [1, 2, 1, 3, 5, 6, 4]
    Output: 5 (element 6 is a peak) or 1 (element 2 is also a peak)

Note: If there are multiple peaks, you can return any of them.

Time Complexity: O(log n) - using binary search approach
Space Complexity: O(1)
"""

from typing import List


def find_peak_element(arr: List[int]) -> int:
    """
    Finds the index of a peak element using binary search.

    Args:
        arr: The input array

    Returns:
        The index of any peak element
    """
    # TODO: Implement peak element finder
    # Hint: Use binary search logic
    # If arr[mid] < arr[mid + 1], peak must be on the right
    # Otherwise, peak must be on the left (or mid itself)
    raise NotImplementedError("Not implemented yet")


def find_peak_linear(arr: List[int]) -> int:
    """
    Linear search approach to find a peak (for comparison).

    Args:
        arr: The input array

    Returns:
        The index of any peak element
    """
    # TODO: Optional - implement linear O(n) solution for comparison
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    arr1 = [1, 2, 3, 1]
    arr2 = [1, 2, 1, 3, 5, 6, 4]

    print("Array 1:", arr1)
    print("Peak at index:", find_peak_element(arr1))  # Expected: 2

    print("\nArray 2:", arr2)
    print("Peak at index:", find_peak_element(arr2))  # Expected: 1 or 5
