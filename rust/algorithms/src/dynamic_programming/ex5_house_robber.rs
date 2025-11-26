/// Exercise 5: House Robber
/// Difficulty: Medium
///
/// You are a robber planning to rob houses along a street.
/// Each house has a certain amount of money.
/// Adjacent houses have security systems connected, so you cannot rob
/// two adjacent houses on the same night.
///
/// # Examples
///
/// ```
/// use algorithms::dynamic_programming::ex5_house_robber::rob;
///
/// assert_eq!(rob(&[1, 2, 3, 1]), 4); // Rob house 1 and 3: 1 + 3 = 4
/// assert_eq!(rob(&[2, 7, 9, 3, 1]), 12); // Rob houses 1, 3, 5: 2 + 9 + 1 = 12
/// ```
///
/// Time Complexity: O(n)
/// Space Complexity: O(n) with DP vector, O(1) with optimization

/// Find maximum amount that can be robbed.
pub fn rob(nums: &[i32]) -> i32 {
    // TODO: Implement house robber
    // dp[i] = max money robbing up to house i
    // dp[i] = max(nums[i] + dp[i-2], dp[i-1])
    // Either rob current house + skip previous, or skip current
    unimplemented!("Not implemented yet")
}

/// Space-optimized approach using only two variables.
pub fn rob_optimized(nums: &[i32]) -> i32 {
    // TODO: Implement space-optimized version
    // Only need to track last two values
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let nums = vec![1, 2, 3, 1];
        assert_eq!(rob(&nums), 4);
    }

    #[test]
    fn test_longer_array() {
        let nums = vec![2, 7, 9, 3, 1];
        assert_eq!(rob(&nums), 12);
    }

    #[test]
    fn test_single_house() {
        let nums = vec![5];
        assert_eq!(rob(&nums), 5);
    }

    #[test]
    fn test_two_houses() {
        let nums = vec![2, 3];
        assert_eq!(rob(&nums), 3);

        let nums2 = vec![5, 1];
        assert_eq!(rob(&nums2), 5);
    }

    #[test]
    fn test_three_houses() {
        let nums = vec![2, 1, 1, 2];
        assert_eq!(rob(&nums), 4);
    }

    #[test]
    fn test_all_same_value() {
        let nums = vec![5, 5, 5, 5, 5];
        assert_eq!(rob(&nums), 15);
    }

    #[test]
    fn test_increasing_values() {
        let nums = vec![1, 2, 3, 4, 5];
        assert_eq!(rob(&nums), 9);
    }

    #[test]
    fn test_decreasing_values() {
        let nums = vec![5, 4, 3, 2, 1];
        assert_eq!(rob(&nums), 9);
    }

    #[test]
    fn test_optimized_matches_regular() {
        let nums = vec![2, 7, 9, 3, 1];
        assert_eq!(rob(&nums), rob_optimized(&nums));
    }

    #[test]
    fn test_large_array() {
        let nums = vec![2, 1, 1, 2, 10, 1, 1, 10];
        assert_eq!(rob(&nums), 22);
    }
}
