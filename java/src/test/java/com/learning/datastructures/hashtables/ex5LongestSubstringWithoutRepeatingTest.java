package com.learning.datastructures.hashtables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex5LongestSubstringWithoutRepeatingTest {

    private ex5_LongestSubstringWithoutRepeating solution;

    @BeforeEach
    void setUp() {
        solution = new ex5_LongestSubstringWithoutRepeating();
    }

    @Test
    void testBasicCase() {
        String s = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testAllSame() {
        String s = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testMixedCase() {
        String s = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testEmptyString() {
        String s = "";
        assertEquals(0, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testSingleCharacter() {
        String s = "a";
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testAllUnique() {
        String s = "abcdef";
        assertEquals(6, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testWithSpaces() {
        String s = "a b c a b c";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void testLongString() {
        String s = "dvdf";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }
}
