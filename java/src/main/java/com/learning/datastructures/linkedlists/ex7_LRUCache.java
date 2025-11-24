package com.learning.datastructures.linkedlists;

/**
 * Exercise: LRU Cache (Hard)
 *
 * Design a data structure that implements a Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 * - LRUCache(int capacity): Initialize the LRU cache with positive capacity
 * - int get(int key): Return the value of the key if it exists, otherwise return -1
 * - void put(int key, int value): Update the value if key exists, otherwise add the key-value pair.
 *   If the number of keys exceeds capacity, evict the least recently used key.
 *
 * Both get and put must run in O(1) average time complexity.
 *
 * Example:
 * LRUCache cache = new LRUCache(2);
 * cache.put(1, 1);
 * cache.put(2, 2);
 * cache.get(1);       // returns 1
 * cache.put(3, 3);    // evicts key 2
 * cache.get(2);       // returns -1 (not found)
 * cache.put(4, 4);    // evicts key 1
 * cache.get(1);       // returns -1 (not found)
 * cache.get(3);       // returns 3
 * cache.get(4);       // returns 4
 *
 * Time Complexity: O(1) for both get and put
 * Space Complexity: O(capacity)
 */
public class ex7_LRUCache {

    // TODO: Add private fields here
    // Hint: You'll need a HashMap for O(1) lookups
    // And a doubly linked list to track recency (most recent at head, least recent at tail)
    // You may want to create a private DoublyLinkedNode class

    public ex7_LRUCache(int capacity) {
        // TODO: Initialize your data structures
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int get(int key) {
        // TODO: Implement this method
        // If key exists, move it to the front (most recently used)
        // Return the value, or -1 if not found
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void put(int key, int value) {
        // TODO: Implement this method
        // If key exists, update value and move to front
        // If key doesn't exist, add new node at front
        // If capacity exceeded, remove the least recently used (tail) node
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
