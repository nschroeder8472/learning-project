# Graph Traversal Algorithms

## Concept

Graph traversal algorithms are fundamental techniques for exploring vertices and edges in a graph. These algorithms form the basis for solving many complex problems including pathfinding, connectivity, cycle detection, and topological sorting.

## Key Concepts

### Graph Representation
Graphs can be represented in multiple ways:
- **Adjacency List**: Map where each vertex maps to a list of its neighbors (most common)
- **Adjacency Matrix**: 2D array where matrix[i][j] indicates edge from i to j
- **Edge List**: List of all edges as (source, destination) pairs

### Depth-First Search (DFS)
- **Approach**: Explore as far as possible along each branch before backtracking
- **Implementation**: Can use recursion (implicit stack) or explicit stack
- **Best Use**: Finding paths, cycle detection, topological sort

### Breadth-First Search (BFS)
- **Approach**: Explore all vertices at current depth before moving to next depth
- **Implementation**: Uses a queue
- **Best Use**: Shortest path in unweighted graphs, level-order traversal

### Shortest Path Algorithms
- **Dijkstra's Algorithm**: Finds shortest path in weighted graphs (non-negative weights)
- **Uses a priority queue** to always process the nearest unvisited vertex

## Common Operations & Complexity

| Algorithm | Time Complexity | Space Complexity | Use Case |
|-----------|----------------|------------------|-----------|
| DFS (Adjacency List) | O(V + E) | O(V) | Path finding, cycle detection |
| BFS (Adjacency List) | O(V + E) | O(V) | Shortest path (unweighted) |
| Dijkstra's | O((V + E) log V) | O(V) | Shortest path (weighted) |
| Topological Sort | O(V + E) | O(V) | Dependency resolution |

*V = number of vertices, E = number of edges*

## Exercises

### Easy
1. **ex1_DepthFirstSearch** - Traverse graph using DFS, return visited order
2. **ex2_BreadthFirstSearch** - Traverse graph using BFS, return visited order

### Medium
3. **ex3_NumberOfIslands** - Count connected components in 2D grid
4. **ex4_CourseSchedule** - Detect cycle in directed graph (topological sort)
5. **ex5_CloneGraph** - Deep copy a graph

### Hard
6. **ex6_DijkstraAlgorithm** - Find shortest path in weighted graph

## Hints

1. **DFS**: Use recursion or a stack. Mark vertices as visited to avoid cycles. Process vertex, then recursively visit unvisited neighbors.
2. **BFS**: Use a queue. Start with source vertex, enqueue it. While queue not empty: dequeue, process, enqueue unvisited neighbors.
3. **Number of Islands**: Treat as a grid graph. For each unvisited land cell, do DFS/BFS to mark entire island, increment count.
4. **Course Schedule**: Build dependency graph. Use DFS to detect cycles (if you visit a node currently in recursion stack, cycle exists).
5. **Clone Graph**: Use HashMap to map original nodes to cloned nodes. DFS/BFS through graph, creating clones and copying edges.
6. **Dijkstra's Algorithm**: Use priority queue (min heap). Start with source at distance 0. Pop closest vertex, update distances to neighbors, add to queue.

## Testing Your Implementation

Run all graph traversal tests:
```bash
./gradlew test --tests "com.learning.algorithms.graphtraversal.*"
```

Run specific test:
```bash
./gradlew test --tests "com.learning.algorithms.graphtraversal.ex1DepthFirstSearchTest"
```
