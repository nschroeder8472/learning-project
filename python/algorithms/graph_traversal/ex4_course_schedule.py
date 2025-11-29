"""
Exercise 4: Course Schedule (Cycle Detection)
Difficulty: Medium

There are a total of num_courses courses labeled from 0 to num_courses - 1.
You are given a list prerequisites where prerequisites[i] = [ai, bi]
indicates that you must take course bi before course ai.

Return True if you can finish all courses, False otherwise.
(This is equivalent to detecting if the course dependency graph has a cycle)

Example 1:
    Input: num_courses = 2, prerequisites = [[1, 0]]
    Output: True
    Explanation: Take course 0, then course 1

Example 2:
    Input: num_courses = 2, prerequisites = [[1, 0], [0, 1]]
    Output: False
    Explanation: Circular dependency - cannot complete

Example 3:
    Input: num_courses = 4, prerequisites = [[1, 0], [2, 0], [3, 1], [3, 2]]
    Output: True
    Explanation: Valid ordering: [0, 1, 2, 3] or [0, 2, 1, 3]

Time Complexity: O(V + E) where V is courses and E is prerequisites
Space Complexity: O(V + E) for the graph and recursion stack
"""

from typing import List, Dict, Set
from collections import defaultdict


def can_finish(num_courses: int, prerequisites: List[List[int]]) -> bool:
    """
    Determines if all courses can be completed given the prerequisites.

    Args:
        num_courses: Total number of courses
        prerequisites: List of [course, prerequisite] pairs

    Returns:
        True if all courses can be completed, False if there's a cycle
    """
    # TODO: Implement cycle detection using DFS
    # Hint: Build adjacency list from prerequisites
    # Hint: Use DFS with three states: unvisited, visiting (in current path), visited
    # Hint: If you encounter a node in "visiting" state, there's a cycle
    raise NotImplementedError("Not implemented yet")


def _has_cycle_dfs(graph: Dict[int, List[int]], course: int,
                   visiting: Set[int], visited: Set[int]) -> bool:
    """
    Helper function to detect cycle using DFS.
    Returns True if cycle is detected.

    Args:
        graph: Adjacency list representation of course dependencies
        course: Current course being checked
        visiting: Set of courses currently in recursion stack
        visited: Set of courses already processed

    Returns:
        True if cycle detected, False otherwise
    """
    # TODO: Implement cycle detection DFS
    # Hint: If course is in visiting set, cycle detected
    # Hint: If course is in visited set, already processed, no cycle from here
    # Hint: Add to visiting, check all neighbors, then move to visited
    raise NotImplementedError("Not implemented yet")


def find_order(num_courses: int, prerequisites: List[List[int]]) -> List[int]:
    """
    Returns a valid course order if possible, empty list if impossible.
    This is topological sorting.

    Args:
        num_courses: Total number of courses
        prerequisites: List of [course, prerequisite] pairs

    Returns:
        List representing valid course order, empty list if impossible
    """
    # TODO: Implement topological sort
    # Hint: Use DFS and add courses to result in reverse order of completion
    # Hint: Return empty list if cycle is detected
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    print("Can finish [1,0]:", can_finish(2, [[1, 0]]))  # True
    print("Can finish [1,0],[0,1]:", can_finish(2, [[1, 0], [0, 1]]))  # False
    print("Can finish [1,0],[2,0],[3,1],[3,2]:", can_finish(4, [[1, 0], [2, 0], [3, 1], [3, 2]]))  # True
    print("Course order:", find_order(4, [[1, 0], [2, 0], [3, 1], [3, 2]]))
