package com.learning.datastructures.hashtables;

import java.util.List;

/**
 * Exercise: Group Anagrams (Medium)
 *
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly once.
 *
 * Example:
 * Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 * Time Complexity: O(n * k log k) where n is the number of strings and k is the max length
 * Space Complexity: O(n * k)
 */
public class ex3_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: Implement this method
        // Hint: Sort each string to use as a key in a HashMap
        // Strings with the same sorted form are anagrams
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
