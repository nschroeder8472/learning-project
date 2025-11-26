"""
Exercise: Search in Rotated Sorted Array (Medium)

A sorted list has been rotated at an unknown pivot. For example,
[0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]. You are given a target
value to search. If found, return its index; otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: arr = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: arr = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: arr = [1], target = 0
Output: -1

Time Complexity: O(log n) - modified binary search
Space Complexity: O(1)
"""

from typing import List


def search(arr: List[int], target: int) -> int:
    """
    Searches for a target in a rotated sorted list.

    Args:
        arr: The rotated sorted list
        target: The element to find

    Returns:
        The index of the target if found, -1 otherwise
    """
    # TODO: Implement search in rotated sorted array
    # Hint 1: Use modified binary search with left and right pointers
    # Hint 2: At least one half (left or right) will always be sorted
    # Hint 3: Determine which half is sorted by comparing arr[left] with arr[mid]
    # Hint 4: If left half is sorted (arr[left] <= arr[mid]):
    #         - Check if target is in range [arr[left], arr[mid]]
    #         - If yes, search left half; otherwise search right half
    # Hint 5: If right half is sorted:
    #         - Check if target is in range [arr[mid+1], arr[right]]
    #         - If yes, search right half; otherwise search left half
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [4, 5, 6, 7, 0, 1, 2]
    target = 0
    result = search(test_arr, target)
    print(f"Index of {target} in {test_arr}: {result}")
