package com.learning.datastructures.linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex2FindLengthTest {

    private ex2_FindLength lengthFinder;

    @BeforeEach
    void setUp() {
        lengthFinder = new ex2_FindLength();
    }

    @Test
    void testEmptyList() {
        assertEquals(0, lengthFinder.length(null));
    }

    @Test
    void testSingleNode() {
        ListNode head = new ListNode(1);
        assertEquals(1, lengthFinder.length(head));
    }

    @Test
    void testTwoNodes() {
        ListNode head = new ListNode(1, new ListNode(2));
        assertEquals(2, lengthFinder.length(head));
    }

    @Test
    void testFiveNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertEquals(5, lengthFinder.length(head));
    }

    @Test
    void testTenNodes() {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 10; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        assertEquals(10, lengthFinder.length(head));
    }
}
