r"""
Exercise: Lowest Common Ancestor (Medium)

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes.

The lowest common ancestor is defined between two nodes p and q as the lowest node in the tree
that has both p and q as descendants (where we allow a node to be a descendant of itself).

Example:
Input:      6
          /   \
         2     8
        / \   / \
       0   4 7   9
          / \
         3   5
p = 2, q = 8
Output: 6 (LCA of 2 and 8 is 6)

Input: Same tree, p = 2, q = 4
Output: 2 (LCA of 2 and 4 is 2, since a node can be a descendant of itself)

Time Complexity: O(h) where h is the height of the tree
Space Complexity: O(h) for recursion stack (or O(1) for iterative solution)
"""

from typing import Optional
from .tree_node import TreeNode


def lowest_common_ancestor(root: Optional[TreeNode], p: TreeNode, q: TreeNode) -> Optional[TreeNode]:
    """
    Find the lowest common ancestor of two nodes in a BST.

    Args:
        root: The root node of the binary search tree
        p: First node
        q: Second node

    Returns:
        The lowest common ancestor node
    """
    # TODO: Implement this function
    # Hint: Use BST property - if both p and q are smaller than root, LCA is in left subtree
    # If both are larger, LCA is in right subtree
    # Otherwise, root is the LCA
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    root = TreeNode(6)
    root.left = TreeNode(2, TreeNode(0), TreeNode(4, TreeNode(3), TreeNode(5)))
    root.right = TreeNode(8, TreeNode(7), TreeNode(9))

    p = root.left  # Node with value 2
    q = root.right  # Node with value 8
    lca = lowest_common_ancestor(root, p, q)
    print(f"LCA of {p.val} and {q.val}: {lca.val if lca else None}")

    p2 = root.left  # Node with value 2
    q2 = root.left.right  # Node with value 4
    lca2 = lowest_common_ancestor(root, p2, q2)
    print(f"LCA of {p2.val} and {q2.val}: {lca2.val if lca2 else None}")
