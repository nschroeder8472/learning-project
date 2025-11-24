import pytest
from data_structures.trees.tree_node import TreeNode
from data_structures.trees.ex7_lowest_common_ancestor import lowest_common_ancestor


def test_lca_root_is_ancestor():
    root = TreeNode(6)
    root.left = TreeNode(2, TreeNode(0), TreeNode(4, TreeNode(3), TreeNode(5)))
    root.right = TreeNode(8, TreeNode(7), TreeNode(9))
    p = root.left  # 2
    q = root.right  # 8
    result = lowest_common_ancestor(root, p, q)
    assert result.val == 6


def test_lca_node_is_ancestor_of_itself():
    root = TreeNode(6)
    root.left = TreeNode(2, TreeNode(0), TreeNode(4, TreeNode(3), TreeNode(5)))
    root.right = TreeNode(8, TreeNode(7), TreeNode(9))
    p = root.left  # 2
    q = root.left.right  # 4
    result = lowest_common_ancestor(root, p, q)
    assert result.val == 2


def test_lca_both_in_left_subtree():
    root = TreeNode(6)
    root.left = TreeNode(2, TreeNode(0), TreeNode(4, TreeNode(3), TreeNode(5)))
    root.right = TreeNode(8, TreeNode(7), TreeNode(9))
    p = root.left.left  # 0
    q = root.left.right.left  # 3
    result = lowest_common_ancestor(root, p, q)
    assert result.val == 2


def test_lca_both_in_right_subtree():
    root = TreeNode(6)
    root.left = TreeNode(2, TreeNode(0), TreeNode(4, TreeNode(3), TreeNode(5)))
    root.right = TreeNode(8, TreeNode(7), TreeNode(9))
    p = root.right.left  # 7
    q = root.right.right  # 9
    result = lowest_common_ancestor(root, p, q)
    assert result.val == 8


def test_lca_simple_tree():
    root = TreeNode(2, TreeNode(1), TreeNode(3))
    p = root.left  # 1
    q = root.right  # 3
    result = lowest_common_ancestor(root, p, q)
    assert result.val == 2


def test_lca_single_child():
    root = TreeNode(5)
    root.left = TreeNode(3, TreeNode(1))
    p = root  # 5
    q = root.left.left  # 1
    result = lowest_common_ancestor(root, p, q)
    assert result.val == 5


def test_lca_leaf_nodes():
    root = TreeNode(6)
    root.left = TreeNode(2, TreeNode(0), TreeNode(4))
    root.right = TreeNode(8)
    p = root.left.left  # 0
    q = root.left.right  # 4
    result = lowest_common_ancestor(root, p, q)
    assert result.val == 2
