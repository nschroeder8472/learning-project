"""
Exercise: Maximum Depth (Easy)

Given the root of a binary tree, return its maximum depth.

The maximum depth is the number of nodes along the longest path from the
root node down to the farthest leaf node.

Example:
Input:     3
          / \
         9  20
           /  \
          15   7
Output: 3

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(h) where h is the height (recursion stack)
"""

from typing import Optional
from .tree_node import TreeNode


def max_depth(root: Optional[TreeNode]) -> int:
    """
    Find the maximum depth of a binary tree.

    Args:
        root: The root node of the binary tree

    Returns:
        The maximum depth of the tree (0 if tree is empty)
    """
    # TODO: Implement this function
    # Hint: Use recursion - depth is 1 + max(left_depth, right_depth)
    # Base case: empty tree has depth 0
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20, TreeNode(15), TreeNode(7))
    print(f"Maximum depth: {max_depth(root)}")
