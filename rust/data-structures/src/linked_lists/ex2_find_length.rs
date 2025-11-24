/// Exercise: Find Length (Easy)
///
/// Given the head of a singly linked list, return the number of nodes in the list.
///
/// Example:
/// Input: 1 -> 2 -> 3 -> 4 -> None
/// Output: 4
///
/// Example:
/// Input: None
/// Output: 0
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(1)

use super::list_node::ListNode;

pub fn find_length(head: &Option<Box<ListNode>>) -> usize {
    // TODO: Implement this function
    // Hint: Traverse the list and count the nodes
    // Handle the empty list case (None)
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_list() {
        assert_eq!(find_length(&None), 0);
    }

    #[test]
    fn test_single_node() {
        let head = Some(Box::new(ListNode::new(1)));
        assert_eq!(find_length(&head), 1);
    }

    #[test]
    fn test_two_nodes() {
        let head = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::new(2))),
        )));
        assert_eq!(find_length(&head), 2);
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
        assert_eq!(find_length(&head), 5);
    }
}
