# Searching Algorithms

## Concept

Searching algorithms are used to find specific elements within a data structure. The choice of algorithm depends on whether the data is sorted, the size of the dataset, and performance requirements.

### Key Characteristics
- **Linear Search**: Works on both sorted and unsorted data, checks each element sequentially
- **Binary Search**: Requires sorted data, uses divide-and-conquer to eliminate half the search space each iteration
- **Time Complexity**: Ranges from O(n) for linear search to O(log n) for binary search
- **Space Complexity**: Most searching algorithms use O(1) space for iterative implementations

### Common Searching Algorithms

| Algorithm | Time Complexity | Space | Prerequisites |
|-----------|----------------|-------|---------------|
| Linear Search | O(n) | O(1) | None |
| Binary Search | O(log n) | O(1) iterative, O(log n) recursive | Sorted array |
| Search in Rotated Array | O(log n) | O(1) | Rotated sorted array |
| Find Peak Element | O(log n) | O(1) | None |
| Median of Two Sorted Arrays | O(log(min(m,n))) | O(1) | Two sorted arrays |

## Exercises

### Easy
1. **LinearSearch** - Sequential search through array to find target element
2. **BinarySearch** - Efficiently search sorted array by repeatedly dividing search interval

### Medium
3. **SearchInRotatedSortedArray** - Find element in sorted array that has been rotated (e.g., [4,5,6,7,0,1,2])
4. **FindPeakElement** - Find an element that is greater than its neighbors

### Hard
5. **MedianOfTwoSortedArrays** - Find median of two sorted arrays in O(log(min(m,n))) time

## Hints

**LinearSearch**: Simply iterate through the array and compare each element with the target. Return index when found, or -1 if not found.

**BinarySearch**: Compare middle element with target. If equal, return index. If target is smaller, search left half. If larger, search right half. Repeat until found or search space is empty.

**SearchInRotatedSortedArray**: Use modified binary search. One half of the array will always be sorted - determine which half is sorted, check if target is in that range, and adjust search accordingly.

**FindPeakElement**: Use binary search approach. Compare middle element with its neighbor. Move toward the higher neighbor (a peak must exist in that direction).

**MedianOfTwoSortedArrays**: Use binary search on the smaller array to partition both arrays such that elements on the left are smaller than elements on the right. The median can be calculated from the partition boundaries.
