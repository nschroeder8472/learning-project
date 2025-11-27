package com.learning.algorithms.graphtraversal;

import java.util.*;

/**
 * Exercise 6: Dijkstra's Algorithm
 * Difficulty: Hard
 *
 * Implement Dijkstra's algorithm to find the shortest path from a source vertex
 * to all other vertices in a weighted graph with non-negative edge weights.
 *
 * Graph representation: Map<Integer, List<Edge>> where Edge contains (destination, weight)
 *
 * Example:
 * Input: graph with edges: (0->1, weight=4), (0->2, weight=1), (2->1, weight=2),
 *        (1->3, weight=1), (2->3, weight=5), source=0
 * Output: distances = {0: 0, 1: 3, 2: 1, 3: 4}
 * Explanation:
 *   - 0->0: distance 0
 *   - 0->2->1: distance 3 (shorter than direct 0->1 which is 4)
 *   - 0->2: distance 1
 *   - 0->2->1->3: distance 4
 *
 * Time Complexity: O((V + E) log V) with priority queue
 * Space Complexity: O(V) for distances map and priority queue
 */
public class ex6_DijkstraAlgorithm {

    /**
     * Represents a weighted edge in the graph.
     */
    public static class Edge {
        public int destination;
        public int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    /**
     * Helper class for priority queue entries.
     */
    private static class VertexDistance implements Comparable<VertexDistance> {
        int vertex;
        int distance;

        VertexDistance(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(VertexDistance other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    /**
     * Computes shortest distances from source to all vertices using Dijkstra's algorithm.
     *
     * @param graph the weighted graph as adjacency list
     * @param source the source vertex
     * @param numVertices total number of vertices
     * @return map of vertex to shortest distance from source
     */
    public static Map<Integer, Integer> dijkstra(Map<Integer, List<Edge>> graph, int source, int numVertices) {
        // TODO: Implement Dijkstra's algorithm
        // Hint: Use a priority queue (min heap) to always process nearest vertex
        // Hint: Initialize all distances to infinity except source (distance 0)
        // Hint: For each vertex, update distances to neighbors if shorter path found
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Finds the shortest path from source to target.
     * Returns the path as a list of vertices.
     *
     * @param graph the weighted graph as adjacency list
     * @param source the source vertex
     * @param target the target vertex
     * @param numVertices total number of vertices
     * @return list representing shortest path from source to target
     */
    public static List<Integer> dijkstraPath(Map<Integer, List<Edge>> graph, int source,
                                              int target, int numVertices) {
        // TODO: Implement Dijkstra's to find path
        // Hint: Track parent of each vertex while computing distances
        // Hint: Reconstruct path by backtracking from target to source
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method to reconstruct path from parent map.
     */
    private static List<Integer> reconstructPath(Map<Integer, Integer> parent, int source, int target) {
        // TODO: Reconstruct path from target to source using parent map
        // Hint: Start at target, follow parent pointers back to source, then reverse
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
