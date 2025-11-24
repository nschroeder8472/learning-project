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

## Notes for Claude Code

- All exercises use a template-only approach (no solution files provided)
- Each exercise should have corresponding test files
- Intermediate depth for data structures (include variants like doubly-linked lists, balanced trees)
- This is a learning environment - prioritize clarity and educational value over production-level optimization
- While building projects, do not build and test exercises 
