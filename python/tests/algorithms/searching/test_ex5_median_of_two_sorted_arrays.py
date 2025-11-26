import pytest
from algorithms.searching.ex5_median_of_two_sorted_arrays import find_median_sorted_arrays


def test_odd_length_combined():
    nums1 = [1, 3]
    nums2 = [2]
    assert find_median_sorted_arrays(nums1, nums2) == 2.0


def test_even_length_combined():
    nums1 = [1, 2]
    nums2 = [3, 4]
    assert find_median_sorted_arrays(nums1, nums2) == 2.5


def test_first_array_empty():
    nums1 = []
    nums2 = [1]
    assert find_median_sorted_arrays(nums1, nums2) == 1.0


def test_second_array_empty():
    nums1 = [2]
    nums2 = []
    assert find_median_sorted_arrays(nums1, nums2) == 2.0


def test_both_arrays_single_element():
    nums1 = [1]
    nums2 = [2]
    assert find_median_sorted_arrays(nums1, nums2) == 1.5


def test_different_sizes():
    nums1 = [1, 3]
    nums2 = [2, 7, 9, 10]
    assert find_median_sorted_arrays(nums1, nums2) == 5.0


def test_no_overlap():
    nums1 = [1, 2]
    nums2 = [3, 4, 5]
    assert find_median_sorted_arrays(nums1, nums2) == 3.0


def test_negative_numbers():
    nums1 = [-5, -3, -1]
    nums2 = [-4, -2]
    assert find_median_sorted_arrays(nums1, nums2) == -3.0
