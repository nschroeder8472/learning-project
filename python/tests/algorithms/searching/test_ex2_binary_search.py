"""Test cases for Binary Search implementation."""

import pytest
from algorithms.searching.ex2_binary_search import (
    binary_search_iterative,
    binary_search_recursive
)


def test_iterative_element_found():
    arr = [1, 3, 5, 7, 9, 11]
    assert binary_search_iterative(arr, 7) == 3


def test_iterative_element_not_found():
    arr = [1, 3, 5, 7, 9, 11]
    assert binary_search_iterative(arr, 4) == -1


def test_iterative_first_element():
    arr = [2, 4, 6, 8, 10]
    assert binary_search_iterative(arr, 2) == 0


def test_iterative_last_element():
    arr = [2, 4, 6, 8, 10]
    assert binary_search_iterative(arr, 10) == 4


def test_iterative_single_element():
    arr = [5]
    assert binary_search_iterative(arr, 5) == 0


def test_iterative_empty_array():
    arr = []
    assert binary_search_iterative(arr, 1) == -1


def test_iterative_large_array():
    arr = [i * 2 for i in range(1000)]  # Even numbers: 0, 2, 4, ..., 1998
    assert binary_search_iterative(arr, 500) == 250
    assert binary_search_iterative(arr, 501) == -1


def test_recursive_element_found():
    arr = [1, 3, 5, 7, 9, 11]
    assert binary_search_recursive(arr, 7) == 3


def test_recursive_element_not_found():
    arr = [1, 3, 5, 7, 9, 11]
    assert binary_search_recursive(arr, 4) == -1


def test_recursive_single_element():
    arr = [42]
    assert binary_search_recursive(arr, 42) == 0


def test_recursive_empty_array():
    arr = []
    assert binary_search_recursive(arr, 1) == -1
