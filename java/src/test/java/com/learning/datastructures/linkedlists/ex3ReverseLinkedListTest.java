package com.learning.datastructures.linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex3ReverseLinkedListTest {

    private ex3_ReverseLinkedList reverser;

    @BeforeEach
    void setUp() {
        reverser = new ex3_ReverseLinkedList();
    }

    @Test
    void testEmptyList() {
        assertNull(reverser.reverse(null));
    }

    @Test
    void testSingleNode() {
        ListNode head = new ListNode(1);
        ListNode result = reverser.reverse(head);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    void testTwoNodes() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = reverser.reverse(head);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    void testFiveNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = reverser.reverse(head);

        // Verify reversed order: 5 -> 4 -> 3 -> 2 -> 1
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }

    @Test
    void testReversePreservesValues() {
        ListNode head = new ListNode(10, new ListNode(20, new ListNode(30)));
        ListNode result = reverser.reverse(head);

        assertEquals(30, result.val);
        assertEquals(20, result.next.val);
        assertEquals(10, result.next.next.val);
    }
}
