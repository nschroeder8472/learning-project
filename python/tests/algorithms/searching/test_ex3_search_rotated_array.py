"""Test cases for Search in Rotated Sorted Array."""

import pytest
from algorithms.searching.ex3_search_rotated_array import search


def test_element_found():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 0) == 4


def test_element_not_found():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 3) == -1


def test_no_rotation():
    arr = [1, 2, 3, 4, 5]
    assert search(arr, 3) == 2


def test_single_element():
    arr = [1]
    assert search(arr, 1) == 0
    assert search(arr, 0) == -1


def test_two_elements():
    arr = [3, 1]
    assert search(arr, 1) == 1
    assert search(arr, 3) == 0


def test_target_at_rotation_point():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 4) == 0


def test_target_in_left_half():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 5) == 1


def test_target_in_right_half():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 1) == 5


def test_large_rotation():
    arr = [7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6]
    assert search(arr, 3) == 8


def test_rotated_by_one():
    arr = [2, 3, 4, 5, 1]
    assert search(arr, 1) == 4
