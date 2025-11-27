"""
Exercise 6: Dijkstra's Algorithm
Difficulty: Hard

Implement Dijkstra's algorithm to find the shortest path from a source vertex
to all other vertices in a weighted graph with non-negative edge weights.

Graph representation: Dictionary where keys are vertices and values are lists of (neighbor, weight) tuples

Example:
    Input: graph with edges: (0->1, weight=4), (0->2, weight=1), (2->1, weight=2),
           (1->3, weight=1), (2->3, weight=5), source=0
    Output: distances = {0: 0, 1: 3, 2: 1, 3: 4}
    Explanation:
      - 0->0: distance 0
      - 0->2->1: distance 3 (shorter than direct 0->1 which is 4)
      - 0->2: distance 1
      - 0->2->1->3: distance 4

Time Complexity: O((V + E) log V) with priority queue
Space Complexity: O(V) for distances dictionary and priority queue
"""

from typing import Dict, List, Tuple
import heapq


def dijkstra(graph: Dict[int, List[Tuple[int, int]]], source: int) -> Dict[int, int]:
    """
    Computes shortest distances from source to all vertices using Dijkstra's algorithm.

    Args:
        graph: The weighted graph as adjacency list (vertex -> [(neighbor, weight)])
        source: The source vertex

    Returns:
        Dictionary mapping each vertex to its shortest distance from source
    """
    # TODO: Implement Dijkstra's algorithm
    # Hint: Use heapq for priority queue (min heap) to always process nearest vertex
    # Hint: Initialize all distances to infinity except source (distance 0)
    # Hint: For each vertex, update distances to neighbors if shorter path found
    raise NotImplementedError("Not implemented yet")


def dijkstra_path(graph: Dict[int, List[Tuple[int, int]]], source: int, target: int) -> List[int]:
    """
    Finds the shortest path from source to target.
    Returns the path as a list of vertices.

    Args:
        graph: The weighted graph as adjacency list
        source: The source vertex
        target: The target vertex

    Returns:
        List representing shortest path from source to target, empty list if no path
    """
    # TODO: Implement Dijkstra's to find path
    # Hint: Track parent of each vertex while computing distances
    # Hint: Reconstruct path by backtracking from target to source
    raise NotImplementedError("Not implemented yet")


def _reconstruct_path(parent: Dict[int, int], source: int, target: int) -> List[int]:
    """
    Helper function to reconstruct path from parent dictionary.

    Args:
        parent: Dictionary mapping each vertex to its parent in shortest path
        source: The source vertex
        target: The target vertex

    Returns:
        Path from source to target
    """
    # TODO: Reconstruct path from target to source using parent dict
    # Hint: Start at target, follow parent pointers back to source, then reverse
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    graph = {
        0: [(1, 4), (2, 1)],
        1: [(3, 1)],
        2: [(1, 2), (3, 5)],
        3: []
    }

    distances = dijkstra(graph, 0)
    print("Shortest distances from vertex 0:", distances)

    path = dijkstra_path(graph, 0, 3)
    print("Shortest path from 0 to 3:", path)
