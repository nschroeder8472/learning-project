import pytest
from data_structures.trees.tree_node import TreeNode
from data_structures.trees.max_depth import max_depth


def test_empty_tree():
    result = max_depth(None)
    assert result == 0


def test_single_node():
    root = TreeNode(42)
    result = max_depth(root)
    assert result == 1


def test_left_skewed_tree():
    root = TreeNode(3)
    root.left = TreeNode(2)
    root.left.left = TreeNode(1)
    result = max_depth(root)
    assert result == 3


def test_right_skewed_tree():
    root = TreeNode(1)
    root.right = TreeNode(2)
    root.right.right = TreeNode(3)
    result = max_depth(root)
    assert result == 3


def test_balanced_tree():
    root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20, TreeNode(15), TreeNode(7))
    result = max_depth(root)
    assert result == 3


def test_complete_binary_tree():
    root = TreeNode(1)
    root.left = TreeNode(2, TreeNode(4), TreeNode(5))
    root.right = TreeNode(3, TreeNode(6), TreeNode(7))
    result = max_depth(root)
    assert result == 3


def test_deeply_unbalanced_tree():
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3, None, TreeNode(4, None, TreeNode(5, None, TreeNode(6))))
    result = max_depth(root)
    assert result == 5
