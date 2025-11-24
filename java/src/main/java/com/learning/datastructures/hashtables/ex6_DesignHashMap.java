package com.learning.datastructures.hashtables;

/**
 * Exercise: Design HashMap (Hard)
 *
 * Design a HashMap without using any built-in hash table libraries.
 *
 * Implement the MyHashMap class:
 * - MyHashMap() initializes the object with an empty map
 * - void put(int key, int value) inserts a (key, value) pair into the HashMap.
 *   If the key already exists, update the corresponding value.
 * - int get(int key) returns the value to which the specified key is mapped,
 *   or -1 if this map contains no mapping for the key.
 * - void remove(int key) removes the key and its corresponding value if the map
 *   contains the mapping for the key.
 *
 * Example:
 * MyHashMap myHashMap = new MyHashMap();
 * myHashMap.put(1, 1);      // map is now [[1,1]]
 * myHashMap.put(2, 2);      // map is now [[1,1], [2,2]]
 * myHashMap.get(1);         // returns 1
 * myHashMap.get(3);         // returns -1 (not found)
 * myHashMap.put(2, 1);      // map is now [[1,1], [2,1]] (update existing value)
 * myHashMap.get(2);         // returns 1
 * myHashMap.remove(2);      // removes the mapping for 2, map is now [[1,1]]
 * myHashMap.get(2);         // returns -1 (not found)
 *
 * Time Complexity: O(1) average for put, get, remove
 * Space Complexity: O(n) where n is the number of key-value pairs
 */
public class ex6_DesignHashMap {

    /**
     * Inner class to represent a key-value pair in the hash map
     */
    private static class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 1000;
    private Entry[] buckets;

    public ex6_DesignHashMap() {
        // TODO: Initialize the buckets array
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Insert or update a key-value pair
     */
    public void put(int key, int value) {
        // TODO: Implement this method
        // Hint: 1. Compute hash to find bucket index
        //       2. Search the linked list in that bucket for the key
        //       3. If found, update value; if not found, add new entry to the list
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Get the value associated with a key, or -1 if not found
     */
    public int get(int key) {
        // TODO: Implement this method
        // Hint: 1. Compute hash to find bucket index
        //       2. Search the linked list in that bucket for the key
        //       3. Return value if found, -1 otherwise
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Remove a key-value pair from the map
     */
    public void remove(int key) {
        // TODO: Implement this method
        // Hint: 1. Compute hash to find bucket index
        //       2. Search and remove from the linked list in that bucket
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Simple hash function to map key to bucket index
     */
    private int hash(int key) {
        // TODO: Implement this method
        // Hint: Use modulo operation to map key to a valid bucket index
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
