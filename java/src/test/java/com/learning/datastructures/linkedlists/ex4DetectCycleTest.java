package com.learning.datastructures.linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex4DetectCycleTest {

    private ex4_DetectCycle detector;

    @BeforeEach
    void setUp() {
        detector = new ex4_DetectCycle();
    }

    @Test
    void testEmptyList() {
        assertFalse(detector.hasCycle(null));
    }

    @Test
    void testSingleNodeNoCycle() {
        ListNode head = new ListNode(1);
        assertFalse(detector.hasCycle(head));
    }

    @Test
    void testTwoNodesNoCycle() {
        ListNode head = new ListNode(1, new ListNode(2));
        assertFalse(detector.hasCycle(head));
    }

    @Test
    void testNoCycle() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        assertFalse(detector.hasCycle(head));
    }

    @Test
    void testCycleAtEnd() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node1; // Cycle back to first node

        assertTrue(detector.hasCycle(node1));
    }

    @Test
    void testCycleInMiddle() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Cycle back to second node

        assertTrue(detector.hasCycle(node1));
    }

    @Test
    void testSelfCycle() {
        ListNode node = new ListNode(1);
        node.next = node; // Points to itself
        assertTrue(detector.hasCycle(node));
    }
}
