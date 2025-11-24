import pytest
from data_structures.linked_lists.list_node import ListNode
from data_structures.linked_lists._6_merge_sorted_lists import merge


def test_both_empty():
    assert merge(None, None) is None


def test_first_empty():
    list2 = ListNode(1, ListNode(2))
    result = merge(None, list2)
    assert result.val == 1
    assert result.next.val == 2


def test_second_empty():
    list1 = ListNode(1, ListNode(2))
    result = merge(list1, None)
    assert result.val == 1
    assert result.next.val == 2


def test_basic_merge():
    list1 = ListNode(1, ListNode(3, ListNode(5)))
    list2 = ListNode(2, ListNode(4, ListNode(6)))
    result = merge(list1, list2)

    # Verify: 1 -> 2 -> 3 -> 4 -> 5 -> 6
    assert result.val == 1
    assert result.next.val == 2
    assert result.next.next.val == 3
    assert result.next.next.next.val == 4
    assert result.next.next.next.next.val == 5
    assert result.next.next.next.next.next.val == 6
    assert result.next.next.next.next.next.next is None


def test_no_overlap():
    list1 = ListNode(1, ListNode(2, ListNode(3)))
    list2 = ListNode(4, ListNode(5, ListNode(6)))
    result = merge(list1, list2)

    assert result.val == 1
    assert result.next.val == 2
    assert result.next.next.val == 3
    assert result.next.next.next.val == 4


def test_duplicate_values():
    list1 = ListNode(1, ListNode(2, ListNode(4)))
    list2 = ListNode(1, ListNode(3, ListNode(4)))
    result = merge(list1, list2)

    assert result.val == 1
    assert result.next.val == 1
    assert result.next.next.val == 2
    assert result.next.next.next.val == 3
    assert result.next.next.next.next.val == 4
    assert result.next.next.next.next.next.val == 4


def test_different_lengths():
    list1 = ListNode(1)
    list2 = ListNode(2, ListNode(3, ListNode(4, ListNode(5))))
    result = merge(list1, list2)

    assert result.val == 1
    assert result.next.val == 2
    assert result.next.next.val == 3
    assert result.next.next.next.val == 4
    assert result.next.next.next.next.val == 5
