# Searching Algorithms

## Concept

Searching algorithms are fundamental techniques for finding specific elements within data structures. The choice of algorithm depends on the data's organization and the performance requirements.

## Key Concepts

### Linear Search
- **Approach**: Sequential scan through each element
- **Prerequisites**: None (works on unsorted data)
- **Best Use**: Small datasets or unsorted data

### Binary Search
- **Approach**: Divide and conquer on sorted data
- **Prerequisites**: Data must be sorted
- **Best Use**: Large sorted datasets
- **Key Insight**: Eliminates half of remaining elements each iteration

## Common Operations & Complexity

| Algorithm | Time (Average) | Time (Worst) | Space | Prerequisites |
|-----------|---------------|--------------|-------|---------------|
| Linear Search | O(n) | O(n) | O(1) | None |
| Binary Search (Iterative) | O(log n) | O(log n) | O(1) | Sorted array |
| Binary Search (Recursive) | O(log n) | O(log n) | O(log n) | Sorted array |

## Exercises

### Easy
1. **ex1_linear_search** - Sequential search through array
2. **ex2_binary_search** - Classic binary search on sorted array

### Medium
3. **ex3_search_rotated_array** - Binary search variant for rotated sorted arrays
4. **ex4_find_peak_element** - Find local maximum using binary search

### Hard
5. **ex5_median_two_arrays** - Find median of two sorted arrays in O(log(min(m,n)))

## Hints

1. **Linear Search**: Iterate through array, return index when element is found, None if not found
2. **Binary Search**: Use two pointers (left, right). Compare middle element with target. Adjust pointers based on comparison
3. **Search Rotated Array**: Determine which half is sorted, then decide which half to search
4. **Find Peak Element**: Use binary search logic - if middle element is less than neighbor, peak must be on that side
5. **Median Two Arrays**: Partition both arrays such that left half has same number of elements as right half

## Testing Your Implementation

Run all searching algorithm tests:
```bash
cargo test --package algorithms
```

Run specific test:
```bash
cargo test ex1_linear_search
```

Run tests with output:
```bash
cargo test --package algorithms -- --nocapture
```
