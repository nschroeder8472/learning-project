# Learning Project - Complete Implementation Plan

## Project Overview

A multi-language learning repository for data structures, algorithms, and software engineering fundamentals. Each topic includes exercises ranging from easy to hard difficulty, with comprehensive test suites and explanatory documentation.

**Languages**: Java (Gradle), Python (pytest), Rust (Cargo)
**Approach**: Template-only (no solutions provided - learner implements everything)
**Testing**: Every exercise must have corresponding test files

## Current Status

### ✅ Completed

#### Infrastructure & Documentation
- [x] Project setup for all three languages
- [x] Java: Gradle build system with JUnit 5 and AssertJ
- [x] Python: pytest setup with requirements.txt
- [x] Rust: Cargo workspace with multiple crates
- [x] CLAUDE.md - Comprehensive build/test/run instructions
- [x] README.md - Learning path and project overview
- [x] .gitignore files for each language

#### Data Structures
- [x] **Arrays** - Complete for all 3 languages
  - Java: 6 exercises + 6 test files + README
  - Python: 6 exercises + 6 test files + README
  - Rust: 6 exercises (with embedded tests) + README
- [x] **Linked Lists** - Complete for all 3 languages
  - Java: 7 exercises + 7 test files + README
  - Python: 7 exercises + 7 test files + README
  - Rust: 7 exercises (with embedded tests) + README
- [x] **Trees** - Complete for all 3 languages
  - Java: 7 exercises + 7 test files + README
  - Python: 7 exercises + 7 test files + README
  - Rust: 7 exercises (with embedded tests) + README
- [x] **Hash Tables** - Complete for all 3 languages
  - Java: 6 exercises + 6 test files + README
  - Python: 6 exercises + 6 test files + README
  - Rust: 6 exercises (with embedded tests) + README

#### Algorithms
- [x] **Sorting** - Complete for all 3 languages
  - Java: 4 exercises + 4 test files + README
  - Python: 4 exercises + 4 test files + README
  - Rust: 4 exercises (with embedded tests) + README
- [x] **Searching** - Complete for all 3 languages
  - Java: 5 exercises + 5 test files + README
  - Python: 5 exercises + 5 test files + README
  - Rust: 5 exercises (with embedded tests) + README

#### Recent Updates
- **2025-11-26**: Searching Algorithms completed for all 3 languages (5 exercises each: linear, binary, rotated array, peak element, median)
- **2025-11-26**: Sorting Algorithms completed for all 3 languages (4 exercises each: bubble, selection, merge, quick)
- **2025-11-23**: Hash Tables completed for all 3 languages (6 exercises each)
- **2025-11-23**: File naming standardized to `ex<number>_` format across all languages
- **2025-11-23**: All data structure exercises (Arrays, Linked Lists, Trees) renamed and updated
- **2025-11-23**: Module files updated (mod.rs in Rust, test imports in Python/Java)

### 📋 Remaining Work

#### Algorithms (2 topics)
6. Dynamic Programming (fibonacci, coin change, LCS, edit distance)
7. Graph Traversal (BFS, DFS, Dijkstra, topological sort)

#### Additional Topics (4 topics)
8. Big O Analysis (complexity analysis exercises)
9. Design Patterns (Singleton, Factory, Observer, Strategy, Decorator)
10. Concurrency (threading, synchronization, async patterns)
11. System Design (case studies with discussion prompts)

---

## Implementation Pattern

### Standard Structure for Each Topic

Each topic should follow this exact pattern across all three languages:

#### 0. File Naming Conventions

**IMPORTANT**: All exercise files must be numbered to indicate the order they should be solved.

**Java**:
- Exercise files: `ex<number>_<PascalCase>.java` (e.g., `ex1_FindMaxElement.java`, `ex2_ReverseArray.java`)
- Test files: `ex<number><PascalCaseNoUnderscore>Test.java` (e.g., `ex1FindMaxElementTest.java`, `ex2ReverseArrayTest.java`)
- Numbering starts at 1

