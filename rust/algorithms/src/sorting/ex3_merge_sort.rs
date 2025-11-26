/// Exercise: Merge Sort (Medium)
///
/// Implement the merge sort algorithm to sort a vector of integers in ascending order.
/// Merge sort is a divide-and-conquer algorithm that recursively divides the vector into
/// two halves, sorts each half, and then merges them back together.
///
/// Example:
/// Input: &mut [38, 27, 43, 3, 9, 82, 10]
/// Output: [3, 9, 10, 27, 38, 43, 82]
///
/// Example (already sorted):
/// Input: &mut [1, 2, 3, 4, 5]
/// Output: [1, 2, 3, 4, 5]
///
/// Time Complexity: O(n log n) for all cases (best, average, worst)
/// Space Complexity: O(n) - requires auxiliary array for merging
/// Stability: Yes - maintains relative order of equal elements

pub fn merge_sort(arr: &mut [i32]) {
    // TODO: Implement merge sort
    // Hint 1: Base case - if arr.len() <= 1, return
    // Hint 2: Find the middle point and split into left and right halves
    // Hint 3: Recursively call merge_sort on both halves
    // Hint 4: Merge the two sorted halves back
    // Hint 5: You may need a helper function or use Vec for temporary storage
    unimplemented!("Not implemented yet")
}

/// Helper function to merge two sorted slices into a single sorted array
fn merge(left: &[i32], right: &[i32], result: &mut [i32]) {
    // TODO: Implement merge logic
    // Hint 1: Use two pointers, one for left and one for right
    // Hint 2: Compare elements and copy the smaller one to result
    // Hint 3: Copy any remaining elements from either left or right
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let mut arr = vec![38, 27, 43, 3, 9, 82, 10];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![3, 9, 10, 27, 38, 43, 82]);
    }

    #[test]
    fn test_already_sorted() {
        let mut arr = vec![1, 2, 3, 4, 5];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_reverse_sorted() {
        let mut arr = vec![5, 4, 3, 2, 1];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_single_element() {
        let mut arr = vec![42];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![42]);
    }

    #[test]
    fn test_empty_array() {
        let mut arr: Vec<i32> = vec![];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![]);
    }

    #[test]
    fn test_duplicates() {
        let mut arr = vec![3, 1, 4, 1, 5, 9, 2, 6, 5];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![1, 1, 2, 3, 4, 5, 5, 6, 9]);
    }

    #[test]
    fn test_all_same() {
        let mut arr = vec![5, 5, 5, 5, 5];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![5, 5, 5, 5, 5]);
    }

    #[test]
    fn test_negative_numbers() {
        let mut arr = vec![-5, 2, -8, 1, 9];
        merge_sort(&mut arr);
        assert_eq!(arr, vec![-8, -5, 1, 2, 9]);
    }
}
