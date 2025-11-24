import pytest
from data_structures.linked_lists.list_node import ListNode
from data_structures.linked_lists.ex1_traverse_and_print import traverse


def test_empty_list():
    result = traverse(None)
    assert result == []


def test_single_node():
    head = ListNode(42)
    result = traverse(head)
    assert result == [42]


def test_multiple_nodes():
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    result = traverse(head)
    assert result == [1, 2, 3, 4]


def test_two_nodes():
    head = ListNode(10, ListNode(20))
    result = traverse(head)
    assert result == [10, 20]


def test_negative_values():
    head = ListNode(-5, ListNode(-10, ListNode(-15)))
    result = traverse(head)
    assert result == [-5, -10, -15]


def test_duplicate_values():
    head = ListNode(7, ListNode(7, ListNode(7)))
    result = traverse(head)
    assert result == [7, 7, 7]
