"""
Exercise: Reverse Linked List (Medium)

Given the head of a singly linked list, reverse the list in-place and return the new head.

Example:
Input: 1 -> 2 -> 3 -> 4 -> None
Output: 4 -> 3 -> 2 -> 1 -> None

Example:
Input: None
Output: None

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(1) - in-place reversal
"""

from typing import Optional
from .list_node import ListNode


def reverse(head: Optional[ListNode]) -> Optional[ListNode]:
    """
    Reverse the linked list in-place.

    Args:
        head: The head node of the linked list

    Returns:
        The new head of the reversed list
    """
    # TODO: Implement this function
    # Hint: Use three pointers: previous, current, and next
    # Reverse the direction of each link as you traverse
    # Return the new head (which was the last node)
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    reversed_head = reverse(head)

    # Print reversed list
    current = reversed_head
    while current:
        print(current.val, end=" -> ")
        current = current.next
    print("None")
