package com.learning.datastructures.linkedlists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ex7LRUCacheTest {

    @Test
    void testBasicOperations() {
        ex7_LRUCache cache = new ex7_LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void testEviction() {
        ex7_LRUCache cache = new ex7_LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3); // Evicts key 1
        assertEquals(-1, cache.get(1)); // Not found
        assertEquals(2, cache.get(2));
        assertEquals(3, cache.get(3));
    }

    @Test
    void testGetUpdatesRecency() {
        ex7_LRUCache cache = new ex7_LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);    // Makes 1 recently used
        cache.put(3, 3); // Should evict key 2, not 1
        assertEquals(1, cache.get(1));
        assertEquals(-1, cache.get(2)); // Evicted
        assertEquals(3, cache.get(3));
    }

    @Test
    void testUpdateExistingKey() {
        ex7_LRUCache cache = new ex7_LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 10); // Update key 1
        assertEquals(10, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void testSingleCapacity() {
        ex7_LRUCache cache = new ex7_LRUCache(1);
        cache.put(1, 1);
        assertEquals(1, cache.get(1));
        cache.put(2, 2); // Evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    void testGetNonexistent() {
        ex7_LRUCache cache = new ex7_LRUCache(2);
        assertEquals(-1, cache.get(1));
        cache.put(1, 1);
        assertEquals(1, cache.get(1));
        assertEquals(-1, cache.get(2));
    }

    @Test
    void testComplexSequence() {
        ex7_LRUCache cache = new ex7_LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));
        cache.put(3, 3);    // Evicts key 2
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);    // Evicts key 1
        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }
}
