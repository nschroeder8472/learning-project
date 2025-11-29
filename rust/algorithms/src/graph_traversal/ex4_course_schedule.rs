/// Exercise 4: Course Schedule (Cycle Detection)
/// Difficulty: Medium
///
/// There are a total of num_courses courses labeled from 0 to num_courses - 1.
/// You are given a vector prerequisites where prerequisites[i] = [ai, bi]
/// indicates that you must take course bi before course ai.
///
/// Return true if you can finish all courses, false otherwise.
/// (This is equivalent to detecting if the course dependency graph has a cycle)
///
/// # Examples
///
/// ```
/// use algorithms::graph_traversal::ex4_course_schedule::can_finish;
///
/// assert_eq!(can_finish(2, &vec![vec![1, 0]]), true);
/// assert_eq!(can_finish(2, &vec![vec![1, 0], vec![0, 1]]), false);
/// ```
///
/// Time Complexity: O(V + E) where V is courses and E is prerequisites
/// Space Complexity: O(V + E) for the graph and recursion stack

use std::collections::{HashMap, HashSet};

/// Determines if all courses can be completed given the prerequisites.
///
/// # Arguments
///
/// * `num_courses` - Total number of courses
/// * `prerequisites` - Vector of [course, prerequisite] pairs
///
/// # Returns
///
/// true if all courses can be completed, false if there's a cycle
pub fn can_finish(num_courses: i32, prerequisites: &Vec<Vec<i32>>) -> bool {
    // TODO: Implement cycle detection using DFS
    // Hint: Build adjacency list from prerequisites
    // Hint: Use DFS with three states: unvisited, visiting (in current path), visited
    // Hint: If you encounter a node in "visiting" state, there's a cycle
    unimplemented!("Not implemented yet")
}

/// Helper function to detect cycle using DFS.
/// Returns true if cycle is detected.
fn has_cycle_dfs(
    graph: &HashMap<i32, Vec<i32>>,
    course: i32,
    visiting: &mut HashSet<i32>,
    visited: &mut HashSet<i32>,
) -> bool {
    // TODO: Implement cycle detection DFS
    // Hint: If course is in visiting set, cycle detected
    // Hint: If course is in visited set, already processed, no cycle from here
    // Hint: Add to visiting, check all neighbors, then move to visited
    unimplemented!("Not implemented yet")
}

/// Returns a valid course order if possible, empty vector if impossible.
/// This is topological sorting.
///
/// # Arguments
///
/// * `num_courses` - Total number of courses
/// * `prerequisites` - Vector of [course, prerequisite] pairs
///
/// # Returns
///
/// Vector representing valid course order, empty if impossible
pub fn find_order(num_courses: i32, prerequisites: &Vec<Vec<i32>>) -> Vec<i32> {
    // TODO: Implement topological sort
    // Hint: Use DFS and add courses to result in reverse order of completion
    // Hint: Return empty vector if cycle is detected
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_simple_valid_schedule() {
        let prerequisites = vec![vec![1, 0]];
        assert_eq!(can_finish(2, &prerequisites), true);
    }

    #[test]
    fn test_simple_cycle() {
        let prerequisites = vec![vec![1, 0], vec![0, 1]];
        assert_eq!(can_finish(2, &prerequisites), false);
    }

    #[test]
    fn test_no_prerequisites() {
        let prerequisites = vec![];
        assert_eq!(can_finish(3, &prerequisites), true);
    }

    #[test]
    fn test_complex_valid_schedule() {
        let prerequisites = vec![vec![1, 0], vec![2, 0], vec![3, 1], vec![3, 2]];
        assert_eq!(can_finish(4, &prerequisites), true);
    }

    #[test]
    fn test_large_cycle() {
        let prerequisites = vec![vec![1, 0], vec![2, 1], vec![3, 2], vec![0, 3]];
        assert_eq!(can_finish(4, &prerequisites), false);
    }

    #[test]
    fn test_self_loop() {
        let prerequisites = vec![vec![0, 0]];
        assert_eq!(can_finish(2, &prerequisites), false);
    }

    #[test]
    fn test_find_order_valid() {
        let prerequisites = vec![vec![1, 0], vec![2, 0], vec![3, 1], vec![3, 2]];
        let order = find_order(4, &prerequisites);
        assert_eq!(order.len(), 4);

        let mut pos = HashMap::new();
        for (i, &course) in order.iter().enumerate() {
            pos.insert(course, i);
        }
        assert!(pos[&0] < pos[&1]);
        assert!(pos[&0] < pos[&2]);
        assert!(pos[&1] < pos[&3]);
        assert!(pos[&2] < pos[&3]);
    }

    #[test]
    fn test_find_order_with_cycle() {
        let prerequisites = vec![vec![1, 0], vec![0, 1]];
        let order = find_order(2, &prerequisites);
        assert_eq!(order.len(), 0);
    }
}
