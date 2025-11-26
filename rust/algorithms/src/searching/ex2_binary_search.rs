/// Exercise 2: Binary Search
/// Difficulty: Easy
///
/// Implement binary search to find the index of a target element in a sorted array.
/// Binary search works by repeatedly dividing the search interval in half.
///
/// # Examples
///
/// ```
/// use algorithms::searching::ex2_binary_search::{binary_search_iterative, binary_search_recursive};
///
/// let arr = vec![1, 3, 5, 7, 9, 11];
/// assert_eq!(binary_search_iterative(&arr, 7), Some(3));
/// assert_eq!(binary_search_iterative(&arr, 4), None);
/// ```
///
/// Time Complexity: O(log n) - eliminates half of elements each iteration
/// Space Complexity: O(1) iterative, O(log n) recursive due to call stack
///
/// Prerequisites: Array must be sorted in ascending order

/// Performs iterative binary search on a sorted array.
///
/// # Arguments
///
/// * `arr` - The sorted array to search
/// * `target` - The element to find
///
/// # Returns
///
/// The index of the target element, or None if not found
pub fn binary_search_iterative(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement iterative binary search
    // Hint: Use two pointers (left and right)
    // Compare middle element with target
    // Adjust pointers based on comparison
    unimplemented!("Not implemented yet")
}

/// Performs recursive binary search on a sorted array.
///
/// # Arguments
///
/// * `arr` - The sorted array to search
/// * `target` - The element to find
///
/// # Returns
///
/// The index of the target element, or None if not found
pub fn binary_search_recursive(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement recursive binary search
    // Hint: Call a helper function with left and right indices
    fn helper(arr: &[i32], target: i32, left: usize, right: usize) -> Option<usize> {
        // TODO: Implement recursive helper
        unimplemented!("Not implemented yet")
    }

    if arr.is_empty() {
        return None;
    }
    helper(arr, target, 0, arr.len() - 1)
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_iterative_element_found() {
        let arr = vec![1, 3, 5, 7, 9, 11];
        assert_eq!(binary_search_iterative(&arr, 7), Some(3));
    }

    #[test]
    fn test_iterative_element_not_found() {
        let arr = vec![1, 3, 5, 7, 9, 11];
        assert_eq!(binary_search_iterative(&arr, 4), None);
    }

    #[test]
    fn test_iterative_first_element() {
        let arr = vec![2, 4, 6, 8, 10];
        assert_eq!(binary_search_iterative(&arr, 2), Some(0));
    }

    #[test]
    fn test_iterative_last_element() {
        let arr = vec![2, 4, 6, 8, 10];
        assert_eq!(binary_search_iterative(&arr, 10), Some(4));
    }

    #[test]
    fn test_iterative_single_element() {
        let arr = vec![5];
        assert_eq!(binary_search_iterative(&arr, 5), Some(0));
    }

    #[test]
    fn test_iterative_empty_array() {
        let arr: Vec<i32> = vec![];
        assert_eq!(binary_search_iterative(&arr, 1), None);
    }

    #[test]
    fn test_iterative_large_array() {
        let arr: Vec<i32> = (0..1000).map(|i| i * 2).collect(); // Even numbers: 0, 2, 4, ..., 1998
        assert_eq!(binary_search_iterative(&arr, 500), Some(250));
        assert_eq!(binary_search_iterative(&arr, 501), None);
    }

    #[test]
    fn test_recursive_element_found() {
        let arr = vec![1, 3, 5, 7, 9, 11];
        assert_eq!(binary_search_recursive(&arr, 7), Some(3));
    }

    #[test]
    fn test_recursive_element_not_found() {
        let arr = vec![1, 3, 5, 7, 9, 11];
        assert_eq!(binary_search_recursive(&arr, 4), None);
    }

    #[test]
    fn test_recursive_single_element() {
        let arr = vec![42];
        assert_eq!(binary_search_recursive(&arr, 42), Some(0));
    }

    #[test]
    fn test_recursive_empty_array() {
        let arr: Vec<i32> = vec![];
        assert_eq!(binary_search_recursive(&arr, 1), None);
    }
}
