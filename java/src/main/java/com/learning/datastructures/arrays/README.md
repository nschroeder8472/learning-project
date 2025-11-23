# Arrays

## Concept

Arrays are contiguous blocks of memory that store elements of the same type. They provide O(1) random access to elements via indices but have fixed size in most languages.

### Key Characteristics
- **Fixed size**: Once created, size cannot change (in Java)
- **Contiguous memory**: Elements stored sequentially
- **O(1) access**: Direct access to any element by index
- **O(n) insertion/deletion**: May require shifting elements

### Common Operations
- Access: O(1)
- Search: O(n) unsorted, O(log n) if sorted (binary search)
- Insert: O(n) - requires shifting
- Delete: O(n) - requires shifting

## Exercises

### Easy
1. **FindMaxElement** - Find the maximum element in an array
2. **ReverseArray** - Reverse an array in-place

### Medium
3. **RotateArray** - Rotate an array by k positions to the right
4. **RemoveDuplicates** - Remove duplicates from a sorted array in-place

### Hard
5. **TrappingRainWater** - Calculate how much water can be trapped between bars
6. **MaxSlidingWindow** - Find maximum in each sliding window of size k

## Hints

**FindMaxElement**: Iterate through the array keeping track of the maximum seen so far.

**ReverseArray**: Use two pointers from start and end, swap elements while moving toward center.

**RotateArray**: Consider the rotate operation as reversing portions of the array.

**RemoveDuplicates**: Use two pointers - one for reading, one for writing unique elements.

**TrappingRainWater**: For each position, water level = min(max_left, max_right) - current_height.

**MaxSlidingWindow**: Use a deque to maintain potential maximum elements for each window.
