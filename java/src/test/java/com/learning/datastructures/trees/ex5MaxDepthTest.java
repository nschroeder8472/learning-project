package com.learning.datastructures.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex5MaxDepthTest {

    private ex5_MaxDepth ex5MaxDepth;

    @BeforeEach
    void setUp() {
        ex5MaxDepth = new ex5_MaxDepth();
    }

    @Test
    void testEmptyTree() {
        int result = ex5MaxDepth.maxDepth(null);
        assertEquals(0, result);
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(42);
        int result = ex5MaxDepth.maxDepth(root);
        assertEquals(1, result);
    }

    @Test
    void testTwoLevelBalancedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20));
        int result = ex5MaxDepth.maxDepth(root);
        assertEquals(2, result);
    }

    @Test
    void testThreeLevelBalancedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        int result = ex5MaxDepth.maxDepth(root);
        assertEquals(3, result);
    }

    @Test
    void testLeftSkewedTree() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        new TreeNode(1),
                        null),
                null);
        int result = ex5MaxDepth.maxDepth(root);
        assertEquals(3, result);
    }

    @Test
    void testRightSkewedTree() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                null,
                                new TreeNode(4))));
        int result = ex5MaxDepth.maxDepth(root);
        assertEquals(4, result);
    }

    @Test
    void testUnbalancedTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(6), null), null),
                new TreeNode(3, null, new TreeNode(5)));
        int result = ex5MaxDepth.maxDepth(root);
        assertEquals(4, result);
    }
}
