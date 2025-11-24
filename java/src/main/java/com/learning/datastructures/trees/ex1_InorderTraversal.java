package com.learning.datastructures.trees;

import java.util.List;

/**
 * Exercise: Inorder Traversal (Easy)
 *
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * Inorder traversal visits nodes in the order: Left subtree, Root, Right subtree.
 *
 * For a BST, inorder traversal returns values in sorted order.
 *
 * Example:
 * Input:     2
 *           / \
 *          1   3
 * Output: [1, 2, 3]
 *
 * Example:
 * Input:     4
 *           / \
 *          2   6
 *         / \ / \
 *        1  3 5  7
 * Output: [1, 2, 3, 4, 5, 6, 7]
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(h) for recursion stack, where h is height
 */
public class ex1_InorderTraversal {

    public List<Integer> inorder(TreeNode root) {
        // TODO: Implement this method
        // Hint: Recursively visit left subtree, then add root value, then visit right subtree
        // Base case: if root is null, return empty list
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
