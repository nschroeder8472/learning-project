"""Tests for Contains Duplicate exercise."""

import pytest
from data_structures.hash_tables.ex2_contains_duplicate import contains_duplicate


def test_has_duplicate():
    nums = [1, 2, 3, 1]
    assert contains_duplicate(nums) is True


def test_no_duplicate():
    nums = [1, 2, 3, 4]
    assert contains_duplicate(nums) is False


def test_multiple_duplicates():
    nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    assert contains_duplicate(nums) is True


def test_single_element():
    nums = [1]
    assert contains_duplicate(nums) is False


def test_empty_list():
    nums = []
    assert contains_duplicate(nums) is False


def test_consecutive_duplicates():
    nums = [1, 2, 2, 3, 4]
    assert contains_duplicate(nums) is True


def test_all_same_elements():
    nums = [5, 5, 5, 5, 5]
    assert contains_duplicate(nums) is True


def test_negative_numbers():
    nums = [-1, -2, -3, -1]
    assert contains_duplicate(nums) is True
