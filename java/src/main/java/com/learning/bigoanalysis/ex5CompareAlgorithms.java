package com.learning.bigoanalysis;

/**
 * Exercise 5: Compare Algorithms (Medium)
 *
 * For each scenario, choose the most appropriate algorithm based on Big O analysis
 * and the specific constraints given. Return the method name as a String.
 *
 * Available choices for each scenario will be provided in the method comments.
 *
 * Difficulty: Medium
 * Topics: Algorithm Selection, Trade-offs, Practical Big O
 */
public class ex5CompareAlgorithms {

    /**
     * Scenario 1: Searching in a small, unsorted array (size ~20)
     *
     * Options:
     * - "linear_search" - O(n)
     * - "binary_search" - O(log n) but requires sorted array
     * - "sort_then_binary" - O(n log n) to sort, then O(log n) to search
     */
    public static String chooseSearchSmallUnsorted() {
        // TODO: Which is best for a small unsorted array?
        // Hint: Consider overhead of sorting for just one search
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Scenario 2: Multiple searches in a large, unsorted array (size ~1,000,000)
     *
     * Options:
     * - "linear_search_repeated" - O(n) per search
     * - "sort_once_then_binary" - O(n log n) once, then O(log n) per search
     * - "hash_table" - O(n) to build, O(1) average per search
     */
    public static String chooseSearchLargeMultiple() {
        // TODO: Which is best for many searches?
        // Hint: Amortize the preprocessing cost over multiple searches
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Scenario 3: Sort a nearly-sorted array (most elements already in place)
     *
     * Options:
     * - "insertion_sort" - O(n²) worst case, O(n) best case
     * - "merge_sort" - O(n log n) always
     * - "quick_sort" - O(n log n) average, O(n²) worst case
     */
    public static String chooseSortNearlySorted() {
        // TODO: Which sort is best for nearly-sorted data?
        // Hint: Consider best-case performance
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Scenario 4: Sort with guaranteed worst-case O(n log n) performance
     *
     * Options:
     * - "insertion_sort" - O(n²) worst case
     * - "merge_sort" - O(n log n) worst case
     * - "quick_sort" - O(n²) worst case (with basic pivot selection)
     */
    public static String chooseSortGuaranteedPerformance() {
        // TODO: Which guarantees O(n log n) worst case?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Scenario 5: Sort with minimal extra space (in-place sorting required)
     *
     * Options:
     * - "merge_sort" - O(n) extra space
     * - "quick_sort" - O(log n) extra space (recursion stack)
     * - "heap_sort" - O(1) extra space
     */
    public static String chooseSortInPlace() {
        // TODO: Which uses the least extra space?
        // Hint: Consider space complexity
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Scenario 6: Find duplicates in an array
     *
     * Options:
     * - "nested_loops" - O(n²) time, O(1) space
     * - "sort_then_scan" - O(n log n) time, O(1) space
     * - "hash_set" - O(n) time, O(n) space
     */
    public static String chooseFindDuplicates() {
        // TODO: Which is the fastest approach?
        // Hint: If space is available, what's the fastest?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Scenario 7: Check if array contains a specific value (one-time check)
     *
     * You have a sorted array of 1 million elements.
     *
     * Options:
     * - "linear_search" - O(n)
     * - "binary_search" - O(log n)
     * - "hash_table" - O(n) to build, O(1) to search
     */
    public static String chooseContainsCheckSorted() {
        // TODO: For a single check in a sorted array, which is best?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        System.out.println("Big O Analysis - Exercise 5: Compare Algorithms");

        try {
            System.out.println("Small unsorted search: " + chooseSearchSmallUnsorted());
            System.out.println("Large multiple searches: " + chooseSearchLargeMultiple());
            System.out.println("Nearly sorted array: " + chooseSortNearlySorted());
            System.out.println("Guaranteed performance: " + chooseSortGuaranteedPerformance());
            System.out.println("In-place sorting: " + chooseSortInPlace());
            System.out.println("Find duplicates: " + chooseFindDuplicates());
            System.out.println("Contains check (sorted): " + chooseContainsCheckSorted());
        } catch (UnsupportedOperationException e) {
            System.out.println("Not yet implemented!");
        }
    }
}
