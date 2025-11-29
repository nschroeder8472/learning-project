/// Exercise 1: Depth-First Search (DFS)
/// Difficulty: Easy
///
/// Implement depth-first search to traverse a graph and return vertices in the order visited.
/// DFS explores as far as possible along each branch before backtracking.
///
/// Graph representation: HashMap where keys are vertices and values are vectors of neighbors
///
/// # Examples
///
/// ```
/// use std::collections::HashMap;
/// use algorithms::graph_traversal::ex1_depth_first_search::dfs;
///
/// let mut graph = HashMap::new();
/// graph.insert(0, vec![1, 2]);
/// graph.insert(1, vec![3]);
/// graph.insert(2, vec![3]);
/// graph.insert(3, vec![]);
///
/// let result = dfs(&graph, 0);
/// assert_eq!(result.len(), 4);
/// assert_eq!(result[0], 0);
/// ```
///
/// Time Complexity: O(V + E) where V is vertices and E is edges
/// Space Complexity: O(V) for the visited set and recursion stack

use std::collections::{HashMap, HashSet};

/// Performs DFS traversal on the graph starting from the given vertex.
/// Returns the vertices in the order they were visited.
///
/// # Arguments
///
/// * `graph` - The graph represented as an adjacency list
/// * `start` - The starting vertex
///
/// # Returns
///
/// Vector of vertices in DFS order
pub fn dfs(graph: &HashMap<i32, Vec<i32>>, start: i32) -> Vec<i32> {
    // TODO: Implement DFS using recursion
    // Hint: Use a HashSet to track visited vertices and a Vec to store the result
    // Hint: For each unvisited neighbor, recursively call DFS
    unimplemented!("Not implemented yet")
}

/// Performs DFS traversal using an iterative approach with an explicit stack.
/// Returns the vertices in the order they were visited.
///
/// # Arguments
///
/// * `graph` - The graph represented as an adjacency list
/// * `start` - The starting vertex
///
/// # Returns
///
/// Vector of vertices in DFS order
pub fn dfs_iterative(graph: &HashMap<i32, Vec<i32>>, start: i32) -> Vec<i32> {
    // TODO: Implement DFS using a stack (Vec)
    // Hint: Push start vertex to stack, then while stack not empty:
    //       pop vertex, mark visited, push unvisited neighbors
    unimplemented!("Not implemented yet")
}

/// Helper function for recursive DFS.
fn dfs_helper(
    graph: &HashMap<i32, Vec<i32>>,
    vertex: i32,
    visited: &mut HashSet<i32>,
    result: &mut Vec<i32>,
) {
    // TODO: Implement the recursive helper
    // 1. Mark vertex as visited
    // 2. Add vertex to result
    // 3. For each neighbor, if not visited, recursively call dfs_helper
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

        let result = dfs(&graph, 0);
        assert_eq!(result.len(), 4);
        assert_eq!(result[0], 0);
        assert!(result.contains(&1));
        assert!(result.contains(&2));
        assert!(result.contains(&3));
    }

    #[test]
    fn test_linear_graph() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1]);
        graph.insert(1, vec![2]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let result = dfs(&graph, 0);
        assert_eq!(result, vec![0, 1, 2, 3]);
    }

    #[test]
    fn test_single_node() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![]);

        let result = dfs(&graph, 0);
        assert_eq!(result, vec![0]);
    }

    #[test]
    fn test_disconnected_from_start() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1]);
        graph.insert(1, vec![]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let result = dfs(&graph, 0);
        assert_eq!(result.len(), 2);
        assert!(result.contains(&0));
        assert!(result.contains(&1));
        assert!(!result.contains(&2));
        assert!(!result.contains(&3));
    }

    #[test]
    fn test_graph_with_cycle() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1]);
        graph.insert(1, vec![2]);
        graph.insert(2, vec![0, 3]);
        graph.insert(3, vec![]);

        let result = dfs(&graph, 0);
        assert_eq!(result.len(), 4);
        assert_eq!(result.iter().filter(|&&x| x == 0).count(), 1);
        assert_eq!(result.iter().filter(|&&x| x == 1).count(), 1);
    }

    #[test]
    fn test_iterative_dfs() {
        let mut graph = HashMap::new();
        graph.insert(0, vec![1, 2]);
        graph.insert(1, vec![3]);
        graph.insert(2, vec![3]);
        graph.insert(3, vec![]);

        let result = dfs_iterative(&graph, 0);
        assert_eq!(result.len(), 4);
        assert_eq!(result[0], 0);
        assert!(result.contains(&1));
        assert!(result.contains(&2));
        assert!(result.contains(&3));
    }

    #[test]
    fn test_iterative_single_node() {
        let mut graph = HashMap::new();
        graph.insert(5, vec![]);

        let result = dfs_iterative(&graph, 5);
        assert_eq!(result, vec![5]);
    }
}
