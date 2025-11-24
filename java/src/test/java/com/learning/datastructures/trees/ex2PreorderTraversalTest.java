package com.learning.datastructures.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ex2PreorderTraversalTest {

    private ex2_PreorderTraversal traversal;

    @BeforeEach
    void setUp() {
        traversal = new ex2_PreorderTraversal();
    }

    @Test
    void testEmptyTree() {
        List<Integer> result = traversal.preorder(null);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(42);
        List<Integer> result = traversal.preorder(root);
        assertEquals(List.of(42), result);
    }

    @Test
    void testThreeNodeBalancedTree() {
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));
        List<Integer> result = traversal.preorder(root);
        assertEquals(List.of(2, 1, 3), result);
    }

    @Test
    void testSevenNodeBalancedBST() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6, new TreeNode(5), new TreeNode(7)));
        List<Integer> result = traversal.preorder(root);
        assertEquals(List.of(4, 2, 1, 3, 6, 5, 7), result);
    }

    @Test
    void testLeftSkewedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        new TreeNode(1),
                        null),
                null);
        List<Integer> result = traversal.preorder(root);
        assertEquals(List.of(3, 2, 1), result);
    }

    @Test
    void testRightSkewedTree() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3)));
        List<Integer> result = traversal.preorder(root);
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    void testNegativeValues() {
        TreeNode root = new TreeNode(0,
                new TreeNode(-5, new TreeNode(-10), new TreeNode(-2)),
                new TreeNode(5, new TreeNode(2), new TreeNode(10)));
        List<Integer> result = traversal.preorder(root);
        assertEquals(List.of(0, -5, -10, -2, 5, 2, 10), result);
    }
}
