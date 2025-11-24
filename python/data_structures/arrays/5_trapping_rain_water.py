"""
Exercise: Trapping Rain Water (Hard)

Given a list representing elevation of bars, calculate how much water
can be trapped after raining.

Example:
Input: [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6

Visualization:
       █
   █   █ █   █
 █ █ █ █ █ █ █
[0,1,0,2,1,0,1,3,2,1,2,1]

Time Complexity: O(n)
Space Complexity: O(1) for optimal solution
"""

from typing import List


def trap(height: List[int]) -> int:
    """
    Calculate the amount of water that can be trapped.

    Args:
        height: List of non-negative integers representing bar heights

    Returns:
        Total amount of trapped water
    """
    # TODO: Implement this function
    # Hint: For each position, water level = min(max_left, max_right) - current_height
    # Approach 1: Precompute max_left and max_right lists (O(n) space)
    # Approach 2: Use two pointers for O(1) space
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    test_height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
    print(f"Water trapped: {trap(test_height)} units")
