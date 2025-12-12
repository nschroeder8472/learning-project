# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

A multi-language learning repository focused on data structures, algorithms, and software engineering fundamentals. Designed for practicing core CS concepts in Java, Python, and Rust.

## Project Structure

```
learning-project/
├── java/               # Java implementations
│   ├── data-structures/
│   ├── algorithms/
│   ├── big-o-analysis/
│   ├── design-patterns/
│   ├── concurrency/
│   └── system-design/
├── python/             # Python implementations
│   └── (same topics as java/)
└── rust/               # Rust implementations
    └── (same topics as java/)
```

Each topic contains:
- Exercise template files (with TODO markers for implementation)
  - Naming: `ex<number>_DescriptiveName` (e.g., `ex1_FindMaxElement.java`, `ex2_reverse_array.py`)
- Test files to verify correctness
- README explaining concepts and exercises

## Building and Testing

### Java

**Setup:**
- Uses Gradle for dependency management
- JUnit 5 for testing

**Commands:**
```bash
cd java
./gradlew build            # Compile all Java code and run tests
./gradlew test             # Run all tests
./gradlew test --tests ClassName  # Run specific test class
./gradlew clean            # Clean build artifacts
```

**Running individual exercises:**
```bash
cd java
./gradlew run --args="com.learning.datastructures.arrays.ClassName"
# Or compile and run directly:
./gradlew build
java -cp build/classes/java/main com.learning.datastructures.arrays.ClassName
```

### Python

**Setup:**
```bash
cd python
pip install -r requirements.txt  # Install pytest and dependencies
```

**Commands:**
```bash
cd python
pytest                              # Run all tests
pytest -v                           # Verbose output
pytest path/to/test_file.py         # Run specific test file
pytest path/to/test_file.py::test_name  # Run specific test
```

**Running individual exercises:**
```bash
cd python
python -m data_structures.arrays.exercise_name
```

### Rust

**Setup:**
- Uses Cargo workspace for multi-crate project

**Commands:**
```bash
cd rust
cargo build                # Build all crates
cargo test                 # Run all tests
cargo test --package data-structures  # Test specific crate
cargo test test_name       # Run specific test
```

**Running individual exercises:**
```bash
cd rust/data-structures
cargo run --bin exercise_name
```

## Exercise Workflow

1. Navigate to a topic directory (e.g., `java/data-structures/arrays/`)
2. Open the exercise file and read the problem description
3. Implement the solution where TODOs are marked
4. Run the corresponding test file to verify correctness
5. Review the README for hints if stuck

## Topics Coverage

**Data Structures:** Arrays, Linked Lists (singly & doubly), Trees (BST, traversals), Hash Tables
**Algorithms:** Sorting (bubble, merge, quick), Searching (linear, binary), Dynamic Programming, Graph Traversal (BFS, DFS, Dijkstra)
**Additional:** Big O Analysis, Design Patterns (Singleton, Factory, Observer, Strategy, Decorator), Concurrency, System Design

## Adding a New Language

To add a new language (e.g., Go, C++, TypeScript) to this multi-language learning project, follow these established patterns:

### File Naming Conventions

All exercise files must be numbered with `ex<number>_` prefix to indicate solving order. Numbering starts at 1.

**Java:**
- Exercise files: `ex<number>_PascalCase.java` (e.g., `ex1_FindMaxElement.java`)
- Test files: `ex<number>PascalCaseNoUnderscore>Test.java` (e.g., `ex1FindMaxElementTest.java`)

**Python:**
- Exercise files: `ex<number>_snake_case.py` (e.g., `ex1_find_max_element.py`)
- Test files: `test_ex<number>_snake_case.py` (e.g., `test_ex1_find_max_element.py`)
- Note: `ex` prefix required because Python module names cannot start with digits

**Rust:**
- Exercise files: `ex<number>_snake_case.rs` (e.g., `ex1_find_max_element.rs`)
- Module declarations: `pub mod ex<number>_snake_case;` in `mod.rs`
- Note: Prefix required because Rust module names cannot start with digits
- Tests embedded in same file using `#[cfg(test)] mod tests`

