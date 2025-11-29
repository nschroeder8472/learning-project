package com.learning.algorithms.graphtraversal;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Depth-First Search implementation.
 */
public class ex1DepthFirstSearchTest {

    @Test
    public void testSimpleGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfs(graph, 0);
        assertEquals(4, result.size());
        assertEquals(0, result.get(0)); // Should start with 0
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }

    @Test
    public void testLinearGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfs(graph, 0);
        assertEquals(Arrays.asList(0, 1, 2, 3), result);
    }

    @Test
    public void testSingleNode() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfs(graph, 0);
        assertEquals(Arrays.asList(0), result);
    }

    @Test
    public void testDisconnectedFromStart() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1));
        graph.put(1, new ArrayList<>());
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfs(graph, 0);
        assertEquals(2, result.size()); // Only visits 0 and 1
        assertTrue(result.contains(0));
        assertTrue(result.contains(1));
        assertFalse(result.contains(2)); // Disconnected
        assertFalse(result.contains(3)); // Disconnected
    }

    @Test
    public void testGraphWithCycle() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0, 3)); // Cycle back to 0
        graph.put(3, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfs(graph, 0);
        assertEquals(4, result.size());
        // Should visit each vertex exactly once despite cycle
        assertEquals(1, Collections.frequency(result, 0));
        assertEquals(1, Collections.frequency(result, 1));
        assertEquals(1, Collections.frequency(result, 2));
        assertEquals(1, Collections.frequency(result, 3));
    }

    @Test
    public void testComplexGraph() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2, 3));
        graph.put(1, Arrays.asList(4));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(5));
        graph.put(4, new ArrayList<>());
        graph.put(5, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfs(graph, 0);
        assertEquals(6, result.size());
        assertEquals(0, result.get(0)); // Should start with 0
        assertTrue(result.contains(4));
        assertTrue(result.contains(5));
    }

    @Test
    public void testIterativeDFS() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3));
        graph.put(2, Arrays.asList(3));
        graph.put(3, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfsIterative(graph, 0);
        assertEquals(4, result.size());
        assertEquals(0, result.get(0));
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }

    @Test
    public void testIterativeSingleNode() {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(5, new ArrayList<>());

        List<Integer> result = ex1_DepthFirstSearch.dfsIterative(graph, 5);
        assertEquals(Arrays.asList(5), result);
    }
}
