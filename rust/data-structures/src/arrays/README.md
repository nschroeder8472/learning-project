# Arrays

## Concept

Arrays in Rust come in two flavors: fixed-size arrays `[T; N]` and dynamic vectors `Vec<T>`. Vectors are more commonly used and provide dynamic resizing similar to ArrayLists or Python lists.

### Key Characteristics
- **Fixed arrays**: `[T; N]` - size known at compile time, stack allocated
- **Vectors**: `Vec<T>` - dynamically sized, heap allocated
- **O(1) access**: Direct access to any element by index
- **O(n) insertion/deletion**: May require shifting elements

### Common Operations
- Access: O(1)
- Search: O(n) unsorted, O(log n) if sorted (binary search)
- Push (Vec): O(1) amortized
- Insert: O(n) - requires shifting
- Remove: O(n) - requires shifting

## Exercises

### Easy
1. **find_max_element** - Find the maximum element in a slice
2. **reverse_array** - Reverse a slice in-place

### Medium
3. **rotate_array** - Rotate a vector by k positions to the right
4. **remove_duplicates** - Remove duplicates from a sorted vector in-place

### Hard
5. **trapping_rain_water** - Calculate how much water can be trapped between bars
6. **max_sliding_window** - Find maximum in each sliding window of size k

## Hints

**find_max_element**: Use `iter().max()` or manual iteration with pattern matching.

**reverse_array**: Use the `reverse()` method on slices or implement with two pointers.

**rotate_array**: Use `rotate_right(k)` method or implement with array reversal technique.

**remove_duplicates**: Use `dedup()` or implement with two pointers for practice.

**trapping_rain_water**: For each position, water level = min(max_left, max_right) - current_height.

**max_sliding_window**: Use VecDeque to maintain potential maximum elements for each window.
