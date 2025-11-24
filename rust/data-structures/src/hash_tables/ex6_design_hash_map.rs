/// Exercise: Design HashMap (Hard)
///
/// Design a HashMap without using any built-in hash table libraries.
///
/// Implement the MyHashMap struct with:
/// - new() initializes the object with an empty map
/// - put(key, value) inserts a (key, value) pair into the HashMap.
///   If the key already exists, update the corresponding value.
/// - get(key) returns the value to which the specified key is mapped,
///   or -1 if this map contains no mapping for the key.
/// - remove(key) removes the key and its corresponding value if the map
///   contains the mapping for the key.
///
/// Example:
/// let mut my_hash_map = MyHashMap::new();
/// my_hash_map.put(1, 1);      // map is now [[1,1]]
/// my_hash_map.put(2, 2);      // map is now [[1,1], [2,2]]
/// my_hash_map.get(1);         // returns 1
/// my_hash_map.get(3);         // returns -1 (not found)
/// my_hash_map.put(2, 1);      // map is now [[1,1], [2,1]] (update existing value)
/// my_hash_map.get(2);         // returns 1
/// my_hash_map.remove(2);      // removes the mapping for 2, map is now [[1,1]]
/// my_hash_map.get(2);         // returns -1 (not found)
///
/// Time Complexity: O(1) average for put, get, remove
/// Space Complexity: O(n) where n is the number of key-value pairs

const SIZE: usize = 1000;

#[derive(Clone)]
struct Node {
    key: i32,
    value: i32,
    next: Option<Box<Node>>,
}

pub struct MyHashMap {
    buckets: Vec<Option<Box<Node>>>,
}

impl MyHashMap {
    pub fn new() -> Self {
        // TODO: Initialize the hash map
        // Hint: Create a vector of SIZE with None values
        unimplemented!("Not implemented yet")
    }

    fn hash(&self, key: i32) -> usize {
        // TODO: Implement hash function
        // Hint: Use modulo operation to map key to a valid bucket index
        unimplemented!("Not implemented yet")
    }

    pub fn put(&mut self, key: i32, value: i32) {
        // TODO: Implement this method
        // Hint: 1. Compute hash to find bucket index
        //       2. Search the linked list in that bucket for the key
        //       3. If found, update value; if not found, add new node to the list
        unimplemented!("Not implemented yet")
    }

    pub fn get(&self, key: i32) -> i32 {
        // TODO: Implement this method
        // Hint: 1. Compute hash to find bucket index
        //       2. Search the linked list in that bucket for the key
        //       3. Return value if found, -1 otherwise
        unimplemented!("Not implemented yet")
    }

    pub fn remove(&mut self, key: i32) {
        // TODO: Implement this method
        // Hint: 1. Compute hash to find bucket index
        //       2. Search and remove from the linked list in that bucket
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_put_and_get() {
        let mut hash_map = MyHashMap::new();
        hash_map.put(1, 1);
        assert_eq!(hash_map.get(1), 1);
    }

    #[test]
    fn test_get_non_existent() {
        let hash_map = MyHashMap::new();
        assert_eq!(hash_map.get(1), -1);
    }

    #[test]
    fn test_update_value() {
        let mut hash_map = MyHashMap::new();
        hash_map.put(2, 1);
        hash_map.put(2, 2);
        assert_eq!(hash_map.get(2), 2);
    }

    #[test]
    fn test_multiple_puts() {
        let mut hash_map = MyHashMap::new();
        hash_map.put(1, 1);
        hash_map.put(2, 2);
        hash_map.put(3, 3);
        assert_eq!(hash_map.get(1), 1);
        assert_eq!(hash_map.get(2), 2);
        assert_eq!(hash_map.get(3), 3);
    }

    #[test]
    fn test_remove() {
        let mut hash_map = MyHashMap::new();
        hash_map.put(2, 1);
        hash_map.remove(2);
        assert_eq!(hash_map.get(2), -1);
    }

    #[test]
    fn test_remove_non_existent() {
        let mut hash_map = MyHashMap::new();
        hash_map.remove(1);
        assert_eq!(hash_map.get(1), -1);
    }

    #[test]
    fn test_complex_sequence() {
        let mut hash_map = MyHashMap::new();
        hash_map.put(1, 1);
        hash_map.put(2, 2);
        assert_eq!(hash_map.get(1), 1);
        assert_eq!(hash_map.get(3), -1);
        hash_map.put(2, 1);
        assert_eq!(hash_map.get(2), 1);
        hash_map.remove(2);
        assert_eq!(hash_map.get(2), -1);
    }

    #[test]
    fn test_collisions() {
        let mut hash_map = MyHashMap::new();
        // These keys should hash to the same bucket (1 and 1001 with SIZE=1000)
        hash_map.put(1, 100);
        hash_map.put(1001, 200);
        assert_eq!(hash_map.get(1), 100);
        assert_eq!(hash_map.get(1001), 200);
    }

    #[test]
    fn test_many_insertions() {
        let mut hash_map = MyHashMap::new();
        for i in 0..100 {
            hash_map.put(i, i * 10);
        }
        for i in 0..100 {
            assert_eq!(hash_map.get(i), i * 10);
        }
    }
}
