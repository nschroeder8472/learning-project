/// Exercise: Search in Rotated Sorted Array (Medium)
///
/// A sorted array has been rotated at an unknown pivot. For example,
/// [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]. You are given a target
/// value to search. If found, return its index; otherwise, return None.
///
/// You must write an algorithm with O(log n) runtime complexity.
///
/// Example 1:
/// Input: arr = &[4,5,6,7,0,1,2], target = 0
/// Output: Some(4)
///
/// Example 2:
/// Input: arr = &[4,5,6,7,0,1,2], target = 3
/// Output: None
///
/// Example 3:
/// Input: arr = &[1], target = 0
/// Output: None
///
/// Time Complexity: O(log n) - modified binary search
/// Space Complexity: O(1)

pub fn search(arr: &[i32], target: i32) -> Option<usize> {
    // TODO: Implement search in rotated sorted array
    // Hint 1: Use modified binary search with left and right pointers
    // Hint 2: At least one half (left or right) will always be sorted
    // Hint 3: Determine which half is sorted by comparing arr[left] with arr[mid]
    // Hint 4: If left half is sorted (arr[left] <= arr[mid]):
    //         - Check if target is in range [arr[left], arr[mid]]
    //         - If yes, search left half; otherwise search right half
    // Hint 5: If right half is sorted:
    //         - Check if target is in range [arr[mid+1], arr[right]]
    //         - If yes, search right half; otherwise search left half
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_target_in_rotated_part() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 0), Some(4));
    }

    #[test]
    fn test_target_not_found() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 3), None);
    }

    #[test]
    fn test_single_element_not_found() {
        let arr = vec![1];
        assert_eq!(search(&arr, 0), None);
    }

    #[test]
    fn test_single_element_found() {
        let arr = vec![1];
        assert_eq!(search(&arr, 1), Some(0));
    }

    #[test]
    fn test_no_rotation() {
        let arr = vec![1, 2, 3, 4, 5];
        assert_eq!(search(&arr, 3), Some(2));
    }

    #[test]
    fn test_rotated_at_end() {
        let arr = vec![2, 3, 4, 5, 1];
        assert_eq!(search(&arr, 1), Some(4));
        assert_eq!(search(&arr, 5), Some(3));
    }

    #[test]
    fn test_target_at_pivot() {
        let arr = vec![4, 5, 6, 7, 0, 1, 2];
        assert_eq!(search(&arr, 4), Some(0));
        assert_eq!(search(&arr, 2), Some(6));
    }

    #[test]
    fn test_empty_array() {
        let arr: Vec<i32> = vec![];
        assert_eq!(search(&arr, 5), None);
    }
}
