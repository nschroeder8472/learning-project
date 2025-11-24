/// Exercise: Lowest Common Ancestor of a Binary Search Tree (Medium)
///
/// Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given values.
///
/// The lowest common ancestor is defined as the lowest node in the tree that has both
/// p and q as descendants (where we allow a node to be a descendant of itself).
///
/// For simplicity in Rust, we use values p and q instead of node references,
/// and return the value instead of a node reference.
///
/// Example:
/// Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
///     6
///    / \
///   2   8
///  / \ / \
/// 0  4 7  9
///   / \
///  3   5
/// Output: 6 (LCA of 2 and 8 is 6)
///
/// Example:
/// Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
/// Output: 2 (LCA of 2 and 4 is 2, since a node can be a descendant of itself)
///
/// Time Complexity: O(h) where h is the height of the tree
/// Space Complexity: O(h) for recursion stack (or O(1) for iterative)

use super::tree_node::TreeNode;

pub fn lowest_common_ancestor(root: Option<Box<TreeNode>>, p: i32, q: i32) -> Option<i32> {
    // TODO: Implement this function
    // Hint: Use the BST property
    // If both p and q are less than root, LCA is in left subtree
    // If both p and q are greater than root, LCA is in right subtree
    // Otherwise, root is the LCA
    // This can be solved iteratively or recursively
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_tree() {
        assert_eq!(lowest_common_ancestor(None, 1, 2), None);
    }

    #[test]
    fn test_both_in_different_subtrees() {
        let node0 = Some(Box::new(TreeNode::new(0)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node4 = Some(Box::new(TreeNode::with_children(4, node3, node5)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node0, node4)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node9 = Some(Box::new(TreeNode::new(9)));
        let node8 = Some(Box::new(TreeNode::with_children(8, node7, node9)));
        let root = Some(Box::new(TreeNode::with_children(6, node2, node8)));

        assert_eq!(lowest_common_ancestor(root, 2, 8), Some(6));
    }

    #[test]
    fn test_one_is_ancestor_of_other() {
        let node0 = Some(Box::new(TreeNode::new(0)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node4 = Some(Box::new(TreeNode::with_children(4, node3, node5)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node0, node4)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node9 = Some(Box::new(TreeNode::new(9)));
        let node8 = Some(Box::new(TreeNode::with_children(8, node7, node9)));
        let root = Some(Box::new(TreeNode::with_children(6, node2, node8)));

        assert_eq!(lowest_common_ancestor(root, 2, 4), Some(2));
    }

    #[test]
    fn test_both_in_left_subtree() {
        let node0 = Some(Box::new(TreeNode::new(0)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node4 = Some(Box::new(TreeNode::with_children(4, node3, node5)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node0, node4)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node9 = Some(Box::new(TreeNode::new(9)));
        let node8 = Some(Box::new(TreeNode::with_children(8, node7, node9)));
        let root = Some(Box::new(TreeNode::with_children(6, node2, node8)));

        assert_eq!(lowest_common_ancestor(root, 0, 5), Some(2));
    }

    #[test]
    fn test_both_in_right_subtree() {
        let node0 = Some(Box::new(TreeNode::new(0)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node4 = Some(Box::new(TreeNode::with_children(4, node3, node5)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node0, node4)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node9 = Some(Box::new(TreeNode::new(9)));
        let node8 = Some(Box::new(TreeNode::with_children(8, node7, node9)));
        let root = Some(Box::new(TreeNode::with_children(6, node2, node8)));

        assert_eq!(lowest_common_ancestor(root, 7, 9), Some(8));
    }

    #[test]
    fn test_simple_tree() {
        let left = Some(Box::new(TreeNode::new(1)));
        let right = Some(Box::new(TreeNode::new(3)));
        let root = Some(Box::new(TreeNode::with_children(2, left, right)));

        assert_eq!(lowest_common_ancestor(root, 1, 3), Some(2));
    }

    #[test]
    fn test_root_is_one_of_nodes() {
        let left = Some(Box::new(TreeNode::new(1)));
        let right = Some(Box::new(TreeNode::new(3)));
        let root = Some(Box::new(TreeNode::with_children(2, left, right)));

        assert_eq!(lowest_common_ancestor(root, 2, 3), Some(2));
    }
}
