import pytest
from data_structures.linked_lists.list_node import ListNode
from data_structures.linked_lists._2_find_length import find_length


def test_empty_list():
    assert find_length(None) == 0


def test_single_node():
    head = ListNode(1)
    assert find_length(head) == 1


def test_two_nodes():
    head = ListNode(1, ListNode(2))
    assert find_length(head) == 2


def test_five_nodes():
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    assert find_length(head) == 5


def test_ten_nodes():
    head = ListNode(1)
    current = head
    for i in range(2, 11):
        current.next = ListNode(i)
        current = current.next
    assert find_length(head) == 10
