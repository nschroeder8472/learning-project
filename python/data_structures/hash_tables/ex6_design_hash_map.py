"""
Exercise: Design HashMap (Hard)

Design a HashMap without using any built-in hash table libraries.

Implement the MyHashMap class:
- MyHashMap() initializes the object with an empty map
- put(key, value) inserts a (key, value) pair into the HashMap.
  If the key already exists, update the corresponding value.
- get(key) returns the value to which the specified key is mapped,
  or -1 if this map contains no mapping for the key.
- remove(key) removes the key and its corresponding value if the map
  contains the mapping for the key.

Example:
my_hash_map = MyHashMap()
my_hash_map.put(1, 1)      # map is now [[1,1]]
my_hash_map.put(2, 2)      # map is now [[1,1], [2,2]]
my_hash_map.get(1)         # returns 1
my_hash_map.get(3)         # returns -1 (not found)
my_hash_map.put(2, 1)      # map is now [[1,1], [2,1]] (update existing value)
my_hash_map.get(2)         # returns 1
my_hash_map.remove(2)      # removes the mapping for 2, map is now [[1,1]]
my_hash_map.get(2)         # returns -1 (not found)

Time Complexity: O(1) average for put, get, remove
Space Complexity: O(n) where n is the number of key-value pairs
"""


class ListNode:
    """Node in a linked list for chaining."""

    def __init__(self, key: int, value: int):
        self.key = key
        self.value = value
        self.next = None


class MyHashMap:
    """Hash map implementation using chaining for collision resolution."""

    def __init__(self):
        """Initialize the hash map with empty buckets."""
        self.size = 1000
        # TODO: Initialize the buckets list
        # Hint: Create a list of None values
        raise NotImplementedError("Not implemented yet")

    def _hash(self, key: int) -> int:
        """
        Compute hash value for a key.

        Args:
            key: The key to hash

        Returns:
            Bucket index
        """
        # TODO: Implement hash function
        # Hint: Use modulo operation to map key to a valid bucket index
        raise NotImplementedError("Not implemented yet")

    def put(self, key: int, value: int) -> None:
        """
        Insert or update a key-value pair.

        Args:
            key: The key
            value: The value
        """
        # TODO: Implement this method
        # Hint: 1. Compute hash to find bucket index
        #       2. Search the linked list in that bucket for the key
        #       3. If found, update value; if not found, add new node to the list
        raise NotImplementedError("Not implemented yet")

    def get(self, key: int) -> int:
        """
        Get the value associated with a key.

        Args:
            key: The key to look up

        Returns:
            The value if found, -1 otherwise
        """
        # TODO: Implement this method
        # Hint: 1. Compute hash to find bucket index
        #       2. Search the linked list in that bucket for the key
        #       3. Return value if found, -1 otherwise
        raise NotImplementedError("Not implemented yet")

    def remove(self, key: int) -> None:
        """
        Remove a key-value pair.

        Args:
            key: The key to remove
        """
        # TODO: Implement this method
        # Hint: 1. Compute hash to find bucket index
        #       2. Search and remove from the linked list in that bucket
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    my_hash_map = MyHashMap()
    my_hash_map.put(1, 1)
    my_hash_map.put(2, 2)
    print(my_hash_map.get(1))  # Should output 1
    print(my_hash_map.get(3))  # Should output -1
    my_hash_map.put(2, 1)
    print(my_hash_map.get(2))  # Should output 1
    my_hash_map.remove(2)
    print(my_hash_map.get(2))  # Should output -1
