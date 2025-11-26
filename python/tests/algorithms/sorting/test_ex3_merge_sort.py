import pytest
from algorithms.sorting.ex3_merge_sort import merge_sort


def test_basic_case():
    arr = [38, 27, 43, 3, 9, 82, 10]
    merge_sort(arr)
    assert arr == [3, 9, 10, 27, 38, 43, 82]


def test_already_sorted():
    arr = [1, 2, 3, 4, 5]
    merge_sort(arr)
    assert arr == [1, 2, 3, 4, 5]


def test_reverse_sorted():
    arr = [5, 4, 3, 2, 1]
    merge_sort(arr)
    assert arr == [1, 2, 3, 4, 5]


def test_single_element():
    arr = [42]
    merge_sort(arr)
    assert arr == [42]


def test_empty_array():
    arr = []
    merge_sort(arr)
    assert arr == []


def test_with_duplicates():
    arr = [3, 1, 4, 1, 5, 9, 2, 6, 5]
    merge_sort(arr)
    assert arr == [1, 1, 2, 3, 4, 5, 5, 6, 9]


def test_all_same():
    arr = [5, 5, 5, 5, 5]
    merge_sort(arr)
    assert arr == [5, 5, 5, 5, 5]


def test_negative_numbers():
    arr = [-5, 2, -8, 1, 9]
    merge_sort(arr)
    assert arr == [-8, -5, 1, 2, 9]
