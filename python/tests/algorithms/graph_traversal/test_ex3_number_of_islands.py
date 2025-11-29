"""Test cases for Number of Islands implementation."""

import pytest
from algorithms.graph_traversal.ex3_number_of_islands import num_islands, num_islands_bfs


def test_three_islands():
    grid = [
        ['1', '1', '0', '0', '0'],
        ['1', '1', '0', '0', '0'],
        ['0', '0', '1', '0', '0'],
        ['0', '0', '0', '1', '1']
    ]
    assert num_islands(grid) == 3


def test_one_island():
    grid = [
        ['1', '1', '1', '1', '0'],
        ['1', '1', '0', '1', '0'],
        ['1', '1', '0', '0', '0'],
        ['0', '0', '0', '0', '0']
    ]
    assert num_islands(grid) == 1


def test_no_islands():
    grid = [
        ['0', '0', '0'],
        ['0', '0', '0'],
        ['0', '0', '0']
    ]
    assert num_islands(grid) == 0


def test_all_island():
    grid = [
        ['1', '1'],
        ['1', '1']
    ]
    assert num_islands(grid) == 1


def test_single_cell():
    grid = [['1']]
    assert num_islands(grid) == 1


def test_single_cell_water():
    grid = [['0']]
    assert num_islands(grid) == 0


def test_diagonal_islands():
    grid = [
        ['1', '0', '1'],
        ['0', '1', '0'],
        ['1', '0', '1']
    ]
    # Diagonal cells are not connected, so 5 separate islands
    assert num_islands(grid) == 5


def test_large_island():
    grid = [
        ['1', '1', '1', '1', '1'],
        ['1', '0', '0', '0', '1'],
        ['1', '0', '1', '0', '1'],
        ['1', '0', '0', '0', '1'],
        ['1', '1', '1', '1', '1']
    ]
    assert num_islands(grid) == 2  # Outer ring and center


def test_horizontal_strip():
    grid = [
        ['1', '1', '1', '1', '1']
    ]
    assert num_islands(grid) == 1


def test_vertical_strip():
    grid = [
        ['1'],
        ['1'],
        ['1'],
        ['1']
    ]
    assert num_islands(grid) == 1


def test_bfs_version():
    grid = [
        ['1', '1', '0', '0', '0'],
        ['1', '1', '0', '0', '0'],
        ['0', '0', '1', '0', '0'],
        ['0', '0', '0', '1', '1']
    ]
    assert num_islands_bfs(grid) == 3


def test_bfs_single_island():
    grid = [
        ['1', '1', '1'],
        ['0', '1', '0'],
        ['1', '1', '1']
    ]
    assert num_islands_bfs(grid) == 1


def test_bfs_no_islands():
    grid = [
        ['0', '0'],
        ['0', '0']
    ]
    assert num_islands_bfs(grid) == 0
