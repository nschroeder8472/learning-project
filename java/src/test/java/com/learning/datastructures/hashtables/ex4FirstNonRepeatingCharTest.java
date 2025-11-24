package com.learning.datastructures.hashtables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex4FirstNonRepeatingCharTest {

    private ex4_FirstNonRepeatingChar solution;

    @BeforeEach
    void setUp() {
        solution = new ex4_FirstNonRepeatingChar();
    }

    @Test
    void testBasicCase() {
        String s = "leetcode";
        assertEquals(0, solution.firstUniqChar(s));
    }

    @Test
    void testMiddleCharacter() {
        String s = "loveleetcode";
        assertEquals(2, solution.firstUniqChar(s));
    }

    @Test
    void testAllDuplicates() {
        String s = "aabb";
        assertEquals(-1, solution.firstUniqChar(s));
    }

    @Test
    void testSingleCharacter() {
        String s = "a";
        assertEquals(0, solution.firstUniqChar(s));
    }

    @Test
    void testAllUnique() {
        String s = "abcd";
        assertEquals(0, solution.firstUniqChar(s));
    }

    @Test
    void testLastCharacterUnique() {
        String s = "aabbccz";
        assertEquals(6, solution.firstUniqChar(s));
    }

    @Test
    void testRepeatingPattern() {
        String s = "dddccdbba";
        assertEquals(8, solution.firstUniqChar(s));
    }
}
