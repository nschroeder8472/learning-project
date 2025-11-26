"""
Exercise: Selection Sort (Easy)

Implement the selection sort algorithm to sort a list of integers in ascending order.
Selection sort works by repeatedly finding the minimum element from the unsorted portion
and moving it to the beginning. The algorithm divides the list into sorted and unsorted
portions, growing the sorted portion by one element in each iteration.

Example:
Input: [64, 25, 12, 22, 11]
Output: [11, 12, 22, 25, 64]

Example (already sorted):
Input: [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]

Time Complexity: O(n²) for all cases (best, average, worst)
Space Complexity: O(1) - sorts in place
Stability: No - may change relative order of equal elements
"""

from typing import List


def selection_sort(arr: List[int]) -> None:
    """
    Sorts a list using the selection sort algorithm (in-place).

    Args:
        arr: List of integers to be sorted (modified in place)

    Returns:
        None (the list is sorted in place)
    """
    # TODO: Implement selection sort
    # Hint 1: Outer loop tracks the boundary between sorted and unsorted portions
    # Hint 2: For each position i, find the minimum element in arr[i..n-1]
    # Hint 3: Swap the minimum element with arr[i]
    # Hint 4: After each iteration, one more element is in its final sorted position
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [64, 25, 12, 22, 11]
    print(f"Before sorting: {test_arr}")
    selection_sort(test_arr)
    print(f"After sorting: {test_arr}")
