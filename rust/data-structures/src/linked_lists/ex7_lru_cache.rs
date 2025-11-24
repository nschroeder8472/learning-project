/// Exercise: LRU Cache (Hard)
///
/// Design a data structure that implements a Least Recently Used (LRU) cache.
///
/// Implement the LRUCache struct with these methods:
/// - new(capacity: usize): Initialize the LRU cache with positive capacity
/// - get(&mut self, key: i32) -> i32: Return the value of the key if it exists, otherwise return -1
/// - put(&mut self, key: i32, value: i32): Update the value if key exists, otherwise add the key-value pair.
///   If the number of keys exceeds capacity, evict the least recently used key.
///
/// Both get and put must run in O(1) average time complexity.
///
/// Example:
/// let mut cache = LRUCache::new(2);
/// cache.put(1, 1);
/// cache.put(2, 2);
/// cache.get(1);       // returns 1
/// cache.put(3, 3);    // evicts key 2
/// cache.get(2);       // returns -1 (not found)
/// cache.put(4, 4);    // evicts key 1
/// cache.get(1);       // returns -1 (not found)
/// cache.get(3);       // returns 3
/// cache.get(4);       // returns 4
///
/// Time Complexity: O(1) for both get and put
/// Space Complexity: O(capacity)
///
/// Note: This is a challenging exercise in Rust. You'll need to use HashMap
/// and a custom doubly linked list structure. Consider using indices or
/// Rc<RefCell<>> for the doubly linked list implementation.

use std::collections::HashMap;

pub struct LRUCache {
    // TODO: Add fields here
    // Hint: You'll need a HashMap for O(1) lookups
    // And a way to track recency - this could be a VecDeque, a custom doubly linked list,
    // or other structure
    capacity: usize,
}

impl LRUCache {
    pub fn new(capacity: usize) -> Self {
        // TODO: Initialize your data structures
        unimplemented!("Not implemented yet")
    }

    pub fn get(&mut self, key: i32) -> i32 {
        // TODO: Implement this method
        // If key exists, update its recency and return the value
        // Otherwise return -1
        unimplemented!("Not implemented yet")
    }

    pub fn put(&mut self, key: i32, value: i32) {
        // TODO: Implement this method
        // If key exists, update value and move to most recent
        // If key doesn't exist, add new entry
        // If capacity exceeded, remove least recently used entry
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_operations() {
        let mut cache = LRUCache::new(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assert_eq!(cache.get(1), 1);
        assert_eq!(cache.get(2), 2);
    }

    #[test]
    fn test_eviction() {
        let mut cache = LRUCache::new(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3); // Evicts key 1
        assert_eq!(cache.get(1), -1); // Not found
        assert_eq!(cache.get(2), 2);
        assert_eq!(cache.get(3), 3);
    }

    #[test]
    fn test_get_updates_recency() {
        let mut cache = LRUCache::new(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1); // Makes 1 recently used
        cache.put(3, 3); // Should evict key 2, not 1
        assert_eq!(cache.get(1), 1);
        assert_eq!(cache.get(2), -1); // Evicted
        assert_eq!(cache.get(3), 3);
    }

    #[test]
    fn test_update_existing_key() {
        let mut cache = LRUCache::new(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10); // Update key 1
        assert_eq!(cache.get(1), 10);
        assert_eq!(cache.get(2), 2);
    }

    #[test]
    fn test_get_nonexistent() {
        let mut cache = LRUCache::new(2);
        assert_eq!(cache.get(1), -1);
        cache.put(1, 1);
        assert_eq!(cache.get(1), 1);
        assert_eq!(cache.get(2), -1);
    }
}
