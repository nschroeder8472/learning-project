package com.learning.algorithms.graphtraversal;

import java.util.*;

/**
 * Exercise 1: Depth-First Search (DFS)
 * Difficulty: Easy
 *
 * Implement depth-first search to traverse a graph and return vertices in the order visited.
 * DFS explores as far as possible along each branch before backtracking.
 *
 * Graph representation: Adjacency list using Map<Integer, List<Integer>>
 * - Key: vertex number
 * - Value: list of adjacent vertices
 *
 * Example:
 * Input: graph = {0: [1, 2], 1: [3], 2: [3], 3: []}, start = 0
 * Output: [0, 1, 3, 2] (or [0, 2, 3, 1] depending on order neighbors are visited)
 *
 * Input: graph = {0: [1], 1: [2], 2: [0, 3], 3: []}, start = 0
 * Output: [0, 1, 2, 3]
 *
 * Time Complexity: O(V + E) where V is vertices and E is edges
 * Space Complexity: O(V) for the visited set and recursion stack
 */
public class ex1_DepthFirstSearch {

    /**
     * Performs DFS traversal on the graph starting from the given vertex.
     * Returns the vertices in the order they were visited.
     *
     * @param graph the graph represented as an adjacency list
     * @param start the starting vertex
     * @return list of vertices in DFS order
     */
    public static List<Integer> dfs(Map<Integer, List<Integer>> graph, int start) {
        // TODO: Implement DFS using recursion
        // Hint: Use a Set to track visited vertices and a List to store the result
        // Hint: For each unvisited neighbor, recursively call DFS
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Performs DFS traversal using an iterative approach with an explicit stack.
     * Returns the vertices in the order they were visited.
     *
     * @param graph the graph represented as an adjacency list
     * @param start the starting vertex
     * @return list of vertices in DFS order
     */
    public static List<Integer> dfsIterative(Map<Integer, List<Integer>> graph, int start) {
        // TODO: Implement DFS using a stack
        // Hint: Push start vertex to stack, then while stack not empty:
        //       pop vertex, mark visited, push unvisited neighbors
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method for recursive DFS.
     */
    private static void dfsHelper(Map<Integer, List<Integer>> graph, int vertex,
                                   Set<Integer> visited, List<Integer> result) {
        // TODO: Implement the recursive helper
        // 1. Mark vertex as visited
        // 2. Add vertex to result
        // 3. For each neighbor, if not visited, recursively call dfsHelper
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