**Python**:
- Exercise files: `ex<number>_<snake_case>.py` (e.g., `ex1_find_max_element.py`, `ex2_reverse_array.py`)
- Test files: `test_ex<number>_<snake_case>.py` (e.g., `test_ex1_find_max_element.py`, `test_ex2_reverse_array.py`)
- Imports: `from package.module.ex<number>_<name> import function_name`
- Numbering starts at 1
- **Note**: Python module names cannot start with digits, hence the `ex` prefix

**Rust**:
- Exercise files: `ex<number>_<snake_case>.rs` (e.g., `ex1_find_max_element.rs`, `ex2_reverse_array.rs`)
- Module declarations in `mod.rs`: `pub mod ex<number>_<snake_case>;` (e.g., `pub mod ex1_find_max_element;`)
- **Note**: The underscore prefix is required in both file names and module declarations because Rust module names cannot start with digits
- Tests are embedded in the same file using `#[cfg(test)] mod tests`
- Numbering starts at 1

#### 1. README.md
Location: `<language>/<category>/<topic>/README.md`

Contents:
- **Concept section**: Explain the data structure/algorithm
- **Key Characteristics**: Bullet points on important properties
- **Common Operations**: Time/space complexity for key operations
- **Exercises section**: List all exercises with difficulty labels
- **Hints section**: One hint per exercise (not full solutions)

#### 2. Exercise Files
Pattern established (see Arrays implementation):

**Java**:
- Location: `java/src/main/java/com/learning/<category>/<topic>/`
- File naming: `ex<number>_<PascalCase>.java` (see section 0 above)
- Class structure: One public class per file
- Documentation: Javadoc with problem description, examples, time/space complexity
- Implementation: Methods throw `UnsupportedOperationException("Not implemented yet")`

**Python**:
- Location: `python/<category>/<topic>/`
- File naming: `ex<number>_<snake_case>.py` (see section 0 above)
- Function structure: Module-level functions with type hints
- Documentation: Docstrings with problem description, examples, complexity
- Implementation: Functions raise `NotImplementedError("Not implemented yet")`
- Include `if __name__ == "__main__"` block with example usage

**Rust**:
- Location: `rust/<crate-name>/src/<topic>/`
- File naming: `ex<number>_<snake_case>.rs` (see section 0 above)
- Module structure: Public functions, tests in same file with `#[cfg(test)]`
- Documentation: `///` doc comments with examples, complexity
- Implementation: Functions use `unimplemented!("Not implemented yet")`

#### 3. Test Files

**Java**:
- Location: `java/src/test/java/com/learning/<category>/<topic>/`
- File naming: `ex<number><PascalCaseNoUnderscore>Test.java` (see section 0 above)
- Framework: JUnit 5 with `@Test`, `@BeforeEach` annotations
- Assertions: Use both JUnit assertions and AssertJ where helpful
- Coverage: 5-8 test methods per exercise covering edge cases

**Python**:
- Location: `python/tests/<category>/<topic>/`
- File naming: `test_ex<number>_<snake_case>.py` (see section 0 above)
- Framework: pytest
- Assertions: Use assert statements
- Coverage: 5-8 test functions per exercise covering edge cases

**Rust**:
- Location: Same file as implementation, in `#[cfg(test)] mod tests`
- Framework: Built-in Rust testing
- Assertions: `assert_eq!`, `assert!` macros
- Coverage: 5-8 test functions per exercise covering edge cases

---

## Detailed Topic Specifications

### 1. Linked Lists

**Concepts to Cover:**
- Singly linked list implementation
- Doubly linked list implementation
- Node structure and ownership (especially important in Rust)

**Exercises (6 total):**

#### Easy (2)
1. **Traverse and Print** - Iterate through list and collect/print values
2. **Find Length** - Count nodes in the list

