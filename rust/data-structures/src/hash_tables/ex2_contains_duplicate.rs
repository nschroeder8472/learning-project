/// Exercise: Contains Duplicate (Easy)
///
/// Given an integer slice nums, return true if any value appears at least twice
/// in the slice, and return false if every element is distinct.
///
/// Example:
/// Input: nums = &[1, 2, 3, 1]
/// Output: true
///
/// Example 2:
/// Input: nums = &[1, 2, 3, 4]
/// Output: false
///
/// Example 3:
/// Input: nums = &[1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
/// Output: true
///
/// Time Complexity: O(n)
/// Space Complexity: O(n)

pub fn contains_duplicate(nums: &[i32]) -> bool {
    // TODO: Implement this function
    // Hint: Use a HashSet to track elements you've seen
    // If you encounter an element already in the set, you've found a duplicate
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_has_duplicate() {
        assert_eq!(contains_duplicate(&[1, 2, 3, 1]), true);
    }

    #[test]
    fn test_no_duplicate() {
        assert_eq!(contains_duplicate(&[1, 2, 3, 4]), false);
    }

    #[test]
    fn test_multiple_duplicates() {
        assert_eq!(contains_duplicate(&[1, 1, 1, 3, 3, 4, 3, 2, 4, 2]), true);
    }

    #[test]
    fn test_single_element() {
        assert_eq!(contains_duplicate(&[1]), false);
    }

    #[test]
    fn test_empty_slice() {
        assert_eq!(contains_duplicate(&[]), false);
    }

    #[test]
    fn test_consecutive_duplicates() {
        assert_eq!(contains_duplicate(&[1, 2, 2, 3, 4]), true);
    }

    #[test]
    fn test_all_same_elements() {
        assert_eq!(contains_duplicate(&[5, 5, 5, 5, 5]), true);
    }

    #[test]
    fn test_negative_numbers() {
        assert_eq!(contains_duplicate(&[-1, -2, -3, -1]), true);
    }
}
