"""
Exercise: Validate Binary Search Tree (Medium)

Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.

Example 1:
Input:     2
          / \
         1   3
Output: True

Example 2:
Input:     5
          / \
         1   4
            / \
           3   6
Output: False (3 < 5 but is in right subtree)

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(h) where h is the height (recursion stack)
"""

from typing import Optional
from .tree_node import TreeNode


def is_valid_bst(root: Optional[TreeNode]) -> bool:
    """
    Determine if a binary tree is a valid binary search tree.

    Args:
        root: The root node of the binary tree

    Returns:
        True if the tree is a valid BST, False otherwise
    """
    # TODO: Implement this function
    # Hint: Use recursion with min and max bounds for valid values
    # Each node must be > all ancestors on left path and < all ancestors on right path
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage - valid BST
    root1 = TreeNode(2, TreeNode(1), TreeNode(3))
    print(f"Valid BST: {is_valid_bst(root1)}")

    # Example usage - invalid BST
    root2 = TreeNode(5)
    root2.left = TreeNode(1)
    root2.right = TreeNode(4, TreeNode(3), TreeNode(6))
    print(f"Valid BST: {is_valid_bst(root2)}")
