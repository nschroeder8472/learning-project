"""
Exercise: Maximum Sliding Window (Hard)

Given a list and a window size k, find the maximum element in each
sliding window as it moves from left to right.

Example:
Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
Output: [3, 3, 5, 5, 6, 7]

Explanation:
Window [1, 3, -1] -> max = 3
Window [3, -1, -3] -> max = 3
Window [-1, -3, 5] -> max = 5
Window [-3, 5, 3] -> max = 5
Window [5, 3, 6] -> max = 6
Window [3, 6, 7] -> max = 7

Time Complexity: O(n)
Space Complexity: O(k)
"""

from typing import List
from collections import deque


def max_sliding_window(arr: List[int], k: int) -> List[int]:
    """
    Find the maximum in each sliding window of size k.

    Args:
        arr: List of integers
        k: Window size

    Returns:
        List of maximum values for each window
    """
    # TODO: Implement this function
    # Edge cases: empty list, k <= 0, k > list length
    # Hint: Use a deque to store indices of potential maximum elements
    # Maintain deque in decreasing order of values
    # Remove indices outside current window
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [1, 3, -1, -3, 5, 3, 6, 7]
    k = 3
    print(f"Max sliding window: {max_sliding_window(test_arr, k)}")
