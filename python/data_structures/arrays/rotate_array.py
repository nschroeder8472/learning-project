"""
Exercise: Rotate Array (Medium)

Rotate a list to the right by k positions.

Example:
Input: arr = [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]

Time Complexity: O(n)
Space Complexity: O(1) for in-place approach
"""

from typing import List


def rotate(arr: List[int], k: int) -> None:
    """
    Rotate the array to the right by k positions.

    Args:
        arr: List of integers to rotate (modified in-place)
        k: Number of positions to rotate
    """
    # TODO: Implement this function
    # Edge case: k might be larger than array length (use k % len(arr))
    # Approach 1: Use slicing: arr[:] = arr[-k:] + arr[:-k]
    # Approach 2: Reverse entire array, then reverse first k and last n-k
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [1, 2, 3, 4, 5, 6, 7]
    rotate(test_arr, 3)
    print(f"Rotated array: {test_arr}")
