package com.learning.datastructures.trees;

import java.util.List;

/**
 * Exercise: Level Order Traversal (Medium)
 *
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * Level order traversal visits nodes level by level from left to right (BFS).
 *
 * Example:
 * Input:     3
 *           / \
 *          9  20
 *            /  \
 *           15   7
 * Output: [[3], [9, 20], [15, 7]]
 *
 * Alternative: Return flattened list: [3, 9, 20, 15, 7]
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(w) where w is the maximum width of the tree
 */
public class ex4_LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Implement this method
        // Hint: Use a Queue for BFS
        // Process nodes level by level: dequeue, add value, enqueue children
        // Track levels separately (can use queue size at start of each level)
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
