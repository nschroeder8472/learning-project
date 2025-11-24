# Linked Lists

## Concept

A linked list is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence. Unlike arrays, linked lists do not require contiguous memory allocation and can grow dynamically.

### Key Characteristics
- **Dynamic size**: Can grow and shrink at runtime
- **Non-contiguous memory**: Nodes can be scattered in memory
- **O(n) access**: Must traverse from head to reach an element
- **O(1) insertion/deletion**: At known position (head or after a node)
- **Extra memory**: Each node requires additional space for pointer(s)

### Types of Linked Lists
- **Singly Linked List**: Each node has a reference to the next node
- **Doubly Linked List**: Each node has references to both next and previous nodes
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
1. **TraverseAndPrint** - Iterate through the list and collect all values
2. **FindLength** - Count the number of nodes in the list

### Medium
3. **ReverseLinkedList** - Reverse a singly linked list in-place
4. **DetectCycle** - Detect if the list has a cycle using Floyd's algorithm
5. **FindMiddleNode** - Find the middle node using slow/fast pointer technique

### Hard
6. **MergeSortedLists** - Merge two sorted linked lists into one sorted list
7. **LRUCache** - Implement an LRU cache using doubly linked list and hash map

## Hints

**TraverseAndPrint**: Start at the head and follow the next pointers until you reach null.

**FindLength**: Similar to traverse, but count the nodes as you go.

**ReverseLinkedList**: Use three pointers: previous, current, and next. Reverse the links as you traverse.

**DetectCycle**: Use Floyd's "tortoise and hare" algorithm with two pointers moving at different speeds.

**FindMiddleNode**: Use two pointers - one moves twice as fast. When fast reaches the end, slow is at the middle.

**MergeSortedLists**: Use a dummy head node and compare values from both lists, always taking the smaller one.

**LRUCache**: Combine a HashMap for O(1) lookups with a doubly linked list for O(1) eviction and updates.
