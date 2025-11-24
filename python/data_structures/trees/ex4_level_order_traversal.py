"""
Exercise: Level Order Traversal (Medium)

Given the root of a binary tree, return the level order traversal of its nodes' values.
(i.e., from left to right, level by level).

Example:
Input:     3
          / \
         9  20
           /  \
          15   7
Output: [[3], [9, 20], [15, 7]]

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(w) where w is the maximum width of the tree
"""

from typing import List, Optional
from .tree_node import TreeNode


def level_order(root: Optional[TreeNode]) -> List[List[int]]:
    """
    Perform level order traversal of a binary tree.

    Args:
        root: The root node of the binary tree

    Returns:
        A list of lists, where each inner list contains values at that level
    """
    # TODO: Implement this function
    # Hint: Use a queue (from collections import deque)
    # Process nodes level by level from left to right
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20, TreeNode(15), TreeNode(7))
    print(f"Level order traversal: {level_order(root)}")
