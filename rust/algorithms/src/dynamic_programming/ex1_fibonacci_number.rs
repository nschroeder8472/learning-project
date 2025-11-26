/// Exercise 1: Fibonacci Number
/// Difficulty: Easy
///
/// Calculate the nth Fibonacci number using dynamic programming.
/// The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
/// F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2) for n > 1
///
/// # Examples
///
/// ```
/// use algorithms::dynamic_programming::ex1_fibonacci_number::fib_tabulation;
///
/// assert_eq!(fib_tabulation(4), 3);
/// assert_eq!(fib_tabulation(10), 55);
/// ```
///
/// Time Complexity:
/// - Naive recursion: O(2^n)
/// - Memoization: O(n)
/// - Tabulation: O(n)
/// - Space-optimized: O(1)

use std::collections::HashMap;

/// Naive recursive approach (exponential time - DO NOT USE for large n).
pub fn fib_recursive(n: u32) -> u64 {
    // TODO: Implement naive recursive solution
    // Base cases: if n == 0 return 0, if n == 1 return 1
    // Recursive case: return fib(n-1) + fib(n-2)
    unimplemented!("Not implemented yet")
}

/// Top-down approach with memoization.
pub fn fib_memoization(n: u32) -> u64 {
    let mut memo = HashMap::new();
    fib_memo_helper(n, &mut memo)
}

fn fib_memo_helper(n: u32, memo: &mut HashMap<u32, u64>) -> u64 {
    // TODO: Implement memoization approach
    // Check if result is in memo
    // If not, compute recursively and store in memo
    unimplemented!("Not implemented yet")
}

/// Bottom-up approach with tabulation.
pub fn fib_tabulation(n: u32) -> u64 {
    // TODO: Implement tabulation approach
    // Create vector dp of size n+1
    // Initialize base cases: dp[0] = 0, dp[1] = 1
    // Fill vector: dp[i] = dp[i-1] + dp[i-2]
    unimplemented!("Not implemented yet")
}

/// Space-optimized approach (only keep last two values).
pub fn fib_optimized(n: u32) -> u64 {
    // TODO: Implement space-optimized approach
    // Only need to track previous two values
    // Use two variables instead of vector
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_fib_base_case_0() {
        assert_eq!(fib_tabulation(0), 0);
        assert_eq!(fib_memoization(0), 0);
        assert_eq!(fib_optimized(0), 0);
    }

    #[test]
    fn test_fib_base_case_1() {
        assert_eq!(fib_tabulation(1), 1);
        assert_eq!(fib_memoization(1), 1);
        assert_eq!(fib_optimized(1), 1);
    }

    #[test]
    fn test_fib_small_numbers() {
        assert_eq!(fib_tabulation(2), 1);
        assert_eq!(fib_tabulation(3), 2);
        assert_eq!(fib_tabulation(4), 3);
        assert_eq!(fib_tabulation(5), 5);
    }

    #[test]
    fn test_fib_medium_numbers() {
        assert_eq!(fib_memoization(10), 55);
        assert_eq!(fib_memoization(20), 6765);
    }

    #[test]
    fn test_fib_consistency() {
        // All methods should give same results
        for i in 0..=15 {
            let memo = fib_memoization(i);
            let tab = fib_tabulation(i);
            let opt = fib_optimized(i);
            assert_eq!(memo, tab);
            assert_eq!(tab, opt);
        }
    }

    #[test]
    fn test_fib_large_number() {
        // Test with larger number
        assert_eq!(fib_tabulation(30), 832040);
    }

    #[test]
    fn test_fib_recursive_small() {
        // Only test recursive with small numbers (exponential time!)
        assert_eq!(fib_recursive(0), 0);
        assert_eq!(fib_recursive(1), 1);
        assert_eq!(fib_recursive(5), 5);
    }

    #[test]
    fn test_fib_optimized_space() {
        // Optimized version should handle larger numbers efficiently
        assert_eq!(fib_optimized(40), 102334155);
    }
}
