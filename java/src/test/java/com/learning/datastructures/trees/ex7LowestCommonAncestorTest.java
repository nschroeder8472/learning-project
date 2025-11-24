package com.learning.datastructures.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex7LowestCommonAncestorTest {

    private ex7_LowestCommonAncestor lca;

    @BeforeEach
    void setUp() {
        lca = new ex7_LowestCommonAncestor();
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(6);
        TreeNode result = lca.lowestCommonAncestor(root, root, root);
        assertEquals(6, result.val);
    }

    @Test
    void testThreeNodeBSTNodesOnDifferentSides() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2),
                new TreeNode(8));
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode result = lca.lowestCommonAncestor(root, p, q);
        assertEquals(6, result.val);
    }

    @Test
    void testSevenNodeBSTNodesOnDifferentSides() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.left; // 2
        TreeNode q = root.right; // 8
        TreeNode result = lca.lowestCommonAncestor(root, p, q);
        assertEquals(6, result.val);
    }

    @Test
    void testSevenNodeBSTNodeIsAncestorOfOther() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.left; // 2
        TreeNode q = root.left.right; // 4
        TreeNode result = lca.lowestCommonAncestor(root, p, q);
        assertEquals(2, result.val);
    }

    @Test
    void testSevenNodeBSTBothNodesInLeftSubtree() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.left.right.left; // 3
        TreeNode q = root.left.right.right; // 5
        TreeNode result = lca.lowestCommonAncestor(root, p, q);
        assertEquals(4, result.val);
    }

    @Test
    void testLeftSkewedBST() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        new TreeNode(1),
                        null),
                null);
        TreeNode p = root; // 3
        TreeNode q = root.left.left; // 1
        TreeNode result = lca.lowestCommonAncestor(root, p, q);
        assertEquals(3, result.val);
    }

    @Test
    void testRightSkewedBST() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3)));
        TreeNode p = root.right; // 2
        TreeNode q = root.right.right; // 3
        TreeNode result = lca.lowestCommonAncestor(root, p, q);
        assertEquals(2, result.val);
    }
}
