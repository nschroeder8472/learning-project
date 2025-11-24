/// Exercise: Maximum Depth of Binary Tree (Easy)
///
/// Given the root of a binary tree, return its maximum depth.
/// A binary tree's maximum depth is the number of nodes along the longest path
/// from the root node down to the farthest leaf node.
///
/// Example:
/// Input:
///     3
///    / \
///   9  20
///     /  \
///    15   7
/// Output: 3
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(h) where h is the height of the tree (recursion stack)

use super::tree_node::TreeNode;

pub fn max_depth(root: &Option<Box<TreeNode>>) -> i32 {
    // TODO: Implement this function
    // Hint: Use recursion
    // Base case: if root is None, return 0
    // Recursive case: return 1 + max(depth of left subtree, depth of right subtree)
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_tree() {
        assert_eq!(max_depth(&None), 0);
    }

    #[test]
    fn test_single_node() {
        let root = Some(Box::new(TreeNode::new(1)));
        assert_eq!(max_depth(&root), 1);
    }

    #[test]
    fn test_balanced_tree_depth_2() {
        let left = Some(Box::new(TreeNode::new(2)));
        let right = Some(Box::new(TreeNode::new(3)));
        let root = Some(Box::new(TreeNode::with_children(1, left, right)));
        assert_eq!(max_depth(&root), 2);
    }

    #[test]
    fn test_balanced_tree_depth_3() {
        let node15 = Some(Box::new(TreeNode::new(15)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node9 = Some(Box::new(TreeNode::new(9)));
        let node20 = Some(Box::new(TreeNode::with_children(20, node15, node7)));
        let root = Some(Box::new(TreeNode::with_children(3, node9, node20)));
        assert_eq!(max_depth(&root), 3);
    }

    #[test]
    fn test_left_skewed() {
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node3, None)));
        let root = Some(Box::new(TreeNode::with_children(1, node2, None)));
        assert_eq!(max_depth(&root), 3);
    }

    #[test]
    fn test_right_skewed() {
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, None, node3)));
        let root = Some(Box::new(TreeNode::with_children(1, None, node2)));
        assert_eq!(max_depth(&root), 3);
    }

    #[test]
    fn test_unbalanced_tree() {
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node4 = Some(Box::new(TreeNode::with_children(4, node5, None)));
        let node3 = Some(Box::new(TreeNode::with_children(3, node4, None)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node3, None)));
        let root = Some(Box::new(TreeNode::with_children(1, node2, None)));
        assert_eq!(max_depth(&root), 5);
    }
}
