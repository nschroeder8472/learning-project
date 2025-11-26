"""
Exercise: Median of Two Sorted Arrays (Hard)

Given two sorted lists nums1 and nums2 of size m and n respectively,
return the median of the two sorted lists.

The overall run time complexity should be O(log(min(m,n))).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.0
Explanation: merged array = [1,2,3] and median is 2

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.5
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5

Example 3:
Input: nums1 = [], nums2 = [1]
Output: 1.0

Time Complexity: O(log(min(m,n))) - binary search on smaller array
Space Complexity: O(1)
"""

from typing import List


def find_median_sorted_arrays(nums1: List[int], nums2: List[int]) -> float:
    """
    Finds the median of two sorted lists.

    Args:
        nums1: First sorted list
        nums2: Second sorted list

    Returns:
        The median of the combined lists
    """
    # TODO: Implement median of two sorted arrays
    # Hint 1: Ensure nums1 is the smaller array (swap if necessary)
    # Hint 2: Use binary search on the smaller array to partition both arrays
    # Hint 3: Partition such that left half has (m+n+1)//2 elements
    # Hint 4: Find partition points partition_x and partition_y where:
    #         partition_x + partition_y = (m + n + 1) // 2
    # Hint 5: Check if partition is correct: max_left_x <= min_right_y && max_left_y <= min_right_x
    # Hint 6: If max_left_x > min_right_y, move partition left in nums1
    # Hint 7: If max_left_y > min_right_x, move partition right in nums1
    # Hint 8: When found, median is:
    #         - For odd total: max(max_left_x, max_left_y)
    #         - For even total: (max(max_left_x, max_left_y) + min(min_right_x, min_right_y)) / 2.0
    # Hint 9: Handle edge cases with float('-inf') and float('inf')
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    nums1 = [1, 3]
    nums2 = [2]
    result = find_median_sorted_arrays(nums1, nums2)
    print(f"Median of {nums1} and {nums2}: {result}")
