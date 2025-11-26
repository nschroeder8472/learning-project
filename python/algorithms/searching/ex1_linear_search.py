"""
Exercise: Linear Search (Easy)

Implement linear search to find the index of a target element in a list.
Linear search checks each element sequentially from left to right until the
target is found or the end of the list is reached.

Example:
Input: arr = [4, 2, 7, 1, 9, 5], target = 7
Output: 2

Example (not found):
Input: arr = [4, 2, 7, 1, 9, 5], target = 10
Output: -1

Time Complexity: O(n) - must potentially check every element
Space Complexity: O(1) - only uses a constant amount of extra space
"""

from typing import List


def linear_search(arr: List[int], target: int) -> int:
    """
    Searches for a target element in a list using linear search.

    Args:
        arr: The list to search
        target: The element to find

    Returns:
        The index of the target if found, -1 otherwise
    """
    # TODO: Implement linear search
    # Hint 1: Use enumerate to iterate through elements with their indices
    # Hint 2: Compare each element with the target
    # Hint 3: Return the index when found
    # Hint 4: Return -1 if the loop completes without finding the target
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [4, 2, 7, 1, 9, 5]
    target = 7
    result = linear_search(test_arr, target)
    print(f"Index of {target} in {test_arr}: {result}")
