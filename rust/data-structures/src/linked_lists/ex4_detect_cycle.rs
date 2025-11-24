/// Exercise: Detect Cycle (Medium)
///
/// Given the head of a linked list, determine if the list has a cycle in it.
/// A cycle exists if a node can be reached again by continuously following the next pointer.
///
/// Note: This exercise is challenging in Rust due to ownership rules.
/// In practice, you would use Rc<RefCell<>> for cycles, but for learning purposes,
/// we'll skip the actual implementation and focus on the algorithm concept.
///
/// Example 1:
/// Input: 1 -> 2 -> 3 -> 4 -> 2 (cycle back to node 2)
/// Output: true
///
/// Example 2:
/// Input: 1 -> 2 -> 3 -> None
/// Output: false
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(1)

use super::list_node::ListNode;

pub fn has_cycle(head: &Option<Box<ListNode>>) -> bool {
    // TODO: Implement this function
    // Hint: Use Floyd's "tortoise and hare" algorithm
    // Two pointers: slow moves 1 step, fast moves 2 steps
    // If they meet, there's a cycle; if fast reaches None, no cycle
    //
    // Note: Creating cycles in safe Rust with Box is not straightforward.
    // This function can work with references, but testing cycles requires unsafe code
    // or using Rc<RefCell<>>. For this exercise, implement the algorithm assuming
    // you can traverse with references.
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_list() {
        assert_eq!(has_cycle(&None), false);
    }

    #[test]
    fn test_single_node_no_cycle() {
        let head = Some(Box::new(ListNode::new(1)));
        assert_eq!(has_cycle(&head), false);
    }

    #[test]
    fn test_no_cycle() {
        let head = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::with_next(
                2,
                Some(Box::new(ListNode::with_next(
                    3,
                    Some(Box::new(ListNode::new(4))),
                ))),
            ))),
        )));
        assert_eq!(has_cycle(&head), false);
    }

    // Note: Creating actual cycles in tests would require Rc<RefCell<>> or unsafe code
    // These tests verify the no-cycle case works correctly
}
