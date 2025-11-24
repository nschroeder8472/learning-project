import pytest
from data_structures.linked_lists.list_node import ListNode
from data_structures.linked_lists._3_reverse_linked_list import reverse


def test_empty_list():
    assert reverse(None) is None


def test_single_node():
    head = ListNode(1)
    result = reverse(head)
    assert result.val == 1
    assert result.next is None


def test_two_nodes():
    head = ListNode(1, ListNode(2))
    result = reverse(head)
    assert result.val == 2
    assert result.next.val == 1
    assert result.next.next is None


def test_five_nodes():
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    result = reverse(head)

    # Verify reversed order: 5 -> 4 -> 3 -> 2 -> 1
    assert result.val == 5
    assert result.next.val == 4
    assert result.next.next.val == 3
    assert result.next.next.next.val == 2
    assert result.next.next.next.next.val == 1
    assert result.next.next.next.next.next is None


def test_reverse_preserves_values():
    head = ListNode(10, ListNode(20, ListNode(30)))
    result = reverse(head)

    assert result.val == 30
    assert result.next.val == 20
    assert result.next.next.val == 10
