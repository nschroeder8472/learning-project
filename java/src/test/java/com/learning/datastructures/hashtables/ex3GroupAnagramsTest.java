package com.learning.datastructures.hashtables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class ex3GroupAnagramsTest {

    private ex3_GroupAnagrams solution;

    @BeforeEach
    void setUp() {
        solution = new ex3_GroupAnagrams();
    }

    @Test
    void testBasicCase() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals(3, result.size());

        // Verify groups (order within groups doesn't matter)
        Set<Set<String>> expected = new HashSet<>();
        expected.add(new HashSet<>(Arrays.asList("eat", "tea", "ate")));
        expected.add(new HashSet<>(Arrays.asList("tan", "nat")));
        expected.add(new HashSet<>(Arrays.asList("bat")));

        Set<Set<String>> actual = new HashSet<>();
        for (List<String> group : result) {
            actual.add(new HashSet<>(group));
        }

        assertEquals(expected, actual);
    }

    @Test
    void testEmptyString() {
        String[] strs = {""};
        List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("", result.get(0).get(0));
    }

    @Test
    void testSingleString() {
        String[] strs = {"a"};
        List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("a", result.get(0).get(0));
    }

    @Test
    void testNoAnagrams() {
        String[] strs = {"abc", "def", "ghi"};
        List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals(3, result.size());
    }

    @Test
    void testAllAnagrams() {
        String[] strs = {"abc", "bca", "cab"};
        List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals(1, result.size());
        assertEquals(3, result.get(0).size());
    }

    @Test
    void testDifferentLengths() {
        String[] strs = {"a", "ab", "ba", "abc", "bca"};
        List<List<String>> result = solution.groupAnagrams(strs);
        assertEquals(3, result.size());
    }
}
