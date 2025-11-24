"""Tests for First Non-Repeating Character exercise."""

import pytest
from data_structures.hash_tables.ex4_first_non_repeating_char import first_uniq_char


def test_basic_case():
    s = "leetcode"
    assert first_uniq_char(s) == 0


def test_middle_character():
    s = "loveleetcode"
    assert first_uniq_char(s) == 2


def test_all_duplicates():
    s = "aabb"
    assert first_uniq_char(s) == -1


def test_single_character():
    s = "a"
    assert first_uniq_char(s) == 0


def test_all_unique():
    s = "abcd"
    assert first_uniq_char(s) == 0


def test_last_character_unique():
    s = "aabbccz"
    assert first_uniq_char(s) == 6


def test_repeating_pattern():
    s = "dddccdbba"
    assert first_uniq_char(s) == 8
