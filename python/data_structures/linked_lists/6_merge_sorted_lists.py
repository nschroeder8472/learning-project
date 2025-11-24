"""
Exercise: Merge Two Sorted Lists (Hard)

Given the heads of two sorted linked lists, merge them into one sorted linked list.
The merged list should be made by splicing together the nodes of the two lists.

Example:
Input: list1 = 1 -> 3 -> 5 -> None, list2 = 2 -> 4 -> 6 -> None
Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> None

Example:
Input: list1 = None, list2 = 1 -> 2 -> None
Output: 1 -> 2 -> None

Time Complexity: O(n + m) where n and m are the lengths of the two lists
Space Complexity: O(1) - only using pointers, no new nodes created
"""

from typing import Optional
from .list_node import ListNode


def merge(list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    """
    Merge two sorted linked lists.

    Args:
        list1: Head of the first sorted linked list
        list2: Head of the second sorted linked list

    Returns:
        Head of the merged sorted linked list
    """
    # TODO: Implement this function
    # Hint: Create a dummy head node to simplify edge cases
    # Compare values from both lists and always take the smaller one
    # Attach any remaining nodes from either list at the end
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    list1 = ListNode(1, ListNode(3, ListNode(5)))
    list2 = ListNode(2, ListNode(4, ListNode(6)))
    merged = merge(list1, list2)

    # Print merged list
    current = merged
    while current:
        print(current.val, end=" -> ")
        current = current.next
    print("None")
