package com.learning.datastructures.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ex4LevelOrderTraversalTest {

    private ex4_LevelOrderTraversal traversal;

    @BeforeEach
    void setUp() {
        traversal = new ex4_LevelOrderTraversal();
    }

    @Test
    void testEmptyTree() {
        List<List<Integer>> result = traversal.levelOrder(null);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(42);
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(List.of(42)), result);
    }

    @Test
    void testThreeNodeBalancedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        ), result);
    }

    @Test
    void testBalancedBST() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6, new TreeNode(5), new TreeNode(7)));
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(
                List.of(4),
                List.of(2, 6),
                List.of(1, 3, 5, 7)
        ), result);
    }

    @Test
    void testLeftSkewedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        new TreeNode(1),
                        null),
                null);
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(
                List.of(3),
                List.of(2),
                List.of(1)
        ), result);
    }

    @Test
    void testRightSkewedTree() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3)));
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(
                List.of(1),
                List.of(2),
                List.of(3)
        ), result);
    }

    @Test
    void testUnbalancedTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, null, new TreeNode(5)));
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 5)
        ), result);
    }
}
