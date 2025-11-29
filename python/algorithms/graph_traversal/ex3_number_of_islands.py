"""
Exercise 3: Number of Islands
Difficulty: Medium

Given a 2D grid of '1's (land) and '0's (water), count the number of islands.
An island is surrounded by water and formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are surrounded by water.

Example 1:
    Input: grid = [
        ['1','1','0','0','0'],
        ['1','1','0','0','0'],
        ['0','0','1','0','0'],
        ['0','0','0','1','1']
    ]
    Output: 3
    Explanation: There are 3 distinct islands

Example 2:
    Input: grid = [
        ['1','1','1','1','0'],
        ['1','1','0','1','0'],
        ['1','1','0','0','0'],
        ['0','0','0','0','0']
    ]
    Output: 1

Time Complexity: O(rows * cols) - visit each cell once
Space Complexity: O(rows * cols) - worst case recursion depth for DFS
"""

from typing import List
from collections import deque


def num_islands(grid: List[List[str]]) -> int:
    """
    Counts the number of islands in the grid.

    Args:
        grid: 2D grid of '1's (land) and '0's (water)

    Returns:
        Number of islands
    """
    # TODO: Implement island counting
    # Hint: Iterate through grid, when you find '1', increment count and DFS to mark entire island
    # Hint: Mark visited cells by changing '1' to '0' or use a separate visited set
    raise NotImplementedError("Not implemented yet")


def _dfs(grid: List[List[str]], row: int, col: int) -> None:
    """
    Helper function to perform DFS and mark all connected land cells.

    Args:
        grid: 2D grid of '1's (land) and '0's (water)
        row: Current row
        col: Current column
    """
    # TODO: Implement DFS to mark connected land cells
    # Hint: Check boundaries, check if current cell is water or already visited
    # Hint: Mark current cell as visited, then recursively visit all 4 neighbors
    raise NotImplementedError("Not implemented yet")


def num_islands_bfs(grid: List[List[str]]) -> int:
    """
    Alternative solution using BFS instead of DFS.

    Args:
        grid: 2D grid of '1's (land) and '0's (water)

    Returns:
        Number of islands
    """
    # TODO: Implement island counting using BFS
    # Hint: Use a deque to perform BFS when an island is found
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    grid1 = [
        ['1', '1', '0', '0', '0'],
        ['1', '1', '0', '0', '0'],
        ['0', '0', '1', '0', '0'],
        ['0', '0', '0', '1', '1']
    ]

    grid2 = [
        ['1', '1', '1', '1', '0'],
        ['1', '1', '0', '1', '0'],
        ['1', '1', '0', '0', '0'],
        ['0', '0', '0', '0', '0']
    ]

    print("Number of islands (grid1):", num_islands(grid1))
    print("Number of islands (grid2):", num_islands(grid2))
    print("Number of islands BFS (grid1):", num_islands_bfs(grid1))
