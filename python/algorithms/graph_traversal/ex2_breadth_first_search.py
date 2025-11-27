"""
Exercise 2: Breadth-First Search (BFS)
Difficulty: Easy

Implement breadth-first search to traverse a graph and return vertices in the order visited.
BFS explores all vertices at the current depth before moving to vertices at the next depth.

Graph representation: Dictionary where keys are vertices and values are lists of neighbors

Example:
    Input: graph = {0: [1, 2], 1: [3], 2: [3], 3: []}, start = 0
    Output: [0, 1, 2, 3] (level-order traversal)

    Input: graph = {0: [1, 2], 1: [3, 4], 2: [5], 3: [], 4: [], 5: []}, start = 0
    Output: [0, 1, 2, 3, 4, 5]

Time Complexity: O(V + E) where V is vertices and E is edges
Space Complexity: O(V) for the visited set and queue
"""

from typing import Dict, List
from collections import deque


def bfs(graph: Dict[int, List[int]], start: int) -> List[int]:
    """
    Performs BFS traversal on the graph starting from the given vertex.
    Returns the vertices in the order they were visited.

    Args:
        graph: The graph represented as an adjacency list
        start: The starting vertex

    Returns:
        List of vertices in BFS order
    """
    # TODO: Implement BFS using a queue (deque)
    # Hint: Use a deque for vertices to visit and a set for visited vertices
    # Hint: Process vertex when dequeuing, add unvisited neighbors to queue
    raise NotImplementedError("Not implemented yet")


def bfs_with_distance(graph: Dict[int, List[int]], start: int) -> Dict[int, int]:
    """
    Performs BFS and returns the shortest distance from start to each vertex.
    Returns a dictionary of vertex -> distance.

    Args:
        graph: The graph represented as an adjacency list
        start: The starting vertex

    Returns:
        Dictionary mapping each reachable vertex to its distance from start
    """
    # TODO: Implement BFS that tracks distance
    # Hint: Maintain a distance dictionary, initialize start with 0
    # Hint: When visiting neighbors, set distance as current distance + 1
    raise NotImplementedError("Not implemented yet")


def bfs_shortest_path(graph: Dict[int, List[int]], start: int, target: int) -> List[int]:
    """
    Performs BFS to find the shortest path from start to target.
    Returns the path as a list of vertices.

    Args:
        graph: The graph represented as an adjacency list
        start: The starting vertex
        target: The target vertex

    Returns:
        List representing path from start to target, empty list if no path exists
    """
    # TODO: Implement BFS to find shortest path
    # Hint: Track parent of each vertex during BFS
    # Hint: Reconstruct path by backtracking from target to start using parent dictionary
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    graph = {
        0: [1, 2],
        1: [3],
        2: [3],
        3: []
    }

    print("BFS from vertex 0:", bfs(graph, 0))
    print("BFS with distances from vertex 0:", bfs_with_distance(graph, 0))
    print("Shortest path from 0 to 3:", bfs_shortest_path(graph, 0, 3))
