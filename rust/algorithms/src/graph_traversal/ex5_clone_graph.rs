/// Exercise 5: Clone Graph
/// Difficulty: Medium
///
/// Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
/// Each node in the graph contains a value and a list of its neighbors.
///
/// # Examples
///
/// ```
/// use algorithms::graph_traversal::ex5_clone_graph::{Node, clone_graph};
/// use std::rc::Rc;
/// use std::cell::RefCell;
///
/// let node1 = Rc::new(RefCell::new(Node::new(1)));
/// let node2 = Rc::new(RefCell::new(Node::new(2)));
/// node1.borrow_mut().neighbors.push(Rc::clone(&node2));
/// node2.borrow_mut().neighbors.push(Rc::clone(&node1));
///
/// let cloned = clone_graph(Some(Rc::clone(&node1)));
/// assert!(cloned.is_some());
/// ```
///
/// Time Complexity: O(V + E) - visit each vertex and edge once
/// Space Complexity: O(V) - for the HashMap storing cloned nodes

use std::cell::RefCell;
use std::collections::HashMap;
use std::rc::Rc;

/// Definition for a graph node.
#[derive(Debug)]
pub struct Node {
    pub val: i32,
    pub neighbors: Vec<Rc<RefCell<Node>>>,
}

impl Node {
    pub fn new(val: i32) -> Self {
        Node {
            val,
            neighbors: vec![],
        }
    }
}

/// Creates a deep copy of the graph using DFS.
///
/// # Arguments
///
/// * `node` - Reference to a node in the graph
///
/// # Returns
///
/// Reference to the cloned node
pub fn clone_graph(node: Option<Rc<RefCell<Node>>>) -> Option<Rc<RefCell<Node>>> {
    // TODO: Implement graph cloning using DFS
    // Hint: Use a HashMap to map original nodes (by value) to cloned nodes
    // Hint: For each node: create clone, then recursively clone neighbors
    // Hint: Check HashMap before cloning to avoid infinite loops
    unimplemented!("Not implemented yet")
}

/// Helper function for DFS-based cloning.
fn clone_dfs(
    node: Rc<RefCell<Node>>,
    cloned: &mut HashMap<i32, Rc<RefCell<Node>>>,
) -> Rc<RefCell<Node>> {
    // TODO: Implement DFS helper for cloning
    // Hint: Check if node already cloned (in map), return the clone if so
    // Hint: Create new node, add to map, then clone all neighbors
    unimplemented!("Not implemented yet")
}

/// Creates a deep copy of the graph using BFS.
///
/// # Arguments
///
/// * `node` - Reference to a node in the graph
///
/// # Returns
///
/// Reference to the cloned node
pub fn clone_graph_bfs(node: Option<Rc<RefCell<Node>>>) -> Option<Rc<RefCell<Node>>> {
    // TODO: Implement graph cloning using BFS
    // Hint: Use a VecDeque for BFS and HashMap for original->clone mapping
    // Hint: First clone the nodes, then clone the edges (neighbor connections)
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_single_node() {
        let node = Rc::new(RefCell::new(Node::new(1)));
        let cloned = clone_graph(Some(Rc::clone(&node)));

        assert!(cloned.is_some());
        let cloned = cloned.unwrap();
        assert_eq!(cloned.borrow().val, 1);
        assert!(cloned.borrow().neighbors.is_empty());
    }

    #[test]
    fn test_two_connected_nodes() {
        let node1 = Rc::new(RefCell::new(Node::new(1)));
        let node2 = Rc::new(RefCell::new(Node::new(2)));
        node1.borrow_mut().neighbors.push(Rc::clone(&node2));
        node2.borrow_mut().neighbors.push(Rc::clone(&node1));

        let cloned = clone_graph(Some(Rc::clone(&node1)));

        assert!(cloned.is_some());
        let cloned = cloned.unwrap();
        assert_eq!(cloned.borrow().val, 1);
        assert_eq!(cloned.borrow().neighbors.len(), 1);

        let cloned_neighbor = &cloned.borrow().neighbors[0];
        assert_eq!(cloned_neighbor.borrow().val, 2);
        assert_eq!(cloned_neighbor.borrow().neighbors.len(), 1);
    }

    #[test]
    fn test_null_graph() {
        let cloned = clone_graph(None);
        assert!(cloned.is_none());
    }

    #[test]
    fn test_graph_with_self_loop() {
        let node = Rc::new(RefCell::new(Node::new(1)));
        node.borrow_mut().neighbors.push(Rc::clone(&node));

        let cloned = clone_graph(Some(Rc::clone(&node)));

        assert!(cloned.is_some());
        let cloned = cloned.unwrap();
        assert_eq!(cloned.borrow().val, 1);
        assert_eq!(cloned.borrow().neighbors.len(), 1);
    }

    #[test]
    fn test_triangle_graph() {
        let node1 = Rc::new(RefCell::new(Node::new(1)));
        let node2 = Rc::new(RefCell::new(Node::new(2)));
        let node3 = Rc::new(RefCell::new(Node::new(3)));

        node1
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node2));
        node1
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node3));
        node2
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node1));
        node2
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node3));
        node3
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node1));
        node3
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node2));

        let cloned = clone_graph(Some(Rc::clone(&node1)));

        assert!(cloned.is_some());
        let cloned = cloned.unwrap();
        assert_eq!(cloned.borrow().val, 1);
        assert_eq!(cloned.borrow().neighbors.len(), 2);
    }

    #[test]
    fn test_bfs_clone() {
        let node1 = Rc::new(RefCell::new(Node::new(1)));
        let node2 = Rc::new(RefCell::new(Node::new(2)));
        let node3 = Rc::new(RefCell::new(Node::new(3)));

        node1
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node2));
        node1
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node3));
        node2
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node1));
        node3
            .borrow_mut()
            .neighbors
            .push(Rc::clone(&node1));

        let cloned = clone_graph_bfs(Some(Rc::clone(&node1)));

        assert!(cloned.is_some());
        let cloned = cloned.unwrap();
        assert_eq!(cloned.borrow().val, 1);
        assert_eq!(cloned.borrow().neighbors.len(), 2);
    }

    #[test]
    fn test_bfs_null() {
        let cloned = clone_graph_bfs(None);
        assert!(cloned.is_none());
    }
}
