"""
Exercise 5: Median of Two Sorted Arrays
Difficulty: Hard

Given two sorted arrays, find the median of the combined sorted array.
The overall run time complexity should be O(log(min(m, n))).

Example 1:
    Input: nums1 = [1, 3], nums2 = [2]
    Output: 2.0
    Explanation: merged array = [1, 2, 3], median = 2

Example 2:
    Input: nums1 = [1, 2], nums2 = [3, 4]
    Output: 2.5
    Explanation: merged array = [1, 2, 3, 4], median = (2 + 3) / 2 = 2.5

Example 3:
    Input: nums1 = [], nums2 = [1]
    Output: 1.0

Time Complexity: O(log(min(m, n))) - binary search on smaller array
Space Complexity: O(1)
"""

from typing import List


def find_median_sorted_arrays(nums1: List[int], nums2: List[int]) -> float:
    """
    Finds the median of two sorted arrays.

    Args:
        nums1: The first sorted array
        nums2: The second sorted array

    Returns:
        The median of the combined arrays
    """
    # TODO: Implement median finder using binary search
    # Hint: Perform binary search on the smaller array
    # Goal: Partition both arrays such that:
    #   1. Left partition has same number of elements as right partition
    #   2. All elements in left partition <= all elements in right partition
    #
    # For partition at position i in nums1 and j in nums2:
    #   j = (m + n + 1) // 2 - i
    #
    # Valid partition when:
    #   nums1[i-1] <= nums2[j] and nums2[j-1] <= nums1[i]
    raise NotImplementedError("Not implemented yet")


def find_median_naive(nums1: List[int], nums2: List[int]) -> float:
    """
    Naive approach: merge arrays and find median (for comparison).
    Time: O(m + n), Space: O(m + n)

    Args:
        nums1: The first sorted array
        nums2: The second sorted array

    Returns:
        The median of the combined arrays
    """
    # TODO: Optional - implement naive O(m+n) solution for comparison
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    nums1 = [1, 3]
    nums2 = [2]
    print(f"nums1 = {nums1}, nums2 = {nums2}")
    print(f"Median: {find_median_sorted_arrays(nums1, nums2)}")  # Expected: 2.0

    nums1 = [1, 2]
    nums2 = [3, 4]
    print(f"\nnums1 = {nums1}, nums2 = {nums2}")
    print(f"Median: {find_median_sorted_arrays(nums1, nums2)}")  # Expected: 2.5
