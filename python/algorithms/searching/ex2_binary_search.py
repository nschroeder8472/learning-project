"""
Exercise: Binary Search (Easy)

Implement binary search to find the index of a target element in a sorted list.
Binary search works by repeatedly dividing the search interval in half. If the
target is less than the middle element, search the left half; otherwise search
the right half.

Example:
Input: arr = [1, 3, 5, 7, 9, 11, 13], target = 7
Output: 3

Example (not found):
Input: arr = [1, 3, 5, 7, 9, 11, 13], target = 6
Output: -1

Time Complexity: O(log n) - eliminates half the search space each iteration
Space Complexity: O(1) iterative, O(log n) recursive (call stack)
Prerequisite: List must be sorted
"""

from typing import List


def binary_search(arr: List[int], target: int) -> int:
    """
    Searches for a target element in a sorted list using binary search.

    Args:
        arr: The sorted list to search
        target: The element to find

    Returns:
        The index of the target if found, -1 otherwise
    """
    # TODO: Implement iterative binary search
    # Hint 1: Use two pointers - left (0) and right (len(arr) - 1)
    # Hint 2: While left <= right, calculate mid = left + (right - left) // 2
    # Hint 3: If arr[mid] == target, return mid
    # Hint 4: If arr[mid] < target, search right half (left = mid + 1)
    # Hint 5: If arr[mid] > target, search left half (right = mid - 1)
    # Hint 6: Return -1 if not found
    raise NotImplementedError("Not implemented yet")


def binary_search_recursive(arr: List[int], target: int) -> int:
    """
    Recursive implementation of binary search (optional).

    Args:
        arr: The sorted list to search
        target: The element to find

    Returns:
        The index of the target if found, -1 otherwise
    """
    def helper(left: int, right: int) -> int:
        # TODO: Implement recursive binary search
        # Hint 1: Base case - if left > right, return -1
        # Hint 2: Calculate mid = left + (right - left) // 2
        # Hint 3: If arr[mid] == target, return mid
        # Hint 4: If arr[mid] < target, recursively search right half
        # Hint 5: If arr[mid] > target, recursively search left half
        raise NotImplementedError("Not implemented yet")

    return helper(0, len(arr) - 1)


if __name__ == "__main__":
    # Example usage
    test_arr = [1, 3, 5, 7, 9, 11, 13]
    target = 7
    result = binary_search(test_arr, target)
    print(f"Index of {target} in {test_arr}: {result}")
