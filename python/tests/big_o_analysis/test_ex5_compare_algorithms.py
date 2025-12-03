import pytest
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from big_o_analysis.ex5_compare_algorithms import *


def test_search_small_unsorted():
    assert choose_search_small_unsorted() == "linear_search", \
        "For small arrays, linear search is simpler and avoids sorting overhead"


def test_search_large_multiple():
    assert choose_search_large_multiple() == "hash_table", \
        "Hash table provides O(1) average lookups after O(n) preprocessing"


def test_sort_nearly_sorted():
    assert choose_sort_nearly_sorted() == "insertion_sort", \
        "Insertion sort is O(n) for nearly-sorted data"


def test_sort_guaranteed_performance():
    assert choose_sort_guaranteed_performance() == "merge_sort", \
        "Merge sort guarantees O(n log n) worst case"


def test_sort_in_place():
    assert choose_sort_in_place() == "heap_sort", "Heap sort uses O(1) extra space"


def test_find_duplicates():
    assert choose_find_duplicates() == "hash_set", "Hash set is fastest at O(n) time"


def test_contains_check_sorted():
    assert choose_contains_check_sorted() == "binary_search", \
        "Binary search is O(log n) on sorted array"
