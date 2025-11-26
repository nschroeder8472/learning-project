/// Exercise: Binary Search (Easy)
///
/// Implement binary search to find the index of a target element in a sorted slice.
/// Binary search works by repeatedly dividing the search interval in half. If the
/// target is less than the middle element, search the left half; otherwise search
/// the right half.
///
/// Example:
/// Input: arr = &[1, 3, 5, 7, 9, 11, 13], target = 7
/// Output: Some(3)
///
/// Example (not found):
/// Input: arr = &[1, 3, 5, 7, 9, 11, 13], target = 6
/// Output: None
///
/// Time Complexity: O(log n) - eliminates half the search space each iteration
/// Space Complexity: O(1) iterative, O(log n) recursive (call stack)
/// Prerequisite: Slice must be sorted

pub fn binary_search(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement iterative binary search
    // Hint 1: Use two pointers - left (0) and right (arr.len() - 1)
    // Hint 2: While left <= right, calculate mid = left + (right - left) / 2
    // Hint 3: If arr[mid] == target, return Some(mid)
    // Hint 4: If arr[mid] < target, search right half (left = mid + 1)
    // Hint 5: If arr[mid] > target, search left half (right = mid - 1)
    // Hint 6: Return None if not found
    // Note: Be careful with usize underflow when updating right
    unimplemented!("Not implemented yet")
}

/// Recursive implementation of binary search (optional)
pub fn binary_search_recursive(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement recursive binary search
    // Hint: Use a helper function that takes left and right indices
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_element_found() {
        let arr = vec![1, 3, 5, 7, 9, 11, 13];
        assert_eq!(binary_search(&arr, 7), Some(3));
    }

    #[test]
    fn test_element_not_found() {
        let arr = vec![1, 3, 5, 7, 9, 11, 13];
        assert_eq!(binary_search(&arr, 6), None);
    }

    #[test]
    fn test_first_element() {
        let arr = vec![1, 3, 5, 7, 9, 11, 13];
        assert_eq!(binary_search(&arr, 1), Some(0));
    }

    #[test]
    fn test_last_element() {
        let arr = vec![1, 3, 5, 7, 9, 11, 13];
        assert_eq!(binary_search(&arr, 13), Some(6));
    }

    #[test]
    fn test_single_element_found() {
        let arr = vec![42];
        assert_eq!(binary_search(&arr, 42), Some(0));
    }

    #[test]
    fn test_single_element_not_found() {
        let arr = vec![42];
        assert_eq!(binary_search(&arr, 10), None);
    }

    #[test]
    fn test_empty_array() {
        let arr: Vec<i32> = vec![];
        assert_eq!(binary_search(&arr, 5), None);
    }

    #[test]
    fn test_two_elements() {
        let arr = vec![1, 3];
        assert_eq!(binary_search(&arr, 1), Some(0));
        assert_eq!(binary_search(&arr, 3), Some(1));
        assert_eq!(binary_search(&arr, 2), None);
    }
}
