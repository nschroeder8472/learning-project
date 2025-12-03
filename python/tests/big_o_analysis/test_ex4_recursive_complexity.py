import pytest
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from big_o_analysis.ex4_recursive_complexity import *


def test_factorial_complexity():
    assert get_complexity_factorial() == "O(n)", "Factorial makes n recursive calls"


def test_fibonacci_complexity():
    assert get_complexity_fibonacci() == "O(2^n)", "Naive Fibonacci has exponential complexity"


def test_binary_search_complexity():
    assert get_complexity_binary_search() == "O(log n)", "Binary search halves the problem each time"


def test_merge_sort_complexity():
    assert get_complexity_merge_sort() == "O(n log n)", "Merge sort: T(n) = 2T(n/2) + O(n)"


def test_tower_of_hanoi_complexity():
    assert get_complexity_tower_of_hanoi() == "O(2^n)", "Tower of Hanoi: T(n) = 2T(n-1) + O(1) = O(2^n)"


def test_sum_array_complexity():
    assert get_complexity_sum_array() == "O(n)", "Divide-and-conquer sum: T(n) = 2T(n/2) + O(1) = O(n)"
