"""
Exercise: Find Length (Easy)

Given the head of a singly linked list, return the number of nodes in the list.

Example:
Input: 1 -> 2 -> 3 -> 4 -> None
Output: 4

Example:
Input: None
Output: 0

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(1)
"""

from typing import Optional
from .list_node import ListNode


def find_length(head: Optional[ListNode]) -> int:
    """
    Find the length of the linked list.

    Args:
        head: The head node of the linked list

    Returns:
        The number of nodes in the list
    """
    # TODO: Implement this function
    # Hint: Traverse the list and count the nodes
    # Handle the empty list case (None)
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    print(f"Length: {find_length(head)}")

    # Empty list
    print(f"Length of empty list: {find_length(None)}")
