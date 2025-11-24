package com.learning.datastructures.trees;

/**
 * Exercise: Lowest Common Ancestor of a Binary Search Tree (Hard)
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes.
 *
 * The LCA is defined as the lowest node in the tree that has both p and q as descendants
 * (where we allow a node to be a descendant of itself).
 *
 * Example 1:
 * Input:     6
 *           / \
 *          2   8
 *         / \ / \
 *        0  4 7  9
 *          / \
 *         3   5
 * p = 2, q = 8
 * Output: 6
 * Explanation: The LCA of nodes 2 and 8 is 6.
 *
 * Example 2:
 * Input: Same tree as above, p = 2, q = 4
 * Output: 2
 * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself.
 *
 * Time Complexity: O(h) where h is height (O(log n) for balanced, O(n) for skewed)
 * Space Complexity: O(h) for recursion stack (O(1) for iterative solution)
 */
public class ex7_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TODO: Implement this method
        // Hint: Leverage the BST property!
        // If both p and q are less than root, LCA is in left subtree
        // If both p and q are greater than root, LCA is in right subtree
        // Otherwise, root is the LCA (one is on each side, or one equals root)
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
