/// Exercise 5: Median of Two Sorted Arrays
/// Difficulty: Hard
///
/// Given two sorted arrays, find the median of the combined sorted array.
/// The overall run time complexity should be O(log(min(m, n))).
///
/// # Examples
///
/// ```
/// use algorithms::searching::ex5_median_two_arrays::find_median_sorted_arrays;
///
/// let nums1 = vec![1, 3];
/// let nums2 = vec![2];
/// assert!((find_median_sorted_arrays(&nums1, &nums2) - 2.0).abs() < 0.00001);
/// ```
///
/// Time Complexity: O(log(min(m, n))) - binary search on smaller array
/// Space Complexity: O(1)

/// Finds the median of two sorted arrays.
///
/// # Arguments
///
/// * `nums1` - The first sorted array
/// * `nums2` - The second sorted array
///
/// # Returns
///
/// The median of the combined arrays
pub fn find_median_sorted_arrays(nums1: &[i32], nums2: &[i32]) -> f64 {
    // TODO: Implement median finder using binary search
    // Hint: Perform binary search on the smaller array
    // Goal: Partition both arrays such that:
    //   1. Left partition has same number of elements as right partition
    //   2. All elements in left partition <= all elements in right partition
    //
    // For partition at position i in nums1 and j in nums2:
    //   j = (m + n + 1) / 2 - i
    //
    // Valid partition when:
    //   nums1[i-1] <= nums2[j] && nums2[j-1] <= nums1[i]
    unimplemented!("Not implemented yet")
}

/// Naive approach: merge arrays and find median (for comparison).
/// Time: O(m + n), Space: O(m + n)
///
/// # Arguments
///
/// * `nums1` - The first sorted array
/// * `nums2` - The second sorted array
///
/// # Returns
///
/// The median of the combined arrays
#[allow(dead_code)]
pub fn find_median_naive(nums1: &[i32], nums2: &[i32]) -> f64 {
    // TODO: Optional - implement naive O(m+n) solution for comparison
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    const DELTA: f64 = 0.00001;

    #[test]
    fn test_odd_total_length() {
        let nums1 = vec![1, 3];
        let nums2 = vec![2];
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 2.0).abs() < DELTA);
    }

    #[test]
    fn test_even_total_length() {
        let nums1 = vec![1, 2];
        let nums2 = vec![3, 4];
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 2.5).abs() < DELTA);
    }

    #[test]
    fn test_first_array_empty() {
        let nums1: Vec<i32> = vec![];
        let nums2 = vec![1];
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 1.0).abs() < DELTA);
    }

    #[test]
    fn test_second_array_empty() {
        let nums1 = vec![2];
        let nums2: Vec<i32> = vec![];
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 2.0).abs() < DELTA);
    }

    #[test]
    fn test_both_arrays_single_element() {
        let nums1 = vec![1];
        let nums2 = vec![2];
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 1.5).abs() < DELTA);
    }

    #[test]
    fn test_different_sizes() {
        let nums1 = vec![1, 3, 5, 7, 9];
        let nums2 = vec![2, 4, 6];
        // Merged: [1, 2, 3, 4, 5, 6, 7, 9]
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 4.5).abs() < DELTA);
    }

    #[test]
    fn test_no_overlap() {
        let nums1 = vec![1, 2, 3];
        let nums2 = vec![4, 5, 6];
        // Merged: [1, 2, 3, 4, 5, 6]
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 3.5).abs() < DELTA);
    }

    #[test]
    fn test_complete_overlap() {
        let nums1 = vec![1, 2];
        let nums2 = vec![1, 2];
        // Merged: [1, 1, 2, 2]
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 1.5).abs() < DELTA);
    }

    #[test]
    fn test_negative_numbers() {
        let nums1 = vec![-5, -3, -1];
        let nums2 = vec![-4, -2, 0];
        // Merged: [-5, -4, -3, -2, -1, 0]
        assert!((find_median_sorted_arrays(&nums1, &nums2) - (-2.5)).abs() < DELTA);
    }

    #[test]
    fn test_large_arrays() {
        let nums1: Vec<i32> = (1..11).collect(); // [1, 2, ..., 10]
        let nums2: Vec<i32> = (11..21).collect(); // [11, 12, ..., 20]
        // Merged: [1..20], median = (10 + 11) / 2 = 10.5
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 10.5).abs() < DELTA);
    }

    #[test]
    fn test_one_element_in_first_array() {
        let nums1 = vec![3];
        let nums2 = vec![1, 2, 4, 5];
        // Merged: [1, 2, 3, 4, 5]
        assert!((find_median_sorted_arrays(&nums1, &nums2) - 3.0).abs() < DELTA);
    }
}
