"""Test cases for Dijkstra's Algorithm implementation."""

import pytest
from algorithms.graph_traversal.ex6_dijkstra_algorithm import dijkstra, dijkstra_path


def test_simple_graph():
    graph = {
        0: [(1, 4), (2, 1)],
        1: [(3, 1)],
        2: [(1, 2), (3, 5)],
        3: []
    }
    distances = dijkstra(graph, 0)

    assert distances[0] == 0
    assert distances[1] == 3  # 0->2->1 = 3 (shorter than direct 0->1 = 4)
    assert distances[2] == 1  # 0->2 = 1
    assert distances[3] == 4  # 0->2->1->3 = 4


def test_single_node():
    graph = {0: []}
    distances = dijkstra(graph, 0)
    assert distances[0] == 0


def test_linear_graph():
    graph = {
        0: [(1, 2)],
        1: [(2, 3)],
        2: [(3, 4)],
        3: []
    }
    distances = dijkstra(graph, 0)

    assert distances[0] == 0
    assert distances[1] == 2
    assert distances[2] == 5
    assert distances[3] == 9


def test_multiple_paths():
    graph = {
        0: [(1, 10), (2, 5)],
        1: [(3, 1)],
        2: [(1, 3), (3, 8)],
        3: []
    }
    distances = dijkstra(graph, 0)

    assert distances[0] == 0
    assert distances[1] == 8  # 0->2->1 = 8 (shorter than direct 0->1 = 10)
    assert distances[2] == 5
    assert distances[3] == 9  # 0->2->1->3 = 9


def test_disconnected_node():
    graph = {
        0: [(1, 1)],
        1: [],
        2: [(3, 1)],
        3: []
    }
    distances = dijkstra(graph, 0)

    assert distances[0] == 0
    assert distances[1] == 1
    assert 2 not in distances  # Unreachable from 0
    assert 3 not in distances  # Unreachable from 0


def test_graph_with_cycle():
    graph = {
        0: [(1, 2)],
        1: [(2, 3), (0, 1)],  # Cycle back to 0
        2: [(3, 1)],
        3: []
    }
    distances = dijkstra(graph, 0)

    assert distances[0] == 0
    assert distances[1] == 2
    assert distances[2] == 5
    assert distances[3] == 6


def test_equal_weight_paths():
    graph = {
        0: [(1, 1), (2, 1)],
        1: [(3, 1)],
        2: [(3, 1)],
        3: []
    }
    distances = dijkstra(graph, 0)

    assert distances[0] == 0
    assert distances[1] == 1
    assert distances[2] == 1
    assert distances[3] == 2


def test_shortest_path():
    graph = {
        0: [(1, 4), (2, 1)],
        1: [(3, 1)],
        2: [(1, 2), (3, 5)],
        3: []
    }
    path = dijkstra_path(graph, 0, 3)

    assert path is not None
    assert path[0] == 0  # Start at 0
    assert path[-1] == 3  # End at 3
    assert len(path) == 4  # 0->2->1->3


def test_path_to_self():
    graph = {
        0: [(1, 1)],
        1: []
    }
    path = dijkstra_path(graph, 0, 0)
    assert path == [0]


def test_no_path():
    graph = {
        0: [(1, 1)],
        1: [],
        2: [(3, 1)],
        3: []
    }
    path = dijkstra_path(graph, 0, 3)
    assert path == []  # No path from 0 to 3


def test_direct_path():
    graph = {
        0: [(1, 1), (2, 5), (3, 2)],
        1: [],
        2: [],
        3: []
    }
    path = dijkstra_path(graph, 0, 3)
    assert path == [0, 3]  # Direct path is shortest


def test_larger_graph():
    graph = {
        0: [(1, 7), (2, 9), (5, 14)],
        1: [(0, 7), (2, 10), (3, 15)],
        2: [(0, 9), (1, 10), (3, 11), (5, 2)],
        3: [(1, 15), (2, 11), (4, 6)],
        4: [(3, 6), (5, 9)],
        5: [(0, 14), (2, 2), (4, 9)]
    }
    distances = dijkstra(graph, 0)

    assert distances[0] == 0
    assert distances[1] == 7
    assert distances[2] == 9
    assert distances[3] == 20
    assert distances[4] == 20
    assert distances[5] == 11


def test_path_longer():
    graph = {
        0: [(1, 1)],
        1: [(2, 1)],
        2: [(3, 1)],
        3: [(4, 1)],
        4: []
    }
    path = dijkstra_path(graph, 0, 4)
    assert path == [0, 1, 2, 3, 4]


def test_alternative_shorter_path():
    graph = {
        0: [(1, 5), (2, 1)],
        1: [(3, 1)],
        2: [(1, 1), (3, 10)],
        3: []
    }
    path = dijkstra_path(graph, 0, 3)
    # Should take 0->2->1->3 (cost 3) rather than 0->1->3 (cost 6)
    assert path[0] == 0
    assert path[-1] == 3
    assert 2 in path  # Should go through node 2
