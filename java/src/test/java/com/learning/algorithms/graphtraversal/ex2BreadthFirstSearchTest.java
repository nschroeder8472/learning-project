package com.learning.algorithms.graphtraversal;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Breadth-First Search implementation.
 */
public class ex2BreadthFirstSearchTest {

    @Test
    public void testSimpleGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> result = ex2_BreadthFirstSearch.bfs(graph, 0);
        assertEquals(Arrays.asList(0, 1, 2, 3), result); // Level-order
    }

    @Test
    public void testLinearGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> result = ex2_BreadthFirstSearch.bfs(graph, 0);
        assertEquals(Arrays.asList(0, 1, 2, 3), result);
    }

    @Test
    public void testSingleNode() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, new ArrayList<>());

        List<Integer> result = ex2_BreadthFirstSearch.bfs(graph, 0);
        assertEquals(Arrays.asList(0), result);
    }

    @Test
    public void testMultiLevelGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, new ArrayList<>());
        graph.put(4, new ArrayList<>());
        graph.put(5, new ArrayList<>());

        List<Integer> result = ex2_BreadthFirstSearch.bfs(graph, 0);
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5), result);
    }

    @Test
    public void testGraphWithCycle() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0, 3)); // Cycle back to 0
        graph.put(3, Arrays.asList(3)); // Self loop

        List<Integer> result = ex2_BreadthFirstSearch.bfs(graph, 0);
        assertEquals(4, result.size());
        // Should visit each vertex exactly once
        assertEquals(1, Collections.frequency(result, 0));
        assertEquals(1, Collections.frequency(result, 1));
        assertEquals(1, Collections.frequency(result, 2));
        assertEquals(1, Collections.frequency(result, 3));
    }

    @Test
    public void testBFSWithDistance() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        Map<Integer, Integer> distances = ex2_BreadthFirstSearch.bfsWithDistance(graph, 0);
        assertEquals(0, distances.get(0));
        assertEquals(1, distances.get(1));
        assertEquals(1, distances.get(2));
        assertEquals(2, distances.get(3));
    }

    @Test
    public void testBFSDistanceDisconnected() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1));
        graph.put(1, new ArrayList<>());
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        Map<Integer, Integer> distances = ex2_BreadthFirstSearch.bfsWithDistance(graph, 0);
        assertEquals(0, distances.get(0));
        assertEquals(1, distances.get(1));
        assertFalse(distances.containsKey(2)); // Unreachable
        assertFalse(distances.containsKey(3)); // Unreachable
    }

    @Test
    public void testShortestPath() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> path = ex2_BreadthFirstSearch.bfsShortestPath(graph, 0, 3);
        assertEquals(0, path.get(0)); // Start
        assertEquals(3, path.get(path.size() - 1)); // End
        assertEquals(3, path.size()); // Shortest path: 0 -> 1 -> 3 or 0 -> 2 -> 3
    }

    @Test
    public void testShortestPathNoPath() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1));
        graph.put(1, new ArrayList<>());
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> path = ex2_BreadthFirstSearch.bfsShortestPath(graph, 0, 3);
        assertTrue(path.isEmpty()); // No path from 0 to 3
    }

    @Test
    public void testShortestPathSameNode() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, new ArrayList<>());
        graph.put(2, new ArrayList<>());

        List<Integer> path = ex2_BreadthFirstSearch.bfsShortestPath(graph, 0, 0);
        assertEquals(Arrays.asList(0), path); // Path to itself
    }
}
