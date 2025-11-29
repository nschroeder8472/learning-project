/// Exercise 2: Breadth-First Search (BFS)
/// Difficulty: Easy
///
/// Implement breadth-first search to traverse a graph and return vertices in the order visited.
/// BFS explores all vertices at the current depth before moving to vertices at the next depth.
///
/// Graph representation: HashMap where keys are vertices and values are vectors of neighbors
///
/// # Examples
///
/// ```
/// use std::collections::HashMap;
/// use algorithms::graph_traversal::ex2_breadth_first_search::bfs;
///
/// let mut graph = HashMap::new();
/// graph.insert(0, vec![1, 2]);
/// graph.insert(1, vec![3]);
/// graph.insert(2, vec![3]);
/// graph.insert(3, vec![]);
///
/// let result = bfs(&graph, 0);
/// assert_eq!(result, vec![0, 1, 2, 3]);
/// ```
///
/// Time Complexity: O(V + E) where V is vertices and E is edges
/// Space Complexity: O(V) for the visited set and queue

use std::collections::{HashMap, HashSet, VecDeque};

/// Performs BFS traversal on the graph starting from the given vertex.
/// Returns the vertices in the order they were visited.
///
/// # Arguments
///
/// * `graph` - The graph represented as an adjacency list
/// * `start` - The starting vertex
///
/// # Returns
///
/// Vector of vertices in BFS order
pub fn bfs(graph: &HashMap<i32, Vec<i32>>, start: i32) -> Vec<i32> {
    // TODO: Implement BFS using a queue (VecDeque)
    // Hint: Use a VecDeque for vertices to visit and a HashSet for visited vertices
    // Hint: Process vertex when dequeuing, add unvisited neighbors to queue
    unimplemented!("Not implemented yet")
}

/// Performs BFS and returns the shortest distance from start to each vertex.
/// Returns a HashMap of vertex -> distance.
///
/// # Arguments
///
/// * `graph` - The graph represented as an adjacency list
/// * `start` - The starting vertex
///
/// # Returns
///
/// HashMap mapping each reachable vertex to its distance from start
pub fn bfs_with_distance(graph: &HashMap<i32, Vec<i32>>, start: i32) -> HashMap<i32, i32> {
    // TODO: Implement BFS that tracks distance
    // Hint: Maintain a distance HashMap, initialize start with 0
    // Hint: When visiting neighbors, set distance as current distance + 1
    unimplemented!("Not implemented yet")
}

/// Performs BFS to find the shortest path from start to target.
/// Returns the path as a vector of vertices.
///
/// # Arguments
///
/// * `graph` - The graph represented as an adjacency list
/// * `start` - The starting vertex
/// * `target` - The target vertex
///
/// # Returns
///
/// Vector representing path from start to target, empty if no path exists
pub fn bfs_shortest_path(graph: &HashMap<i32, Vec<i32>>, start: i32, target: i32) -> Vec<i32> {
    // TODO: Implement BFS to find shortest path
    // Hint: Track parent of each vertex during BFS
    // Hint: Reconstruct path by backtracking from target to start using parent HashMap
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_simple_graph() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1, 2]);
        graph.insert(1, vec![3]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let result = bfs(&graph, 0);
        assert_eq!(result, vec![0, 1, 2, 3]);
    }

    #[test]
    fn test_linear_graph() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1]);
        graph.insert(1, vec![2]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let result = bfs(&graph, 0);
        assert_eq!(result, vec![0, 1, 2, 3]);
    }

    #[test]
    fn test_single_node() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![]);

        let result = bfs(&graph, 0);
        assert_eq!(result, vec![0]);
    }

    #[test]
    fn test_multi_level_graph() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1, 2]);
        graph.insert(1, vec![3, 4]);
        graph.insert(2, vec![5]);
        graph.insert(3, vec![]);
        graph.insert(4, vec![]);
        graph.insert(5, vec![]);

        let result = bfs(&graph, 0);
        assert_eq!(result, vec![0, 1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_bfs_with_distance() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1, 2]);
        graph.insert(1, vec![3]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let distances = bfs_with_distance(&graph, 0);
        assert_eq!(distances[&0], 0);
        assert_eq!(distances[&1], 1);
        assert_eq!(distances[&2], 1);
        assert_eq!(distances[&3], 2);
    }

    #[test]
    fn test_bfs_distance_disconnected() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1]);
        graph.insert(1, vec![]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let distances = bfs_with_distance(&graph, 0);
        assert_eq!(distances[&0], 0);
        assert_eq!(distances[&1], 1);
        assert!(!distances.contains_key(&2));
        assert!(!distances.contains_key(&3));
    }

    #[test]
    fn test_shortest_path() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1, 2]);
        graph.insert(1, vec![3]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let path = bfs_shortest_path(&graph, 0, 3);
        assert_eq!(path[0], 0);
        assert_eq!(path[path.len() - 1], 3);
        assert_eq!(path.len(), 3);
    }

    #[test]
    fn test_shortest_path_no_path() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1]);
        graph.insert(1, vec![]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let path = bfs_shortest_path(&graph, 0, 3);
        assert!(path.is_empty());
    }

    #[test]
    fn test_shortest_path_same_node() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1, 2]);
        graph.insert(1, vec![]);
        graph.insert(2, vec![]);

        let path = bfs_shortest_path(&graph, 0, 0);
        assert_eq!(path, vec![0]);
    }
}
