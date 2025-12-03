"""
Exercise 5: Compare Algorithms (Medium)

For each scenario, choose the most appropriate algorithm based on Big O analysis
and the specific constraints given. Return the method name as a string.

Available choices for each scenario will be provided in the function docstrings.

Difficulty: Medium
Topics: Algorithm Selection, Trade-offs, Practical Big O
"""


def choose_search_small_unsorted() -> str:
    """
    Scenario 1: Searching in a small, unsorted array (size ~20)

    Options:
    - "linear_search" - O(n)
    - "binary_search" - O(log n) but requires sorted array
    - "sort_then_binary" - O(n log n) to sort, then O(log n) to search

    Hint: Consider overhead of sorting for just one search
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def choose_search_large_multiple() -> str:
    """
    Scenario 2: Multiple searches in a large, unsorted array (size ~1,000,000)

    Options:
    - "linear_search_repeated" - O(n) per search
    - "sort_once_then_binary" - O(n log n) once, then O(log n) per search
    - "hash_table" - O(n) to build, O(1) average per search

    Hint: Amortize the preprocessing cost over multiple searches
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def choose_sort_nearly_sorted() -> str:
    """
    Scenario 3: Sort a nearly-sorted array (most elements already in place)

    Options:
    - "insertion_sort" - O(n²) worst case, O(n) best case
    - "merge_sort" - O(n log n) always
    - "quick_sort" - O(n log n) average, O(n²) worst case

    Hint: Consider best-case performance
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def choose_sort_guaranteed_performance() -> str:
    """
    Scenario 4: Sort with guaranteed worst-case O(n log n) performance

    Options:
    - "insertion_sort" - O(n²) worst case
    - "merge_sort" - O(n log n) worst case
    - "quick_sort" - O(n²) worst case (with basic pivot selection)

    Hint: Which guarantees O(n log n) worst case?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def choose_sort_in_place() -> str:
    """
    Scenario 5: Sort with minimal extra space (in-place sorting required)

    Options:
    - "merge_sort" - O(n) extra space
    - "quick_sort" - O(log n) extra space (recursion stack)
    - "heap_sort" - O(1) extra space

    Hint: Consider space complexity
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def choose_find_duplicates() -> str:
    """
    Scenario 6: Find duplicates in an array

    Options:
    - "nested_loops" - O(n²) time, O(1) space
    - "sort_then_scan" - O(n log n) time, O(1) space
    - "hash_set" - O(n) time, O(n) space

    Hint: If space is available, what's the fastest?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def choose_contains_check_sorted() -> str:
    """
    Scenario 7: Check if array contains a specific value (one-time check)

    You have a sorted array of 1 million elements.

    Options:
    - "linear_search" - O(n)
    - "binary_search" - O(log n)
    - "hash_table" - O(n) to build, O(1) to search

    Hint: For a single check in a sorted array, which is best?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Big O Analysis - Exercise 5: Compare Algorithms\n")

    try:
        print(f"Small unsorted search: {choose_search_small_unsorted()}")
        print(f"Large multiple searches: {choose_search_large_multiple()}")
        print(f"Nearly sorted array: {choose_sort_nearly_sorted()}")
        print(f"Guaranteed performance: {choose_sort_guaranteed_performance()}")
        print(f"In-place sorting: {choose_sort_in_place()}")
        print(f"Find duplicates: {choose_find_duplicates()}")
        print(f"Contains check (sorted): {choose_contains_check_sorted()}")
    except NotImplementedError:
        print("Not yet implemented!")
