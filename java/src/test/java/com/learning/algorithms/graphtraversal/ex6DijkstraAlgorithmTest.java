package com.learning.algorithms.graphtraversal;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import static com.learning.algorithms.graphtraversal.ex6_DijkstraAlgorithm.Edge;

/**
 * Test cases for Dijkstra's Algorithm implementation.
 */
public class ex6DijkstraAlgorithmTest {

    @Test
    public void testSimpleGraph() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 4), new Edge(2, 1)));
        graph.put(1, Arrays.asList(new Edge(3, 1)));
        graph.put(2, Arrays.asList(new Edge(1, 2), new Edge(3, 5)));
        graph.put(3, new ArrayList<>());

        Map<Integer, Integer> distances = ex6_DijkstraAlgorithm.dijkstra(graph, 0, 4);

        assertEquals(0, distances.get(0));
        assertEquals(3, distances.get(1)); // 0->2->1 = 3 (shorter than direct 0->1 = 4)
        assertEquals(1, distances.get(2)); // 0->2 = 1
        assertEquals(4, distances.get(3)); // 0->2->1->3 = 4
    }

    @Test
    public void testSingleNode() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, new ArrayList<>());

        Map<Integer, Integer> distances = ex6_DijkstraAlgorithm.dijkstra(graph, 0, 1);

        assertEquals(0, distances.get(0));
    }

    @Test
    public void testLinearGraph() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 2)));
        graph.put(1, Arrays.asList(new Edge(2, 3)));
        graph.put(2, Arrays.asList(new Edge(3, 4)));
        graph.put(3, new ArrayList<>());

        Map<Integer, Integer> distances = ex6_DijkstraAlgorithm.dijkstra(graph, 0, 4);

        assertEquals(0, distances.get(0));
        assertEquals(2, distances.get(1));
        assertEquals(5, distances.get(2));
        assertEquals(9, distances.get(3));
    }

    @Test
    public void testMultiplePaths() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 10), new Edge(2, 5)));
        graph.put(1, Arrays.asList(new Edge(3, 1)));
        graph.put(2, Arrays.asList(new Edge(1, 3), new Edge(3, 8)));
        graph.put(3, new ArrayList<>());

        Map<Integer, Integer> distances = ex6_DijkstraAlgorithm.dijkstra(graph, 0, 4);

        assertEquals(0, distances.get(0));
        assertEquals(8, distances.get(1)); // 0->2->1 = 8 (shorter than direct 0->1 = 10)
        assertEquals(5, distances.get(2));
        assertEquals(9, distances.get(3)); // 0->2->1->3 = 9
    }

    @Test
    public void testDisconnectedNode() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 1)));
        graph.put(1, new ArrayList<>());
        graph.put(2, Arrays.asList(new Edge(3, 1)));
        graph.put(3, new ArrayList<>());

        Map<Integer, Integer> distances = ex6_DijkstraAlgorithm.dijkstra(graph, 0, 4);

        assertEquals(0, distances.get(0));
        assertEquals(1, distances.get(1));
        assertFalse(distances.containsKey(2)); // Unreachable from 0
        assertFalse(distances.containsKey(3)); // Unreachable from 0
    }

    @Test
    public void testGraphWithCycle() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 2)));
        graph.put(1, Arrays.asList(new Edge(2, 3), new Edge(0, 1))); // Cycle back to 0
        graph.put(2, Arrays.asList(new Edge(3, 1)));
        graph.put(3, new ArrayList<>());

        Map<Integer, Integer> distances = ex6_DijkstraAlgorithm.dijkstra(graph, 0, 4);

        assertEquals(0, distances.get(0));
        assertEquals(2, distances.get(1));
        assertEquals(5, distances.get(2));
        assertEquals(6, distances.get(3));
    }

    @Test
    public void testShortestPath() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 4), new Edge(2, 1)));
        graph.put(1, Arrays.asList(new Edge(3, 1)));
        graph.put(2, Arrays.asList(new Edge(1, 2), new Edge(3, 5)));
        graph.put(3, new ArrayList<>());

        List<Integer> path = ex6_DijkstraAlgorithm.dijkstraPath(graph, 0, 3, 4);

        assertNotNull(path);
        assertEquals(0, path.get(0)); // Start at 0
        assertEquals(3, path.get(path.size() - 1)); // End at 3
        assertEquals(4, path.size()); // 0->2->1->3
    }

    @Test
    public void testPathToSelf() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 1)));
        graph.put(1, new ArrayList<>());

        List<Integer> path = ex6_DijkstraAlgorithm.dijkstraPath(graph, 0, 0, 2);

        assertEquals(Arrays.asList(0), path);
    }

    @Test
    public void testNoPath() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 1)));
        graph.put(1, new ArrayList<>());
        graph.put(2, Arrays.asList(new Edge(3, 1)));
        graph.put(3, new ArrayList<>());

        List<Integer> path = ex6_DijkstraAlgorithm.dijkstraPath(graph, 0, 3, 4);

        assertTrue(path.isEmpty()); // No path from 0 to 3
    }

    @Test
    public void testLargerGraph() {
        Map<Integer, List<Edge>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(new Edge(1, 7), new Edge(2, 9), new Edge(5, 14)));
        graph.put(1, Arrays.asList(new Edge(0, 7), new Edge(2, 10), new Edge(3, 15)));
        graph.put(2, Arrays.asList(new Edge(0, 9), new Edge(1, 10), new Edge(3, 11), new Edge(5, 2)));
        graph.put(3, Arrays.asList(new Edge(1, 15), new Edge(2, 11), new Edge(4, 6)));
        graph.put(4, Arrays.asList(new Edge(3, 6), new Edge(5, 9)));
        graph.put(5, Arrays.asList(new Edge(0, 14), new Edge(2, 2), new Edge(4, 9)));

        Map<Integer, Integer> distances = ex6_DijkstraAlgorithm.dijkstra(graph, 0, 6);

        assertEquals(0, distances.get(0));
        assertEquals(7, distances.get(1));
        assertEquals(9, distances.get(2));
        assertEquals(20, distances.get(3));
        assertEquals(20, distances.get(4));
        assertEquals(11, distances.get(5));
    }
}
