import pytest
from data_structures.trees.tree_node import TreeNode
from data_structures.trees.validate_bst import is_valid_bst


def test_empty_tree():
    result = is_valid_bst(None)
    assert result is True


def test_single_node():
    root = TreeNode(42)
    result = is_valid_bst(root)
    assert result is True


def test_valid_simple_bst():
    root = TreeNode(2, TreeNode(1), TreeNode(3))
    result = is_valid_bst(root)
    assert result is True


def test_invalid_simple_bst():
    root = TreeNode(5)
    root.left = TreeNode(1)
    root.right = TreeNode(4, TreeNode(3), TreeNode(6))
    result = is_valid_bst(root)
    assert result is False


def test_valid_larger_bst():
    root = TreeNode(8)
    root.left = TreeNode(4, TreeNode(2), TreeNode(6))
    root.right = TreeNode(12, TreeNode(10), TreeNode(14))
    result = is_valid_bst(root)
    assert result is True


def test_invalid_subtree_violation():
    root = TreeNode(10)
    root.left = TreeNode(5)
    root.right = TreeNode(15, TreeNode(6), TreeNode(20))
    result = is_valid_bst(root)
    assert result is False


def test_duplicate_values():
    root = TreeNode(5, TreeNode(5), TreeNode(10))
    result = is_valid_bst(root)
    assert result is False


def test_left_skewed_valid_bst():
    root = TreeNode(5)
    root.left = TreeNode(4)
    root.left.left = TreeNode(3)
    result = is_valid_bst(root)
    assert result is True
