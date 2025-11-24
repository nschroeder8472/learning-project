package com.learning.datastructures.trees;

/**
 * Exercise: Validate Binary Search Tree (Medium)
 *
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the node's key
 * - The right subtree of a node contains only nodes with keys greater than the node's key
 * - Both the left and right subtrees must also be binary search trees
 *
 * Example 1:
 * Input:     2
 *           / \
 *          1   3
 * Output: true
 *
 * Example 2:
 * Input:     5
 *           / \
 *          1   4
 *             / \
 *            3   6
 * Output: false
 * Explanation: The root node's value is 5 but its right child's value is 4.
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(h) for recursion stack, where h is height
 */
public class ex6_ValidateBST {

    public boolean isValidBST(TreeNode root) {
        // TODO: Implement this method
        // Hint: Use a helper method with min and max constraints
        // For each node, ensure min < node.val < max
        // Pass updated constraints to left and right subtrees
        // Use Long.MIN_VALUE and Long.MAX_VALUE for initial constraints
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
