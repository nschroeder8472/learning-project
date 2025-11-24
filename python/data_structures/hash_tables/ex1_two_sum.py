"""
Exercise: Two Sum (Easy)

Given a list of integers nums and an integer target, return indices of the
two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may
not use the same element twice.

Example:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: nums[0] + nums[1] == 9, so return [0, 1]

Example 2:
Input: nums = [3, 2, 4], target = 6
Output: [1, 2]

Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List


def two_sum(nums: List[int], target: int) -> List[int]:
    """
    Find two numbers that add up to target and return their indices.

    Args:
        nums: List of integers
        target: Target sum

    Returns:
        List containing the two indices

    Raises:
        ValueError: If no solution exists
    """
    # TODO: Implement this function
    # Hint: Use a dictionary to store numbers you've seen and their indices
    # For each number, check if (target - number) exists in the dict
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    print(two_sum([2, 7, 11, 15], 9))  # Should output [0, 1]
    print(two_sum([3, 2, 4], 6))  # Should output [1, 2]
