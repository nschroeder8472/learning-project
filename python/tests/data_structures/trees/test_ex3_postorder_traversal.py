import pytest
from data_structures.trees.tree_node import TreeNode
from data_structures.trees.ex3_postorder_traversal import postorder


def test_empty_tree():
    result = postorder(None)
    assert result == []


def test_single_node():
    root = TreeNode(42)
    result = postorder(root)
    assert result == [42]


def test_left_skewed_tree():
    root = TreeNode(3)
    root.left = TreeNode(2)
    root.left.left = TreeNode(1)
    result = postorder(root)
    assert result == [1, 2, 3]


def test_right_skewed_tree():
    root = TreeNode(1)
    root.right = TreeNode(2)
    root.right.right = TreeNode(3)
    result = postorder(root)
    assert result == [3, 2, 1]


def test_balanced_tree():
    root = TreeNode(1)
    root.left = TreeNode(2, TreeNode(4), TreeNode(5))
    root.right = TreeNode(3)
    result = postorder(root)
    assert result == [4, 5, 2, 3, 1]


def test_complete_binary_tree():
    root = TreeNode(4)
    root.left = TreeNode(2, TreeNode(1), TreeNode(3))
    root.right = TreeNode(6, TreeNode(5), TreeNode(7))
    result = postorder(root)
    assert result == [1, 3, 2, 5, 7, 6, 4]


def test_tree_with_negative_values():
    root = TreeNode(0)
    root.left = TreeNode(-5, TreeNode(-10), TreeNode(-2))
    root.right = TreeNode(5)
    result = postorder(root)
    assert result == [-10, -2, -5, 5, 0]
