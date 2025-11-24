"""
Exercise: Inorder Traversal (Easy)

Given the root of a binary tree, return the inorder traversal of its nodes' values.

Inorder traversal visits nodes in the order: Left -> Root -> Right

Example:
Input:     1
          / \
         2   3
        / \
       4   5
Output: [4, 2, 5, 1, 3]

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(h) where h is the height (recursion stack)
"""

from typing import List, Optional
from .tree_node import TreeNode


def inorder(root: Optional[TreeNode]) -> List[int]:
    """
    Perform inorder traversal of a binary tree.

    Args:
        root: The root node of the binary tree

    Returns:
        A list containing node values in inorder sequence
    """
    # TODO: Implement this function
    # Hint: Use recursion or iteration with a stack
    # Order: traverse left subtree, visit root, traverse right subtree
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    root = TreeNode(1)
    root.left = TreeNode(2, TreeNode(4), TreeNode(5))
    root.right = TreeNode(3)
    print(f"Inorder traversal: {inorder(root)}")
