package com.learning.datastructures.hashtables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex6DesignHashMapTest {

    private ex6_DesignHashMap hashMap;

    @BeforeEach
    void setUp() {
        hashMap = new ex6_DesignHashMap();
    }

    @Test
    void testPutAndGet() {
        hashMap.put(1, 1);
        assertEquals(1, hashMap.get(1));
    }

    @Test
    void testGetNonExistent() {
        assertEquals(-1, hashMap.get(1));
    }

    @Test
    void testUpdateValue() {
        hashMap.put(2, 1);
        hashMap.put(2, 2);
        assertEquals(2, hashMap.get(2));
    }

    @Test
    void testMultiplePuts() {
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 3);
        assertEquals(1, hashMap.get(1));
        assertEquals(2, hashMap.get(2));
        assertEquals(3, hashMap.get(3));
    }

    @Test
    void testRemove() {
        hashMap.put(2, 1);
        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));
    }

    @Test
    void testRemoveNonExistent() {
        hashMap.remove(1);
        assertEquals(-1, hashMap.get(1));
    }

    @Test
    void testComplexSequence() {
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        assertEquals(1, hashMap.get(1));
        assertEquals(-1, hashMap.get(3));
        hashMap.put(2, 1);
        assertEquals(1, hashMap.get(2));
        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));
    }

    @Test
    void testCollisions() {
        // These keys should hash to the same bucket (1 and 1001 with SIZE=1000)
        hashMap.put(1, 100);
        hashMap.put(1001, 200);
        assertEquals(100, hashMap.get(1));
        assertEquals(200, hashMap.get(1001));
    }

    @Test
    void testManyInsertions() {
        for (int i = 0; i < 100; i++) {
            hashMap.put(i, i * 10);
        }
        for (int i = 0; i < 100; i++) {
            assertEquals(i * 10, hashMap.get(i));
        }
    }
}
