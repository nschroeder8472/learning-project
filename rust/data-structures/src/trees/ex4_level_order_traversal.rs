/// Exercise: Level Order Traversal (Medium)
///
/// Given the root of a binary tree, return the level order traversal of its nodes' values.
/// (i.e., from left to right, level by level).
///
/// Example:
/// Input:
///     3
///    / \
///   9  20
///     /  \
///    15   7
/// Output: vec![vec![3], vec![9, 20], vec![15, 7]]
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(w) where w is the maximum width of the tree

use super::tree_node::TreeNode;
use std::collections::VecDeque;

pub fn level_order(root: Option<Box<TreeNode>>) -> Vec<Vec<i32>> {
    // TODO: Implement this function
    // Hint: Use a VecDeque to implement BFS (breadth-first search)
    // Process nodes level by level
    // For each level, track the number of nodes and process them all before moving to the next level
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_tree() {
        assert_eq!(level_order(None), vec![] as Vec<Vec<i32>>);
    }

    #[test]
    fn test_single_node() {
        let root = Some(Box::new(TreeNode::new(1)));
        assert_eq!(level_order(root), vec![vec![1]]);
    }

    #[test]
    fn test_two_levels() {
        let left = Some(Box::new(TreeNode::new(2)));
        let right = Some(Box::new(TreeNode::new(3)));
        let root = Some(Box::new(TreeNode::with_children(1, left, right)));
        assert_eq!(level_order(root), vec![vec![1], vec![2, 3]]);
    }

    #[test]
    fn test_three_levels() {
        let node15 = Some(Box::new(TreeNode::new(15)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node9 = Some(Box::new(TreeNode::new(9)));
        let node20 = Some(Box::new(TreeNode::with_children(20, node15, node7)));
        let root = Some(Box::new(TreeNode::with_children(3, node9, node20)));
        assert_eq!(level_order(root), vec![vec![3], vec![9, 20], vec![15, 7]]);
    }

    #[test]
    fn test_left_skewed() {
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node3, None)));
        let root = Some(Box::new(TreeNode::with_children(1, node2, None)));
        assert_eq!(level_order(root), vec![vec![1], vec![2], vec![3]]);
    }

    #[test]
    fn test_right_skewed() {
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, None, node3)));
        let root = Some(Box::new(TreeNode::with_children(1, None, node2)));
        assert_eq!(level_order(root), vec![vec![1], vec![2], vec![3]]);
    }

    #[test]
    fn test_unbalanced_tree() {
        let node4 = Some(Box::new(TreeNode::new(4)));
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node4, node5)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let root = Some(Box::new(TreeNode::with_children(1, node2, node3)));
        assert_eq!(level_order(root), vec![vec![1], vec![2, 3], vec![4, 5]]);
    }
}
