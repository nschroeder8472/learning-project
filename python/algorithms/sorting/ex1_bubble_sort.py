"""
Exercise: Bubble Sort (Easy)

Implement the bubble sort algorithm to sort a list of integers in ascending order.
Bubble sort works by repeatedly stepping through the list, comparing adjacent elements
and swapping them if they are in the wrong order. The algorithm continues until no more
swaps are needed.

Example:
Input: [5, 2, 8, 1, 9]
Output: [1, 2, 5, 8, 9]

Example (already sorted):
Input: [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]

Time Complexity: O(n²) worst/average case, O(n) best case (already sorted with optimization)
Space Complexity: O(1) - sorts in place
Stability: Yes - maintains relative order of equal elements
"""

from typing import List


def bubble_sort(arr: List[int]) -> None:
    """
    Sorts a list using the bubble sort algorithm (in-place).

    Args:
        arr: List of integers to be sorted (modified in place)

    Returns:
        None (the list is sorted in place)
    """
    # TODO: Implement bubble sort
    # Hint 1: Use nested loops - outer loop for number of passes, inner loop for comparisons
    # Hint 2: In each pass, compare adjacent elements and swap if needed
    # Hint 3: After each pass, the largest element "bubbles up" to the end
    # Hint 4: Optimization - keep track of whether any swaps occurred, stop early if none
    # Hint 5: You can reduce the inner loop range after each pass (last i elements are sorted)
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_arr = [5, 2, 8, 1, 9]
    print(f"Before sorting: {test_arr}")
    bubble_sort(test_arr)
    print(f"After sorting: {test_arr}")