**New Language Guidelines:**
- Use language-appropriate casing (PascalCase for C++/C#, snake_case for Go/Python/Rust)
- Maintain `ex<number>_` prefix for consistency
- Follow language idioms for test file organization

### Directory Structure Patterns

**Java:**
```
java/
├── build.gradle                    # Gradle build config
├── settings.gradle
├── gradle.properties
├── README.md
├── .gitignore
└── src/
    ├── main/java/com/learning/
    │   ├── datastructures/
    │   │   ├── arrays/
    │   │   ├── linkedlists/
    │   │   ├── trees/
    │   │   └── hashtables/
    │   ├── algorithms/
    │   │   ├── sorting/
    │   │   ├── searching/
    │   │   ├── dynamicprogramming/
    │   │   └── graphtraversal/
    │   ├── bigoanalysis/
    │   ├── designpatterns/
    │   ├── concurrency/
    │   └── systemdesign/
    └── test/java/com/learning/
        └── (mirrors main structure)
```

**Python:**
```
python/
├── requirements.txt                # pytest, pytest-cov
├── __init__.py
├── README.md
├── .gitignore
├── data_structures/
│   ├── __init__.py
│   ├── arrays/
│   ├── linked_lists/
│   ├── trees/
│   └── hash_tables/
├── algorithms/
│   ├── __init__.py
│   ├── sorting/
│   ├── searching/
│   ├── dynamic_programming/
│   └── graph_traversal/
├── big_o_analysis/
├── design_patterns/
├── concurrency/
├── system_design/
└── tests/
    └── (mirrors module structure)
```

**Rust:**
```
rust/
├── Cargo.toml                      # Workspace definition
├── Cargo.lock
├── .gitignore
├── data-structures/
│   ├── Cargo.toml                  # Crate config
│   └── src/
│       ├── lib.rs
│       ├── arrays/
│       │   ├── mod.rs (contains: pub mod ex1_find_max_element; ...)
│       │   ├── ex1_find_max_element.rs
│       │   └── ...
│       ├── linked_lists/
│       ├── trees/
│       └── hash_tables/
├── algorithms/
│   ├── Cargo.toml
│   └── src/
│       ├── lib.rs
│       ├── sorting/
│       ├── searching/
│       ├── dynamic_programming/
│       └── graph_traversal/
├── big-o-analysis/
├── design-patterns/
├── concurrency/
└── system-design/
```

### Build System Setup

**Java:**
- Build tool: Gradle
- Language version: Java 21
- Test framework: JUnit 5
- Additional libraries: AssertJ for assertions
- Single `build.gradle` at `/java/` covering all exercises

**Python:**
- Build tool: pip (requirements.txt)
- Test framework: pytest
- Dependencies: `pytest>=7.4.0`, `pytest-cov>=4.1.0`
- No centralized build system (Python's nature)

**Rust:**
- Build tool: Cargo workspace
- Root `Cargo.toml` defines workspace members
- Each crate has its own `Cargo.toml` inheriting workspace settings
- Test framework: Built-in (`#[cfg(test)]` modules)

**For New Languages:**
- Choose language-appropriate build tool (Go Modules, CMake, Maven, npm, etc.)
- Create root-level configuration file
- Organize modules to mirror topic structure
- Document build/test commands in this file

### Testing Framework Patterns

| Language | Framework | Location | Structure |
|----------|-----------|----------|-----------|
| **Java** | JUnit 5 | `src/test/java/com/learning/<category>/<topic>/` | Separate test classes, 5-8 test methods per exercise |
| **Python** | pytest | `tests/<category>/<topic>/` | Separate test modules, 5-8 test functions per exercise |
| **Rust** | Built-in | Same file as implementation | `#[cfg(test)] mod tests` block, 5-8 test functions |

**For New Languages:**
- Use language's standard or most popular testing framework
- Create 5-8 test cases per exercise covering edge cases
- Follow language conventions for test file naming and organization
- Verify tests are discoverable with standard commands

### Exercise Template Structure

**Java Example:**
- Javadoc comments with problem description, example, time/space complexity
- Single public class matching file name
- Methods throw `UnsupportedOperationException("Not implemented yet")`
- TODO comments with hints

**Python Example:**
- Module-level docstring with problem description, example, complexity
- Type hints on function signatures
- Functions raise `NotImplementedError("Not implemented yet")`
- `if __name__ == "__main__"` block with example usage
- TODO comments with hints

**Rust Example:**
- `///` doc comments with problem description, example, complexity
- Functions use `unimplemented!("Not implemented yet")`
- Embedded test module with `#[cfg(test)]`
- Tests use `assert_eq!` and `assert!` macros

**For New Languages:**
- Clear problem description in comments/docstrings
- Time/space complexity annotations
- Language-appropriate "not implemented" placeholder
- Hints without full solutions

### Consistency Checklist

When adding a new language, verify:
- [ ] Naming convention follows language idiom + `ex<number>_` prefix
- [ ] Exercise templates match structure across languages (problem description, complexity, hints)
- [ ] 5-8 test cases per exercise
- [ ] README for each topic with concept explanation and exercise list
- [ ] Build/test commands documented in this file
- [ ] Module/package structure mirrors other languages
- [ ] .gitignore appropriate for language and build system
- [ ] Directory structure aligns with existing patterns
- [ ] All exercises have corresponding test files

## Implementation Standards

### Standard Structure for Each Topic

Each topic follows this pattern across all languages:

#### 1. README.md
**Location:** `<language>/<category>/<topic>/README.md`

**Required Sections:**
- **Concept:** Explain the data structure/algorithm
- **Key Characteristics:** Bullet points on important properties
- **Common Operations:** Time/space complexity for key operations
- **Exercises:** List all exercises with difficulty labels (Easy/Medium/Hard)
- **Hints:** One hint per exercise (not full solutions)

#### 2. Exercise Files

**Java:**
- Location: `java/src/main/java/com/learning/<category>/<topic>/`
- Class structure: One public class per file
- Documentation: Javadoc with problem, examples, complexity
- Implementation: `throw new UnsupportedOperationException("Not implemented yet")`

**Python:**
- Location: `python/<category>/<topic>/`
- Function structure: Module-level functions with type hints
- Documentation: Docstrings with problem, examples, complexity
- Implementation: `raise NotImplementedError("Not implemented yet")`
- Include `if __name__ == "__main__"` block

**Rust:**
- Location: `rust/<crate-name>/src/<topic>/`
- Module structure: Public functions, tests in `#[cfg(test)]`
- Documentation: `///` doc comments with examples, complexity
- Implementation: `unimplemented!("Not implemented yet")`

#### 3. Test Files

**Coverage Requirements:**
- Minimum 5-8 test cases per exercise
- Must cover: empty/null inputs, single element, typical cases, edge cases
- Test names should be descriptive

**Java:**
- Location: `java/src/test/java/com/learning/<category>/<topic>/`
- Framework: JUnit 5 with `@Test`, `@BeforeEach`
- Assertions: JUnit assertions and AssertJ

**Python:**
- Location: `python/tests/<category>/<topic>/`
- Framework: pytest
- Assertions: assert statements

**Rust:**
- Location: Same file as implementation
- Framework: Built-in testing
- Assertions: `assert_eq!`, `assert!` macros

### Documentation Requirements

Every exercise must include:
- Problem description
- Example input/output
- Time complexity
- Space complexity
- Hints (not full solutions)

Every README must include:
- Concept explanation
- Key characteristics
- Operation complexities
- Exercise list
- Hints section

### Code Quality Standards

- All code must compile/run without errors (even with unimplemented placeholders)
- Use consistent naming conventions per language
- Follow language idioms (e.g., Rust ownership, Python type hints, Java interfaces)
- Template-only approach (no solution files provided)
- Prioritize clarity and educational value over production-level optimization

### Implementation Checklist

For each new topic, verify:
- [ ] README.md created with all required sections
- [ ] All exercises implemented as templates with TODOs
- [ ] All test files created with comprehensive coverage
- [ ] Tests run successfully (failing as expected for unimplemented code)
- [ ] Module/package structure updated (mod.rs, __init__.py, etc.)
- [ ] Consistent naming and formatting across languages
- [ ] Examples in documentation are accurate
- [ ] Difficulty distribution: 2 Easy, 2-3 Medium, 1-2 Hard

## Topic Specifications

Detailed specifications for all topics in this learning project.

### 1. Arrays

**Concepts:**
- Contiguous memory allocation
- Index-based access
- Time complexity of common operations
- Static vs dynamic sizing

**Exercises (6 total):**

**Easy (2):**
1. Find Maximum Element - Linear scan through array
2. Reverse Array - In-place reversal

**Medium (2):**
3. Rotate Array - Rotate by k positions
4. Two Sum - Find two numbers that add to target

**Hard (2):**
5. Maximum Subarray Sum - Kadane's algorithm
6. Product of Array Except Self - Without division operator

**Test Coverage:**
- Empty arrays
- Single element
- All positive/negative/mixed numbers
- Large arrays
- Edge cases (k=0, k>length for rotation)

### 2. Linked Lists

**Concepts:**
- Singly linked list implementation
- Doubly linked list implementation
- Node structure and ownership (especially in Rust)
- Pointer manipulation

**Exercises (7 total):**

**Easy (2):**
1. Traverse and Print - Iterate through list
2. Find Length - Count nodes

**Medium (3):**
3. Reverse Linked List - In-place reversal
4. Detect Cycle - Floyd's cycle detection (tortoise and hare)
5. Find Middle Node - Slow/fast pointer technique

**Hard (2):**
6. Merge Two Sorted Lists - Maintain sorted order
7. LRU Cache - Doubly linked list + hash map

**Test Coverage:**
- Empty list
- Single node
- Multiple nodes
- Lists with cycles
- Edge cases for merging

### 3. Trees

**Concepts:**
- Binary Search Tree (BST) properties
- Tree traversals (inorder, preorder, postorder, level-order)
- Tree validation
- Recursion vs iteration

**Exercises (7 total):**

**Easy (3):**
1. Inorder Traversal - Left, Root, Right
2. Preorder Traversal - Root, Left, Right
3. Postorder Traversal - Left, Right, Root

**Medium (3):**
4. Level Order Traversal - BFS approach
5. Max Depth - Find height of tree
6. Validate BST - Check BST properties

**Hard (1):**
7. Lowest Common Ancestor - Find LCA of two nodes

**Test Coverage:**
- Empty tree
- Single node
- Balanced trees
- Skewed trees
- Invalid BSTs for validation

### 4. Hash Tables

**Concepts:**
- Hash function design
- Collision resolution (chaining, open addressing)
- Load factor and resizing
- Common use cases

**Exercises (6 total):**

**Easy (2):**
1. Two Sum - Find two numbers using hash map
2. Contains Duplicate - Check for duplicates

**Medium (3):**
3. Group Anagrams - Group strings that are anagrams
4. First Non-Repeating Character - Track frequencies
5. Longest Substring Without Repeating - Sliding window + hash set

**Hard (1):**
6. Design Hash Map - Implement from scratch with chaining

**Test Coverage:**
- Empty inputs
- Single element
- No solution cases
- Multiple valid solutions
- Large inputs

### 5. Sorting Algorithms

**Concepts:**
- Comparison-based sorting
- Divide and conquer
- Stability
- Time/space complexity trade-offs

**Exercises (4 total):**

**Easy (2):**
1. Bubble Sort - O(n²) time, O(1) space, stable
2. Selection Sort - O(n²) time, O(1) space, not stable

**Medium (2):**
3. Merge Sort - O(n log n) time, O(n) space, stable
4. Quick Sort - O(n log n) average, O(n²) worst, O(log n) space, not stable

**Test Coverage:**
- Empty array
- Single element
- Already sorted
- Reverse sorted
- All duplicates
- Random order
- Verify stability for stable sorts

### 6. Searching Algorithms

**Concepts:**
- Linear search vs binary search
- Prerequisites for binary search
- Search variants

**Exercises (5 total):**

**Easy (2):**
1. Linear Search - O(n) time, O(1) space
2. Binary Search - O(log n) time, O(1) space iterative

**Medium (2):**
3. Search in Rotated Sorted Array - Modified binary search
4. Find Peak Element - Element greater than neighbors

**Hard (1):**
5. Median of Two Sorted Arrays - O(log(min(m,n))) solution

**Test Coverage:**
- Element not present
- Element at start/middle/end
- Single element
- Two elements
- Large arrays

### 7. Dynamic Programming

**Concepts:**
- Memoization (top-down)
- Tabulation (bottom-up)
- State definition
- Recurrence relations

**Exercises (6 total):**

**Easy (2):**
1. Fibonacci Number - Classic DP introduction
2. Climbing Stairs - Ways to climb n stairs (1 or 2 steps)

**Medium (3):**
3. Coin Change - Minimum coins to make amount
4. Longest Common Subsequence - LCS of two strings
5. House Robber - Max money without adjacent houses

**Hard (1):**
6. Edit Distance - Minimum operations to convert strings

**Test Coverage:**
- Base cases (n=0, n=1)
- Small inputs
- Impossible cases
- Empty strings
- Large inputs for efficiency verification

### 8. Graph Traversal

**Concepts:**
- Graph representations (adjacency list, adjacency matrix)
- BFS vs DFS
- Shortest path algorithms
- Topological sorting

**Graph Representation:**
- Java: `Map<Integer, List<Integer>>` or custom Graph class
- Python: `dict[int, list[int]]` or custom Graph class
- Rust: `HashMap<i32, Vec<i32>>` or custom struct

**Exercises (6 total):**

**Easy (2):**
1. Depth-First Search - Traverse using DFS, return visited order
2. Breadth-First Search - Traverse using BFS, return visited order

**Medium (3):**
3. Number of Islands - Count connected components in 2D grid
4. Course Schedule - Detect cycle (topological sort)
5. Clone Graph - Deep copy a graph

**Hard (1):**
6. Dijkstra's Algorithm - Shortest path with priority queue

**Test Coverage:**
- Empty graph
- Single node
- Disconnected graphs
- Cyclic graphs
- Self-loops
- Large graphs

### 9. Big O Analysis

**Concepts:**
- Time complexity analysis
- Space complexity analysis
- Best/average/worst case
- Common complexities: O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ)

**Format:** Analysis exercises with code snippets

**Exercises (5 total):**
1. Simple Loops - Single loop, nested loops analysis
2. Recursive Functions - Fibonacci, factorial analysis
3. Divide and Conquer - Binary search, merge sort analysis
4. Hash Table Operations - Average vs worst case
5. Graph Algorithms - BFS/DFS with V vertices, E edges

**Implementation:**
- Provide code snippets with complexity analysis questions
- Test files can be quiz-style
- README contains detailed explanations

### 10. Design Patterns

**Concepts:**
- Creational, Structural, Behavioral patterns
- When to use each pattern

**Exercises (6 patterns):**

**Creational (2):**
1. Singleton - Thread-safe, single instance
2. Factory - Create objects without specifying class

**Structural (2):**
3. Decorator - Add behavior dynamically
4. Adapter - Make incompatible interfaces work together

**Behavioral (2):**
5. Observer - One-to-many dependency (publish-subscribe)
6. Strategy - Encapsulate interchangeable algorithms

**Test Coverage:**
- Singleton: Same instance returned
- Factory: Correct object types created
- Decorator: Behaviors stack correctly
- Adapter: Interface compatibility
- Observer: Notifications to all observers
- Strategy: Algorithms swappable at runtime

### 11. Concurrency

**Concepts:**
- Threads vs processes
- Race conditions
- Synchronization mechanisms
- Thread-safe data structures

**Language-Specific:**
- Java: `Thread`, `Runnable`, `synchronized`, `ExecutorService`
- Python: `threading`, `Queue`, `Lock`, `asyncio`
- Rust: `std::thread`, `Arc`, `Mutex`, `async/await`

**Exercises (5 total):**

**Easy (2):**
1. Create and Run Threads - Start multiple threads
2. Thread Joining - Wait for completion

**Medium (2):**
3. Producer-Consumer - Use queue pattern
4. Thread-Safe Counter - Increment from multiple threads

**Hard (1):**
5. Dining Philosophers - Avoid deadlock

**Test Coverage:**
- Verify correct output
- Check for race conditions
- Verify synchronization
- Test with varying thread counts

**Note:** Some tests may be non-deterministic; verify invariants hold.

### 12. System Design

**Concepts:**
- Scalability
- Load balancing
- Caching strategies
- Database design
- CAP theorem
- Microservices vs monolith

**Format:** Case studies with discussion prompts (not traditional coding exercises)

**Exercises (5 case studies):**
1. URL Shortener - Requirements, schema, API, scalability
2. Social Media Feed - Fan-out strategies, caching
3. Rate Limiter - Token bucket, leaking bucket, fixed window
4. Key-Value Store - Data structures, persistence, replication
5. File Storage System - Chunking, deduplication, sync

**Deliverables:**
- `<topic>_design.md` - Problem statement and design template
- `<topic>_discussion.md` - Discussion questions
- Optional: Basic prototype implementation

## Notes for Claude Code

- All exercises use a template-only approach (no solution files provided)
- Each exercise should have corresponding test files
- Intermediate depth for data structures (include variants like doubly-linked lists, balanced trees)
- This is a learning environment - prioritize clarity and educational value over production-level optimization
- While building projects, do not build and test exercises 
- If the user asks you to act as a teacher, load the TEACHER_PROMPT.MD as the prompt