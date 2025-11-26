import pytest
from algorithms.searching.ex2_binary_search import binary_search


def test_element_found():
    arr = [1, 3, 5, 7, 9, 11, 13]
    assert binary_search(arr, 7) == 3


def test_element_not_found():
    arr = [1, 3, 5, 7, 9, 11, 13]
    assert binary_search(arr, 6) == -1


def test_first_element():
    arr = [1, 3, 5, 7, 9, 11, 13]
    assert binary_search(arr, 1) == 0


def test_last_element():
    arr = [1, 3, 5, 7, 9, 11, 13]
    assert binary_search(arr, 13) == 6


def test_single_element_found():
    arr = [42]
    assert binary_search(arr, 42) == 0


def test_single_element_not_found():
    arr = [42]
    assert binary_search(arr, 10) == -1


def test_empty_array():
    arr = []
    assert binary_search(arr, 5) == -1


def test_two_elements():
    arr = [1, 3]
    assert binary_search(arr, 1) == 0
    assert binary_search(arr, 3) == 1
    assert binary_search(arr, 2) == -1
