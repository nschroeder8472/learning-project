import pytest
from algorithms.searching.ex3_search_in_rotated_sorted_array import search


def test_target_in_rotated_part():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 0) == 4


def test_target_not_found():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 3) == -1


def test_single_element_not_found():
    arr = [1]
    assert search(arr, 0) == -1


def test_single_element_found():
    arr = [1]
    assert search(arr, 1) == 0


def test_no_rotation():
    arr = [1, 2, 3, 4, 5]
    assert search(arr, 3) == 2


def test_rotated_at_end():
    arr = [2, 3, 4, 5, 1]
    assert search(arr, 1) == 4
    assert search(arr, 5) == 3


def test_target_at_pivot():
    arr = [4, 5, 6, 7, 0, 1, 2]
    assert search(arr, 4) == 0
    assert search(arr, 2) == 6


def test_empty_array():
    arr = []
    assert search(arr, 5) == -1
