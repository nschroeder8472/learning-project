"""
TreeNode class for binary tree operations.

A TreeNode represents a node in a binary tree with:
- val: The value stored in the node
- left: Reference to the left child node
- right: Reference to the right child node
"""

from typing import Optional


class TreeNode:
    """
    A node in a binary tree.

    Attributes:
        val: The value stored in this node
        left: The left child node (or None)
        right: The right child node (or None)
    """

    def __init__(self, val: int = 0, left: Optional['TreeNode'] = None, right: Optional['TreeNode'] = None):
        """
        Initialize a TreeNode.

        Args:
            val: The value to store in this node
            left: The left child node
            right: The right child node
        """
        self.val = val
        self.left = left
        self.right = right

    def __repr__(self) -> str:
        """Return a string representation of the node."""
        return f"TreeNode({self.val})"


if __name__ == "__main__":
    # Example usage
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    print(f"Root: {root}")
    print(f"Left child: {root.left}")
    print(f"Right child: {root.right}")
