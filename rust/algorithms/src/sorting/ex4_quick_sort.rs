/// Exercise: Quick Sort (Medium)
///
/// Implement the quick sort algorithm to sort a vector of integers in ascending order.
/// Quick sort is a divide-and-conquer algorithm that selects a 'pivot' element and
/// partitions the vector around it, placing smaller elements to the left and larger
/// elements to the right. It then recursively sorts the left and right partitions.
///
/// Example:
/// Input: &mut [10, 7, 8, 9, 1, 5]
/// Output: [1, 5, 7, 8, 9, 10]
///
/// Example (already sorted):
/// Input: &mut [1, 2, 3, 4, 5]
/// Output: [1, 2, 3, 4, 5]
///
/// Time Complexity: O(n log n) average case, O(n²) worst case (already sorted with poor pivot)
/// Space Complexity: O(log n) - recursion stack
/// Stability: No - relative order of equal elements may change

pub fn quick_sort(arr: &mut [i32]) {
    // TODO: Implement quick sort
    // Hint 1: Get the length of the array
    // Hint 2: If length > 1, call helper function with 0 and len - 1
    unimplemented!("Not implemented yet")
}

/// Helper function to recursively sort a portion of the array
fn quick_sort_helper(arr: &mut [i32], left: isize, right: isize) {
    // TODO: Implement recursive quick sort logic
    // Hint 1: Base case - if left >= right, return
    // Hint 2: Partition the array and get the pivot index
    // Hint 3: Recursively sort left partition (left to pivot_index - 1)
    // Hint 4: Recursively sort right partition (pivot_index + 1 to right)
    unimplemented!("Not implemented yet")
}

/// Partitions the array around a pivot element
/// Places all elements smaller than pivot to the left and larger to the right
fn partition(arr: &mut [i32], left: isize, right: isize) -> isize {
    // TODO: Implement partition logic
    // Hint 1: Choose a pivot (simplest: use arr[right])
    // Hint 2: Use a pointer to track position of smaller elements
    // Hint 3: Iterate through array, swap elements smaller than pivot to left side
    // Hint 4: Finally, swap pivot to its correct position
    // Hint 5: Return the pivot's final position
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let mut arr = vec![10, 7, 8, 9, 1, 5];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![1, 5, 7, 8, 9, 10]);
    }

    #[test]
    fn test_already_sorted() {
        let mut arr = vec![1, 2, 3, 4, 5];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_reverse_sorted() {
        let mut arr = vec![5, 4, 3, 2, 1];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![1, 2, 3, 4, 5]);
    }

    #[test]
    fn test_single_element() {
        let mut arr = vec![42];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![42]);
    }

    #[test]
    fn test_empty_array() {
        let mut arr: Vec<i32> = vec![];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![]);
    }

    #[test]
    fn test_duplicates() {
        let mut arr = vec![3, 1, 4, 1, 5, 9, 2, 6, 5];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![1, 1, 2, 3, 4, 5, 5, 6, 9]);
    }

    #[test]
    fn test_all_same() {
        let mut arr = vec![5, 5, 5, 5, 5];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![5, 5, 5, 5, 5]);
    }

    #[test]
    fn test_negative_numbers() {
        let mut arr = vec![-5, 2, -8, 1, 9];
        quick_sort(&mut arr);
        assert_eq!(arr, vec![-8, -5, 1, 2, 9]);
    }
}
