/// Exercise 3: Search in Rotated Sorted Array
/// Difficulty: Medium
///
/// A sorted array has been rotated at an unknown pivot point. Find the index of a target element.
/// You may assume no duplicates exist in the array.
///
/// # Examples
///
/// ```
/// use algorithms::searching::ex3_search_rotated_array::search;
///
/// let arr = vec![4, 5, 6, 7, 0, 1, 2];
/// assert_eq!(search(&arr, 0), Some(4));
/// assert_eq!(search(&arr, 3), None);
/// ```
///
/// Explanation:
/// The array was originally [0, 1, 2, 4, 5, 6, 7] and was rotated at index 4.
///
/// Time Complexity: O(log n) - modified binary search
/// Space Complexity: O(1)

/// Searches for a target in a rotated sorted array.
///
/// # Arguments
///
/// * `arr` - The rotated sorted array
/// * `target` - The element to find
///
/// # Returns
///
/// The index of the target element, or None if not found
pub fn search(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement search in rotated sorted array
    // Hint: Use binary search, but determine which half is sorted
    // If left half is sorted (arr[left] <= arr[mid]):
    //   - Check if target is in left half range
    // Otherwise right half is sorted:
    //   - Check if target is in right half range
    unimplemented!("Not implemented yet")
}

/// Finds the index of the minimum element (rotation point).
/// This can be useful for understanding the rotation.
///
/// # Arguments
///
/// * `arr` - The rotated sorted array
///
/// # Returns
///
/// The index of the minimum element
#[allow(dead_code)]
pub fn find_rotation_point(arr: &[i32]) -> Option<usize> {
    // TODO: Optional - implement finding the rotation point
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_element_found() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 0), Some(4));
    }

    #[test]
    fn test_element_not_found() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 3), None);
    }

    #[test]
    fn test_no_rotation() {
        let arr = vec![1, 2, 3, 4, 5];
        assert_eq!(search(&arr, 3), Some(2));
    }

    #[test]
    fn test_single_element() {
        let arr = vec![1];
        assert_eq!(search(&arr, 1), Some(0));
        assert_eq!(search(&arr, 0), None);
    }

    #[test]
    fn test_two_elements() {
        let arr = vec![3, 1];
        assert_eq!(search(&arr, 1), Some(1));
        assert_eq!(search(&arr, 3), Some(0));
    }

    #[test]
    fn test_target_at_rotation_point() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 4), Some(0));
    }

    #[test]
    fn test_target_in_left_half() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 5), Some(1));
    }

    #[test]
    fn test_target_in_right_half() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 1), Some(5));
    }

    #[test]
    fn test_large_rotation() {
        let arr = vec![7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6];
        assert_eq!(search(&arr, 3), Some(8));
    }

    #[test]
    fn test_rotated_by_one() {
        let arr = vec![2, 3, 4, 5, 1];
        assert_eq!(search(&arr, 1), Some(4));
    }
}
