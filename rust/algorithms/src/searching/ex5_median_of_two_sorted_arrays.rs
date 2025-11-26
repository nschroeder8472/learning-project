/// Exercise: Median of Two Sorted Arrays (Hard)
///
/// Given two sorted arrays nums1 and nums2 of size m and n respectively,
/// return the median of the two sorted arrays.
///
/// The overall run time complexity should be O(log(min(m,n))).
///
/// Example 1:
/// Input: nums1 = &[1,3], nums2 = &[2]
/// Output: 2.0
/// Explanation: merged array = [1,2,3] and median is 2
///
/// Example 2:
/// Input: nums1 = &[1,2], nums2 = &[3,4]
/// Output: 2.5
/// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
///
/// Example 3:
/// Input: nums1 = &[], nums2 = &[1]
/// Output: 1.0
///
/// Time Complexity: O(log(min(m,n))) - binary search on smaller array
/// Space Complexity: O(1)

pub fn find_median_sorted_arrays(nums1: &[i32], nums2: &[i32]) -> f64 {
    // TODO: Implement median of two sorted arrays
    // Hint 1: Ensure nums1 is the smaller array (swap if necessary)
    // Hint 2: Use binary search on the smaller array to partition both arrays
    // Hint 3: Partition such that left half has (m+n+1)/2 elements
    // Hint 4: Find partition points partition_x and partition_y where:
    //         partition_x + partition_y = (m + n + 1) / 2
    // Hint 5: Check if partition is correct: max_left_x <= min_right_y && max_left_y <= min_right_x
    // Hint 6: If max_left_x > min_right_y, move partition left in nums1
    // Hint 7: If max_left_y > min_right_x, move partition right in nums1
    // Hint 8: When found, median is:
    //         - For odd total: max(max_left_x, max_left_y) as f64
    //         - For even total: (max(max_left_x, max_left_y) + min(min_right_x, min_right_y)) / 2.0
    // Hint 9: Handle edge cases with i32::MIN and i32::MAX
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_odd_length_combined() {
        let nums1 = vec![1, 3];
        let nums2 = vec![2];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), 2.0);
    }

    #[test]
    fn test_even_length_combined() {
        let nums1 = vec![1, 2];
        let nums2 = vec![3, 4];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), 2.5);
    }

    #[test]
    fn test_first_array_empty() {
        let nums1: Vec<i32> = vec![];
        let nums2 = vec![1];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), 1.0);
    }

    #[test]
    fn test_second_array_empty() {
        let nums1 = vec![2];
        let nums2: Vec<i32> = vec![];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), 2.0);
    }

    #[test]
    fn test_both_arrays_single_element() {
        let nums1 = vec![1];
        let nums2 = vec![2];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), 1.5);
    }

    #[test]
    fn test_different_sizes() {
        let nums1 = vec![1, 3];
        let nums2 = vec![2, 7, 9, 10];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), 5.0);
    }

    #[test]
    fn test_no_overlap() {
        let nums1 = vec![1, 2];
        let nums2 = vec![3, 4, 5];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), 3.0);
    }

    #[test]
    fn test_negative_numbers() {
        let nums1 = vec![-5, -3, -1];
        let nums2 = vec![-4, -2];
        assert_eq!(find_median_sorted_arrays(&nums1, &nums2), -3.0);
    }
}
