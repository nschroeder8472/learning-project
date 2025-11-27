"""
Exercise 5: Clone Graph
Difficulty: Medium

Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
Each node in the graph contains a value and a list of its neighbors.

Example:
    Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
    Output: [[2,4],[1,3],[2,4],[1,3]]
    Explanation:
    Node 1: neighbors are 2 and 4
    Node 2: neighbors are 1 and 3
    Node 3: neighbors are 2 and 4
    Node 4: neighbors are 1 and 3

Time Complexity: O(V + E) - visit each vertex and edge once
Space Complexity: O(V) - for the dictionary storing cloned nodes
"""

from typing import Optional, Dict
from collections import deque


class Node:
    """Definition for a graph node."""

    def __init__(self, val: int = 0, neighbors: Optional[list] = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []


def clone_graph(node: Optional[Node]) -> Optional[Node]:
    """
    Creates a deep copy of the graph using DFS.

    Args:
        node: Reference to a node in the graph

    Returns:
        Reference to the cloned node
    """
    # TODO: Implement graph cloning using DFS
    # Hint: Use a dictionary to map original nodes to cloned nodes
    # Hint: For each node: create clone, then recursively clone neighbors
    # Hint: Check dictionary before cloning to avoid infinite loops
    raise NotImplementedError("Not implemented yet")


def _clone_dfs(node: Optional[Node], cloned: Dict[Node, Node]) -> Optional[Node]:
    """
    Helper function for DFS-based cloning.

    Args:
        node: Current node being cloned
        cloned: Dictionary mapping original nodes to cloned nodes

    Returns:
        Cloned version of the node
    """
    # TODO: Implement DFS helper for cloning
    # Hint: If node is None, return None
    # Hint: If node already cloned (in dict), return the clone
    # Hint: Create new node, add to dict, then clone all neighbors
    raise NotImplementedError("Not implemented yet")


def clone_graph_bfs(node: Optional[Node]) -> Optional[Node]:
    """
    Creates a deep copy of the graph using BFS.

    Args:
        node: Reference to a node in the graph

    Returns:
        Reference to the cloned node
    """
    # TODO: Implement graph cloning using BFS
    # Hint: Use a queue for BFS and dictionary for original->clone mapping
    # Hint: First clone the nodes, then clone the edges (neighbor connections)
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage: Create a simple graph
    # Graph: 1 -- 2
    #        |    |
    #        4 -- 3
    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)
    node4 = Node(4)

    node1.neighbors = [node2, node4]
    node2.neighbors = [node1, node3]
    node3.neighbors = [node2, node4]
    node4.neighbors = [node1, node3]

    cloned = clone_graph(node1)
    print(f"Original node value: {node1.val}")
    print(f"Cloned node value: {cloned.val if cloned else None}")
    print(f"Are they the same object? {node1 is cloned}")
