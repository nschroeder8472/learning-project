package com.learning.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Longest Common Subsequence implementation.
 */
public class ex4LongestCommonSubsequenceTest {

    @Test
    public void testBasicLCS() {
        assertEquals(3, ex4_LongestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));
        // LCS is "ace"
    }

    @Test
    public void testIdenticalStrings() {
        assertEquals(3, ex4_LongestCommonSubsequence.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void testNoCommonSubsequence() {
        assertEquals(0, ex4_LongestCommonSubsequence.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, ex4_LongestCommonSubsequence.longestCommonSubsequence("", "abc"));
        assertEquals(0, ex4_LongestCommonSubsequence.longestCommonSubsequence("abc", ""));
        assertEquals(0, ex4_LongestCommonSubsequence.longestCommonSubsequence("", ""));
    }

    @Test
    public void testSingleCharMatch() {
        assertEquals(1, ex4_LongestCommonSubsequence.longestCommonSubsequence("a", "a"));
        assertEquals(0, ex4_LongestCommonSubsequence.longestCommonSubsequence("a", "b"));
    }

    @Test
    public void testPartialMatch() {
        assertEquals(4, ex4_LongestCommonSubsequence.longestCommonSubsequence("abcdef", "aecbdf"));
        // LCS could be "abdf" or "acdf" (both length 4)
    }

    @Test
    public void testLongerStrings() {
        assertEquals(4, ex4_LongestCommonSubsequence.longestCommonSubsequence("AGGTAB", "GXTXAYB"));
        // LCS is "GTAB"
    }

    @Test
    public void testReversedStrings() {
        assertEquals(1, ex4_LongestCommonSubsequence.longestCommonSubsequence("abc", "cba"));
        // Only middle character 'b' is common in subsequence
    }

    @Test
    public void testOneSubstringOfOther() {
        assertEquals(3, ex4_LongestCommonSubsequence.longestCommonSubsequence("abc", "aXbXcX"));
        // LCS is "abc"
    }

    @Test
    public void testRepeatedCharacters() {
        assertEquals(3, ex4_LongestCommonSubsequence.longestCommonSubsequence("aaa", "aaa"));
        assertEquals(2, ex4_LongestCommonSubsequence.longestCommonSubsequence("aaa", "aa"));
    }
}
