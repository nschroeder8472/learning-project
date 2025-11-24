"""Tests for Longest Substring Without Repeating Characters exercise."""

import pytest
from data_structures.hash_tables.ex5_longest_substring_without_repeating import length_of_longest_substring


def test_basic_case():
    s = "abcabcbb"
    assert length_of_longest_substring(s) == 3


def test_all_same():
    s = "bbbbb"
    assert length_of_longest_substring(s) == 1


def test_mixed_case():
    s = "pwwkew"
    assert length_of_longest_substring(s) == 3


def test_empty_string():
    s = ""
    assert length_of_longest_substring(s) == 0


def test_single_character():
    s = "a"
    assert length_of_longest_substring(s) == 1


def test_all_unique():
    s = "abcdef"
    assert length_of_longest_substring(s) == 6


def test_with_spaces():
    s = "a b c a b c"
    assert length_of_longest_substring(s) == 3


def test_long_string():
    s = "dvdf"
    assert length_of_longest_substring(s) == 3
