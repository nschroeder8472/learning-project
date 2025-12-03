# Big O Analysis

## Overview

Big O notation is a mathematical notation used to describe the upper bound of an algorithm's time or space complexity. It helps us understand how an algorithm's performance scales with input size, allowing us to make informed decisions about which algorithms to use.

## Key Concepts

### Time Complexity
Describes how the runtime of an algorithm grows relative to input size:
- **O(1)** - Constant: Runtime doesn't depend on input size (array access, hash table lookup)
- **O(log n)** - Logarithmic: Runtime grows logarithmically (binary search, balanced tree operations)
- **O(n)** - Linear: Runtime grows linearly with input (linear search, single loop)
- **O(n log n)** - Linearithmic: Common in efficient sorting (merge sort, quick sort average case)
- **O(n²)** - Quadratic: Nested loops over input (bubble sort, insertion sort)
- **O(2ⁿ)** - Exponential: Recursive algorithms with branching (naive Fibonacci)
- **O(n!)** - Factorial: Generate all permutations

### Space Complexity
Describes additional memory an algorithm uses:
- **O(1)** - Constant space: Fixed amount regardless of input
- **O(n)** - Linear space: Proportional to input size
- **O(n²)** - Quadratic space: 2D arrays, adjacency matrices

### Best, Worst, and Average Cases
- **Best Case**: Minimum time/space for optimal input (e.g., already sorted for insertion sort)
- **Worst Case**: Maximum time/space for pessimal input (e.g., reverse sorted for bubble sort)
- **Average Case**: Expected time/space for random input

### Amortized Analysis
Analyzes average performance over a sequence of operations (e.g., dynamic array resizing)

## Why Big O Matters

1. **Scalability**: Understand how algorithms perform with large datasets
2. **Comparison**: Choose between algorithms objectively
3. **Optimization**: Identify bottlenecks and improve performance
4. **Interview Prep**: Fundamental concept in technical interviews

## Common Patterns

### Identifying Time Complexity
- **Single loop**: O(n)
- **Nested loops**: O(n²), O(n³), etc.
- **Halving input each iteration**: O(log n)
- **Divide and conquer**: Often O(n log n)
- **Multiple independent loops**: Add them - O(n + m)
- **Nested dependent loops**: Multiply them - O(n * m)

### Analyzing Recursive Algorithms
1. Identify the recurrence relation
2. Use Master Theorem (if applicable)
3. Draw recursion tree
4. Count total operations

## Exercises

1. **ex1_identify_time_complexity** (Easy): Analyze code snippets and determine time complexity
2. **ex2_space_complexity** (Easy): Determine space complexity of various algorithms
3. **ex3_best_worst_average** (Medium): Identify best, worst, and average case scenarios
4. **ex4_recursive_complexity** (Medium): Analyze recursive algorithms
5. **ex5_compare_algorithms** (Medium): Compare algorithms for different scenarios
6. **ex6_optimize_code** (Hard): Improve complexity of inefficient implementations

## Running Tests

```bash
cd rust/big-o-analysis
cargo test
```

## Tips

- Focus on the dominant term (ignore constants and lower-order terms)
- O(2n + 100) simplifies to O(n)
- O(n² + n) simplifies to O(n²)
- Analyze loops: nested loops multiply, sequential loops add
- Consider both time and space trade-offs
- Big O describes growth rate, not exact runtime
