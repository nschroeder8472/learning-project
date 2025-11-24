"""
Exercise: Detect Cycle (Medium)

Given the head of a linked list, determine if the list has a cycle in it.
A cycle exists if a node can be reached again by continuously following the next pointer.

Example 1:
Input: 1 -> 2 -> 3 -> 4 -> 2 (cycle back to node 2)
Output: True

Example 2:
Input: 1 -> 2 -> 3 -> None
Output: False

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(1)
"""

from typing import Optional
from .list_node import ListNode


def has_cycle(head: Optional[ListNode]) -> bool:
    """
    Detect if the linked list has a cycle.

    Args:
        head: The head node of the linked list

    Returns:
        True if the list has a cycle, False otherwise
    """
    # TODO: Implement this function
    # Hint: Use Floyd's "tortoise and hare" algorithm
    # Two pointers: slow moves 1 step, fast moves 2 steps
    # If they meet, there's a cycle; if fast reaches None, no cycle
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage - no cycle
    head1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    print(f"Has cycle: {has_cycle(head1)}")

    # Example with cycle (note: be careful creating cycles in practice)
    # node1 = ListNode(1)
    # node2 = ListNode(2)
    # node3 = ListNode(3)
    # node1.next = node2
    # node2.next = node3
    # node3.next = node1  # Creates cycle
    # print(f"Has cycle: {has_cycle(node1)}")
