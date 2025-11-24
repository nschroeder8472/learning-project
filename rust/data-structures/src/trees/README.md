# Trees

## Concept

A tree is a hierarchical data structure consisting of nodes, with a root node at the top and child nodes branching downward. A Binary Search Tree (BST) is a special type of binary tree where each node has at most two children, and for every node, all values in the left subtree are less than the node's value, and all values in the right subtree are greater.

**Note for Rust**: Trees in Rust require careful handling of ownership. We'll use `Option<Box<TreeNode>>` for child pointers, which provides single ownership. More complex tree operations may require `Rc<RefCell<TreeNode>>` for shared ownership, but we'll keep it simple with Box.

### Key Characteristics
- **Hierarchical structure**: Parent-child relationships between nodes
- **Binary tree**: Each node has at most two children (left and right)
- **BST property**: Left < Root < Right for all subtrees
- **No cycles**: Trees are acyclic by definition
- **One path**: Exactly one path between root and any node

### Tree Terminology
- **Root**: The topmost node
- **Leaf**: A node with no children
- **Height**: The longest path from root to a leaf
- **Depth**: Distance from root to a node
- **Subtree**: A node and all its descendants

### Common Operations
- Search: O(log n) average, O(n) worst case
- Insert: O(log n) average, O(n) worst case
- Delete: O(log n) average, O(n) worst case
- Traversal: O(n) - visit all nodes

### Tree Traversals
- **Inorder (Left, Root, Right)**: Gives sorted order for BST
- **Preorder (Root, Left, Right)**: Useful for copying tree structure
- **Postorder (Left, Right, Root)**: Useful for deleting tree
- **Level Order (BFS)**: Visit nodes level by level

## Exercises

### Easy
1. **inorder_traversal** - Traverse tree in Left-Root-Right order
2. **preorder_traversal** - Traverse tree in Root-Left-Right order
3. **postorder_traversal** - Traverse tree in Left-Right-Root order

### Medium
4. **level_order_traversal** - Traverse tree level by level using BFS
5. **max_depth** - Find the maximum depth (height) of the tree
6. **validate_bst** - Check if a binary tree is a valid BST

### Hard
7. **lowest_common_ancestor** - Find the LCA of two nodes in a BST

## Hints

**inorder_traversal**: Recursively visit left subtree, then root, then right subtree. Use pattern matching with Option.

**preorder_traversal**: Visit root first, then recursively visit left and right subtrees.

**postorder_traversal**: Recursively visit left and right subtrees first, then visit root.

**level_order_traversal**: Use VecDeque for BFS. Add root, then process each level: pop node, add its value, push its children.

**max_depth**: Recursively compute max(depth of left subtree, depth of right subtree) + 1. Use pattern matching for None case.

**validate_bst**: For each node, ensure all left descendants < node < all right descendants. Pass valid range (Option<i32>, Option<i32>) down recursively.

**lowest_common_ancestor**: In BST, if both nodes are less than current, go left. If both greater, go right. Otherwise, current is LCA.
