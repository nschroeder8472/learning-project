/// Exercise: Selection Sort (Easy)
///
/// Implement the selection sort algorithm to sort a vector of integers in ascending order.
/// Selection sort works by repeatedly finding the minimum element from the unsorted portion
/// and moving it to the beginning. The algorithm divides the vector into sorted and unsorted
/// portions, growing the sorted portion by one element in each iteration.
///
/// Example:
/// Input: &mut [64, 25, 12, 22, 11]
/// Output: [11, 12, 22, 25, 64]
///
/// Example (already sorted):
/// Input: &mut [1, 2, 3, 4, 5]
/// Output: [1, 2, 3, 4, 5]
///
/// Time Complexity: O(n²) for all cases (best, average, worst)
/// Space Complexity: O(1) - sorts in place
/// Stability: No - may change relative order of equal elements

pub fn selection_sort(arr: &mut [i32]) {
    // TODO: Implement selection sort
    // Hint 1: Outer loop tracks the boundary between sorted and unsorted portions
    // Hint 2: For each position i, find the minimum element in arr[i..n-1]
    // Hint 3: Swap the minimum element with arr[i]
    // Hint 4: After each iteration, one more element is in its final sorted position
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let mut arr = vec![64, 25, 12, 22, 11];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![11, 12, 22, 25, 64]);
    }

    #[test]
    fn test_already_sorted() {
        let mut arr = vec![1, 2, 3, 4, 5];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_reverse_sorted() {
        let mut arr = vec![5, 4, 3, 2, 1];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_single_element() {
        let mut arr = vec![42];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![42]);
    }

    #[test]
    fn test_empty_array() {
        let mut arr: Vec<i32> = vec![];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![]);
    }

    #[test]
    fn test_duplicates() {
        let mut arr = vec![3, 1, 4, 1, 5, 9, 2, 6, 5];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![1, 1, 2, 3, 4, 5, 5, 6, 9]);
    }

    #[test]
    fn test_all_same() {
        let mut arr = vec![5, 5, 5, 5, 5];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![5, 5, 5, 5, 5]);
    }

    #[test]
    fn test_negative_numbers() {
        let mut arr = vec![-5, 2, -8, 1, 9];
        selection_sort(&mut arr);
        assert_eq!(arr, vec![-8, -5, 1, 2, 9]);
    }
}
