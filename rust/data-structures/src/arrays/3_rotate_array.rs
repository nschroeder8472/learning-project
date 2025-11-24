/// Exercise: Rotate Array (Medium)
///
/// Rotate a vector to the right by k positions.
///
/// Example:
/// Input: vec![1, 2, 3, 4, 5, 6, 7], k = 3
/// Output: vec![5, 6, 7, 1, 2, 3, 4]
///
/// Time Complexity: O(n)
/// Space Complexity: O(1)

pub fn rotate(arr: &mut Vec<i32>, k: usize) {
    // TODO: Implement this function
    // Edge case: k might be larger than vector length (use k % len)
    // Hint: Use rotate_right() method or implement with reversal technique
    // Reversal: reverse all, then reverse first k, then reverse rest
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_rotation() {
        let mut arr = vec![1, 2, 3, 4, 5, 6, 7];
        rotate(&mut arr, 3);
        assert_eq!(arr, vec![5, 6, 7, 1, 2, 3, 4]);
    }

    #[test]
    fn test_rotate_by_zero() {
        let mut arr = vec![1, 2, 3, 4, 5];
        rotate(&mut arr, 0);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_rotate_by_length() {
        let mut arr = vec![1, 2, 3, 4, 5];
        rotate(&mut arr, 5);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_rotate_by_more_than_length() {
        let mut arr = vec![1, 2, 3, 4, 5];
        rotate(&mut arr, 7); // 7 % 5 = 2
        assert_eq!(arr, vec![4, 5, 1, 2, 3]);
    }

    #[test]
    fn test_rotate_by_one() {
        let mut arr = vec![1, 2, 3, 4, 5];
        rotate(&mut arr, 1);
        assert_eq!(arr, vec![5, 1, 2, 3, 4]);
    }

    #[test]
    fn test_single_element() {
        let mut arr = vec![42];
        rotate(&mut arr, 3);
        assert_eq!(arr, vec![42]);
    }

    #[test]
    fn test_empty_vector() {
        let mut arr: Vec<i32> = vec![];
        rotate(&mut arr, 3);
        assert_eq!(arr, Vec::<i32>::new());
    }
}
