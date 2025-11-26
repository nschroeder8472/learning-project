"""
Exercise 1: Fibonacci Number
Difficulty: Easy

Calculate the nth Fibonacci number using dynamic programming.
The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2) for n > 1

Example:
    Input: n = 4
    Output: 3
    Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3

    Input: n = 10
    Output: 55

Time Complexity:
    - Naive recursion: O(2^n)
    - Memoization: O(n)
    - Tabulation: O(n)
    - Space-optimized: O(1)

Space Complexity:
    - Memoization: O(n) for call stack + memo
    - Tabulation: O(n) for array
    - Space-optimized: O(1)
"""

from typing import Dict


def fib_recursive(n: int) -> int:
    """
    Naive recursive approach (exponential time - DO NOT USE for large n).

    Args:
        n: The index in Fibonacci sequence

    Returns:
        The nth Fibonacci number
    """
    # TODO: Implement naive recursive solution
    # Base cases: if n == 0 return 0, if n == 1 return 1
    # Recursive case: return fib(n-1) + fib(n-2)
    raise NotImplementedError("Not implemented yet")


def fib_memoization(n: int) -> int:
    """
    Top-down approach with memoization.

    Args:
        n: The index in Fibonacci sequence

    Returns:
        The nth Fibonacci number
    """
    memo: Dict[int, int] = {}

    def helper(n: int) -> int:
        # TODO: Implement memoization approach
        # Check if result is in memo
        # If not, compute recursively and store in memo
        raise NotImplementedError("Not implemented yet")

    return helper(n)


def fib_tabulation(n: int) -> int:
    """
    Bottom-up approach with tabulation.

    Args:
        n: The index in Fibonacci sequence

    Returns:
        The nth Fibonacci number
    """
    # TODO: Implement tabulation approach
    # Create list dp of size n+1
    # Initialize base cases: dp[0] = 0, dp[1] = 1
    # Fill list: dp[i] = dp[i-1] + dp[i-2]
    raise NotImplementedError("Not implemented yet")


def fib_optimized(n: int) -> int:
    """
    Space-optimized approach (only keep last two values).

    Args:
        n: The index in Fibonacci sequence

    Returns:
        The nth Fibonacci number
    """
    # TODO: Implement space-optimized approach
    # Only need to track previous two values
    # Use two variables instead of array
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    n = 10

    print(f"Fibonacci number at position {n}:")
    print(f"Memoization: {fib_memoization(n)}")  # Expected: 55
    print(f"Tabulation: {fib_tabulation(n)}")  # Expected: 55
    print(f"Optimized: {fib_optimized(n)}")  # Expected: 55
