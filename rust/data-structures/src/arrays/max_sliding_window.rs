/// Exercise: Maximum Sliding Window (Hard)
///
/// Given a slice and a window size k, find the maximum element in each
/// sliding window as it moves from left to right.
///
/// Example:
/// Input: &[1, 3, -1, -3, 5, 3, 6, 7], k = 3
/// Output: vec![3, 3, 5, 5, 6, 7]
///
/// Explanation:
/// Window [1, 3, -1] -> max = 3
/// Window [3, -1, -3] -> max = 3
/// Window [-1, -3, 5] -> max = 5
/// Window [-3, 5, 3] -> max = 5
/// Window [5, 3, 6] -> max = 6
/// Window [3, 6, 7] -> max = 7
///
/// Time Complexity: O(n)
/// Space Complexity: O(k)

use std::collections::VecDeque;

pub fn max_sliding_window(arr: &[i32], k: usize) -> Vec<i32> {
    // TODO: Implement this function
    // Edge cases: empty slice, k == 0, k > slice length
    // Hint: Use VecDeque to store indices of potential maximum elements
    // Maintain deque in decreasing order of values
    // Remove indices outside current window from front
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        assert_eq!(
            max_sliding_window(&[1, 3, -1, -3, 5, 3, 6, 7], 3),
            vec![3, 3, 5, 5, 6, 7]
        );
    }

    #[test]
    fn test_window_size_one() {
        assert_eq!(
            max_sliding_window(&[1, 2, 3, 4, 5], 1),
            vec![1, 2, 3, 4, 5]
        );
    }

    #[test]
    fn test_window_size_equals_array_length() {
        assert_eq!(max_sliding_window(&[1, 3, 5, 2, 4], 5), vec![5]);
    }

    #[test]
    fn test_decreasing_array() {
        assert_eq!(max_sliding_window(&[5, 4, 3, 2, 1], 3), vec![5, 4, 3]);
    }

    #[test]
    fn test_increasing_array() {
        assert_eq!(max_sliding_window(&[1, 2, 3, 4, 5], 3), vec![3, 4, 5]);
    }

    #[test]
    fn test_duplicate_values() {
        assert_eq!(max_sliding_window(&[1, 3, 3, 3, 5], 3), vec![3, 3, 5]);
    }

    #[test]
    fn test_negative_numbers() {
        assert_eq!(
            max_sliding_window(&[-7, -8, -1, -5, -3], 3),
            vec![-1, -1, -1]
        );
    }

    #[test]
    fn test_empty_slice() {
        assert_eq!(max_sliding_window(&[], 3), Vec::<i32>::new());
    }
}
