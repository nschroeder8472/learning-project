"""Test cases for House Robber implementation."""

import pytest
from algorithms.dynamic_programming.ex5_house_robber import (
    rob,
    rob_optimized
)


def test_basic_case():
    nums = [1, 2, 3, 1]
    assert rob(nums) == 4
    # Rob house 1 (1) and house 3 (3) = 4


def test_longer_array():
    nums = [2, 7, 9, 3, 1]
    assert rob(nums) == 12
    # Rob houses 1, 3, 5 (2 + 9 + 1 = 12)


def test_single_house():
    nums = [5]
    assert rob(nums) == 5


def test_two_houses():
    nums = [2, 3]
    assert rob(nums) == 3

    nums2 = [5, 1]
    assert rob(nums2) == 5


def test_three_houses():
    nums = [2, 1, 1, 2]
    assert rob(nums) == 4
    # Rob houses 1 and 4 (2 + 2 = 4)


def test_all_same_value():
    nums = [5, 5, 5, 5, 5]
    assert rob(nums) == 15
    # Rob houses 1, 3, 5 (5 + 5 + 5 = 15)


def test_increasing_values():
    nums = [1, 2, 3, 4, 5]
    assert rob(nums) == 9
    # Rob houses 2, 4 (2 + 4 = 6) or 1, 3, 5 (1 + 3 + 5 = 9)


def test_decreasing_values():
    nums = [5, 4, 3, 2, 1]
    assert rob(nums) == 9
    # Rob houses 1, 3, 5 (5 + 3 + 1 = 9)


def test_optimized_matches_regular():
    nums = [2, 7, 9, 3, 1]
    assert rob(nums) == rob_optimized(nums)


def test_large_array():
    nums = [2, 1, 1, 2, 10, 1, 1, 10]
    assert rob(nums) == 22
    # Rob houses with 2, 10, 10 = 22
