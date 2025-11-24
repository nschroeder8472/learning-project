/// Exercise: Traverse and Print (Easy)
///
/// Given the head of a singly linked list, traverse the list and return all values in a vector.
///
/// Example:
/// Input: 1 -> 2 -> 3 -> 4 -> None
/// Output: vec![1, 2, 3, 4]
///
/// Time Complexity: O(n) where n is the number of nodes
/// Space Complexity: O(n) for the output vector

use super::list_node::ListNode;

pub fn traverse(head: Option<Box<ListNode>>) -> Vec<i32> {
    // TODO: Implement this function
    // Hint: Use pattern matching with Option to traverse until you reach None
    // Add each value to a vector
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_empty_list() {
        assert_eq!(traverse(None), vec![]);
    }

    #[test]
    fn test_single_node() {
        let head = Some(Box::new(ListNode::new(42)));
        assert_eq!(traverse(head), vec![42]);
    }

    #[test]
    fn test_multiple_nodes() {
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
        assert_eq!(traverse(head), vec![1, 2, 3, 4]);
    }

    #[test]
    fn test_two_nodes() {
        let head = Some(Box::new(ListNode::with_next(
            10,
            Some(Box::new(ListNode::new(20))),
        )));
        assert_eq!(traverse(head), vec![10, 20]);
    }

    #[test]
    fn test_negative_values() {
        let head = Some(Box::new(ListNode::with_next(
            -5,
            Some(Box::new(ListNode::with_next(
                -10,
                Some(Box::new(ListNode::new(-15))),
            ))),
        )));
        assert_eq!(traverse(head), vec![-5, -10, -15]);
    }
}
