/// Exercise: Inorder Traversal (Easy)
///
/// Given the root of a binary tree, return the inorder traversal of its nodes' values.
/// Inorder traversal visits nodes in the order: left subtree -> root -> right subtree
///
/// Example:
/// Input:
///     1
///    / \
///   2   3
///  / \
/// 4   5
/// Output: vec![4, 2, 5, 1, 3]
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(h) where h is the height of the tree (recursion stack)

use super::tree_node::TreeNode;

pub fn inorder(root: Option<Box<TreeNode>>) -> Vec<i32> {
    // TODO: Implement this function
    // Hint: Use recursion - traverse left, visit node, traverse right
    // Base case: if root is None, return empty vector
    // Create a result vector and use a helper function if needed
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_tree() {
        assert_eq!(inorder(None), vec![]);
    }

    #[test]
    fn test_single_node() {
        let root = Some(Box::new(TreeNode::new(1)));
        assert_eq!(inorder(root), vec![1]);
    }

    #[test]
    fn test_left_skewed_tree() {
        let node1 = Some(Box::new(TreeNode::new(1)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node1, None)));
        let root = Some(Box::new(TreeNode::with_children(3, node2, None)));
        assert_eq!(inorder(root), vec![1, 2, 3]);
    }

    #[test]
    fn test_right_skewed_tree() {
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, None, node3)));
        let root = Some(Box::new(TreeNode::with_children(1, None, node2)));
        assert_eq!(inorder(root), vec![1, 2, 3]);
    }

    #[test]
    fn test_balanced_tree() {
        let node4 = Some(Box::new(TreeNode::new(4)));
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node4, node5)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let root = Some(Box::new(TreeNode::with_children(1, node2, node3)));
        assert_eq!(inorder(root), vec![4, 2, 5, 1, 3]);
    }

    #[test]
    fn test_complex_tree() {
        let node6 = Some(Box::new(TreeNode::new(6)));
        let node7 = Some(Box::new(TreeNode::new(7)));
        let node3 = Some(Box::new(TreeNode::with_children(3, node6, node7)));
        let node4 = Some(Box::new(TreeNode::new(4)));
        let node5 = Some(Box::new(TreeNode::new(5)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node4, node5)));
        let root = Some(Box::new(TreeNode::with_children(1, node2, node3)));
        assert_eq!(inorder(root), vec![4, 2, 5, 1, 6, 3, 7]);
    }

    #[test]
    fn test_only_left_children() {
        let node2 = Some(Box::new(TreeNode::new(2)));
        let node1 = Some(Box::new(TreeNode::with_children(1, node2, None)));
        let root = Some(Box::new(TreeNode::with_children(3, node1, None)));
        assert_eq!(inorder(root), vec![2, 1, 3]);
    }
}
