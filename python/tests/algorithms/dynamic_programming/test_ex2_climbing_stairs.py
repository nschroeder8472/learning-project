"""Test cases for Climbing Stairs implementation."""

import pytest
from algorithms.dynamic_programming.ex2_climbing_stairs import (
    climb_stairs,
    climb_stairs_optimized
)


def test_one_stair():
    assert climb_stairs(1) == 1


def test_two_stairs():
    assert climb_stairs(2) == 2
    # Two ways: 1+1, or 2


def test_three_stairs():
    assert climb_stairs(3) == 3
    # Three ways: 1+1+1, 1+2, or 2+1


def test_four_stairs():
    assert climb_stairs(4) == 5
    # Five ways: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2


def test_five_stairs():
    assert climb_stairs(5) == 8


def test_medium_stairs():
    assert climb_stairs(10) == 89


def test_large_stairs():
    assert climb_stairs(20) == 10946


def test_optimized_matches_regular():
    # Both methods should give same results
    for i in range(1, 16):
        assert climb_stairs(i) == climb_stairs_optimized(i)


def test_very_large_stairs():
    # Should handle large inputs efficiently
    result = climb_stairs(35)
    assert result > 0  # Should complete without timeout
