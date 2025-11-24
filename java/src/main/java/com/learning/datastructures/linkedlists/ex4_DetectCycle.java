package com.learning.datastructures.linkedlists;

/**
 * Exercise: Detect Cycle (Medium)
 *
 * Given the head of a linked list, determine if the list has a cycle in it.
 * A cycle exists if a node can be reached again by continuously following the next pointer.
 *
 * Example 1:
 * Input: 1 -> 2 -> 3 -> 4 -> 2 (cycle back to node 2)
 * Output: true
 *
 * Example 2:
 * Input: 1 -> 2 -> 3 -> null
 * Output: false
 *
 * Time Complexity: O(n) where n is the number of nodes
 * Space Complexity: O(1)
 */
public class ex4_DetectCycle {

    public boolean hasCycle(ListNode head) {
        // TODO: Implement this method
        // Hint: Use Floyd's "tortoise and hare" algorithm
        // Two pointers: slow moves 1 step, fast moves 2 steps
        // If they meet, there's a cycle; if fast reaches null, no cycle
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
