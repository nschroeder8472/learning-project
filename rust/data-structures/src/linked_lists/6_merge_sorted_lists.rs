/// Exercise: Merge Two Sorted Lists (Hard)
///
/// Given the heads of two sorted linked lists, merge them into one sorted linked list.
/// The merged list should be made by splicing together the nodes of the two lists.
///
/// Example:
/// Input: list1 = 1 -> 3 -> 5 -> None, list2 = 2 -> 4 -> 6 -> None
/// Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> None
///
/// Example:
/// Input: list1 = None, list2 = 1 -> 2 -> None
/// Output: 1 -> 2 -> None
///
/// Time Complexity: O(n + m) where n and m are the lengths of the two lists
/// Space Complexity: O(1) - only using pointers, no new nodes created

use super::list_node::ListNode;

pub fn merge(
    list1: Option<Box<ListNode>>,
    list2: Option<Box<ListNode>>,
) -> Option<Box<ListNode>> {
    // TODO: Implement this function
    // Hint: Use pattern matching to compare values from both lists
    // Take the smaller value and recurse or iterate
    // This can be done recursively or iteratively
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_both_empty() {
        assert_eq!(merge(None, None), None);
    }

    #[test]
    fn test_first_empty() {
        let list2 = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::new(2))),
        )));
        let result = merge(None, list2);
        assert_eq!(result.as_ref().unwrap().val, 1);
        assert_eq!(result.as_ref().unwrap().next.as_ref().unwrap().val, 2);
    }

    #[test]
    fn test_second_empty() {
        let list1 = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::new(2))),
        )));
        let result = merge(list1, None);
        assert_eq!(result.as_ref().unwrap().val, 1);
        assert_eq!(result.as_ref().unwrap().next.as_ref().unwrap().val, 2);
    }

    #[test]
    fn test_basic_merge() {
        let list1 = Some(Box::new(ListNode::with_next(
            1,
            Some(Box::new(ListNode::with_next(
                3,
                Some(Box::new(ListNode::new(5))),
            ))),
        )));
        let list2 = Some(Box::new(ListNode::with_next(
            2,
            Some(Box::new(ListNode::with_next(
                4,
                Some(Box::new(ListNode::new(6))),
            ))),
        )));
        let result = merge(list1, list2);

        // Verify: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        let mut current = result.as_ref();
        let expected = vec![1, 2, 3, 4, 5, 6];
        for &val in &expected {
            assert!(current.is_some());
            assert_eq!(current.unwrap().val, val);
            current = current.unwrap().next.as_ref();
        }
        assert!(current.is_none());
    }

    #[test]
    fn test_different_lengths() {
        let list1 = Some(Box::new(ListNode::new(1)));
        let list2 = Some(Box::new(ListNode::with_next(
            2,
            Some(Box::new(ListNode::with_next(
                3,
                Some(Box::new(ListNode::with_next(
                    4,
                    Some(Box::new(ListNode::new(5))),
                ))),
            ))),
        )));
        let result = merge(list1, list2);

        let mut current = result.as_ref();
        let expected = vec![1, 2, 3, 4, 5];
        for &val in &expected {
            assert!(current.is_some());
            assert_eq!(current.unwrap().val, val);
            current = current.unwrap().next.as_ref();
        }
    }
}
