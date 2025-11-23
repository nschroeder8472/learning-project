# Arrays

## Concept

Arrays (or lists in Python) are contiguous blocks of memory that store elements. Python lists are dynamic arrays that can grow and shrink, unlike fixed-size arrays in languages like Java or C.

### Key Characteristics
- **Dynamic size**: Lists can grow/shrink automatically in Python
- **Contiguous memory**: Elements stored sequentially
- **O(1) access**: Direct access to any element by index
- **O(n) insertion/deletion**: May require shifting elements

### Common Operations
- Access: O(1)
- Search: O(n) unsorted, O(log n) if sorted (binary search)
- Append: O(1) amortized
- Insert: O(n) - requires shifting
- Delete: O(n) - requires shifting

## Exercises

### Easy
1. **find_max_element** - Find the maximum element in a list
2. **reverse_array** - Reverse a list in-place

### Medium
3. **rotate_array** - Rotate a list by k positions to the right
4. **remove_duplicates** - Remove duplicates from a sorted list in-place

### Hard
5. **trapping_rain_water** - Calculate how much water can be trapped between bars
6. **max_sliding_window** - Find maximum in each sliding window of size k

## Hints

**find_max_element**: Use the built-in max() function or iterate keeping track of maximum.

**reverse_array**: Use list slicing [::-1] or reverse() method, or two-pointer approach.

**rotate_array**: Slicing approach: arr[:] = arr[-k:] + arr[:-k]

**remove_duplicates**: Use two pointers - one for reading, one for writing unique elements.

**trapping_rain_water**: For each position, water level = min(max_left, max_right) - current_height.

**max_sliding_window**: Use collections.deque to maintain potential maximum elements for each window.
