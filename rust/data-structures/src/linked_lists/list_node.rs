/// Node structure for singly linked list

#[derive(Debug, PartialEq, Eq)]
pub struct ListNode {
    pub val: i32,
    pub next: Option<Box<ListNode>>,
}

impl ListNode {
    /// Create a new node with the given value
    pub fn new(val: i32) -> Self {
        ListNode { val, next: None }
    }

    /// Create a new node with the given value and next pointer
    pub fn with_next(val: i32, next: Option<Box<ListNode>>) -> Self {
        ListNode { val, next }
    }
}
