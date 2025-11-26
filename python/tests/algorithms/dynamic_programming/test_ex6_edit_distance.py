"""Test cases for Edit Distance implementation."""

import pytest
from algorithms.dynamic_programming.ex6_edit_distance import min_distance


def test_basic_case():
    assert min_distance("horse", "ros") == 3
    # horse -> rorse -> rose -> ros


def test_longer_strings():
    assert min_distance("intention", "execution") == 5


def test_identical_strings():
    assert min_distance("abc", "abc") == 0


def test_empty_strings():
    assert min_distance("abc", "") == 3
    # Delete all 3 characters

    assert min_distance("", "abc") == 3
    # Insert all 3 characters

    assert min_distance("", "") == 0


def test_single_character():
    assert min_distance("a", "a") == 0
    assert min_distance("a", "b") == 1
    assert min_distance("a", "") == 1
    assert min_distance("", "a") == 1


def test_only_inserts():
    assert min_distance("", "abc") == 3


def test_only_deletes():
    assert min_distance("abc", "") == 3


def test_only_replaces():
    assert min_distance("abc", "def") == 3


def test_partial_match():
    assert min_distance("sea", "eat") == 2
    # sea -> eea -> eat (insert e, replace s with t)
    # Or: sea -> ea -> eat (delete s, insert t)


def test_one_is_substring_of_other():
    assert min_distance("abc", "abcde") == 2
    # Insert 'd' and 'e'


def test_reversed_strings():
    assert min_distance("abc", "cba") == 2
    # abc -> cbc -> cba (or other combinations)


def test_case_matters():
    assert min_distance("Hello", "hello") == 1
    # Replace 'H' with 'h'
