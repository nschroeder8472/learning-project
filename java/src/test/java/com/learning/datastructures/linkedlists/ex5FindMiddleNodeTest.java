package com.learning.datastructures.linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex5FindMiddleNodeTest {

    private ex5_FindMiddleNode middleFinder;

    @BeforeEach
    void setUp() {
        middleFinder = new ex5_FindMiddleNode();
    }

    @Test
    void testSingleNode() {
        ListNode head = new ListNode(1);
        ListNode result = middleFinder.findMiddle(head);
        assertEquals(1, result.val);
    }

    @Test
    void testTwoNodes() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = middleFinder.findMiddle(head);
        assertEquals(2, result.val); // Second middle node
    }

    @Test
    void testThreeNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode result = middleFinder.findMiddle(head);
        assertEquals(2, result.val);
    }

    @Test
    void testFourNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result = middleFinder.findMiddle(head);
        assertEquals(3, result.val); // Second middle node
    }

    @Test
    void testFiveNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = middleFinder.findMiddle(head);
        assertEquals(3, result.val);
    }

    @Test
    void testSixNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                        new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = middleFinder.findMiddle(head);
        assertEquals(4, result.val); // Second middle node
    }
}
