import pytest
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from big_o_analysis.ex2_space_complexity import *


def test_snippet1_space_complexity():
    assert get_space_complexity_snippet1() == "O(1)", \
        "Only uses a single sum variable - constant space"


def test_snippet2_space_complexity():
    assert get_space_complexity_snippet2() == "O(n)", \
        "Creates a copy list of size n - linear space"


def test_snippet3_space_complexity():
    assert get_space_complexity_snippet3() == "O(n)", \
        "Recursion stack depth is n - linear space"


def test_snippet4_space_complexity():
    assert get_space_complexity_snippet4() == "O(n^2)", \
        "Creates n×n matrix - quadratic space"


def test_snippet5_space_complexity():
    assert get_space_complexity_snippet5() == "O(n)", \
        "Worst case: all elements pass filter - linear space"


def test_snippet6_space_complexity():
    assert get_space_complexity_snippet6() == "O(n)", \
        "Memo stores n values and stack depth is O(n) - linear space"
