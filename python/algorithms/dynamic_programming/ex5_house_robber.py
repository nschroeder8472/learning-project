"""
Exercise 5: House Robber
Difficulty: Medium

You are a robber planning to rob houses along a street.
Each house has a certain amount of money.
Adjacent houses have security systems connected, so you cannot rob
two adjacent houses on the same night.

Given a list of non-negative integers representing the amount of money
in each house, determine the maximum amount you can rob tonight.

Example:
    Input: nums = [1, 2, 3, 1]
    Output: 4
    Explanation: Rob house 1 (money = 1) and house 3 (money = 3). Total = 4

    Input: nums = [2, 7, 9, 3, 1]
    Output: 12
    Explanation: Rob houses 1, 3, and 5 (2 + 9 + 1 = 12)

    Input: nums = [2, 1, 1, 2]
    Output: 4
    Explanation: Rob houses 1 and 4 (2 + 2 = 4)

Time Complexity: O(n)
Space Complexity: O(n) with DP array, O(1) with optimization
"""

from typing import List


def rob(nums: List[int]) -> int:
    """
    Find maximum amount that can be robbed.

    Args:
        nums: List of money in each house

    Returns:
        Maximum amount that can be robbed
    """
    # TODO: Implement house robber
    # dp[i] = max money robbing up to house i
    # dp[i] = max(nums[i] + dp[i-2], dp[i-1])
    # Either rob current house + skip previous, or skip current
    raise NotImplementedError("Not implemented yet")


def rob_optimized(nums: List[int]) -> int:
    """
    Space-optimized approach using only two variables.

    Args:
        nums: List of money in each house

    Returns:
        Maximum amount that can be robbed
    """
    # TODO: Implement space-optimized version
    # Only need to track last two values
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    nums = [2, 7, 9, 3, 1]
    result = rob(nums)
    print(f"Maximum money that can be robbed: {result}")  # Expected: 12