#### Medium (3)
3. **Reverse Linked List** - Reverse a singly linked list in-place
4. **Detect Cycle** - Use Floyd's cycle detection (tortoise and hare)
5. **Find Middle Node** - Use slow/fast pointer technique

#### Hard (2)
6. **Merge Two Sorted Lists** - Merge while maintaining sorted order
7. **LRU Cache** - Implement using doubly linked list + hash map

**Java Structure:**
```
Node class (inner class or separate file)
LinkedList class with methods for each exercise
```

**Python Structure:**
```python
class Node:
    def __init__(self, val, next=None)

class LinkedList:
    # methods for each exercise
```

**Rust Structure:**
```rust
struct Node<T> {
    val: T,
    next: Option<Box<Node<T>>>,
}
// Functions for each exercise
```

**Test Coverage:**
- Empty list
- Single node
- Multiple nodes
- Lists with cycles (for cycle detection)
- Edge cases for merging

---

### 2. Trees

**Concepts to Cover:**
- Binary Search Tree (BST) properties
- Tree traversals (inorder, preorder, postorder, level-order)
- Tree validation
- Recursion vs iteration

**Exercises (7 total):**

#### Easy (3)
1. **Inorder Traversal** - Left, Root, Right (should give sorted order for BST)
2. **Preorder Traversal** - Root, Left, Right
3. **Postorder Traversal** - Left, Right, Root

#### Medium (3)
4. **Level Order Traversal** - BFS, print nodes level by level
5. **Max Depth** - Find height of tree
6. **Validate BST** - Check if tree satisfies BST properties

#### Hard (1)
7. **Lowest Common Ancestor** - Find LCA of two nodes in BST

**Node Structure:**
```
TreeNode with:
- value/data
- left child pointer
- right child pointer
```

**Test Coverage:**
- Empty tree
- Single node
- Balanced trees
- Skewed trees (all left or all right)
- Invalid BSTs for validation exercise

---

### 3. Hash Tables

**Concepts to Cover:**
- Hash function design
- Collision resolution (chaining, open addressing)
- Load factor and resizing
- Common use cases

**Exercises (6 total):**

#### Easy (2)
1. **Two Sum** - Find two numbers that add to target using hash map
2. **Contains Duplicate** - Check if array has duplicates

#### Medium (3)
3. **Group Anagrams** - Group strings that are anagrams
4. **First Non-Repeating Character** - Use hash map to track frequencies
5. **Longest Substring Without Repeating Characters** - Sliding window + hash set

#### Hard (1)
6. **Design Hash Map** - Implement a hash map from scratch with chaining

**Implementation Notes:**
- Java: Can use `HashMap` for exercises 1-5, implement from scratch for #6
- Python: Can use `dict` for exercises 1-5, implement from scratch for #6
- Rust: Can use `HashMap` for exercises 1-5, implement from scratch for #6

**Test Coverage:**
- Empty inputs
- Single element
- No solution cases
- Multiple valid solutions
- Large inputs

---

### 4. Sorting Algorithms

**Concepts to Cover:**
- Comparison-based sorting
- Divide and conquer
- Stability
- Time/space complexity trade-offs

**Exercises (4 total):**

#### Easy (2)
1. **Bubble Sort** - Repeatedly swap adjacent elements if out of order
   - Time: O(n²), Space: O(1), Stable: Yes
2. **Selection Sort** - Find minimum and move to front
   - Time: O(n²), Space: O(1), Stable: No

#### Medium (2)
3. **Merge Sort** - Divide and conquer, merge sorted halves
   - Time: O(n log n), Space: O(n), Stable: Yes
4. **Quick Sort** - Choose pivot, partition, recurse
   - Time: O(n log n) average, O(n²) worst, Space: O(log n), Stable: No

**Test Coverage:**
- Empty array
- Single element
- Already sorted
- Reverse sorted
- All duplicates
- Random order
- Arrays with duplicates

