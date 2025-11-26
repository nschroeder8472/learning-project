"""Test cases for Longest Common Subsequence implementation."""

import pytest
from algorithms.dynamic_programming.ex4_longest_common_subsequence import (
    longest_common_subsequence
)


def test_basic_lcs():
    assert longest_common_subsequence("abcde", "ace") == 3
    # LCS is "ace"


def test_identical_strings():
    assert longest_common_subsequence("abc", "abc") == 3


def test_no_common_subsequence():
    assert longest_common_subsequence("abc", "def") == 0


def test_empty_string():
    assert longest_common_subsequence("", "abc") == 0
    assert longest_common_subsequence("abc", "") == 0
    assert longest_common_subsequence("", "") == 0


def test_single_char_match():
    assert longest_common_subsequence("a", "a") == 1
    assert longest_common_subsequence("a", "b") == 0


def test_partial_match():
    assert longest_common_subsequence("abcdef", "aecbdf") == 4
    # LCS could be "abdf" or "acdf" (both length 4)


def test_longer_strings():
    assert longest_common_subsequence("AGGTAB", "GXTXAYB") == 4
    # LCS is "GTAB"


def test_reversed_strings():
    assert longest_common_subsequence("abc", "cba") == 1
    # Only middle character 'b' is common in subsequence


def test_one_substring_of_other():
    assert longest_common_subsequence("abc", "aXbXcX") == 3
    # LCS is "abc"


def test_repeated_characters():
    assert longest_common_subsequence("aaa", "aaa") == 3
    assert longest_common_subsequence("aaa", "aa") == 2
