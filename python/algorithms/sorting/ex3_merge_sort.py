"""
Exercise: Merge Sort (Medium)

Implement the merge sort algorithm to sort a list of integers in ascending order.
Merge sort is a divide-and-conquer algorithm that recursively divides the list into
two halves, sorts each half, and then merges them back together.

Example:
Input: [38, 27, 43, 3, 9, 82, 10]
Output: [3, 9, 10, 27, 38, 43, 82]

Example (already sorted):
Input: [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]

Time Complexity: O(n log n) for all cases (best, average, worst)
Space Complexity: O(n) - requires auxiliary array for merging
Stability: Yes - maintains relative order of equal elements
"""

from typing import List


def merge_sort(arr: List[int]) -> None:
    """
    Sorts a list using the merge sort algorithm (in-place).

    Args:
        arr: List of integers to be sorted (modified in place)

    Returns:
        None (the list is sorted in place)
    """
    # TODO: Implement merge sort
    # Hint 1: Base case - if len(arr) <= 1, return
    # Hint 2: Find the middle point and split into left and right halves
    # Hint 3: Recursively call merge_sort on both halves
    # Hint 4: Merge the two sorted halves back into arr
    # Hint 5: You can use slicing or indices to work with subarrays
    raise NotImplementedError("Not implemented yet")


def _merge(arr: List[int], left: int, mid: int, right: int) -> None:
    """
    Helper function to merge two sorted subarrays arr[left..mid] and arr[mid+1..right].

    Args:
        arr: The list containing both subarrays
        left: Starting index of left subarray
        mid: Ending index of left subarray
        right: Ending index of right subarray
    """
    # TODO: Implement merge logic
    # Hint 1: Create temporary lists for left and right halves
    # Hint 2: Use three pointers to merge the temporary lists back into arr
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [38, 27, 43, 3, 9, 82, 10]
    print(f"Before sorting: {test_arr}")
    merge_sort(test_arr)
    print(f"After sorting: {test_arr}")
