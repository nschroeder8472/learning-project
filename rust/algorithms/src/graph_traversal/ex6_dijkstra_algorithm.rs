/// Exercise 6: Dijkstra's Algorithm
/// Difficulty: Hard
///
/// Implement Dijkstra's algorithm to find the shortest path from a source vertex
/// to all other vertices in a weighted graph with non-negative edge weights.
///
/// Graph representation: HashMap where keys are vertices and values are vectors of (neighbor, weight) tuples
///
/// # Examples
///
/// ```
/// use std::collections::HashMap;
/// use algorithms::graph_traversal::ex6_dijkstra_algorithm::dijkstra;
///
/// let mut graph = HashMap::new();
/// graph.insert(0, vec![(1, 4), (2, 1)]);
/// graph.insert(1, vec![(3, 1)]);
/// graph.insert(2, vec![(1, 2), (3, 5)]);
/// graph.insert(3, vec![]);
///
/// let distances = dijkstra(&graph, 0);
/// assert_eq!(distances[&0], 0);
/// assert_eq!(distances[&1], 3);
/// assert_eq!(distances[&2], 1);
/// assert_eq!(distances[&3], 4);
/// ```
///
/// Time Complexity: O((V + E) log V) with priority queue
/// Space Complexity: O(V) for distances HashMap and priority queue

use std::cmp::Ordering;
use std::collections::{BinaryHeap, HashMap};

/// State for priority queue in Dijkstra's algorithm.
#[derive(Eq, PartialEq)]
struct State {
    vertex: i32,
    distance: i32,
}

impl Ord for State {
    fn cmp(&self, other: &Self) -> Ordering {
        // Reverse ordering for min-heap (BinaryHeap is max-heap by default)
        other.distance.cmp(&self.distance)
    }
}

impl PartialOrd for State {
    fn partial_cmp(&self, other: &Self) -> Option<Ordering> {
        Some(self.cmp(other))
    }
}

/// Computes shortest distances from source to all vertices using Dijkstra's algorithm.
///
/// # Arguments
///
/// * `graph` - The weighted graph as adjacency list (vertex -> [(neighbor, weight)])
/// * `source` - The source vertex
///
/// # Returns
///
/// HashMap mapping each vertex to its shortest distance from source
pub fn dijkstra(graph: &HashMap<i32, Vec<(i32, i32)>>, source: i32) -> HashMap<i32, i32> {
    // TODO: Implement Dijkstra's algorithm
    // Hint: Use BinaryHeap for priority queue (min heap) to always process nearest vertex
    // Hint: Initialize all distances to infinity except source (distance 0)
    // Hint: For each vertex, update distances to neighbors if shorter path found
    unimplemented!("Not implemented yet")
}

/// Finds the shortest path from source to target.
/// Returns the path as a vector of vertices.
///
/// # Arguments
///
/// * `graph` - The weighted graph as adjacency list
/// * `source` - The source vertex
/// * `target` - The target vertex
///
/// # Returns
///
/// Vector representing shortest path from source to target, empty if no path
pub fn dijkstra_path(graph: &HashMap<i32, Vec<(i32, i32)>>, source: i32, target: i32) -> Vec<i32> {
    // TODO: Implement Dijkstra's to find path
    // Hint: Track parent of each vertex while computing distances
    // Hint: Reconstruct path by backtracking from target to source
    unimplemented!("Not implemented yet")
}

/// Helper function to reconstruct path from parent HashMap.
fn reconstruct_path(parent: &HashMap<i32, i32>, source: i32, target: i32) -> Vec<i32> {
    // TODO: Reconstruct path from target to source using parent map
    // Hint: Start at target, follow parent pointers back to source, then reverse
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_simple_graph() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 4), (2, 1)]);
        graph.insert(1, vec![(3, 1)]);
        graph.insert(2, vec![(1, 2), (3, 5)]);
        graph.insert(3, vec![]);

        let distances = dijkstra(&graph, 0);

        assert_eq!(distances[&0], 0);
        assert_eq!(distances[&1], 3);
        assert_eq!(distances[&2], 1);
        assert_eq!(distances[&3], 4);
    }

    #[test]
    fn test_single_node() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![]);

        let distances = dijkstra(&graph, 0);
        assert_eq!(distances[&0], 0);
    }

    #[test]
    fn test_linear_graph() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 2)]);
        graph.insert(1, vec![(2, 3)]);
        graph.insert(2, vec![(3, 4)]);
        graph.insert(3, vec![]);

        let distances = dijkstra(&graph, 0);

        assert_eq!(distances[&0], 0);
        assert_eq!(distances[&1], 2);
        assert_eq!(distances[&2], 5);
        assert_eq!(distances[&3], 9);
    }

    #[test]
    fn test_multiple_paths() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 10), (2, 5)]);
        graph.insert(1, vec![(3, 1)]);
        graph.insert(2, vec![(1, 3), (3, 8)]);
        graph.insert(3, vec![]);

        let distances = dijkstra(&graph, 0);

        assert_eq!(distances[&0], 0);
        assert_eq!(distances[&1], 8);
        assert_eq!(distances[&2], 5);
        assert_eq!(distances[&3], 9);
    }

    #[test]
    fn test_disconnected_node() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 1)]);
        graph.insert(1, vec![]);
        graph.insert(2, vec![(3, 1)]);
        graph.insert(3, vec![]);

        let distances = dijkstra(&graph, 0);

        assert_eq!(distances[&0], 0);
        assert_eq!(distances[&1], 1);
        assert!(!distances.contains_key(&2));
        assert!(!distances.contains_key(&3));
    }

    #[test]
    fn test_shortest_path() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 4), (2, 1)]);
        graph.insert(1, vec![(3, 1)]);
        graph.insert(2, vec![(1, 2), (3, 5)]);
        graph.insert(3, vec![]);

        let path = dijkstra_path(&graph, 0, 3);

        assert_eq!(path[0], 0);
        assert_eq!(path[path.len() - 1], 3);
        assert_eq!(path.len(), 4);
    }

    #[test]
    fn test_path_to_self() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 1)]);
        graph.insert(1, vec![]);

        let path = dijkstra_path(&graph, 0, 0);
        assert_eq!(path, vec![0]);
    }

    #[test]
    fn test_no_path() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 1)]);
        graph.insert(1, vec![]);
        graph.insert(2, vec![(3, 1)]);
        graph.insert(3, vec![]);

        let path = dijkstra_path(&graph, 0, 3);
        assert!(path.is_empty());
    }

    #[test]
    fn test_larger_graph() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![(1, 7), (2, 9), (5, 14)]);
        graph.insert(1, vec![(0, 7), (2, 10), (3, 15)]);
        graph.insert(2, vec![(0, 9), (1, 10), (3, 11), (5, 2)]);
        graph.insert(3, vec![(1, 15), (2, 11), (4, 6)]);
        graph.insert(4, vec![(3, 6), (5, 9)]);
        graph.insert(5, vec![(0, 14), (2, 2), (4, 9)]);

        let distances = dijkstra(&graph, 0);

        assert_eq!(distances[&0], 0);
        assert_eq!(distances[&1], 7);
        assert_eq!(distances[&2], 9);
        assert_eq!(distances[&3], 20);
        assert_eq!(distances[&4], 20);
        assert_eq!(distances[&5], 11);
    }
}
