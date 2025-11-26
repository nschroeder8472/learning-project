"""Test cases for Linear Search implementation."""

import pytest
from algorithms.searching.ex1_linear_search import linear_search, linear_search_range


def test_element_found():
    arr = [5, 2, 8, 1, 9]
    assert linear_search(arr, 8) == 2


def test_element_not_found():
    arr = [5, 2, 8, 1, 9]
    assert linear_search(arr, 7) == -1


def test_first_element():
    arr = [10, 20, 30, 40]
    assert linear_search(arr, 10) == 0


def test_last_element():
    arr = [10, 20, 30, 40]
    assert linear_search(arr, 40) == 3


def test_single_element():
    arr = [42]
    assert linear_search(arr, 42) == 0


def test_single_element_not_found():
    arr = [42]
    assert linear_search(arr, 1) == -1


def test_empty_array():
    arr = []
    assert linear_search(arr, 5) == -1


def test_duplicate_elements():
    arr = [3, 5, 3, 7, 3]
    # Should return the first occurrence
    assert linear_search(arr, 3) == 0


def test_ranged_search():
    arr = [1, 2, 3, 4, 5, 6, 7]
    # Search for 5 between index 2 and 6
    assert linear_search_range(arr, 5, 2, 6) == 4


def test_ranged_search_not_in_range():
    arr = [1, 2, 3, 4, 5, 6, 7]
    # Search for 7 between index 0 and 5 (7 is at index 6)
    assert linear_search_range(arr, 7, 0, 5) == -1
