import pytest
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from big_o_analysis.ex6_optimize_code import *


def test_has_duplicates_optimized():
    assert has_duplicates_optimized([1, 2, 3, 1]) == True
    assert has_duplicates_optimized([1, 2, 3, 4]) == False
    assert get_complexity_has_duplicates() == "O(n)"


def test_two_sum_optimized():
    result = two_sum_optimized([2, 7, 11, 15], 9)
    assert result in [(0, 1), (1, 0)]

    result2 = two_sum_optimized([3, 2, 4], 6)
    assert result2 in [(1, 2), (2, 1)]

    assert get_complexity_two_sum() == "O(n)"


def test_first_non_repeating_optimized():
    assert first_non_repeating_optimized("aabbc") == "c"
    assert first_non_repeating_optimized("hello") == "h"
    assert first_non_repeating_optimized("aabbcc") == ""
    assert get_complexity_first_non_repeating() == "O(n)"


def test_find_common_optimized():
    result = find_common_optimized([1, 2, 3, 4, 5], [3, 4, 5, 6, 7])
    assert result == [3, 4, 5]

    result2 = find_common_optimized([1, 3, 5], [2, 4, 6])
    assert result2 == []

    assert get_complexity_find_common() == "O(n + m)"


def test_fibonacci_optimized():
    assert fibonacci_optimized(0) == 0
    assert fibonacci_optimized(1) == 1
    assert fibonacci_optimized(2) == 1
    assert fibonacci_optimized(3) == 2
    assert fibonacci_optimized(5) == 5
    assert fibonacci_optimized(10) == 55
    assert get_complexity_fibonacci() == "O(n)"


def test_max_subarray_sum_optimized():
    assert max_subarray_sum_optimized([-2, 1, -3, 4, -1, 2, 1, -5, 4]) == 6
    assert max_subarray_sum_optimized([1]) == 1
    assert max_subarray_sum_optimized([5, 4, -1, 7, 8]) == 23
    assert get_complexity_max_subarray_sum() == "O(n)"
