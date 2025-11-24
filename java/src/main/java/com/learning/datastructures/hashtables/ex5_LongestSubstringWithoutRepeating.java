package com.learning.datastructures.hashtables;

/**
 * Exercise: Longest Substring Without Repeating Characters (Medium)
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(min(m, n)) where m is the charset size
 */
public class ex5_LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        // TODO: Implement this method
        // Hint: Use sliding window technique with a HashSet
        // Expand window by adding characters, shrink when you find a duplicate
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
