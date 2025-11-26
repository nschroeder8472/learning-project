"""Test cases for Median of Two Sorted Arrays."""

import pytest
from algorithms.searching.ex5_median_two_arrays import find_median_sorted_arrays


DELTA = 0.00001


def test_odd_total_length():
    nums1 = [1, 3]
    nums2 = [2]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 2.0) < DELTA


def test_even_total_length():
    nums1 = [1, 2]
    nums2 = [3, 4]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 2.5) < DELTA


def test_first_array_empty():
    nums1 = []
    nums2 = [1]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 1.0) < DELTA


def test_second_array_empty():
    nums1 = [2]
    nums2 = []
    assert abs(find_median_sorted_arrays(nums1, nums2) - 2.0) < DELTA


def test_both_arrays_single_element():
    nums1 = [1]
    nums2 = [2]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 1.5) < DELTA


def test_different_sizes():
    nums1 = [1, 3, 5, 7, 9]
    nums2 = [2, 4, 6]
    # Merged: [1, 2, 3, 4, 5, 6, 7, 9]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 4.5) < DELTA


def test_no_overlap():
    nums1 = [1, 2, 3]
    nums2 = [4, 5, 6]
    # Merged: [1, 2, 3, 4, 5, 6]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 3.5) < DELTA


def test_complete_overlap():
    nums1 = [1, 2]
    nums2 = [1, 2]
    # Merged: [1, 1, 2, 2]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 1.5) < DELTA


def test_negative_numbers():
    nums1 = [-5, -3, -1]
    nums2 = [-4, -2, 0]
    # Merged: [-5, -4, -3, -2, -1, 0]
    assert abs(find_median_sorted_arrays(nums1, nums2) - (-2.5)) < DELTA


def test_large_arrays():
    nums1 = list(range(1, 11))  # [1, 2, ..., 10]
    nums2 = list(range(11, 21))  # [11, 12, ..., 20]
    # Merged: [1..20], median = (10 + 11) / 2 = 10.5
    assert abs(find_median_sorted_arrays(nums1, nums2) - 10.5) < DELTA


def test_one_element_in_first_array():
    nums1 = [3]
    nums2 = [1, 2, 4, 5]
    # Merged: [1, 2, 3, 4, 5]
    assert abs(find_median_sorted_arrays(nums1, nums2) - 3.0) < DELTA
