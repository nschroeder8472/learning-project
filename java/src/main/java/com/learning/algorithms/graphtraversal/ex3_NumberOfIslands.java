package com.learning.algorithms.graphtraversal;

/**
 * Exercise 3: Number of Islands
 * Difficulty: Medium
 *
 * Given a 2D grid of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are surrounded by water.
 *
 * Example 1:
 * Input: grid = [
 *   ['1','1','0','0','0'],
 *   ['1','1','0','0','0'],
 *   ['0','0','1','0','0'],
 *   ['0','0','0','1','1']
 * ]
 * Output: 3
 * Explanation: There are 3 distinct islands
 *
 * Example 2:
 * Input: grid = [
 *   ['1','1','1','1','0'],
 *   ['1','1','0','1','0'],
 *   ['1','1','0','0','0'],
 *   ['0','0','0','0','0']
 * ]
 * Output: 1
 *
 * Time Complexity: O(rows * cols) - visit each cell once
 * Space Complexity: O(rows * cols) - worst case recursion depth for DFS
 */
public class ex3_NumberOfIslands {

    /**
     * Counts the number of islands in the grid.
     *
     * @param grid 2D grid of '1's (land) and '0's (water)
     * @return number of islands
     */
    public static int numIslands(char[][] grid) {
        // TODO: Implement island counting
        // Hint: Iterate through grid, when you find '1', increment count and DFS to mark entire island
        // Hint: Mark visited cells by changing '1' to '0' or use a separate visited set
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method to perform DFS and mark all connected land cells.
     */
    private static void dfs(char[][] grid, int row, int col) {
        // TODO: Implement DFS to mark connected land cells
        // Hint: Check boundaries, check if current cell is water or already visited
        // Hint: Mark current cell as visited, then recursively visit all 4 neighbors
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Alternative solution using BFS instead of DFS.
     *
     * @param grid 2D grid of '1's (land) and '0's (water)
     * @return number of islands
     */
    public static int numIslandsBFS(char[][] grid) {
        // TODO: Implement island counting using BFS
        // Hint: Use a queue to perform BFS when an island is found
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
