"""Test cases for Find Peak Element."""

import pytest
from algorithms.searching.ex4_find_peak_element import find_peak_element


def test_single_peak():
    arr = [1, 2, 3, 1]
    peak = find_peak_element(arr)
    assert peak == 2


def test_multiple_peaks():
    arr = [1, 2, 1, 3, 5, 6, 4]
    peak = find_peak_element(arr)
    # Either index 1 (element 2) or index 5 (element 6) is valid
    assert peak in [1, 5]
    # Verify it's actually a peak
    if 0 < peak < len(arr) - 1:
        assert arr[peak] > arr[peak - 1] and arr[peak] > arr[peak + 1]


def test_single_element():
    arr = [1]
    assert find_peak_element(arr) == 0


def test_two_elements():
    arr = [1, 2]
    assert find_peak_element(arr) == 1


def test_ascending_array():
    arr = [1, 2, 3, 4, 5]
    # Last element should be peak
    assert find_peak_element(arr) == 4


def test_descending_array():
    arr = [5, 4, 3, 2, 1]
    # First element should be peak
    assert find_peak_element(arr) == 0


def test_peak_at_beginning():
    arr = [5, 4, 3, 2, 1]
    peak = find_peak_element(arr)
    assert peak == 0


def test_peak_at_end():
    arr = [1, 2, 3, 4, 5]
    peak = find_peak_element(arr)
    assert peak == 4


def test_all_same_elements():
    arr = [2, 2, 2, 2]
    peak = find_peak_element(arr)
    # Any element could be considered a peak in this case
    assert 0 <= peak < len(arr)


def test_valid_peak():
    arr = [1, 3, 20, 4, 1, 0]
    peak = find_peak_element(arr)
    assert peak == 2
    # Verify it's a peak
    assert arr[peak] > arr[peak - 1] and arr[peak] > arr[peak + 1]
