/// Exercise: Find Middle Node (Medium)
///
/// Given the head of a singly linked list, return the value of the middle node.
/// If there are two middle nodes (even number of nodes), return the second middle node's value.
///
/// Example 1:
/// Input: 1 -> 2 -> 3 -> 4 -> 5 -> None
/// Output: 3
///
/// Example 2:
/// Input: 1 -> 2 -> 3 -> 4 -> None
/// Output: 3 (the second middle)
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(1)

use super::list_node::ListNode;

pub fn find_middle(head: &Option<Box<ListNode>>) -> Option<i32> {
    // TODO: Implement this function
    // Hint: Use two pointers - slow and fast
    // Slow moves 1 step at a time, fast moves 2 steps
    // When fast reaches the end, slow will be at the middle
    // Return the value at the slow pointer
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_single_node() {
        let head = Some(Box::new(ListNode::new(1)));
        assert_eq!(find_middle(&head), Some(1));
    }

    #[test]
    fn test_two_nodes() {
        let head = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::new(2))),
        )));
        assert_eq!(find_middle(&head), Some(2)); // Second middle node
    }

    #[test]
    fn test_three_nodes() {
        let head = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::with_next(
                2,
                Some(Box::new(ListNode::new(3))),
            ))),
        )));
        assert_eq!(find_middle(&head), Some(2));
    }

    #[test]
    fn test_five_nodes() {
        let head = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::with_next(
                2,
                Some(Box::new(ListNode::with_next(
                    3,
                    Some(Box::new(ListNode::with_next(
                        4,
                        Some(Box::new(ListNode::new(5))),
                    ))),
                ))),
            ))),
        )));
        assert_eq!(find_middle(&head), Some(3));
    }

    #[test]
    fn test_four_nodes() {
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
        assert_eq!(find_middle(&head), Some(3)); // Second middle node
    }
}
