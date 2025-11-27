"""Test cases for Breadth-First Search implementation."""

import pytest
from algorithms.graph_traversal.ex2_breadth_first_search import (
    bfs, bfs_with_distance, bfs_shortest_path
)


def test_simple_graph():
    graph = {
        0: [1, 2],
        1: [3],
        2: [3],
        3: []
    }
    result = bfs(graph, 0)
    assert result == [0, 1, 2, 3]  # Level-order


def test_linear_graph():
    graph = {
        0: [1],
        1: [2],
        2: [3],
        3: []
    }
    result = bfs(graph, 0)
    assert result == [0, 1, 2, 3]


def test_single_node():
    graph = {0: []}
    result = bfs(graph, 0)
    assert result == [0]


def test_multi_level_graph():
    graph = {
        0: [1, 2],
        1: [3, 4],
        2: [5],
        3: [],
        4: [],
        5: []
    }
    result = bfs(graph, 0)
    assert result == [0, 1, 2, 3, 4, 5]


def test_graph_with_cycle():
    graph = {
        0: [1, 2],
        1: [2],
        2: [0, 3],  # Cycle back to 0
        3: [3]  # Self loop
    }
    result = bfs(graph, 0)
    assert len(result) == 4
    # Should visit each vertex exactly once
    assert result.count(0) == 1
    assert result.count(1) == 1
    assert result.count(2) == 1
    assert result.count(3) == 1


def test_bfs_with_distance():
    graph = {
        0: [1, 2],
        1: [3],
        2: [3],
        3: []
    }
    distances = bfs_with_distance(graph, 0)
    assert distances[0] == 0
    assert distances[1] == 1
    assert distances[2] == 1
    assert distances[3] == 2


def test_bfs_distance_disconnected():
    graph = {
        0: [1],
        1: [],
        2: [3],
        3: []
    }
    distances = bfs_with_distance(graph, 0)
    assert distances[0] == 0
    assert distances[1] == 1
    assert 2 not in distances  # Unreachable
    assert 3 not in distances  # Unreachable


def test_bfs_distance_complex():
    graph = {
        0: [1, 2],
        1: [3, 4],
        2: [5],
        3: [],
        4: [],
        5: []
    }
    distances = bfs_with_distance(graph, 0)
    assert distances[0] == 0
    assert distances[1] == 1
    assert distances[2] == 1
    assert distances[3] == 2
    assert distances[4] == 2
    assert distances[5] == 2


def test_shortest_path():
    graph = {
        0: [1, 2],
        1: [3],
        2: [3],
        3: []
    }
    path = bfs_shortest_path(graph, 0, 3)
    assert path[0] == 0  # Start
    assert path[-1] == 3  # End
    assert len(path) == 3  # Shortest path: 0 -> 1 -> 3 or 0 -> 2 -> 3


def test_shortest_path_no_path():
    graph = {
        0: [1],
        1: [],
        2: [3],
        3: []
    }
    path = bfs_shortest_path(graph, 0, 3)
    assert path == []  # No path from 0 to 3


def test_shortest_path_same_node():
    graph = {
        0: [1, 2],
        1: [],
        2: []
    }
    path = bfs_shortest_path(graph, 0, 0)
    assert path == [0]  # Path to itself


def test_shortest_path_direct():
    graph = {
        0: [1, 2, 3],
        1: [],
        2: [],
        3: []
    }
    path = bfs_shortest_path(graph, 0, 3)
    assert path == [0, 3]  # Direct path


def test_shortest_path_longer():
    graph = {
        0: [1],
        1: [2],
        2: [3],
        3: [4],
        4: []
    }
    path = bfs_shortest_path(graph, 0, 4)
    assert path == [0, 1, 2, 3, 4]
