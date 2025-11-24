# Hash Tables

## Concept

Hash tables (also called hash maps) are data structures that store key-value pairs and provide fast lookup, insertion, and deletion operations. They use a hash function to compute an index into an array of buckets from which the desired value can be found.

### Key Characteristics
- **Fast lookup**: Average O(1) time for search, insert, and delete
- **Hash function**: Maps keys to array indices
- **Collision handling**: Strategies like chaining or open addressing
- **Dynamic sizing**: Can resize to maintain performance

### Common Operations
- Insert: O(1) average, O(n) worst case
- Search: O(1) average, O(n) worst case
- Delete: O(1) average, O(n) worst case
- Space: O(n) where n is the number of key-value pairs

### Collision Resolution Strategies
- **Chaining**: Each bucket contains a linked list of entries
- **Open Addressing**: Find another slot using probing (linear, quadratic, double hashing)

## Exercises

### Easy
1. **TwoSum** - Find two numbers in an array that add up to a target value
2. **ContainsDuplicate** - Check if an array contains any duplicate elements

### Medium
3. **GroupAnagrams** - Group strings that are anagrams of each other
4. **FirstNonRepeatingChar** - Find the first non-repeating character in a string
5. **LongestSubstringWithoutRepeating** - Find the length of longest substring without repeating characters

### Hard
6. **DesignHashMap** - Implement a hash map from scratch with chaining

## Hints

**TwoSum**: Use a hash map to store numbers you've seen. For each number, check if (target - number) exists in the map.

**ContainsDuplicate**: Use a hash set to track elements you've seen. If you encounter an element already in the set, you've found a duplicate.

**GroupAnagrams**: Sort each string and use the sorted version as a key. Strings with the same sorted form are anagrams.

**FirstNonRepeatingChar**: Make two passes - first to count frequencies, second to find the first character with count 1.

**LongestSubstringWithoutRepeating**: Use sliding window with a hash set. Expand window by adding characters, shrink when you find a duplicate.

**DesignHashMap**: Use an array of linked lists (buckets). Hash function determines which bucket. Handle collisions with chaining.
