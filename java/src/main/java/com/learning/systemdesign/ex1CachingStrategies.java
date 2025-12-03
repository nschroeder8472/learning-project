package com.learning.systemdesign;

import java.util.*;

/**
 * Exercise 1: Caching Strategies (Medium)
 *
 * Implement various caching patterns used in system design.
 * This exercise covers:
 * - LRU (Least Recently Used) Cache
 * - Write-through cache
 * - Write-behind cache
 * - Cache invalidation strategies
 *
 * Difficulty: Medium
 * Topics: Caching, Data Structures, Performance Optimization
 */
public class ex1CachingStrategies {

    /**
     * Task 1: Implement LRU Cache
     *
     * LRU evicts the least recently used item when capacity is reached.
     * Operations should be O(1).
     *
     * TODO: Implement using LinkedHashMap or HashMap + Doubly Linked List
     */
    public static class LRUCache<K, V> {
        private final int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            // TODO: Initialize data structures
        }

        public V get(K key) {
            // TODO: Get value and mark as recently used
            // Return null if not found
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void put(K key, V value) {
            // TODO: Add/update key-value pair
            // Evict LRU item if at capacity
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public int size() {
            // TODO: Return current size
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 2: Write-Through Cache
     *
     * Writes go to both cache and database synchronously.
     * Ensures cache and DB are always in sync.
     */
    public static class WriteThroughCache<K, V> {
        private final Map<K, V> cache = new HashMap<>();
        private final Database<K, V> database;

        public WriteThroughCache(Database<K, V> database) {
            this.database = database;
        }

        public V get(K key) {
            // TODO: Check cache first, then database
            // Update cache if found in database
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void put(K key, V value) {
            // TODO: Write to both cache and database
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 3: Write-Behind (Write-Back) Cache
     *
     * Writes go to cache immediately, database writes are async/batched.
     * Better write performance but risk of data loss.
     */
    public static class WriteBehindCache<K, V> {
        private final Map<K, V> cache = new HashMap<>();
        private final Queue<WriteOperation<K, V>> writeQueue = new LinkedList<>();
        private final Database<K, V> database;

        public WriteBehindCache(Database<K, V> database) {
            this.database = database;
        }

        public V get(K key) {
            // TODO: Return from cache
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void put(K key, V value) {
            // TODO: Write to cache immediately
            // TODO: Queue write operation for async processing
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void flush() {
            // TODO: Process all queued writes to database
            throw new UnsupportedOperationException("Not implemented yet");
        }

        private static class WriteOperation<K, V> {
            K key;
            V value;

            WriteOperation(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    }

    /**
     * Task 4: Cache with TTL (Time To Live)
     *
     * Entries expire after a certain time.
     */
    public static class TTLCache<K, V> {
        private final Map<K, CacheEntry<V>> cache = new HashMap<>();
        private final long ttlMillis;

        public TTLCache(long ttlMillis) {
            this.ttlMillis = ttlMillis;
        }

        public V get(K key) {
            // TODO: Return value if not expired, null otherwise
            // Remove expired entries
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void put(K key, V value) {
            // TODO: Store value with expiration timestamp
            throw new UnsupportedOperationException("Not implemented yet");
        }

        private static class CacheEntry<V> {
            V value;
            long expiresAt;

            CacheEntry(V value, long expiresAt) {
                this.value = value;
                this.expiresAt = expiresAt;
            }

            boolean isExpired() {
                return System.currentTimeMillis() > expiresAt;
            }
        }
    }

    /**
     * Task 5: Multi-level Cache
     *
     * L1 (small, fast) -> L2 (larger, slower)
     */
    public static class MultiLevelCache<K, V> {
        private final LRUCache<K, V> l1Cache;
        private final LRUCache<K, V> l2Cache;

        public MultiLevelCache(int l1Capacity, int l2Capacity) {
            this.l1Cache = new LRUCache<>(l1Capacity);
            this.l2Cache = new LRUCache<>(l2Capacity);
        }

        public V get(K key) {
            // TODO: Check L1, then L2
            // Promote to L1 if found in L2
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void put(K key, V value) {
            // TODO: Put in L1 (may evict to L2)
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    // Simple database interface for testing
    public interface Database<K, V> {
        V read(K key);
        void write(K key, V value);
    }

    public static void main(String[] args) {
        System.out.println("System Design - Exercise 1: Caching Strategies\n");

        // Example: Simple LRU usage
        LRUCache<String, Integer> cache = new LRUCache<>(3);
        System.out.println("LRU Cache Example:");
        System.out.println("Implement the TODO tasks to complete caching strategies!");
    }
}