**Verification:**
Each test should verify the array is sorted and (for stable sorts) that relative order of equal elements is preserved.

---

### 5. Searching Algorithms

**Concepts to Cover:**
- Linear search vs binary search
- Prerequisites for binary search
- Search variants

**Exercises (5 total):**

#### Easy (2)
1. **Linear Search** - Sequential search through array
   - Time: O(n), Space: O(1)
2. **Binary Search** - Search in sorted array
   - Time: O(log n), Space: O(1) iterative or O(log n) recursive

#### Medium (2)
3. **Search in Rotated Sorted Array** - Modified binary search
   - Array like [4,5,6,7,0,1,2], find target
4. **Find Peak Element** - Element greater than neighbors
   - Can use modified binary search

#### Hard (1)
5. **Median of Two Sorted Arrays** - O(log(min(m,n))) solution
   - Use binary search on the smaller array

**Test Coverage:**
- Element not present
- Element at start/middle/end
- Single element
- Two elements
- Large arrays

---

### 6. Dynamic Programming

**Concepts to Cover:**
- Memoization (top-down)
- Tabulation (bottom-up)
- State definition
- Recurrence relations

**Exercises (6 total):**

#### Easy (2)
1. **Fibonacci Number** - Classic DP introduction
   - Both recursive with memo and iterative
2. **Climbing Stairs** - How many ways to climb n stairs (1 or 2 steps at a time)

#### Medium (3)
3. **Coin Change** - Minimum coins to make amount
   - Return -1 if impossible
4. **Longest Common Subsequence (LCS)** - Find longest subsequence in two strings
5. **House Robber** - Max money without robbing adjacent houses

#### Hard (1)
6. **Edit Distance** - Minimum operations to convert one string to another
   - Operations: insert, delete, replace

**Test Coverage:**
- Base cases (n=0, n=1)
- Small inputs
- Impossible cases (for coin change)
- Empty strings
- Large inputs to verify efficiency

---

### 7. Graph Traversal

**Concepts to Cover:**
- Graph representations (adjacency list, adjacency matrix)
- BFS vs DFS
- Shortest path algorithms
- Topological sorting

**Graph Representation:**
Use adjacency list (most common):
- Java: `Map<Integer, List<Integer>>` or custom Graph class
- Python: `dict[int, list[int]]` or custom Graph class
- Rust: `HashMap<i32, Vec<i32>>` or custom struct

**Exercises (6 total):**

#### Easy (2)
1. **Depth-First Search (DFS)** - Traverse graph using DFS, return visited order
2. **Breadth-First Search (BFS)** - Traverse graph using BFS, return visited order

#### Medium (3)
3. **Number of Islands** - Count connected components in 2D grid
4. **Course Schedule** - Detect cycle in directed graph (topological sort)
5. **Clone Graph** - Deep copy a graph

#### Hard (1)
6. **Dijkstra's Algorithm** - Shortest path in weighted graph
   - Use priority queue/heap

**Test Coverage:**
- Empty graph
- Single node
- Disconnected graphs
- Cyclic graphs
- Graphs with self-loops
- Large graphs

---

### 8. Big O Analysis

**Concepts to Cover:**
- Time complexity analysis
- Space complexity analysis
- Best/average/worst case
- Common complexities: O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ)

**Exercises (5 total):**

This topic is more about analysis than implementation. Provide code snippets and ask for complexity analysis.

#### Format for Each Exercise:
1. Provide a code snippet (in all three languages)
2. Ask: "What is the time complexity?"
3. Ask: "What is the space complexity?"
4. Provide explanation in README

**Exercise Topics:**
1. **Simple Loops** - Single loop, nested loops
2. **Recursive Functions** - Fibonacci, factorial analysis
3. **Divide and Conquer** - Binary search, merge sort analysis
4. **Hash Table Operations** - Average vs worst case
5. **Graph Algorithms** - BFS/DFS complexity with V vertices, E edges

