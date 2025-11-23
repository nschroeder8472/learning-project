/// Exercise: Remove Duplicates from Sorted Vector (Medium)
///
/// Given a sorted vector, remove duplicates in-place and return the new length.
/// The first 'new_length' elements should contain unique values.
///
/// Example:
/// Input: vec![1, 1, 2, 2, 3, 4, 4, 5]
/// Output: 5 (vector becomes [1, 2, 3, 4, 5, ...])
///
/// Time Complexity: O(n)
/// Space Complexity: O(1)

pub fn remove_duplicates(arr: &mut Vec<i32>) -> usize {
    // TODO: Implement this function
    // Edge case: handle empty vector
    // Hint: Use two pointers - one for reading, one for writing
    // Only write when you find a different element
    // Alternative: Use dedup() method, but implement manually for practice
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let mut arr = vec![1, 1, 2, 2, 3, 4, 4, 5];
        let new_length = remove_duplicates(&mut arr);
        assert_eq!(new_length, 5);
        assert_eq!(&arr[..new_length], &[1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_no_duplicates() {
        let mut arr = vec![1, 2, 3, 4, 5];
        let new_length = remove_duplicates(&mut arr);
        assert_eq!(new_length, 5);
        assert_eq!(&arr[..new_length], &[1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_all_duplicates() {
        let mut arr = vec![5, 5, 5, 5, 5];
        let new_length = remove_duplicates(&mut arr);
        assert_eq!(new_length, 1);
        assert_eq!(&arr[..new_length], &[5]);
    }

    #[test]
    fn test_single_element() {
        let mut arr = vec![42];
        let new_length = remove_duplicates(&mut arr);
        assert_eq!(new_length, 1);
    }

    #[test]
    fn test_empty_vector() {
        let mut arr: Vec<i32> = vec![];
        let new_length = remove_duplicates(&mut arr);
        assert_eq!(new_length, 0);
    }

    #[test]
    fn test_consecutive_duplicates() {
        let mut arr = vec![1, 1, 1, 2, 2, 3];
        let new_length = remove_duplicates(&mut arr);
        assert_eq!(new_length, 3);
        assert_eq!(&arr[..new_length], &[1, 2, 3]);
    }
}
