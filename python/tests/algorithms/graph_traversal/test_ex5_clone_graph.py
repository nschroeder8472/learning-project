"""Test cases for Clone Graph implementation."""

import pytest
from algorithms.graph_traversal.ex5_clone_graph import Node, clone_graph, clone_graph_bfs


def test_single_node():
    node = Node(1)
    cloned = clone_graph(node)

    assert cloned is not None
    assert cloned.val == 1
    assert node is not cloned  # Different object
    assert len(cloned.neighbors) == 0


def test_two_connected_nodes():
    node1 = Node(1)
    node2 = Node(2)
    node1.neighbors = [node2]
    node2.neighbors = [node1]

    cloned = clone_graph(node1)

    assert cloned is not None
    assert cloned.val == 1
    assert node1 is not cloned
    assert len(cloned.neighbors) == 1

    cloned_neighbor = cloned.neighbors[0]
    assert cloned_neighbor.val == 2
    assert node2 is not cloned_neighbor

    # Verify bidirectional connection
    assert len(cloned_neighbor.neighbors) == 1
    assert cloned_neighbor.neighbors[0] is cloned


def test_four_node_graph():
    # Graph: 1-2, 1-4, 2-3, 3-4
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)
    node4 = Node(4)

    node1.neighbors = [node2, node4]
    node2.neighbors = [node1, node3]
    node3.neighbors = [node2, node4]
    node4.neighbors = [node1, node3]

    cloned = clone_graph(node1)

    # Verify it's a deep copy
    assert node1 is not cloned

    # Verify structure using BFS
    visited_orig = set()
    visited_cloned = set()
    queue_orig = [node1]
    queue_cloned = [cloned]

    while queue_orig:
        orig_node = queue_orig.pop(0)
        cloned_node = queue_cloned.pop(0)

        if id(orig_node) in visited_orig:
            continue

        visited_orig.add(id(orig_node))
        visited_cloned.add(id(cloned_node))

        assert orig_node.val == cloned_node.val
        assert len(orig_node.neighbors) == len(cloned_node.neighbors)
        assert orig_node is not cloned_node

        queue_orig.extend(orig_node.neighbors)
        queue_cloned.extend(cloned_node.neighbors)

    assert len(visited_orig) == 4
    assert len(visited_cloned) == 4


def test_null_graph():
    cloned = clone_graph(None)
    assert cloned is None


def test_graph_with_self_loop():
    node = Node(1)
    node.neighbors = [node]  # Self loop

    cloned = clone_graph(node)

    assert cloned is not None
    assert cloned.val == 1
    assert node is not cloned
    assert len(cloned.neighbors) == 1
    assert cloned.neighbors[0] is cloned  # Cloned node points to itself


def test_triangle_graph():
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)

    node1.neighbors = [node2, node3]
    node2.neighbors = [node1, node3]
    node3.neighbors = [node1, node2]

    cloned = clone_graph(node1)

    assert cloned is not None
    assert cloned.val == 1
    assert node1 is not cloned
    assert len(cloned.neighbors) == 2

    # Verify all nodes are different objects
    for neighbor in cloned.neighbors:
        assert neighbor is not node2
        assert neighbor is not node3


def test_bfs_clone():
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)

    node1.neighbors = [node2, node3]
    node2.neighbors = [node1]
    node3.neighbors = [node1]

    cloned = clone_graph_bfs(node1)

    assert cloned is not None
    assert cloned.val == 1
    assert node1 is not cloned
    assert len(cloned.neighbors) == 2

    # Verify deep copy
    for neighbor in cloned.neighbors:
        assert neighbor is not node2
        assert neighbor is not node3


def test_bfs_null():
    cloned = clone_graph_bfs(None)
    assert cloned is None


def test_complex_graph():
    # Create a more complex graph
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)
    node4 = Node(4)
    node5 = Node(5)

    node1.neighbors = [node2, node3]
    node2.neighbors = [node3, node4]
    node3.neighbors = [node4, node5]
    node4.neighbors = [node5]
    node5.neighbors = []

    cloned = clone_graph(node1)

    # Traverse and count nodes
    visited = set()
    queue = [cloned]

    while queue:
        current = queue.pop(0)
        if id(current) in visited:
            continue
        visited.add(id(current))
        queue.extend(current.neighbors)

    assert len(visited) == 5


def test_disconnected_neighbor():
    node1 = Node(1)
    node2 = Node(2)
    node1.neighbors = [node2]
    node2.neighbors = []

    cloned = clone_graph(node1)

    assert cloned is not None
    assert cloned.val == 1
    assert len(cloned.neighbors) == 1
    assert cloned.neighbors[0].val == 2
    assert len(cloned.neighbors[0].neighbors) == 0
