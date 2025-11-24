import pytest
from data_structures.trees.tree_node import TreeNode
from data_structures.trees.ex4_level_order_traversal import level_order


def test_empty_tree():
    result = level_order(None)
    assert result == []


def test_single_node():
    root = TreeNode(42)
    result = level_order(root)
    assert result == [[42]]


def test_left_skewed_tree():
    root = TreeNode(3)
    root.left = TreeNode(2)
    root.left.left = TreeNode(1)
    result = level_order(root)
    assert result == [[3], [2], [1]]


def test_right_skewed_tree():
    root = TreeNode(1)
    root.right = TreeNode(2)
    root.right.right = TreeNode(3)
    result = level_order(root)
    assert result == [[1], [2], [3]]


def test_balanced_tree():
    root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20, TreeNode(15), TreeNode(7))
    result = level_order(root)
    assert result == [[3], [9, 20], [15, 7]]


def test_complete_binary_tree():
    root = TreeNode(1)
    root.left = TreeNode(2, TreeNode(4), TreeNode(5))
    root.right = TreeNode(3, TreeNode(6), TreeNode(7))
    result = level_order(root)
    assert result == [[1], [2, 3], [4, 5, 6, 7]]


def test_unbalanced_tree():
    root = TreeNode(1)
    root.left = TreeNode(2, TreeNode(4))
    root.right = TreeNode(3, None, TreeNode(5))
    result = level_order(root)
    assert result == [[1], [2, 3], [4, 5]]
