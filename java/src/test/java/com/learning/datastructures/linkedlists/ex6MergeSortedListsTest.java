package com.learning.datastructures.linkedlists;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ex6MergeSortedListsTest {

    private ex6_MergeSortedLists merger;

    @BeforeEach
    void setUp() {
        merger = new ex6_MergeSortedLists();
    }

    @Test
    void testBothEmpty() {
        assertNull(merger.merge(null, null));
    }

    @Test
    void testFirstEmpty() {
        ListNode list2 = new ListNode(1, new ListNode(2));
        ListNode result = merger.merge(null, list2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

    @Test
    void testSecondEmpty() {
        ListNode list1 = new ListNode(1, new ListNode(2));
        ListNode result = merger.merge(list1, null);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

    @Test
    void testBasicMerge() {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode result = merger.merge(list1, list2);

        // Verify: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
        assertEquals(6, result.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next);
    }

    @Test
    void testNoOverlap() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode result = merger.merge(list1, list2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
    }

    @Test
    void testDuplicateValues() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = merger.merge(list1, list2);

        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
    }

    @Test
    void testDifferentLengths() {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))));
        ListNode result = merger.merge(list1, list2);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }
}
