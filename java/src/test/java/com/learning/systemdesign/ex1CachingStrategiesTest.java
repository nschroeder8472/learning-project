package com.learning.systemdesign;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ex1CachingStrategiesTest {

    @Test
    void testLRUCache() {
        ex1CachingStrategies.LRUCache<Integer, String> cache = new ex1CachingStrategies.LRUCache<>(3);

        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");

        assertEquals("one", cache.get(1));
        assertEquals("two", cache.get(2));

        // Add 4th item, should evict 3 (least recently used)
        cache.put(4, "four");

        assertNull(cache.get(3), "Key 3 should be evicted");
        assertEquals("one", cache.get(1));
        assertEquals(3, cache.size());
    }

    @Test
    void testWriteThroughCache() {
        ex1CachingStrategies.Database<String, Integer> db = new TestDatabase<>();
        ex1CachingStrategies.WriteThroughCache<String, Integer> cache =
            new ex1CachingStrategies.WriteThroughCache<>(db);

        cache.put("key1", 100);
        assertEquals(100, cache.get("key1"));
        assertEquals(100, db.read("key1"), "Should write to database");
    }

    @Test
    void testWriteBehindCache() {
        ex1CachingStrategies.Database<String, Integer> db = new TestDatabase<>();
        ex1CachingStrategies.WriteBehindCache<String, Integer> cache =
            new ex1CachingStrategies.WriteBehindCache<>(db);

        cache.put("key1", 100);
        assertEquals(100, cache.get("key1"), "Should read from cache");

        cache.flush();
        assertEquals(100, db.read("key1"), "Should write to database after flush");
    }

    @Test
    void testTTLCache() throws InterruptedException {
        ex1CachingStrategies.TTLCache<String, String> cache =
            new ex1CachingStrategies.TTLCache<>(100); // 100ms TTL

        cache.put("key1", "value1");
        assertEquals("value1", cache.get("key1"));

        Thread.sleep(150);
        assertNull(cache.get("key1"), "Entry should expire");
    }

    @Test
    void testMultiLevelCache() {
        ex1CachingStrategies.MultiLevelCache<String, Integer> cache =
            new ex1CachingStrategies.MultiLevelCache<>(2, 4);

        cache.put("a", 1);
        cache.put("b", 2);
        cache.put("c", 3); // Should move to L2

        assertEquals(1, cache.get("a"));
        assertEquals(3, cache.get("c")); // Should promote to L1
    }

    // Test database implementation
    static class TestDatabase<K, V> implements ex1CachingStrategies.Database<K, V> {
        private final java.util.Map<K, V> storage = new java.util.HashMap<>();

        @Override
        public V read(K key) {
            return storage.get(key);
        }

        @Override
        public void write(K key, V value) {
            storage.put(key, value);
        }
    }
}
