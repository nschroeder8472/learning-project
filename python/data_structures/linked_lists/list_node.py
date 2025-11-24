"""
Node class for singly linked list
"""

from typing import Optional


class ListNode:
    """A node in a singly linked list."""

    def __init__(self, val: int = 0, next: Optional['ListNode'] = None):
        """
        Initialize a list node.

        Args:
            val: The value stored in the node
            next: Reference to the next node (None if this is the last node)
        """
        self.val = val
        self.next = next
