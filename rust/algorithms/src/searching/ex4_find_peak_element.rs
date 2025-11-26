/// Exercise: Find Peak Element (Medium)
///
/// A peak element is an element that is strictly greater than its neighbors.
/// Given an integer array, find a peak element and return its index.
/// If the array contains multiple peaks, return the index of any one of them.
///
/// You may assume arr[-1] = arr[n] = -∞ (elements outside bounds are negative infinity).
/// You must write an algorithm with O(log n) runtime complexity.
///
/// Example 1:
/// Input: arr = &[1,2,3,1]
/// Output: 2 (element 3 is a peak)
///
/// Example 2:
/// Input: arr = &[1,2,1,3,5,6,4]
/// Output: 5 (element 6 is a peak, though element 2 is also a peak)
///
/// Example 3:
/// Input: arr = &[1]
/// Output: 0
///
/// Time Complexity: O(log n) - binary search approach
/// Space Complexity: O(1)

pub fn find_peak_element(arr: &[i32]) -> usize {
    // TODO: Implement find peak element
    // Hint 1: Use binary search with left and right pointers
    // Hint 2: Compare arr[mid] with arr[mid + 1]
    // Hint 3: If arr[mid] < arr[mid + 1], peak must be on the right (left = mid + 1)
    // Hint 4: Otherwise, peak must be on the left or at mid (right = mid)
    // Hint 5: When left == right, we've found a peak
    // Hint 6: Handle edge case of single element
    // Note: Function assumes non-empty array (panic on empty is acceptable for this exercise)
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_peak_at_end() {
        let arr = vec![1, 2, 3, 1];
        let peak_idx = find_peak_element(&arr);
        assert_eq!(peak_idx, 2);
    }

    #[test]
    fn test_multiple_peaks() {
        let arr = vec![1, 2, 1, 3, 5, 6, 4];
        let peak_idx = find_peak_element(&arr);
        // Either index 1 (value 2) or index 5 (value 6) is valid
        assert!(peak_idx == 1 || peak_idx == 5);
    }

    #[test]
    fn test_single_element() {
        let arr = vec![1];
        assert_eq!(find_peak_element(&arr), 0);
    }

    #[test]
    fn test_ascending_array() {
        let arr = vec![1, 2, 3, 4, 5];
        assert_eq!(find_peak_element(&arr), 4);
    }

    #[test]
    fn test_descending_array() {
        let arr = vec![5, 4, 3, 2, 1];
        assert_eq!(find_peak_element(&arr), 0);
    }

    #[test]
    fn test_two_elements_ascending() {
        let arr = vec![1, 2];
        assert_eq!(find_peak_element(&arr), 1);
    }

    #[test]
    fn test_two_elements_descending() {
        let arr = vec![2, 1];
        assert_eq!(find_peak_element(&arr), 0);
    }

    #[test]
    fn test_peak_in_middle() {
        let arr = vec![1, 5, 3];
        assert_eq!(find_peak_element(&arr), 1);
    }
}
