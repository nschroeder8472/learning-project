/// Exercise: Validate Binary Search Tree (Medium)
///
/// Given the root of a binary tree, determine if it is a valid binary search tree (BST).
///
/// A valid BST is defined as follows:
/// - The left subtree of a node contains only nodes with keys less than the node's key.
/// - The right subtree of a node contains only nodes with keys greater than the node's key.
/// - Both the left and right subtrees must also be binary search trees.
///
/// Example:
/// Input:
///     2
///    / \
///   1   3
/// Output: true
///
/// Example:
/// Input:
///     5
///    / \
///   1   4
///      / \
///     3   6
/// Output: false (because 3 < 5 but it's in the right subtree)
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(h) where h is the height of the tree (recursion stack)

use super::tree_node::TreeNode;

pub fn is_valid_bst(root: &Option<Box<TreeNode>>) -> bool {
    // TODO: Implement this function
    // Hint: Use a helper function that tracks min and max bounds
    // For each node, check if its value is within the valid range
    // Left subtree must have max bound of current node's value
    // Right subtree must have min bound of current node's value
    // Use Option<i32> for min/max to handle None as unbounded
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_tree() {
        assert_eq!(is_valid_bst(&None), true);
    }

    #[test]
    fn test_single_node() {
        let root = Some(Box::new(TreeNode::new(1)));
        assert_eq!(is_valid_bst(&root), true);
    }

    #[test]
    fn test_valid_bst_simple() {
        let left = Some(Box::new(TreeNode::new(1)));
        let right = Some(Box::new(TreeNode::new(3)));
        let root = Some(Box::new(TreeNode::with_children(2, left, right)));
        assert_eq!(is_valid_bst(&root), true);
    }

    #[test]
    fn test_invalid_bst_simple() {
        let left = Some(Box::new(TreeNode::new(3)));
        let right = Some(Box::new(TreeNode::new(1)));
        let root = Some(Box::new(TreeNode::with_children(2, left, right)));
        assert_eq!(is_valid_bst(&root), false);
    }

    #[test]
    fn test_valid_bst_complex() {
        let node1 = Some(Box::new(TreeNode::new(1)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node1, node3)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node6 = Some(Box::new(TreeNode::with_children(6, None, node7)));
        let root = Some(Box::new(TreeNode::with_children(4, node2, node6)));
        assert_eq!(is_valid_bst(&root), true);
    }

    #[test]
    fn test_invalid_bst_subtree_violation() {
        // Tree: 5, left: 1, right: 4 with children 3 and 6
        // Invalid because 3 < 5 but 3 is in right subtree
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node6 = Some(Box::new(TreeNode::new(6)));
        let node4 = Some(Box::new(TreeNode::with_children(4, node3, node6)));
        let node1 = Some(Box::new(TreeNode::new(1)));
        let root = Some(Box::new(TreeNode::with_children(5, node1, node4)));
        assert_eq!(is_valid_bst(&root), false);
    }

    #[test]
    fn test_left_skewed_valid() {
        let node1 = Some(Box::new(TreeNode::new(1)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node1, None)));
        let root = Some(Box::new(TreeNode::with_children(3, node2, None)));
        assert_eq!(is_valid_bst(&root), true);
    }

    #[test]
    fn test_right_skewed_valid() {
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, None, node3)));
        let root = Some(Box::new(TreeNode::with_children(1, None, node2)));
        assert_eq!(is_valid_bst(&root), true);
    }
}
