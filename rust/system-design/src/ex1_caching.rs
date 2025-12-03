use std::collections::HashMap;

pub struct LRUCache<K, V> {
    capacity: usize,
}

impl<K, V> LRUCache<K, V> {
    pub fn new(capacity: usize) -> Self {
        // TODO: Implement LRU cache
        unimplemented!()
    }

    pub fn get(&mut self, key: &K) -> Option<&V> {
        unimplemented!()
    }

    pub fn put(&mut self, key: K, value: V) {
        unimplemented!()
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_lru_cache() {
        let mut cache = LRUCache::new(2);
        cache.put(1, "one");
        cache.put(2, "two");
        assert_eq!(cache.get(&1), Some(&"one"));
    }
}
