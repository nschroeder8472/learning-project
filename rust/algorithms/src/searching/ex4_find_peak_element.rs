/// Exercise 4: Find Peak Element
/// Difficulty: Medium
///
/// A peak element is an element that is strictly greater than its neighbors.
/// Given an array, find the index of any peak element.
/// You may assume that arr[-1] = arr[n] = -∞.
///
/// # Examples
///
/// ```
/// use algorithms::searching::ex4_find_peak_element::find_peak_element;
///
/// let arr = vec![1, 2, 3, 1];
/// assert_eq!(find_peak_element(&arr), 2); // element 3 is a peak
/// ```
///
/// Note: If there are multiple peaks, you can return any of them.
///
/// Time Complexity: O(log n) - using binary search approach
/// Space Complexity: O(1)

/// Finds the index of a peak element using binary search.
///
/// # Arguments
///
/// * `arr` - The input array
///
/// # Returns
///
/// The index of any peak element
pub fn find_peak_element(arr: &[i32]) -> usize {
    // TODO: Implement peak element finder
    // Hint: Use binary search logic
    // If arr[mid] < arr[mid + 1], peak must be on the right
    // Otherwise, peak must be on the left (or mid itself)
    unimplemented!("Not implemented yet")
}

/// Linear search approach to find a peak (for comparison).
///
/// # Arguments
///
/// * `arr` - The input array
///
/// # Returns
///
/// The index of any peak element
#[allow(dead_code)]
pub fn find_peak_linear(arr: &[i32]) -> usize {
    // TODO: Optional - implement linear O(n) solution for comparison
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_single_peak() {
        let arr = vec![1, 2, 3, 1];
        let peak = find_peak_element(&arr);
        assert_eq!(peak, 2);
    }

    #[test]
    fn test_multiple_peaks() {
        let arr = vec![1, 2, 1, 3, 5, 6, 4];
        let peak = find_peak_element(&arr);
        // Either index 1 (element 2) or index 5 (element 6) is valid
        assert!(peak == 1 || peak == 5);
        // Verify it's actually a peak
        if peak > 0 && peak < arr.len() - 1 {
            assert!(arr[peak] > arr[peak - 1] && arr[peak] > arr[peak + 1]);
        }
    }

    #[test]
    fn test_single_element() {
        let arr = vec![1];
        assert_eq!(find_peak_element(&arr), 0);
    }

    #[test]
    fn test_two_elements() {
        let arr = vec![1, 2];
        assert_eq!(find_peak_element(&arr), 1);
    }

    #[test]
    fn test_ascending_array() {
        let arr = vec![1, 2, 3, 4, 5];
        // Last element should be peak
        assert_eq!(find_peak_element(&arr), 4);
    }

    #[test]
    fn test_descending_array() {
        let arr = vec![5, 4, 3, 2, 1];
        // First element should be peak
        assert_eq!(find_peak_element(&arr), 0);
    }

    #[test]
    fn test_peak_at_beginning() {
        let arr = vec![5, 4, 3, 2, 1];
        let peak = find_peak_element(&arr);
        assert_eq!(peak, 0);
    }

    #[test]
    fn test_peak_at_end() {
        let arr = vec![1, 2, 3, 4, 5];
        let peak = find_peak_element(&arr);
        assert_eq!(peak, 4);
    }

    #[test]
    fn test_valid_peak() {
        let arr = vec![1, 3, 20, 4, 1, 0];
        let peak = find_peak_element(&arr);
        assert_eq!(peak, 2);
        // Verify it's a peak
        assert!(arr[peak] > arr[peak - 1] && arr[peak] > arr[peak + 1]);
    }
}
