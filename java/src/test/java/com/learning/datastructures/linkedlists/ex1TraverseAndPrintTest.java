package com.learning.datastructures.linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ex1TraverseAndPrintTest {

    private ex1_TraverseAndPrint traverser;

    @BeforeEach
    void setUp() {
        traverser = new ex1_TraverseAndPrint();
    }

    @Test
    void testEmptyList() {
        List<Integer> result = traverser.traverse(null);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleNode() {
        ListNode head = new ListNode(42);
        List<Integer> result = traverser.traverse(head);
        assertEquals(List.of(42), result);
    }

    @Test
    void testMultipleNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        List<Integer> result = traverser.traverse(head);
        assertEquals(List.of(1, 2, 3, 4), result);
    }

    @Test
    void testTwoNodes() {
        ListNode head = new ListNode(10, new ListNode(20));
        List<Integer> result = traverser.traverse(head);
        assertEquals(List.of(10, 20), result);
    }

    @Test
    void testNegativeValues() {
        ListNode head = new ListNode(-5, new ListNode(-10, new ListNode(-15)));
        List<Integer> result = traverser.traverse(head);
        assertEquals(List.of(-5, -10, -15), result);
    }

    @Test
    void testDuplicateValues() {
        ListNode head = new ListNode(7, new ListNode(7, new ListNode(7)));
        List<Integer> result = traverser.traverse(head);
        assertEquals(List.of(7, 7, 7), result);
    }
}
