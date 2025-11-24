"""
Exercise: Traverse and Print (Easy)

Given the head of a singly linked list, traverse the list and return all values in a list.

Example:
Input: 1 -> 2 -> 3 -> 4 -> None
Output: [1, 2, 3, 4]

Time Complexity: O(n) where n is the number of nodes
Space Complexity: O(n) for the output list
"""

from typing import List, Optional
from .list_node import ListNode


def traverse(head: Optional[ListNode]) -> List[int]:
    """
    Traverse the linked list and return all values.

    Args:
        head: The head node of the linked list

    Returns:
        A list containing all values from the linked list
    """
    # TODO: Implement this function
    # Hint: Start at head and follow next pointers until you reach None
    # Add each value to a list
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
    print(f"Values: {traverse(head)}")