**Implementation:**
- Create files with code snippets and comments asking for analysis
- Test files can be quiz-style or have students fill in complexity annotations
- README contains detailed explanations

---

### 9. Design Patterns

**Concepts to Cover:**
- Creational patterns
- Structural patterns
- Behavioral patterns
- When to use each pattern

**Exercises (6 patterns):**

#### Creational (2)
1. **Singleton Pattern** - Ensure only one instance exists
   - Thread-safe implementation
2. **Factory Pattern** - Create objects without specifying exact class
   - Example: Shape factory (Circle, Square, Triangle)

#### Structural (2)
3. **Decorator Pattern** - Add behavior to objects dynamically
   - Example: Coffee with milk, sugar decorators
4. **Adapter Pattern** - Make incompatible interfaces work together
   - Example: USB-C to USB-A adapter

#### Behavioral (2)
5. **Observer Pattern** - One-to-many dependency (publish-subscribe)
   - Example: Weather station notifying displays
6. **Strategy Pattern** - Encapsulate interchangeable algorithms
   - Example: Different sorting strategies, payment methods

**Implementation Notes:**
- Each pattern should have a practical example
- Include UML-like structure in README
- Tests verify pattern behavior

**Test Coverage:**
- Singleton: Verify same instance returned
- Factory: Verify correct object types created
- Decorator: Verify behaviors stack correctly
- Adapter: Verify interface compatibility
- Observer: Verify notifications sent to all observers
- Strategy: Verify algorithm can be swapped at runtime

---

### 10. Concurrency

**Concepts to Cover:**
- Threads vs processes
- Race conditions
- Synchronization mechanisms
- Thread-safe data structures

**Language-Specific Approaches:**
- **Java**: `Thread`, `Runnable`, `synchronized`, `ExecutorService`, `ReentrantLock`
- **Python**: `threading`, `Queue`, `Lock`, `asyncio` for async/await
- **Rust**: `std::thread`, `Arc`, `Mutex`, `async`/`await` with tokio

**Exercises (5 total):**

#### Easy (2)
1. **Create and Run Threads** - Start multiple threads, print from each
2. **Thread Joining** - Wait for threads to complete

#### Medium (2)
3. **Producer-Consumer** - Use queue, implement producer and consumer threads
4. **Thread-Safe Counter** - Increment shared counter from multiple threads

#### Hard (1)
5. **Dining Philosophers** - Classic deadlock problem
   - Implement solution to avoid deadlock

**Test Coverage:**
- Verify correct output
- Check for race conditions
- Verify synchronization works
- Test with varying thread counts

**Note:** Some tests may be non-deterministic; focus on verifying invariants hold.

---

### 11. System Design

**Concepts to Cover:**
- Scalability
- Load balancing
- Caching strategies
- Database design
- CAP theorem
- Microservices vs monolith

**Format:**
This topic is more theoretical. Provide case studies and discussion prompts rather than coding exercises.

**Exercises (5 case studies):**

1. **URL Shortener** (like bit.ly)
   - Requirements analysis
   - Database schema
   - API design
   - Scalability considerations

2. **Social Media Feed** (like Twitter/X)
   - Fan-out on write vs fan-out on read
   - Caching strategies
   - Handling high traffic

3. **Rate Limiter**
   - Algorithms: Token bucket, leaking bucket, fixed window
   - Distributed rate limiting

4. **Key-Value Store** (like Redis)
   - Data structures
   - Persistence
   - Replication

5. **File Storage System** (like Dropbox)
   - Chunking and deduplication
   - Sync algorithms
   - Conflict resolution

**Implementation:**
- Create markdown files with problem statement
- Include sections: Requirements, API Design, Database Schema, Components, Scalability
- Optional: Provide skeleton code for core components
- No traditional tests; instead, provide discussion questions

**Deliverable for Each Case Study:**
- `<topic>_design.md` - Problem statement and design template
- `<topic>_discussion.md` - Discussion questions and considerations
- Optional: Basic prototype implementation

