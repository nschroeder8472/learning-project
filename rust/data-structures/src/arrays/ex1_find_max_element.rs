/// Exercise: Find Maximum Element (Easy)
///
/// Given a slice of integers, find and return the maximum element.
///
/// Example:
/// Input: &[3, 7, 2, 9, 1]
/// Output: Some(9)
///
/// Time Complexity: O(n)
/// Space Complexity: O(1)

pub fn find_max(arr: &[i32]) -> Option<i32> {
    // TODO: Implement this function
    // Edge case: handle empty slice (return None)
    // Hint: Use iter().max() or manual iteration
    // Remember to dereference when using iter().max()
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        assert_eq!(find_max(&[3, 7, 2, 9, 1]), Some(9));
    }

    #[test]
    fn test_single_element() {
        assert_eq!(find_max(&[42]), Some(42));
    }

    #[test]
    fn test_negative_numbers() {
        assert_eq!(find_max(&[-5, -2, -8, -1, -10]), Some(-1));
    }

    #[test]
    fn test_all_same_elements() {
        assert_eq!(find_max(&[5, 5, 5, 5]), Some(5));
    }

    #[test]
    fn test_max_at_beginning() {
        assert_eq!(find_max(&[10, 5, 3, 2, 1]), Some(10));
    }

    #[test]
    fn test_max_at_end() {
        assert_eq!(find_max(&[1, 2, 3, 4, 15]), Some(15));
    }

    #[test]
    fn test_empty_slice() {
        assert_eq!(find_max(&[]), None);
    }
}
