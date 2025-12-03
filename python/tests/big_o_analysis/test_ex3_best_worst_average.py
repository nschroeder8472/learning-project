import pytest
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from big_o_analysis.ex3_best_worst_average import *


def test_linear_search_cases():
    assert linear_search_best_case() == "O(1)", "Best case: target is first element"
    assert linear_search_worst_case() == "O(n)", "Worst case: target is last or not present"
    assert linear_search_average_case() == "O(n)", "Average case: still linear"


def test_insertion_sort_cases():
    assert insertion_sort_best_case() == "O(n)", "Best case: already sorted array"
    assert insertion_sort_worst_case() == "O(n^2)", "Worst case: reverse sorted array"
    assert insertion_sort_average_case() == "O(n^2)", "Average case: quadratic"


def test_quick_sort_cases():
    assert quick_sort_best_case() == "O(n log n)", "Best case: balanced partitions"
    assert quick_sort_worst_case() == "O(n^2)", \
        "Worst case: unbalanced partitions (e.g., already sorted with last element as pivot)"
    assert quick_sort_average_case() == "O(n log n)", "Average case: typically balanced partitions"


def test_binary_search_cases():
    assert binary_search_best_case() == "O(1)", "Best case: target is middle element"
    assert binary_search_worst_case() == "O(log n)", "Worst case: target requires full binary divisions"
    assert binary_search_average_case() == "O(log n)", "Average case: logarithmic"
