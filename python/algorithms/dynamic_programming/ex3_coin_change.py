"""
Exercise 3: Coin Change
Difficulty: Medium

Given coins of different denominations and a total amount,
find the minimum number of coins needed to make that amount.
If the amount cannot be made, return -1.

Example:
    Input: coins = [1, 2, 5], amount = 11
    Output: 3
    Explanation: 11 = 5 + 5 + 1

    Input: coins = [2], amount = 3
    Output: -1
    Explanation: Cannot make 3 with only coins of 2

    Input: coins = [1], amount = 0
    Output: 0

Time Complexity: O(amount × len(coins))
Space Complexity: O(amount)
"""

from typing import List


def coin_change(coins: List[int], amount: int) -> int:
    """
    Find minimum number of coins to make the amount.

    Args:
        coins: List of coin denominations
        amount: The target amount

    Returns:
        Minimum number of coins needed, or -1 if impossible
    """
    # TODO: Implement coin change
    # Create dp list of size amount + 1
    # Initialize dp[0] = 0, others = amount + 1 (infinity)
    # For each amount i from 1 to amount:
    #   For each coin:
    #     If coin <= i:
    #       dp[i] = min(dp[i], dp[i - coin] + 1)
    # Return dp[amount] if valid, else -1
    raise NotImplementedError("Not implemented yet")


def can_make_amount(coins: List[int], amount: int) -> bool:
    """
    Helper method to check if amount can be made with given coins.

    Args:
        coins: List of coin denominations
        amount: The target amount

    Returns:
        True if amount can be made, False otherwise
    """
    return coin_change(coins, amount) != -1


if __name__ == "__main__":
    # Example usage
    coins = [1, 2, 5]
    amount = 11
    result = coin_change(coins, amount)
    print(f"Minimum coins for amount {amount}: {result}")  # Expected: 3
