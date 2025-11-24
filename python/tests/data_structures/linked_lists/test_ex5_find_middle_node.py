import pytest
from data_structures.linked_lists.list_node import ListNode
from data_structures.linked_lists.ex5_find_middle_node import find_middle


def test_single_node():
    head = ListNode(1)
    result = find_middle(head)
    assert result.val == 1


def test_two_nodes():
    head = ListNode(1, ListNode(2))
    result = find_middle(head)
    assert result.val == 2  # Second middle node


def test_three_nodes():
    head = ListNode(1, ListNode(2, ListNode(3)))
    result = find_middle(head)
    assert result.val == 2


def test_four_nodes():
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    result = find_middle(head)
    assert result.val == 3  # Second middle node


def test_five_nodes():
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    result = find_middle(head)
    assert result.val == 3


def test_six_nodes():
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6))))))
    result = find_middle(head)
    assert result.val == 4  # Second middle node
