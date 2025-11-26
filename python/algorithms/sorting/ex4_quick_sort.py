"""
Exercise: Quick Sort (Medium)

Implement the quick sort algorithm to sort a list of integers in ascending order.
Quick sort is a divide-and-conquer algorithm that selects a 'pivot' element and
partitions the list around it, placing smaller elements to the left and larger
elements to the right. It then recursively sorts the left and right partitions.

Example:
Input: [10, 7, 8, 9, 1, 5]
Output: [1, 5, 7, 8, 9, 10]

Example (already sorted):
Input: [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]

Time Complexity: O(n log n) average case, O(n²) worst case (already sorted with poor pivot)
Space Complexity: O(log n) - recursion stack
Stability: No - relative order of equal elements may change
"""

from typing import List


def quick_sort(arr: List[int]) -> None:
    """
    Sorts a list using the quick sort algorithm (in-place).

    Args:
        arr: List of integers to be sorted (modified in place)

    Returns:
        None (the list is sorted in place)
    """
    # TODO: Implement quick sort
    # Hint 1: Use a helper function that takes left and right indices
    # Hint 2: Call the helper with 0 and len(arr) - 1
    raise NotImplementedError("Not implemented yet")


def _quick_sort_helper(arr: List[int], left: int, right: int) -> None:
    """
    Helper function to recursively sort a portion of the list.

    Args:
        arr: The list to sort
        left: Starting index
        right: Ending index
    """
    # TODO: Implement recursive quick sort logic
    # Hint 1: Base case - if left >= right, return
    # Hint 2: Partition the list and get the pivot index
    # Hint 3: Recursively sort left partition (left to pivot_index - 1)
    # Hint 4: Recursively sort right partition (pivot_index + 1 to right)
    raise NotImplementedError("Not implemented yet")


def _partition(arr: List[int], left: int, right: int) -> int:
    """
    Partitions the list around a pivot element.
    Places all elements smaller than pivot to the left and larger to the right.

    Args:
        arr: The list to partition
        left: Starting index
        right: Ending index

    Returns:
        The final position of the pivot element
    """
    # TODO: Implement partition logic
    # Hint 1: Choose a pivot (simplest: use arr[right])
    # Hint 2: Use a pointer to track position of smaller elements
    # Hint 3: Iterate through list, swap elements smaller than pivot to left side
    # Hint 4: Finally, swap pivot to its correct position
    # Hint 5: Return the pivot's final position
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [10, 7, 8, 9, 1, 5]
    print(f"Before sorting: {test_arr}")
    quick_sort(test_arr)
    print(f"After sorting: {test_arr}")
