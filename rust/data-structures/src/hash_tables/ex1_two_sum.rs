/// Exercise: Two Sum (Easy)
///
/// Given a slice of integers nums and an integer target, return indices of the
/// two numbers such that they add up to target.
///
/// You may assume that each input would have exactly one solution, and you may
/// not use the same element twice.
///
/// Example:
/// Input: nums = &[2, 7, 11, 15], target = 9
/// Output: Some((0, 1))
/// Explanation: nums[0] + nums[1] == 9, so return (0, 1)
///
/// Example 2:
/// Input: nums = &[3, 2, 4], target = 6
/// Output: Some((1, 2))
///
/// Time Complexity: O(n)
/// Space Complexity: O(n)

pub fn two_sum(nums: &[i32], target: i32) -> Option<(usize, usize)> {
    // TODO: Implement this function
    // Hint: Use a HashMap to store numbers you've seen and their indices
    // For each number, check if (target - number) exists in the map
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let nums = vec![2, 7, 11, 15];
        let result = two_sum(&nums, 9);
        assert!(result.is_some());
        let (i, j) = result.unwrap();
        assert_eq!(nums[i] + nums[j], 9);
    }

    #[test]
    fn test_different_order() {
        let nums = vec![3, 2, 4];
        let result = two_sum(&nums, 6);
        assert!(result.is_some());
        let (i, j) = result.unwrap();
        assert_eq!(nums[i] + nums[j], 6);
    }

    #[test]
    fn test_negative_numbers() {
        let nums = vec![-1, -2, -3, -4, -5];
        let result = two_sum(&nums, -8);
        assert!(result.is_some());
        let (i, j) = result.unwrap();
        assert_eq!(nums[i] + nums[j], -8);
    }

    #[test]
    fn test_with_zero() {
        let nums = vec![0, 4, 3, 0];
        let result = two_sum(&nums, 0);
        assert!(result.is_some());
        let (i, j) = result.unwrap();
        assert_eq!(nums[i] + nums[j], 0);
    }

    #[test]
    fn test_two_elements() {
        let nums = vec![1, 2];
        let result = two_sum(&nums, 3);
        assert!(result.is_some());
        let (i, j) = result.unwrap();
        assert_eq!(nums[i] + nums[j], 3);
    }

    #[test]
    fn test_large_numbers() {
        let nums = vec![1000000, 2000000, 3000000];
        let result = two_sum(&nums, 5000000);
        assert!(result.is_some());
        let (i, j) = result.unwrap();
        assert_eq!(nums[i] + nums[j], 5000000);
    }
}
