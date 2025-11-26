/// Exercise: Bubble Sort (Easy)
///
/// Implement the bubble sort algorithm to sort a vector of integers in ascending order.
/// Bubble sort works by repeatedly stepping through the vector, comparing adjacent elements
/// and swapping them if they are in the wrong order. The algorithm continues until no more
/// swaps are needed.
///
/// Example:
/// Input: &mut [5, 2, 8, 1, 9]
/// Output: [1, 2, 5, 8, 9]
///
/// Example (already sorted):
/// Input: &mut [1, 2, 3, 4, 5]
/// Output: [1, 2, 3, 4, 5]
///
/// Time Complexity: O(n²) worst/average case, O(n) best case (already sorted with optimization)
/// Space Complexity: O(1) - sorts in place
/// Stability: Yes - maintains relative order of equal elements

pub fn bubble_sort(arr: &mut [i32]) {
    // TODO: Implement bubble sort
    // Hint 1: Use nested loops - outer loop for number of passes, inner loop for comparisons
    // Hint 2: In each pass, compare adjacent elements and swap if needed
    // Hint 3: After each pass, the largest element "bubbles up" to the end
    // Hint 4: Optimization - keep track of whether any swaps occurred, stop early if none
    // Hint 5: You can reduce the inner loop range after each pass (last i elements are sorted)
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let mut arr = vec![5, 2, 8, 1, 9];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 5, 8, 9]);
    }

    #[test]
    fn test_already_sorted() {
        let mut arr = vec![1, 2, 3, 4, 5];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_reverse_sorted() {
        let mut arr = vec![5, 4, 3, 2, 1];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_single_element() {
        let mut arr = vec![42];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![42]);
    }

    #[test]
    fn test_empty_array() {
        let mut arr: Vec<i32> = vec![];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![]);
    }

    #[test]
    fn test_duplicates() {
        let mut arr = vec![3, 1, 4, 1, 5, 9, 2, 6, 5];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![1, 1, 2, 3, 4, 5, 5, 6, 9]);
    }

    #[test]
    fn test_all_same() {
        let mut arr = vec![5, 5, 5, 5, 5];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![5, 5, 5, 5, 5]);
    }

    #[test]
    fn test_negative_numbers() {
        let mut arr = vec![-5, 2, -8, 1, 9];
        bubble_sort(&mut arr);
        assert_eq!(arr, vec![-8, -5, 1, 2, 9]);
    }
}
