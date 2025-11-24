"""
Exercise: Preorder Traversal (Easy)

Given the root of a binary tree, return the preorder traversal of its nodes' values.

Preorder traversal visits nodes in the order: Root -> Left -> Right

Example:
Input:     1
          / \
         2   3
        / \
       4   5
Output: [1, 2, 4, 5, 3]

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(h) where h is the height (recursion stack)
"""

from typing import List, Optional
from .tree_node import TreeNode


def preorder(root: Optional[TreeNode]) -> List[int]:
    """
    Perform preorder traversal of a binary tree.

    Args:
        root: The root node of the binary tree

    Returns:
        A list containing node values in preorder sequence
    """
    # TODO: Implement this function
    # Hint: Use recursion or iteration with a stack
    # Order: visit root, traverse left subtree, traverse right subtree
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    root = TreeNode(1)
    root.left = TreeNode(2, TreeNode(4), TreeNode(5))
    root.right = TreeNode(3)
    print(f"Preorder traversal: {preorder(root)}")