---

## File Organization Reference

### Java Project Structure
```
java/
├── build.gradle
├── settings.gradle
├── gradle.properties
├── .gitignore
├── README.md
└── src/
    ├── main/java/com/learning/
    │   ├── datastructures/
    │   │   ├── arrays/          ✅ COMPLETE
    │   │   ├── linkedlists/     ✅ COMPLETE
    │   │   ├── trees/           ✅ COMPLETE
    │   │   └── hashtables/      ✅ COMPLETE
    │   ├── algorithms/
    │   │   ├── sorting/         ✅ COMPLETE
    │   │   ├── searching/       ✅ COMPLETE
    │   │   ├── dynamicprogramming/  ⬜ TODO
    │   │   └── graphtraversal/  ⬜ TODO
    │   ├── biganalysis/         ⬜ TODO
    │   ├── designpatterns/      ⬜ TODO
    │   ├── concurrency/         ⬜ TODO
    │   └── systemdesign/        ⬜ TODO
    └── test/java/com/learning/
        └── (mirrors main structure)
```

### Python Project Structure
```
python/
├── requirements.txt
├── .gitignore
├── __init__.py
├── data_structures/
│   ├── __init__.py
│   ├── arrays/              ✅ COMPLETE
│   │   ├── __init__.py
│   │   ├── ex1_find_max_element.py
│   │   ├── ex2_reverse_array.py
│   │   └── ...
│   ├── linked_lists/        ✅ COMPLETE
│   ├── trees/               ✅ COMPLETE
│   └── hash_tables/         ✅ COMPLETE
├── algorithms/
│   ├── __init__.py
│   ├── sorting/             ✅ COMPLETE
│   ├── searching/           ✅ COMPLETE
│   ├── dynamic_programming/ ⬜ TODO
│   └── graph_traversal/     ⬜ TODO
├── big_o_analysis/          ⬜ TODO
├── design_patterns/         ⬜ TODO
├── concurrency/             ⬜ TODO
├── system_design/           ⬜ TODO
└── tests/
    └── (mirrors main structure)
```

### Rust Project Structure
```
rust/
├── Cargo.toml (workspace)
├── data-structures/
│   ├── Cargo.toml
│   └── src/
│       ├── lib.rs
│       ├── arrays/          ✅ COMPLETE
│       │   ├── mod.rs (contains: pub mod ex1_find_max_element; ...)
│       │   ├── ex1_find_max_element.rs
│       │   ├── ex2_reverse_array.rs
│       │   └── ...
│       ├── linked_lists/    ✅ COMPLETE
│       ├── trees/           ✅ COMPLETE
│       └── hash_tables/     ✅ COMPLETE
├── algorithms/
│   ├── Cargo.toml
│   └── src/
│       ├── lib.rs
│       ├── sorting/         ✅ COMPLETE
│       ├── searching/       ✅ COMPLETE
│       ├── dynamic_programming/  ⬜ TODO
│       └── graph_traversal/ ⬜ TODO
├── big-o-analysis/          ⬜ TODO
├── design-patterns/         ⬜ TODO
├── concurrency/             ⬜ TODO
└── system-design/           ⬜ TODO
```

---

## Arrays Implementation Reference

The Arrays topic has been fully implemented and serves as the reference template for all other topics.

### Key Files to Reference:

**Java Example:**
- Exercise: `java/src/main/java/com/learning/datastructures/arrays/ex1_FindMaxElement.java`
- Test: `java/src/test/java/com/learning/datastructures/arrays/ex1FindMaxElementTest.java`
- README: `java/src/main/java/com/learning/datastructures/arrays/README.md`

**Python Example:**
- Exercise: `python/data_structures/arrays/ex1_find_max_element.py`
- Test: `python/tests/data_structures/arrays/test_ex1_find_max_element.py`
- README: `python/data_structures/arrays/README.md`

