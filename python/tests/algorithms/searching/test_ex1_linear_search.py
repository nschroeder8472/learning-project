import pytest
from algorithms.searching.ex1_linear_search import linear_search


def test_element_found():
    arr = [4, 2, 7, 1, 9, 5]
    assert linear_search(arr, 7) == 2


def test_element_not_found():
    arr = [4, 2, 7, 1, 9, 5]
    assert linear_search(arr, 10) == -1


def test_first_element():
    arr = [4, 2, 7, 1, 9, 5]
    assert linear_search(arr, 4) == 0


def test_last_element():
    arr = [4, 2, 7, 1, 9, 5]
    assert linear_search(arr, 5) == 5


def test_single_element_found():
    arr = [42]
    assert linear_search(arr, 42) == 0


def test_single_element_not_found():
    arr = [42]
    assert linear_search(arr, 10) == -1


def test_empty_array():
    arr = []
    assert linear_search(arr, 5) == -1


def test_duplicates_returns_first():
    arr = [1, 3, 5, 3, 7]
    assert linear_search(arr, 3) == 1
