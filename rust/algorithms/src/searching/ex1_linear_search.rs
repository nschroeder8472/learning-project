/// Exercise 1: Linear Search
/// Difficulty: Easy
///
/// Implement linear search to find the index of a target element in an array.
/// Linear search checks each element sequentially until the target is found or
/// the array is exhausted.
///
/// # Examples
///
/// ```
/// use algorithms::searching::ex1_linear_search::linear_search;
///
/// let arr = vec![5, 2, 8, 1, 9];
/// assert_eq!(linear_search(&arr, 8), Some(2));
/// assert_eq!(linear_search(&arr, 7), None);
/// ```
///
/// Time Complexity: O(n) - must potentially check every element
/// Space Complexity: O(1) - only uses a constant amount of extra space

/// Performs linear search on the array to find the target element.
///
/// # Arguments
///
/// * `arr` - The array to search
/// * `target` - The element to find
///
/// # Returns
///
/// The index of the target element, or None if not found
pub fn linear_search(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement linear search
    // Hint: Iterate through the array and check each element
    unimplemented!("Not implemented yet")
}

/// Alternative signature that searches within a specific range.
///
/// # Arguments
///
/// * `arr` - The array to search
/// * `target` - The element to find
/// * `start` - The starting index (inclusive)
/// * `end` - The ending index (exclusive)
///
/// # Returns
///
/// The index of the target element, or None if not found
pub fn linear_search_range(arr: &[i32], target: i32, start: usize, end: usize) -> Option<usize> {
    // TODO: Implement ranged linear search
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_element_found() {
        let arr = vec![5, 2, 8, 1, 9];
        assert_eq!(linear_search(&arr, 8), Some(2));
    }

    #[test]
    fn test_element_not_found() {
        let arr = vec![5, 2, 8, 1, 9];
        assert_eq!(linear_search(&arr, 7), None);
    }

    #[test]
    fn test_first_element() {
        let arr = vec![10, 20, 30, 40];
        assert_eq!(linear_search(&arr, 10), Some(0));
    }

    #[test]
    fn test_last_element() {
        let arr = vec![10, 20, 30, 40];
        assert_eq!(linear_search(&arr, 40), Some(3));
    }

    #[test]
    fn test_single_element() {
        let arr = vec![42];
        assert_eq!(linear_search(&arr, 42), Some(0));
    }

    #[test]
    fn test_single_element_not_found() {
        let arr = vec![42];
        assert_eq!(linear_search(&arr, 1), None);
    }

    #[test]
    fn test_empty_array() {
        let arr: Vec<i32> = vec![];
        assert_eq!(linear_search(&arr, 5), None);
    }

    #[test]
    fn test_duplicate_elements() {
        let arr = vec![3, 5, 3, 7, 3];
        // Should return the first occurrence
        assert_eq!(linear_search(&arr, 3), Some(0));
    }

    #[test]
    fn test_ranged_search() {
        let arr = vec![1, 2, 3, 4, 5, 6, 7];
        // Search for 5 between index 2 and 6
        assert_eq!(linear_search_range(&arr, 5, 2, 6), Some(4));
    }

    #[test]
    fn test_ranged_search_not_in_range() {
        let arr = vec![1, 2, 3, 4, 5, 6, 7];
        // Search for 7 between index 0 and 5 (7 is at index 6)
        assert_eq!(linear_search_range(&arr, 7, 0, 5), None);
    }
}
