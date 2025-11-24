package com.learning.datastructures.trees;

import java.util.List;

/**
 * Exercise: Preorder Traversal (Easy)
 *
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * Preorder traversal visits nodes in the order: Root, Left subtree, Right subtree.
 *
 * Example:
 * Input:     2
 *           / \
 *          1   3
 * Output: [2, 1, 3]
 *
 * Example:
 * Input:     4
 *           / \
 *          2   6
 *         / \ / \
 *        1  3 5  7
 * Output: [4, 2, 1, 3, 6, 5, 7]
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(h) for recursion stack, where h is height
 */
public class ex2_PreorderTraversal {

    public List<Integer> preorder(TreeNode root) {
        // TODO: Implement this method
        // Hint: Add root value first, then recursively visit left subtree, then right subtree
        // Base case: if root is null, return empty list
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
