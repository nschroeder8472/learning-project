import pytest
from data_structures.linked_lists.list_node import ListNode
from data_structures.linked_lists.ex4_detect_cycle import has_cycle


def test_empty_list():
    assert has_cycle(None) is False


def test_single_node_no_cycle():
    head = ListNode(1)
    assert has_cycle(head) is False


def test_two_nodes_no_cycle():
    head = ListNode(1, ListNode(2))
    assert has_cycle(head) is False


def test_no_cycle():
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    assert has_cycle(head) is False


def test_cycle_at_end():
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node1.next = node2
    node2.next = node3
    node3.next = node1  # Cycle back to first node

    assert has_cycle(node1) is True


def test_cycle_in_middle():
    node1 = ListNode(1)
    node2 = ListNode(2)
    node3 = ListNode(3)
    node4 = ListNode(4)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node2  # Cycle back to second node

    assert has_cycle(node1) is True


def test_self_cycle():
    node = ListNode(1)
    node.next = node  # Points to itself
    assert has_cycle(node) is True
