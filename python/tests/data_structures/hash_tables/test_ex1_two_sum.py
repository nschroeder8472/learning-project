"""Tests for Two Sum exercise."""

import pytest
from data_structures.hash_tables.ex1_two_sum import two_sum


def test_basic_case():
    nums = [2, 7, 11, 15]
    target = 9
    result = two_sum(nums, target)
    assert len(result) == 2
    assert nums[result[0]] + nums[result[1]] == 9


def test_different_order():
    nums = [3, 2, 4]
    target = 6
    result = two_sum(nums, target)
    assert len(result) == 2
    assert nums[result[0]] + nums[result[1]] == 6


def test_negative_numbers():
    nums = [-1, -2, -3, -4, -5]
    target = -8
    result = two_sum(nums, target)
    assert len(result) == 2
    assert nums[result[0]] + nums[result[1]] == -8


def test_with_zero():
    nums = [0, 4, 3, 0]
    target = 0
    result = two_sum(nums, target)
    assert len(result) == 2
    assert nums[result[0]] + nums[result[1]] == 0


def test_two_elements():
    nums = [1, 2]
    target = 3
    result = two_sum(nums, target)
    assert len(result) == 2
    assert nums[result[0]] + nums[result[1]] == 3


def test_large_numbers():
    nums = [1000000, 2000000, 3000000]
    target = 5000000
    result = two_sum(nums, target)
    assert len(result) == 2
    assert nums[result[0]] + nums[result[1]] == 5000000
