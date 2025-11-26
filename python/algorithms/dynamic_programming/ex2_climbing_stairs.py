"""
Exercise 2: Climbing Stairs
Difficulty: Easy

You are climbing a staircase with n steps. Each time you can climb 1 or 2 steps.
How many distinct ways can you climb to the top?

Example:
    Input: n = 2
    Output: 2
    Explanation: Two ways: 1+1, or 2

    Input: n = 3
    Output: 3
    Explanation: Three ways: 1+1+1, 1+2, or 2+1

    Input: n = 5
    Output: 8
    Explanation: Eight ways to reach step 5

Key Insight: This is actually the Fibonacci sequence!
To reach step n, you must come from step (n-1) or (n-2)
So: ways(n) = ways(n-1) + ways(n-2)

Time Complexity: O(n)
Space Complexity: O(n) with DP array, O(1) with optimization
"""

from typing import List


def climb_stairs(n: int) -> int:
    """
    Count ways to climb stairs using dynamic programming.

    Args:
        n: The number of stairs

    Returns:
        The number of distinct ways to climb
    """
    # TODO: Implement climbing stairs
    # Base cases: 1 stair = 1 way, 2 stairs = 2 ways
    # Use DP: dp[i] = dp[i-1] + dp[i-2]
    raise NotImplementedError("Not implemented yet")


def climb_stairs_optimized(n: int) -> int:
    """
    Space-optimized approach using only two variables.

    Args:
        n: The number of stairs

    Returns:
        The number of distinct ways to climb
    """
    # TODO: Implement space-optimized version
    # Only track last two values
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    for stairs in [2, 3, 5, 10]:
        print(f"Ways to climb {stairs} stairs: {climb_stairs(stairs)}")
