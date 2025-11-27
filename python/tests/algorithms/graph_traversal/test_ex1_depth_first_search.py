"""Test cases for Depth-First Search implementation."""

import pytest
from algorithms.graph_traversal.ex1_depth_first_search import dfs, dfs_iterative


def test_simple_graph():
    graph = {
        0: [1, 2],
        1: [3],
        2: [3],
        3: []
    }
    result = dfs(graph, 0)
    assert len(result) == 4
    assert result[0] == 0  # Should start with 0
    assert 1 in result
    assert 2 in result
    assert 3 in result


def test_linear_graph():
    graph = {
        0: [1],
        1: [2],
        2: [3],
        3: []
    }
    result = dfs(graph, 0)
    assert result == [0, 1, 2, 3]


def test_single_node():
    graph = {0: []}
    result = dfs(graph, 0)
    assert result == [0]


def test_disconnected_from_start():
    graph = {
        0: [1],
        1: [],
        2: [3],
        3: []
    }
    result = dfs(graph, 0)
    assert len(result) == 2  # Only visits 0 and 1
    assert 0 in result
    assert 1 in result
    assert 2 not in result  # Disconnected
    assert 3 not in result  # Disconnected


def test_graph_with_cycle():
    graph = {
        0: [1],
        1: [2],
        2: [0, 3],  # Cycle back to 0
        3: []
    }
    result = dfs(graph, 0)
    assert len(result) == 4
    # Should visit each vertex exactly once despite cycle
    assert result.count(0) == 1
    assert result.count(1) == 1
    assert result.count(2) == 1
    assert result.count(3) == 1


def test_complex_graph():
    graph = {
        0: [1, 2, 3],
        1: [4],
        2: [4, 5],
        3: [5],
        4: [],
        5: []
    }
    result = dfs(graph, 0)
    assert len(result) == 6
    assert result[0] == 0  # Should start with 0
    assert 4 in result
    assert 5 in result


def test_iterative_dfs():
    graph = {
        0: [1, 2],
        1: [3],
        2: [3],
        3: []
    }
    result = dfs_iterative(graph, 0)
    assert len(result) == 4
    assert result[0] == 0
    assert 1 in result
    assert 2 in result
    assert 3 in result


def test_iterative_single_node():
    graph = {5: []}
    result = dfs_iterative(graph, 5)
    assert result == [5]


def test_iterative_linear():
    graph = {
        0: [1],
        1: [2],
        2: [3],
        3: []
    }
    result = dfs_iterative(graph, 0)
    assert len(result) == 4
    assert 0 in result
    assert 1 in result
    assert 2 in result
    assert 3 in result
