package com.learning.algorithms.graphtraversal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Number of Islands implementation.
 */
public class ex3NumberOfIslandsTest {

    @Test
    public void testThreeIslands() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        assertEquals(3, ex3_NumberOfIslands.numIslands(grid));
    }

    @Test
    public void testOneIsland() {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        assertEquals(1, ex3_NumberOfIslands.numIslands(grid));
    }

    @Test
    public void testNoIslands() {
        char[][] grid = {
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'}
        };
        assertEquals(0, ex3_NumberOfIslands.numIslands(grid));
    }

    @Test
    public void testAllIsland() {
        char[][] grid = {
            {'1','1'},
            {'1','1'}
        };
        assertEquals(1, ex3_NumberOfIslands.numIslands(grid));
    }

    @Test
    public void testSingleCell() {
        char[][] grid = {{'1'}};
        assertEquals(1, ex3_NumberOfIslands.numIslands(grid));
    }

    @Test
    public void testSingleCellWater() {
        char[][] grid = {{'0'}};
        assertEquals(0, ex3_NumberOfIslands.numIslands(grid));
    }

    @Test
    public void testDiagonalIslands() {
        char[][] grid = {
            {'1','0','1'},
            {'0','1','0'},
            {'1','0','1'}
        };
        // Diagonal cells are not connected, so 5 separate islands
        assertEquals(5, ex3_NumberOfIslands.numIslands(grid));
    }

    @Test
    public void testLargeIsland() {
        char[][] grid = {
            {'1','1','1','1','1'},
            {'1','0','0','0','1'},
            {'1','0','1','0','1'},
            {'1','0','0','0','1'},
            {'1','1','1','1','1'}
        };
        assertEquals(2, ex3_NumberOfIslands.numIslands(grid)); // Outer ring and center
    }

    @Test
    public void testBFSVersion() {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        assertEquals(3, ex3_NumberOfIslands.numIslandsBFS(grid));
    }

    @Test
    public void testBFSSingleIsland() {
        char[][] grid = {
            {'1','1','1'},
            {'0','1','0'},
            {'1','1','1'}
        };
        assertEquals(1, ex3_NumberOfIslands.numIslandsBFS(grid));
    }
}
