import pytest
from algorithms.searching.ex4_find_peak_element import find_peak_element


def test_peak_at_end():
    arr = [1, 2, 3, 1]
    assert find_peak_element(arr) == 2


def test_multiple_peaks():
    arr = [1, 2, 1, 3, 5, 6, 4]
    peak_idx = find_peak_element(arr)
    # Either index 1 (value 2) or index 5 (value 6) is valid
    assert peak_idx == 1 or peak_idx == 5


def test_single_element():
    arr = [1]
    assert find_peak_element(arr) == 0


def test_ascending_array():
    arr = [1, 2, 3, 4, 5]
    assert find_peak_element(arr) == 4


def test_descending_array():
    arr = [5, 4, 3, 2, 1]
    assert find_peak_element(arr) == 0


def test_two_elements_ascending():
    arr = [1, 2]
    assert find_peak_element(arr) == 1


def test_two_elements_descending():
    arr = [2, 1]
    assert find_peak_element(arr) == 0


def test_peak_in_middle():
    arr = [1, 5, 3]
    assert find_peak_element(arr) == 1
