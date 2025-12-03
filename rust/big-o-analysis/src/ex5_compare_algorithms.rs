/// Exercise 5: Compare Algorithms (Medium)
///
/// For each scenario, choose the most appropriate algorithm based on Big O analysis
/// and the specific constraints given. Return the method name as a string.
///
/// Available choices for each scenario will be provided in the function docstrings.
///
/// Difficulty: Medium
/// Topics: Algorithm Selection, Trade-offs, Practical Big O

/// Scenario 1: Searching in a small, unsorted array (size ~20)
///
/// Options:
/// - "linear_search" - O(n)
/// - "binary_search" - O(log n) but requires sorted array
/// - "sort_then_binary" - O(n log n) to sort, then O(log n) to search
pub fn choose_search_small_unsorted() -> &'static str {
    // TODO: Which is best for a small unsorted array?
    // Hint: Consider overhead of sorting for just one search
    unimplemented!("Not implemented yet")
}

/// Scenario 2: Multiple searches in a large, unsorted array (size ~1,000,000)
///
/// Options:
/// - "linear_search_repeated" - O(n) per search
/// - "sort_once_then_binary" - O(n log n) once, then O(log n) per search
/// - "hash_table" - O(n) to build, O(1) average per search
pub fn choose_search_large_multiple() -> &'static str {
    // TODO: Which is best for many searches?
    // Hint: Amortize the preprocessing cost over multiple searches
    unimplemented!("Not implemented yet")
}

/// Scenario 3: Sort a nearly-sorted array (most elements already in place)
///
/// Options:
/// - "insertion_sort" - O(n²) worst case, O(n) best case
/// - "merge_sort" - O(n log n) always
/// - "quick_sort" - O(n log n) average, O(n²) worst case
pub fn choose_sort_nearly_sorted() -> &'static str {
    // TODO: Which sort is best for nearly-sorted data?
    // Hint: Consider best-case performance
    unimplemented!("Not implemented yet")
}

/// Scenario 4: Sort with guaranteed worst-case O(n log n) performance
///
/// Options:
/// - "insertion_sort" - O(n²) worst case
/// - "merge_sort" - O(n log n) worst case
/// - "quick_sort" - O(n²) worst case (with basic pivot selection)
pub fn choose_sort_guaranteed_performance() -> &'static str {
    // TODO: Which guarantees O(n log n) worst case?
    unimplemented!("Not implemented yet")
}

/// Scenario 5: Sort with minimal extra space (in-place sorting required)
///
/// Options:
/// - "merge_sort" - O(n) extra space
/// - "quick_sort" - O(log n) extra space (recursion stack)
/// - "heap_sort" - O(1) extra space
pub fn choose_sort_in_place() -> &'static str {
    // TODO: Which uses the least extra space?
    // Hint: Consider space complexity
    unimplemented!("Not implemented yet")
}

/// Scenario 6: Find duplicates in an array
///
/// Options:
/// - "nested_loops" - O(n²) time, O(1) space
/// - "sort_then_scan" - O(n log n) time, O(1) space
/// - "hash_set" - O(n) time, O(n) space
pub fn choose_find_duplicates() -> &'static str {
    // TODO: Which is the fastest approach?
    // Hint: If space is available, what's the fastest?
    unimplemented!("Not implemented yet")
}

/// Scenario 7: Check if array contains a specific value (one-time check)
///
/// You have a sorted array of 1 million elements.
///
/// Options:
/// - "linear_search" - O(n)
/// - "binary_search" - O(log n)
/// - "hash_table" - O(n) to build, O(1) to search
pub fn choose_contains_check_sorted() -> &'static str {
    // TODO: For a single check in a sorted array, which is best?
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_search_small_unsorted() {
        assert_eq!(choose_search_small_unsorted(), "linear_search",
            "For small arrays, linear search is simpler and avoids sorting overhead");
    }

    #[test]
    fn test_search_large_multiple() {
        assert_eq!(choose_search_large_multiple(), "hash_table",
            "Hash table provides O(1) average lookups after O(n) preprocessing");
    }

    #[test]
    fn test_sort_nearly_sorted() {
        assert_eq!(choose_sort_nearly_sorted(), "insertion_sort",
            "Insertion sort is O(n) for nearly-sorted data");
    }

    #[test]
    fn test_sort_guaranteed_performance() {
        assert_eq!(choose_sort_guaranteed_performance(), "merge_sort",
            "Merge sort guarantees O(n log n) worst case");
    }

    #[test]
    fn test_sort_in_place() {
        assert_eq!(choose_sort_in_place(), "heap_sort",
            "Heap sort uses O(1) extra space");
    }

    #[test]
    fn test_find_duplicates() {
        assert_eq!(choose_find_duplicates(), "hash_set",
            "Hash set is fastest at O(n) time");
    }

    #[test]
    fn test_contains_check_sorted() {
        assert_eq!(choose_contains_check_sorted(), "binary_search",
            "Binary search is O(log n) on sorted array");
    }
}
