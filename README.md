# Learning Project

A comprehensive multi-language repository for learning data structures, algorithms, and software engineering fundamentals through hands-on practice in Java, Python, and Rust.

## Overview

This project provides structured exercises ranging from easy to hard difficulty across key programming topics. Each exercise includes test files to verify your implementation, allowing you to practice and build confidence in core computer science concepts.

## Getting Started

### Prerequisites

- **Java**: JDK 11+ and Gradle (or use included Gradle wrapper)
- **Python**: Python 3.8+ and pip
- **Rust**: Latest stable Rust toolchain (install via [rustup](https://rustup.rs/))

### Setup

1. Clone this repository
2. Choose your language track (or do all three!)
3. Follow the setup instructions in CLAUDE.md for your chosen language
4. Start with the suggested learning path below

## Learning Path

### Recommended Progression

#### Phase 1: Foundations (Start Here)
1. **Arrays** - Master the fundamentals of contiguous memory structures
2. **Big O Analysis** - Learn to analyze time and space complexity
3. **Sorting Algorithms** - Understand comparison-based and divide-and-conquer approaches

#### Phase 2: Core Data Structures
4. **Linked Lists** - Practice pointer manipulation and dynamic structures
5. **Hash Tables** - Explore constant-time lookups and collision handling
6. **Searching Algorithms** - Binary search and its variants

#### Phase 3: Advanced Structures & Algorithms
7. **Trees** - BST operations, traversals, and balancing concepts
8. **Graph Traversal** - BFS, DFS, and shortest path algorithms
9. **Dynamic Programming** - Master memoization and optimal substructure

#### Phase 4: Software Engineering Practices
10. **Design Patterns** - Apply common solutions to recurring problems
11. **Concurrency** - Understand threading, synchronization, and async patterns
12. **System Design** - Learn to think about scalability and trade-offs

## Project Structure

```
learning-project/
├── java/               # Java implementations
├── python/             # Python implementations
└── rust/               # Rust implementations
    ├── data-structures/
    │   ├── arrays/
    │   ├── linked-lists/
    │   ├── trees/
    │   └── hash-tables/
    ├── algorithms/
    │   ├── sorting/
    │   ├── searching/
    │   ├── dynamic-programming/
    │   └── graph-traversal/
    ├── big-o-analysis/
    ├── design-patterns/
    ├── concurrency/
    └── system-design/
```

## How to Use This Repository

1. **Pick a Topic**: Start with Arrays or follow the recommended learning path
2. **Read the README**: Each topic folder has a README explaining the concepts
3. **Implement the Exercises**: Open the exercise files and fill in the TODOs
4. **Run the Tests**: Verify your implementation with the provided test files
5. **Compare Across Languages**: Try the same problem in different languages to see language-specific approaches

## Using Claude Code as Your Teacher

This repository is designed to work with [Claude Code](https://claude.ai/code) in teacher mode. When you're working through exercises and need guidance:

**To activate teacher mode**, simply tell Claude:
> "Act as my teacher" or "Help me as a teacher"

**What to expect in teacher mode:**
- Claude will guide you without giving direct solutions
- You'll be encouraged to try solving problems yourself first
- When you find a solution, Claude will help you understand if it's optimal
- You'll be asked to explain your solutions to reinforce learning
- Claude will suggest which problems to tackle next based on your progress

**Teacher mode is ideal for:**
- Getting hints when you're stuck without spoiling the solution
- Understanding why your solution works (or doesn't)
- Learning the optimal approach after solving a problem
- Building problem-solving skills through guided practice

This approach helps you truly learn the concepts rather than just copying solutions.

## Exercise Difficulty Levels

- **Easy**: Fundamental operations, basic traversals, simple implementations
- **Medium**: Optimization challenges, edge cases, combining multiple concepts
- **Hard**: Advanced algorithms, complex optimizations, real-world applications

## Topics Covered

### Data Structures
- **Arrays**: Manipulation, rotation, sliding windows
- **Linked Lists**: Singly, doubly-linked, cycle detection, reversals
- **Trees**: BST operations, traversals (inorder, preorder, postorder, level-order), validation
- **Hash Tables**: Hash functions, collision handling, common patterns

### Algorithms
- **Sorting**: Bubble, Selection, Merge, Quick Sort
- **Searching**: Linear, Binary Search and variants
- **Dynamic Programming**: Fibonacci, LCS, Coin Change, Edit Distance
- **Graph Traversal**: BFS, DFS, Dijkstra, Topological Sort

### Additional Topics
- **Big O Analysis**: Understanding and analyzing algorithm complexity
- **Design Patterns**: Singleton, Factory, Observer, Strategy, Decorator, Builder
- **Concurrency**: Threading, synchronization, producer-consumer, async/await
- **System Design**: Scalability, trade-offs, distributed systems concepts

## Testing Your Solutions

See CLAUDE.md for language-specific testing commands. Each language uses its standard testing framework:
- **Java**: JUnit 5 with Gradle
- **Python**: pytest
- **Rust**: Cargo's built-in test framework

## Tips for Success

- Start with easier problems to build confidence
- Don't skip the tests - they're your feedback mechanism
- Try implementing the same problem in multiple languages
- Focus on understanding the "why" behind each data structure and algorithm
- Use Big O analysis to evaluate your solutions
- Revisit harder problems after learning new concepts

## Contributing

This is a personal learning repository, but feel free to adapt it for your own use!
