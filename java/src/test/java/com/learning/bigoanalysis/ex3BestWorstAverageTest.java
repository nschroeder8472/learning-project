package com.learning.bigoanalysis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ex3BestWorstAverageTest {

    @Test
    void testLinearSearchCases() {
        assertEquals("O(1)", ex3BestWorstAverage.linearSearchBestCase(),
            "Best case: target is first element");
        assertEquals("O(n)", ex3BestWorstAverage.linearSearchWorstCase(),
            "Worst case: target is last or not present");
        assertEquals("O(n)", ex3BestWorstAverage.linearSearchAverageCase(),
            "Average case: still linear");
    }

    @Test
    void testInsertionSortCases() {
        assertEquals("O(n)", ex3BestWorstAverage.insertionSortBestCase(),
            "Best case: already sorted array");
        assertEquals("O(n^2)", ex3BestWorstAverage.insertionSortWorstCase(),
            "Worst case: reverse sorted array");
        assertEquals("O(n^2)", ex3BestWorstAverage.insertionSortAverageCase(),
            "Average case: quadratic");
    }

    @Test
    void testQuickSortCases() {
        assertEquals("O(n log n)", ex3BestWorstAverage.quickSortBestCase(),
            "Best case: balanced partitions");
        assertEquals("O(n^2)", ex3BestWorstAverage.quickSortWorstCase(),
            "Worst case: unbalanced partitions (e.g., already sorted with last element as pivot)");
        assertEquals("O(n log n)", ex3BestWorstAverage.quickSortAverageCase(),
            "Average case: typically balanced partitions");
    }

    @Test
    void testBinarySearchCases() {
        assertEquals("O(1)", ex3BestWorstAverage.binarySearchBestCase(),
            "Best case: target is middle element");
        assertEquals("O(log n)", ex3BestWorstAverage.binarySearchWorstCase(),
            "Worst case: target requires full binary divisions");
        assertEquals("O(log n)", ex3BestWorstAverage.binarySearchAverageCase(),
            "Average case: logarithmic");
    }
}
