package com.learning.algorithms.graphtraversal;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import static com.learning.algorithms.graphtraversal.ex5_CloneGraph.Node;

/**
 * Test cases for Clone Graph implementation.
 */
public class ex5CloneGraphTest {

    @Test
    public void testSingleNode() {
        Node node = new Node(1);
        Node cloned = ex5_CloneGraph.cloneGraph(node);

        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertNotSame(node, cloned); // Different object
        assertTrue(cloned.neighbors.isEmpty());
    }

    @Test
    public void testTwoConnectedNodes() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);

        Node cloned = ex5_CloneGraph.cloneGraph(node1);

        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertNotSame(node1, cloned);
        assertEquals(1, cloned.neighbors.size());

        Node clonedNeighbor = cloned.neighbors.get(0);
        assertEquals(2, clonedNeighbor.val);
        assertNotSame(node2, clonedNeighbor);

        // Verify bidirectional connection
        assertEquals(1, clonedNeighbor.neighbors.size());
        assertSame(cloned, clonedNeighbor.neighbors.get(0));
    }

    @Test
    public void testFourNodeGraph() {
        // Graph: 1-2, 1-4, 2-3, 3-4
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node cloned = ex5_CloneGraph.cloneGraph(node1);

        // Verify it's a deep copy
        assertNotSame(node1, cloned);

        // Verify structure using BFS
        Set<Node> originalVisited = new HashSet<>();
        Set<Node> clonedVisited = new HashSet<>();
        Queue<Node> originalQueue = new LinkedList<>();
        Queue<Node> clonedQueue = new LinkedList<>();

        originalQueue.add(node1);
        clonedQueue.add(cloned);

        while (!originalQueue.isEmpty()) {
            Node origNode = originalQueue.poll();
            Node clonedNode = clonedQueue.poll();

            if (originalVisited.contains(origNode)) continue;

            originalVisited.add(origNode);
            clonedVisited.add(clonedNode);

            assertEquals(origNode.val, clonedNode.val);
            assertEquals(origNode.neighbors.size(), clonedNode.neighbors.size());
            assertNotSame(origNode, clonedNode);

            for (int i = 0; i < origNode.neighbors.size(); i++) {
                originalQueue.add(origNode.neighbors.get(i));
                clonedQueue.add(clonedNode.neighbors.get(i));
            }
        }

        assertEquals(4, originalVisited.size());
        assertEquals(4, clonedVisited.size());
    }

    @Test
    public void testNullGraph() {
        Node cloned = ex5_CloneGraph.cloneGraph(null);
        assertNull(cloned);
    }

    @Test
    public void testGraphWithSelfLoop() {
        Node node = new Node(1);
        node.neighbors.add(node); // Self loop

        Node cloned = ex5_CloneGraph.cloneGraph(node);

        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertNotSame(node, cloned);
        assertEquals(1, cloned.neighbors.size());
        assertSame(cloned, cloned.neighbors.get(0)); // Cloned node points to itself
    }

    @Test
    public void testBFSClone() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.neighbors.add(node2);
        node1.neighbors.add(node3);
        node2.neighbors.add(node1);
        node3.neighbors.add(node1);

        Node cloned = ex5_CloneGraph.cloneGraphBFS(node1);

        assertNotNull(cloned);
        assertEquals(1, cloned.val);
        assertNotSame(node1, cloned);
        assertEquals(2, cloned.neighbors.size());

        // Verify deep copy
        for (Node neighbor : cloned.neighbors) {
            assertNotSame(node2, neighbor);
            assertNotSame(node3, neighbor);
        }
    }

    @Test
    public void testComplexGraph() {
        // Create a more complex graph
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.neighbors.add(node2);
        node1.neighbors.add(node3);
        node2.neighbors.add(node3);
        node2.neighbors.add(node4);
        node3.neighbors.add(node4);
        node3.neighbors.add(node5);
        node4.neighbors.add(node5);

        Node cloned = ex5_CloneGraph.cloneGraph(node1);

        // Traverse and count nodes
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(cloned);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (visited.contains(current)) continue;
            visited.add(current);
            queue.addAll(current.neighbors);
        }

        assertEquals(5, visited.size());
    }
}
