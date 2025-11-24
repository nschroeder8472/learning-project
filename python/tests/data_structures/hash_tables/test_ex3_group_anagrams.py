"""Tests for Group Anagrams exercise."""

import pytest
from data_structures.hash_tables.ex3_group_anagrams import group_anagrams


def test_basic_case():
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    result = group_anagrams(strs)
    assert len(result) == 3

    # Convert to sets for easier comparison (order doesn't matter)
    result_sets = [set(group) for group in result]
    expected_sets = [
        {"eat", "tea", "ate"},
        {"tan", "nat"},
        {"bat"}
    ]

    assert all(s in result_sets for s in expected_sets)


def test_empty_string():
    strs = [""]
    result = group_anagrams(strs)
    assert len(result) == 1
    assert len(result[0]) == 1
    assert result[0][0] == ""


def test_single_string():
    strs = ["a"]
    result = group_anagrams(strs)
    assert len(result) == 1
    assert len(result[0]) == 1
    assert result[0][0] == "a"


def test_no_anagrams():
    strs = ["abc", "def", "ghi"]
    result = group_anagrams(strs)
    assert len(result) == 3


def test_all_anagrams():
    strs = ["abc", "bca", "cab"]
    result = group_anagrams(strs)
    assert len(result) == 1
    assert len(result[0]) == 3


def test_different_lengths():
    strs = ["a", "ab", "ba", "abc", "bca"]
    result = group_anagrams(strs)
    assert len(result) == 3
