"""Test cases for Fibonacci Number implementation."""

import pytest
from algorithms.dynamic_programming.ex1_fibonacci_number import (
    fib_recursive,
    fib_memoization,
    fib_tabulation,
    fib_optimized
)


def test_fib_base_case_0():
    assert fib_tabulation(0) == 0
    assert fib_memoization(0) == 0
    assert fib_optimized(0) == 0


def test_fib_base_case_1():
    assert fib_tabulation(1) == 1
    assert fib_memoization(1) == 1
    assert fib_optimized(1) == 1


def test_fib_small_numbers():
    assert fib_tabulation(2) == 1
    assert fib_tabulation(3) == 2
    assert fib_tabulation(4) == 3
    assert fib_tabulation(5) == 5


def test_fib_medium_numbers():
    assert fib_memoization(10) == 55
    assert fib_memoization(20) == 6765


def test_fib_consistency():
    # All methods should give same results
    for i in range(16):
        memo = fib_memoization(i)
        tab = fib_tabulation(i)
        opt = fib_optimized(i)
        assert memo == tab
        assert tab == opt


def test_fib_large_number():
    # Test with larger number (memoization and tabulation should handle this)
    assert fib_tabulation(30) == 832040


def test_fib_recursive_small():
    # Only test recursive with small numbers (exponential time!)
    assert fib_recursive(0) == 0
    assert fib_recursive(1) == 1
    assert fib_recursive(5) == 5


def test_fib_optimized_space():
    # Optimized version should handle larger numbers efficiently
    assert fib_optimized(40) == 102334155
