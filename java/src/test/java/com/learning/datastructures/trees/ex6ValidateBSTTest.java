package com.learning.datastructures.trees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex6ValidateBSTTest {

    private ex6_ValidateBST validator;

    @BeforeEach
    void setUp() {
        validator = new ex6_ValidateBST();
    }

    @Test
    void testEmptyTree() {
        boolean result = validator.isValidBST(null);
        assertTrue(result);
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(42);
        boolean result = validator.isValidBST(root);
        assertTrue(result);
    }

    @Test
    void testValidThreeNodeBST() {
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));
        boolean result = validator.isValidBST(root);
        assertTrue(result);
    }

    @Test
    void testValidBalancedBST() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6, new TreeNode(5), new TreeNode(7)));
        boolean result = validator.isValidBST(root);
        assertTrue(result);
    }

    @Test
    void testInvalidBSTRightChildTooSmall() {
        TreeNode root = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        boolean result = validator.isValidBST(root);
        assertFalse(result);
    }

    @Test
    void testInvalidBSTLeftChildTooLarge() {
        TreeNode root = new TreeNode(5,
                new TreeNode(1, null, new TreeNode(6)),
                new TreeNode(7));
        boolean result = validator.isValidBST(root);
        assertFalse(result);
    }

    @Test
    void testValidLeftSkewedBST() {
        TreeNode root = new TreeNode(3,
                new TreeNode(2,
                        new TreeNode(1),
                        null),
                null);
        boolean result = validator.isValidBST(root);
        assertTrue(result);
    }

    @Test
    void testValidRightSkewedBST() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3)));
        boolean result = validator.isValidBST(root);
        assertTrue(result);
    }
}
