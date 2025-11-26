package com.learning.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Edit Distance implementation.
 */
public class ex6EditDistanceTest {

    @Test
    public void testBasicCase() {
        assertEquals(3, ex6_EditDistance.minDistance("horse", "ros"));
        // horse -> rorse -> rose -> ros
    }

    @Test
    public void testLongerStrings() {
        assertEquals(5, ex6_EditDistance.minDistance("intention", "execution"));
    }

    @Test
    public void testIdenticalStrings() {
        assertEquals(0, ex6_EditDistance.minDistance("abc", "abc"));
    }

    @Test
    public void testEmptyStrings() {
        assertEquals(3, ex6_EditDistance.minDistance("abc", ""));
        // Delete all 3 characters

        assertEquals(3, ex6_EditDistance.minDistance("", "abc"));
        // Insert all 3 characters

        assertEquals(0, ex6_EditDistance.minDistance("", ""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals(0, ex6_EditDistance.minDistance("a", "a"));
        assertEquals(1, ex6_EditDistance.minDistance("a", "b"));
        assertEquals(1, ex6_EditDistance.minDistance("a", ""));
        assertEquals(1, ex6_EditDistance.minDistance("", "a"));
    }

    @Test
    public void testOnlyInserts() {
        assertEquals(3, ex6_EditDistance.minDistance("", "abc"));
    }

    @Test
    public void testOnlyDeletes() {
        assertEquals(3, ex6_EditDistance.minDistance("abc", ""));
    }

    @Test
    public void testOnlyReplaces() {
        assertEquals(3, ex6_EditDistance.minDistance("abc", "def"));
    }

    @Test
    public void testPartialMatch() {
        assertEquals(2, ex6_EditDistance.minDistance("sea", "eat"));
        // sea -> eea -> eat (insert e, replace s with t)
        // Or: sea -> ea -> eat (delete s, insert t)
    }

    @Test
    public void testOneIsSubstringOfOther() {
        assertEquals(2, ex6_EditDistance.minDistance("abc", "abcde"));
        // Insert 'd' and 'e'
    }

    @Test
    public void testReversedStrings() {
        assertEquals(2, ex6_EditDistance.minDistance("abc", "cba"));
        // abc -> cbc -> cba (or other combinations)
    }

    @Test
    public void testCaseMatters() {
        assertEquals(1, ex6_EditDistance.minDistance("Hello", "hello"));
        // Replace 'H' with 'h'
    }
}
