"""
Exercise: LRU Cache (Hard)

Design a data structure that implements a Least Recently Used (LRU) cache.

Implement the LRUCache class:
- __init__(capacity: int): Initialize the LRU cache with positive capacity
- get(key: int) -> int: Return the value of the key if it exists, otherwise return -1
- put(key: int, value: int): Update the value if key exists, otherwise add the key-value pair.
  If the number of keys exceeds capacity, evict the least recently used key.

Both get and put must run in O(1) average time complexity.

Example:
cache = LRUCache(2)
cache.put(1, 1)
cache.put(2, 2)
cache.get(1)       # returns 1
cache.put(3, 3)    # evicts key 2
cache.get(2)       # returns -1 (not found)
cache.put(4, 4)    # evicts key 1
cache.get(1)       # returns -1 (not found)
cache.get(3)       # returns 3
cache.get(4)       # returns 4

Time Complexity: O(1) for both get and put
Space Complexity: O(capacity)
"""

from typing import Dict, Optional


class DoublyLinkedNode:
    """Node for doubly linked list."""

    def __init__(self, key: int = 0, value: int = 0):
        self.key = key
        self.value = value
        self.prev: Optional[DoublyLinkedNode] = None
        self.next: Optional[DoublyLinkedNode] = None


class LRUCache:
    """LRU Cache implementation using HashMap and Doubly Linked List."""

    def __init__(self, capacity: int):
        """
        Initialize the LRU cache.

        Args:
            capacity: Maximum number of items the cache can hold
        """
        # TODO: Initialize your data structures
        # Hint: You'll need a dictionary for O(1) lookups
        # And a doubly linked list to track recency (most recent at head, least recent at tail)
        # Consider using dummy head and tail nodes to simplify edge cases
        raise NotImplementedError("Not implemented yet")

    def get(self, key: int) -> int:
        """
        Get the value for a key.

        Args:
            key: The key to look up

        Returns:
            The value associated with the key, or -1 if not found
        """
        # TODO: Implement this method
        # If key exists, move it to the front (most recently used)
        # Return the value, or -1 if not found
        raise NotImplementedError("Not implemented yet")

    def put(self, key: int, value: int) -> None:
        """
        Put a key-value pair into the cache.

        Args:
            key: The key to store
            value: The value to store
        """
        # TODO: Implement this method
        # If key exists, update value and move to front
        # If key doesn't exist, add new node at front
        # If capacity exceeded, remove the least recently used (tail) node
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    print(f"get(1): {cache.get(1)}")  # returns 1
    cache.put(3, 3)  # evicts key 2
    print(f"get(2): {cache.get(2)}")  # returns -1
    cache.put(4, 4)  # evicts key 1
    print(f"get(1): {cache.get(1)}")  # returns -1
    print(f"get(3): {cache.get(3)}")  # returns 3
    print(f"get(4): {cache.get(4)}")  # returns 4