**Rust Example:**
- Exercise: `rust/data-structures/src/arrays/ex1_find_max_element.rs`
- Module: `rust/data-structures/src/arrays/mod.rs` (declares `pub mod ex1_find_max_element;`)
- README: `rust/data-structures/src/arrays/README.md`

### Exercise Difficulty Distribution
- **Easy**: 2 exercises (fundamental operations)
- **Medium**: 2-3 exercises (optimization, edge cases)
- **Hard**: 1-2 exercises (advanced algorithms, real-world applications)

---

## Quality Standards

### Documentation Requirements
- Every exercise must have: problem description, example input/output, time/space complexity
- Every README must have: concept explanation, key characteristics, operation complexities, hints
- Hints should guide without giving away the solution

### Test Requirements
- Minimum 5 test cases per exercise
- Must cover: empty/null inputs, single element, typical cases, edge cases
- Test names should be descriptive (e.g., `testEmptyArray`, `test_single_element`)

### Code Quality
- All code should compile/run without errors (even with unimplemented placeholders)
- Use consistent naming conventions per language
- Follow language idioms (e.g., Rust ownership, Python type hints)

---

## Implementation Checklist

For each topic, verify:
- [ ] README.md created with all sections
- [ ] All exercises implemented (templates with TODOs)
- [ ] All test files created with comprehensive coverage
- [ ] Tests run successfully (failing as expected for unimplemented code)
- [ ] Module/package structure updated (e.g., `mod.rs` in Rust, `__init__.py` in Python)
- [ ] Consistent naming and formatting
- [ ] Examples in documentation are accurate

---

## Getting Started for New Session

### To Continue This Project:

1. **Clone or pull the repository** to your new machine
2. **Read this document** to understand the full scope
3. **Review the completed Arrays implementation** to understand the pattern
4. **Pick a topic from the "Remaining Work" section**
5. **Create all files for that topic** following the established pattern
6. **Test that everything builds/compiles** before moving to next topic
7. **Update this document** marking topics as complete

### Build/Test Commands:

**Java:**
```bash
cd java
gradle wrapper --gradle-version 8.5  # First time only
./gradlew build
./gradlew test
```

**Python:**
```bash
cd python
pip install -r requirements.txt  # First time only
pytest
pytest -v  # Verbose
```

**Rust:**
```bash
cd rust
cargo build
cargo test
cargo test --package data-structures  # Specific crate
```

---

## Notes for AI Assistants

When implementing topics:
1. **Follow the established patterns exactly** - consistency is crucial
2. **Reference the Arrays implementation** for structure and style
3. **Create all three languages in parallel** - complete a topic fully before moving on
4. **Don't skip test files** - they are essential for the learning experience
5. **Keep complexity appropriate** - this is intermediate-level learning material
6. **Update module files** - don't forget `mod.rs`, `__init__.py`, etc.
7. **Test frequently** - verify builds work after each major addition

---

## Summary Statistics

**Total Topics:** 11
**Completed:** 6 (Arrays, Linked Lists, Trees, Hash Tables, Sorting, Searching)
**Remaining:** 5

**Data Structures:** ✅ **COMPLETE** (All 4 fundamental data structures implemented)
**Algorithms:** 🔄 **IN PROGRESS** (2 of 4 algorithm topics complete: Sorting, Searching)

**Total Estimated Files to Create:**
- Exercise files: ~180 (60 per language × 3 languages)
- Test files: ~180 (60 per language × 3 languages)
- README files: ~33 (11 per language × 3 languages)
- Module/config files: ~30
- **Grand Total: ~420 files**

**Estimated Completion:**
- Each topic takes approximately 30-60 minutes to implement fully across all languages
- Total estimated time: 5-10 hours of focused work

---

**Last Updated:** 2025-11-26
**Status:** All data structures complete + 2 algorithm topics (Sorting, Searching), 5 topics remaining
**Next Recommended Topic:** Dynamic Programming or Big O Analysis
