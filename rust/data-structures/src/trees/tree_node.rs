/// TreeNode: Binary Tree Node Structure
///
/// A node in a binary tree with a value and optional left and right children.
/// This is the foundational structure used by all tree exercises.
///
/// Example:
/// ```
/// use data_structures::trees::tree_node::TreeNode;
///
/// let left = Some(Box::new(TreeNode::new(1)));
/// let right = Some(Box::new(TreeNode::new(3)));
/// let root = TreeNode::with_children(2, left, right);
/// ```

#[derive(Debug, PartialEq, Eq)]
pub struct TreeNode {
    pub val: i32,
    pub left: Option<Box<TreeNode>>,
    pub right: Option<Box<TreeNode>>,
}

impl TreeNode {
    /// Creates a new TreeNode with the given value and no children.
    ///
    /// # Arguments
    /// * `val` - The value to store in the node
    ///
    /// # Returns
    /// A new TreeNode with left and right set to None
    pub fn new(val: i32) -> Self {
        // TODO: Implement this function
        // Create a TreeNode with the given value and None for left and right
        unimplemented!("Not implemented yet")
    }

    /// Creates a new TreeNode with the given value and children.
    ///
    /// # Arguments
    /// * `val` - The value to store in the node
    /// * `left` - Optional left child
    /// * `right` - Optional right child
    ///
    /// # Returns
    /// A new TreeNode with the specified children
    pub fn with_children(
        val: i32,
        left: Option<Box<TreeNode>>,
        right: Option<Box<TreeNode>>,
    ) -> Self {
        // TODO: Implement this function
        // Create a TreeNode with the given value and children
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_new_node() {
        let node = TreeNode::new(5);
        assert_eq!(node.val, 5);
        assert_eq!(node.left, None);
        assert_eq!(node.right, None);
    }

    #[test]
    fn test_node_with_left_child() {
        let left = Some(Box::new(TreeNode::new(3)));
        let node = TreeNode::with_children(5, left, None);
        assert_eq!(node.val, 5);
        assert!(node.left.is_some());
        assert_eq!(node.left.as_ref().unwrap().val, 3);
        assert!(node.right.is_none());
    }

    #[test]
    fn test_node_with_right_child() {
        let right = Some(Box::new(TreeNode::new(7)));
        let node = TreeNode::with_children(5, None, right);
        assert_eq!(node.val, 5);
        assert!(node.left.is_none());
        assert!(node.right.is_some());
        assert_eq!(node.right.as_ref().unwrap().val, 7);
    }

    #[test]
    fn test_node_with_both_children() {
        let left = Some(Box::new(TreeNode::new(3)));
        let right = Some(Box::new(TreeNode::new(7)));
        let node = TreeNode::with_children(5, left, right);
        assert_eq!(node.val, 5);
        assert_eq!(node.left.as_ref().unwrap().val, 3);
        assert_eq!(node.right.as_ref().unwrap().val, 7);
    }

    #[test]
    fn test_complex_tree() {
        let node1 = Some(Box::new(TreeNode::new(1)));
        let node3 = Some(Box::new(TreeNode::new(3)));
        let node2 = Some(Box::new(TreeNode::with_children(2, node1, node3)));

        let node6 = Some(Box::new(TreeNode::new(6)));
        let node5 = Some(Box::new(TreeNode::with_children(5, None, node6)));

        let root = TreeNode::with_children(4, node2, node5);

        assert_eq!(root.val, 4);
        assert_eq!(root.left.as_ref().unwrap().val, 2);
        assert_eq!(root.right.as_ref().unwrap().val, 5);
    }
}
