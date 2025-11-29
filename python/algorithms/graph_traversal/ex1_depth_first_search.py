"""
Exercise 1: Depth-First Search (DFS)
Difficulty: Easy

Implement depth-first search to traverse a graph and return vertices in the order visited.
DFS explores as far as possible along each branch before backtracking.

Graph representation: Dictionary where keys are vertices and values are lists of neighbors
    graph = {0: [1, 2], 1: [3], 2: [3], 3: []}

Example:
    Input: graph = {0: [1, 2], 1: [3], 2: [3], 3: []}, start = 0
    Output: [0, 1, 3, 2] (or [0, 2, 3, 1] depending on order neighbors are visited)

    Input: graph = {0: [1], 1: [2], 2: [0, 3], 3: []}, start = 0
    Output: [0, 1, 2, 3]

Time Complexity: O(V + E) where V is vertices and E is edges
Space Complexity: O(V) for the visited set and recursion stack
"""

from typing import Dict, List, Set


def dfs(graph: Dict[int, List[int]], start: int) -> List[int]:
    """
    Performs DFS traversal on the graph starting from the given vertex.
    Returns the vertices in the order they were visited.

    Args:
        graph: The graph represented as an adjacency list
        start: The starting vertex

    Returns:
        List of vertices in DFS order
    """
    # TODO: Implement DFS using recursion
    # Hint: Use a set to track visited vertices and a list to store the result
    # Hint: For each unvisited neighbor, recursively call DFS
    raise NotImplementedError("Not implemented yet")


def dfs_iterative(graph: Dict[int, List[int]], start: int) -> List[int]:
    """
    Performs DFS traversal using an iterative approach with an explicit stack.
    Returns the vertices in the order they were visited.

    Args:
        graph: The graph represented as an adjacency list
        start: The starting vertex

    Returns:
        List of vertices in DFS order
    """
    # TODO: Implement DFS using a stack (list)
    # Hint: Push start vertex to stack, then while stack not empty:
    #       pop vertex, mark visited, push unvisited neighbors
    raise NotImplementedError("Not implemented yet")


def _dfs_helper(graph: Dict[int, List[int]], vertex: int,
                visited: Set[int], result: List[int]) -> None:
    """
    Helper function for recursive DFS.

    Args:
        graph: The graph represented as an adjacency list
        vertex: Current vertex being visited
        visited: Set of already visited vertices
        result: List to store DFS order
    """
    # TODO: Implement the recursive helper
    # 1. Mark vertex as visited
    # 2. Add vertex to result
    # 3. For each neighbor, if not visited, recursively call _dfs_helper
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    graph = {
        0: [1, 2],
        1: [3],
        2: [3],
        3: []
    }

    print("DFS (recursive) from vertex 0:", dfs(graph, 0))
    print("DFS (iterative) from vertex 0:", dfs_iterative(graph, 0))
