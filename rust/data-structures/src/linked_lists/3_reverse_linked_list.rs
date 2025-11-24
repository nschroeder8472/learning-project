/// Exercise: Reverse Linked List (Medium)
///
/// Given the head of a singly linked list, reverse the list in-place and return the new head.
///
/// Example:
/// Input: 1 -> 2 -> 3 -> 4 -> None
/// Output: 4 -> 3 -> 2 -> 1 -> None
///
/// Example:
/// Input: None
/// Output: None
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(1) - in-place reversal

use super::list_node::ListNode;

pub fn reverse(head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
    // TODO: Implement this function
    // Hint: Use Option::take() to move ownership
    // Keep track of previous node as you traverse
    // Reverse the direction of each link
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_list() {
        assert_eq!(reverse(None), None);
    }

    #[test]
    fn test_single_node() {
        let head = Some(Box::new(ListNode::new(1)));
        let result = reverse(head);
        assert!(result.is_some());
        assert_eq!(result.as_ref().unwrap().val, 1);
        assert!(result.as_ref().unwrap().next.is_none());
    }

    #[test]
    fn test_two_nodes() {
        let head = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::new(2))),
        )));
        let result = reverse(head);
        assert_eq!(result.as_ref().unwrap().val, 2);
        assert_eq!(result.as_ref().unwrap().next.as_ref().unwrap().val, 1);
        assert!(result.as_ref().unwrap().next.as_ref().unwrap().next.is_none());
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
        let result = reverse(head);

        // Verify reversed order: 5 -> 4 -> 3 -> 2 -> 1
        let mut current = result.as_ref();
        let expected = vec![5, 4, 3, 2, 1];
        for &val in &expected {
            assert!(current.is_some());
            assert_eq!(current.unwrap().val, val);
            current = current.unwrap().next.as_ref();
        }
        assert!(current.is_none());
    }
}
