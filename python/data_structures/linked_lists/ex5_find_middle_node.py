"""
Exercise: Find Middle Node (Medium)

Given the head of a singly linked list, return the middle node.
If there are two middle nodes (even number of nodes), return the second middle node.

Example 1:
Input: 1 -> 2 -> 3 -> 4 -> 5 -> None
Output: Node with value 3

Example 2:
Input: 1 -> 2 -> 3 -> 4 -> None
Output: Node with value 3 (the second middle)

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(1)
"""

from typing import Optional
from .list_node import ListNode


def find_middle(head: Optional[ListNode]) -> Optional[ListNode]:
    """
    Find the middle node of the linked list.

    Args:
        head: The head node of the linked list

    Returns:
        The middle node (or second middle if even number of nodes)
    """
    # TODO: Implement this function
    # Hint: Use two pointers - slow and fast
    # Slow moves 1 step at a time, fast moves 2 steps
    # When fast reaches the end, slow will be at the middle
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
    middle = find_middle(head)
    if middle:
        print(f"Middle value: {middle.val}")
