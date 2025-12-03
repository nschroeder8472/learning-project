package com.learning.bigoanalysis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ex5CompareAlgorithmsTest {

    @Test
    void testSearchSmallUnsorted() {
        assertEquals("linear_search", ex5CompareAlgorithms.chooseSearchSmallUnsorted(),
            "For small arrays, linear search is simpler and avoids sorting overhead");
    }

    @Test
    void testSearchLargeMultiple() {
        assertEquals("hash_table", ex5CompareAlgorithms.chooseSearchLargeMultiple(),
            "Hash table provides O(1) average lookups after O(n) preprocessing");
    }

    @Test
    void testSortNearlySorted() {
        assertEquals("insertion_sort", ex5CompareAlgorithms.chooseSortNearlySorted(),
            "Insertion sort is O(n) for nearly-sorted data");
    }

    @Test
    void testSortGuaranteedPerformance() {
        assertEquals("merge_sort", ex5CompareAlgorithms.chooseSortGuaranteedPerformance(),
            "Merge sort guarantees O(n log n) worst case");
    }

    @Test
    void testSortInPlace() {
        assertEquals("heap_sort", ex5CompareAlgorithms.chooseSortInPlace(),
            "Heap sort uses O(1) extra space");
    }

    @Test
    void testFindDuplicates() {
        assertEquals("hash_set", ex5CompareAlgorithms.chooseFindDuplicates(),
            "Hash set is fastest at O(n) time");
    }

    @Test
    void testContainsCheckSorted() {
        assertEquals("binary_search", ex5CompareAlgorithms.chooseContainsCheckSorted(),
            "Binary search is O(log n) on sorted array");
    }
}
