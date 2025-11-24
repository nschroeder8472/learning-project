package com.learning.datastructures.trees;

import java.util.List;

/**
 * Exercise: Postorder Traversal (Easy)
 *
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * Postorder traversal visits nodes in the order: Left subtree, Right subtree, Root.
 *
 * Example:
 * Input:     2
 *           / \
 *          1   3
 * Output: [1, 3, 2]
 *
 * Example:
 * Input:     4
 *           / \
 *          2   6
 *         / \ / \
 *        1  3 5  7
 * Output: [1, 3, 2, 5, 7, 6, 4]
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(h) for recursion stack, where h is height
 */
public class ex3_PostorderTraversal {

    public List<Integer> postorder(TreeNode root) {
        // TODO: Implement this method
        // Hint: Recursively visit left subtree, then right subtree, then add root value
        // Base case: if root is null, return empty list
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
