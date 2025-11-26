"""Test cases for Coin Change implementation."""

import pytest
from algorithms.dynamic_programming.ex3_coin_change import (
    coin_change,
    can_make_amount
)


def test_basic_case():
    coins = [1, 2, 5]
    assert coin_change(coins, 11) == 3
    # 11 = 5 + 5 + 1


def test_impossible():
    coins = [2]
    assert coin_change(coins, 3) == -1
    # Cannot make 3 with only coins of 2


def test_zero_amount():
    coins = [1]
    assert coin_change(coins, 0) == 0


def test_single_coin():
    coins = [1]
    assert coin_change(coins, 5) == 5


def test_exact_match():
    coins = [1, 2, 5]
    assert coin_change(coins, 5) == 1


def test_multiple_solutions():
    coins = [1, 3, 4]
    assert coin_change(coins, 6) == 2
    # 6 = 3 + 3 (better than 4 + 1 + 1)


def test_large_denominations():
    coins = [25, 10, 5, 1]
    assert coin_change(coins, 41) == 4
    # 41 = 25 + 10 + 5 + 1


def test_greedy_fails():
    coins = [1, 3, 4]
    assert coin_change(coins, 6) == 2
    # Greedy would choose 4 + 1 + 1 = 3 coins
    # Optimal is 3 + 3 = 2 coins


def test_large_amount():
    coins = [1, 5, 10, 25]
    result = coin_change(coins, 99)
    assert result <= 9  # Should be around 9 coins


def test_can_make_amount():
    coins = [1, 2, 5]
    assert can_make_amount(coins, 11) is True

    coins2 = [2]
    assert can_make_amount(coins2, 3) is False
