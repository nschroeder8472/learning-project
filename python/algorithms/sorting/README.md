# Sorting Algorithms

## Concept

Sorting algorithms arrange elements in a specific order (typically ascending or descending). Understanding different sorting algorithms is crucial for learning about algorithm complexity, trade-offs, and choosing the right tool for the job.

### Key Characteristics
- **Comparison-based**: Most sorting algorithms compare elements to determine order
- **Stability**: Stable sorts maintain relative order of equal elements
- **In-place**: In-place sorts use O(1) extra space (excluding recursion stack)
- **Adaptive**: Some algorithms perform better on partially sorted data

### Common Sorting Algorithms

| Algorithm | Time (Best) | Time (Average) | Time (Worst) | Space | Stable |
|-----------|-------------|----------------|--------------|-------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | No |

## Exercises

### Easy
1. **bubble_sort** - Repeatedly swap adjacent elements if they're in wrong order
2. **selection_sort** - Find minimum element and move it to the front

### Medium
3. **merge_sort** - Divide array in half, recursively sort, then merge sorted halves
4. **quick_sort** - Choose pivot, partition around it, recursively sort partitions

## Hints

**bubble_sort**: In each pass, the largest unsorted element "bubbles up" to its correct position. Optimize by stopping if no swaps occur in a pass.

**selection_sort**: For each position, scan remaining array to find the minimum and swap it into place.

**merge_sort**: The key is the merge operation - efficiently combine two sorted arrays into one. Use auxiliary space for merging.

**quick_sort**: Choosing a good pivot is crucial. Common strategies: first element, last element, random, or median-of-three. Partition rearranges elements so all smaller values are left of pivot.
