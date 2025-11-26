/// Exercise 2: Climbing Stairs
/// Difficulty: Easy
///
/// You are climbing a staircase with n steps. Each time you can climb 1 or 2 steps.
/// How many distinct ways can you climb to the top?
///
/// # Examples
///
/// ```
/// use algorithms::dynamic_programming::ex2_climbing_stairs::climb_stairs;
///
/// assert_eq!(climb_stairs(2), 2); // Two ways: 1+1, or 2
/// assert_eq!(climb_stairs(3), 3); // Three ways: 1+1+1, 1+2, or 2+1
/// ```
///
/// Key Insight: This is actually the Fibonacci sequence!
/// To reach step n, you must come from step (n-1) or (n-2)
/// So: ways(n) = ways(n-1) + ways(n-2)
///
/// Time Complexity: O(n)
/// Space Complexity: O(n) with DP vector, O(1) with optimization

/// Count ways to climb stairs using dynamic programming.
pub fn climb_stairs(n: i32) -> i32 {
    // TODO: Implement climbing stairs
    // Base cases: 1 stair = 1 way, 2 stairs = 2 ways
    // Use DP: dp[i] = dp[i-1] + dp[i-2]
    unimplemented!("Not implemented yet")
}

/// Space-optimized approach using only two variables.
pub fn climb_stairs_optimized(n: i32) -> i32 {
    // TODO: Implement space-optimized version
    // Only track last two values
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_one_stair() {
        assert_eq!(climb_stairs(1), 1);
    }

    #[test]
    fn test_two_stairs() {
        assert_eq!(climb_stairs(2), 2);
    }

    #[test]
    fn test_three_stairs() {
        assert_eq!(climb_stairs(3), 3);
    }

    #[test]
    fn test_four_stairs() {
        assert_eq!(climb_stairs(4), 5);
    }

    #[test]
    fn test_five_stairs() {
        assert_eq!(climb_stairs(5), 8);
    }

    #[test]
    fn test_medium_stairs() {
        assert_eq!(climb_stairs(10), 89);
    }

    #[test]
    fn test_large_stairs() {
        assert_eq!(climb_stairs(20), 10946);
    }

    #[test]
    fn test_optimized_matches_regular() {
        for i in 1..=15 {
            assert_eq!(climb_stairs(i), climb_stairs_optimized(i));
        }
    }

    #[test]
    fn test_very_large_stairs() {
        let result = climb_stairs(35);
        assert!(result > 0); // Should complete without timeout
    }
}
