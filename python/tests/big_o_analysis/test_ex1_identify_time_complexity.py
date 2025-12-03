import pytest
import sys
from pathlib import Path

# Add parent directory to path
sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from big_o_analysis.ex1_identify_time_complexity import *


def test_snippet1_complexity():
    assert get_complexity_snippet1() == "O(1)", "Array access is constant time"


def test_snippet2_complexity():
    assert get_complexity_snippet2() == "O(n)", "Linear search has linear time complexity"


def test_snippet3_complexity():
    assert get_complexity_snippet3() == "O(log n)", "Binary search has logarithmic time complexity"


def test_snippet4_complexity():
    assert get_complexity_snippet4() == "O(n^2)", "Nested loops over same array is quadratic"


def test_snippet5_complexity():
    assert get_complexity_snippet5() == "O(n)", "Two sequential loops is linear (O(n + n) = O(2n) = O(n))"


def test_snippet6_complexity():
    assert get_complexity_snippet6() == "O(n^2)", "Nested loop for finding duplicates is quadratic"
