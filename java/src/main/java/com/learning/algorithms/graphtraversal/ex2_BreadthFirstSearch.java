package com.learning.algorithms.graphtraversal;

import java.util.*;

/**
 * Exercise 2: Breadth-First Search (BFS)
 * Difficulty: Easy
 *
 * Implement breadth-first search to traverse a graph and return vertices in the order visited.
 * BFS explores all vertices at the current depth before moving to vertices at the next depth.
 *
 * Graph representation: Adjacency list using Map<Integer, List<Integer>>
 *
 * Example:
 * Input: graph = {0: [1, 2], 1: [3], 2: [3], 3: []}, start = 0
 * Output: [0, 1, 2, 3] (level-order traversal)
 *
 * Input: graph = {0: [1, 2], 1: [3, 4], 2: [5], 3: [], 4: [], 5: []}, start = 0
 * Output: [0, 1, 2, 3, 4, 5]
 *
 * Time Complexity: O(V + E) where V is vertices and E is edges
 * Space Complexity: O(V) for the visited set and queue
 */
public class ex2_BreadthFirstSearch {

    /**
     * Performs BFS traversal on the graph starting from the given vertex.
     * Returns the vertices in the order they were visited.
     *
     * @param graph the graph represented as an adjacency list
     * @param start the starting vertex
     * @return list of vertices in BFS order
     */
    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
        // TODO: Implement BFS using a queue
        // Hint: Use a Queue for vertices to visit and a Set for visited vertices
        // Hint: Process vertex when dequeuing, add unvisited neighbors to queue
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Performs BFS and returns the shortest distance from start to each vertex.
     * Returns a map of vertex -> distance.
     *
     * @param graph the graph represented as an adjacency list
     * @param start the starting vertex
     * @return map of vertex to its distance from start (-1 if unreachable)
     */
    public static Map<Integer, Integer> bfsWithDistance(Map<Integer, List<Integer>> graph, int start) {
        // TODO: Implement BFS that tracks distance
        // Hint: Maintain a distance map, initialize start with 0
        // Hint: When visiting neighbors, set distance as current distance + 1
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Performs BFS to find the shortest path from start to target.
     * Returns the path as a list of vertices.
     *
     * @param graph the graph represented as an adjacency list
     * @param start the starting vertex
     * @param target the target vertex
     * @return list representing path from start to target, empty if no path exists
     */
    public static List<Integer> bfsShortestPath(Map<Integer, List<Integer>> graph, int start, int target) {
        // TODO: Implement BFS to find shortest path
        // Hint: Track parent of each vertex during BFS
        // Hint: Reconstruct path by backtracking from target to start using parent map
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
