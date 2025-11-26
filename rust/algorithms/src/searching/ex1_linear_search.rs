/// Exercise: Linear Search (Easy)
///
/// Implement linear search to find the index of a target element in a slice.
/// Linear search checks each element sequentially from left to right until the
/// target is found or the end of the slice is reached.
///
/// Example:
/// Input: arr = &[4, 2, 7, 1, 9, 5], target = 7
/// Output: Some(2)
///
/// Example (not found):
/// Input: arr = &[4, 2, 7, 1, 9, 5], target = 10
/// Output: None
///
/// Time Complexity: O(n) - must potentially check every element
/// Space Complexity: O(1) - only uses a constant amount of extra space

pub fn linear_search(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement linear search
    // Hint 1: Use iter().enumerate() or iter().position()
    // Hint 2: Compare each element with the target
    // Hint 3: Return Some(index) when found
    // Hint 4: Return None if not found
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_element_found() {
        let arr = vec![4, 2, 7, 1, 9, 5];
        assert_eq!(linear_search(&arr, 7), Some(2));
    }

    #[test]
    fn test_element_not_found() {
        let arr = vec![4, 2, 7, 1, 9, 5];
        assert_eq!(linear_search(&arr, 10), None);
    }

    #[test]
    fn test_first_element() {
        let arr = vec![4, 2, 7, 1, 9, 5];
        assert_eq!(linear_search(&arr, 4), Some(0));
    }

    #[test]
    fn test_last_element() {
        let arr = vec![4, 2, 7, 1, 9, 5];
        assert_eq!(linear_search(&arr, 5), Some(5));
    }

    #[test]
    fn test_single_element_found() {
        let arr = vec![42];
        assert_eq!(linear_search(&arr, 42), Some(0));
    }

    #[test]
    fn test_single_element_not_found() {
        let arr = vec![42];
        assert_eq!(linear_search(&arr, 10), None);
    }

    #[test]
    fn test_empty_array() {
        let arr: Vec<i32> = vec![];
        assert_eq!(linear_search(&arr, 5), None);
    }

    #[test]
    fn test_duplicates_returns_first() {
        let arr = vec![1, 3, 5, 3, 7];
        assert_eq!(linear_search(&arr, 3), Some(1));
    }
}
