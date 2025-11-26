import pytest
from algorithms.sorting.ex2_selection_sort import selection_sort


def test_basic_case():
    arr = [64, 25, 12, 22, 11]
    selection_sort(arr)
    assert arr == [11, 12, 22, 25, 64]


def test_already_sorted():
    arr = [1, 2, 3, 4, 5]
    selection_sort(arr)
    assert arr == [1, 2, 3, 4, 5]


def test_reverse_sorted():
    arr = [5, 4, 3, 2, 1]
    selection_sort(arr)
    assert arr == [1, 2, 3, 4, 5]


def test_single_element():
    arr = [42]
    selection_sort(arr)
    assert arr == [42]


def test_empty_array():
    arr = []
    selection_sort(arr)
    assert arr == []


def test_with_duplicates():
    arr = [3, 1, 4, 1, 5, 9, 2, 6, 5]
    selection_sort(arr)
    assert arr == [1, 1, 2, 3, 4, 5, 5, 6, 9]


def test_all_same():
    arr = [5, 5, 5, 5, 5]
    selection_sort(arr)
    assert arr == [5, 5, 5, 5, 5]


def test_negative_numbers():
    arr = [-5, 2, -8, 1, 9]
    selection_sort(arr)
    assert arr == [-8, -5, 1, 2, 9]
