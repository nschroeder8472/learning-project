# Linked Lists

## Concept

A linked list is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence. Unlike arrays, linked lists do not require contiguous memory allocation and can grow dynamically.

**Note for Rust**: Implementing linked lists in Rust is notably more challenging than in garbage-collected languages due to ownership rules. We'll use `Box<Node>` for single ownership and `Option<Box<Node>>` for optional links.

### Key Characteristics
- **Dynamic size**: Can grow and shrink at runtime
- **Non-contiguous memory**: Nodes can be scattered in memory
- **O(n) access**: Must traverse from head to reach an element
- **O(1) insertion/deletion**: At known position (head or after a node)
- **Extra memory**: Each node requires additional space for pointer(s)

### Types of Linked Lists
- **Singly Linked List**: Each node has a reference to the next node
- **Doubly Linked List**: Each node has references to both next and previous nodes (requires `Rc` and `RefCell` in Rust)
- **Circular Linked List**: Last node points back to the first node

### Common Operations
- Access by index: O(n)
- Search: O(n)
- Insert at head: O(1)
- Insert at tail: O(n) for singly linked, O(1) with tail pointer
- Insert at position: O(n)
- Delete at head: O(1)
- Delete at position: O(n)

## Exercises

### Easy
1. **traverse_and_print** - Iterate through the list and collect all values
2. **find_length** - Count the number of nodes in the list

### Medium
3. **reverse_linked_list** - Reverse a singly linked list in-place
4. **detect_cycle** - Detect if the list has a cycle using Floyd's algorithm
5. **find_middle_node** - Find the middle node using slow/fast pointer technique

### Hard
6. **merge_sorted_lists** - Merge two sorted linked lists into one sorted list
7. **lru_cache** - Implement an LRU cache using doubly linked list and HashMap

## Hints

**traverse_and_print**: Use pattern matching with `Option` to traverse until you reach `None`.

**find_length**: Similar to traverse, but count the nodes as you go.

**reverse_linked_list**: Use `Option::take()` to move ownership and reverse the links as you traverse.

**detect_cycle**: Use Floyd's "tortoise and hare" algorithm with two references moving at different speeds.

**find_middle_node**: Use two pointers - one moves twice as fast. When fast reaches the end, slow is at the middle.

**merge_sorted_lists**: Use a dummy head node and compare values from both lists, always taking the smaller one.

**lru_cache**: Combine a HashMap for O(1) lookups with a doubly linked list (using `Rc<RefCell<>>`) for O(1) eviction and updates.
