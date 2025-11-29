package com.learning.algorithms.graphtraversal;

import java.util.*;

/**
 * Exercise 5: Clone Graph
 * Difficulty: Medium
 *
 * Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
 * Each node in the graph contains a value and a list of its neighbors.
 *
 * Example:
 * Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
 * Output: [[2,4],[1,3],[2,4],[1,3]]
 * Explanation:
 * Node 1: neighbors are 2 and 4
 * Node 2: neighbors are 1 and 3
 * Node 3: neighbors are 2 and 4
 * Node 4: neighbors are 1 and 3
 *
 * Time Complexity: O(V + E) - visit each vertex and edge once
 * Space Complexity: O(V) - for the HashMap storing cloned nodes
 */
public class ex5_CloneGraph {

    /**
     * Definition for a graph node.
     */
    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, ArrayList<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    /**
     * Creates a deep copy of the graph using DFS.
     *
     * @param node reference to a node in the graph
     * @return reference to the cloned node
     */
    public static Node cloneGraph(Node node) {
        // TODO: Implement graph cloning using DFS
        // Hint: Use a HashMap to map original nodes to cloned nodes
        // Hint: For each node: create clone, then recursively clone neighbors
        // Hint: Check HashMap before cloning to avoid infinite loops
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method for DFS-based cloning.
     */
    private static Node cloneDFS(Node node, Map<Node, Node> cloned) {
        // TODO: Implement DFS helper for cloning
        // Hint: If node is null, return null
        // Hint: If node already cloned (in map), return the clone
        // Hint: Create new node, add to map, then clone all neighbors
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Creates a deep copy of the graph using BFS.
     *
     * @param node reference to a node in the graph
     * @return reference to the cloned node
     */
    public static Node cloneGraphBFS(Node node) {
        // TODO: Implement graph cloning using BFS
        // Hint: Use a queue for BFS and HashMap for original->clone mapping
        // Hint: First clone the nodes, then clone the edges (neighbor connections)
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
