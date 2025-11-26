/// Exercise 3: Coin Change
/// Difficulty: Medium
///
/// Given coins of different denominations and a total amount,
/// find the minimum number of coins needed to make that amount.
/// If the amount cannot be made, return -1.
///
/// # Examples
///
/// ```
/// use algorithms::dynamic_programming::ex3_coin_change::coin_change;
///
/// assert_eq!(coin_change(&[1, 2, 5], 11), 3); // 11 = 5 + 5 + 1
/// assert_eq!(coin_change(&[2], 3), -1); // Cannot make 3 with only coins of 2
/// ```
///
/// Time Complexity: O(amount × coins.len())
/// Space Complexity: O(amount)

/// Find minimum number of coins to make the amount.
pub fn coin_change(coins: &[i32], amount: i32) -> i32 {
    // TODO: Implement coin change
    // Create dp vector of size amount + 1
    // Initialize dp[0] = 0, others = amount + 1 (infinity)
    // For each amount i from 1 to amount:
    //   For each coin:
    //     If coin <= i:
    //       dp[i] = min(dp[i], dp[i - coin] + 1)
    // Return dp[amount] if valid, else -1
    unimplemented!("Not implemented yet")
}

/// Helper method to check if amount can be made with given coins.
pub fn can_make_amount(coins: &[i32], amount: i32) -> bool {
    coin_change(coins, amount) != -1
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let coins = vec![1, 2, 5];
        assert_eq!(coin_change(&coins, 11), 3);
    }

    #[test]
    fn test_impossible() {
        let coins = vec![2];
        assert_eq!(coin_change(&coins, 3), -1);
    }

    #[test]
    fn test_zero_amount() {
        let coins = vec![1];
        assert_eq!(coin_change(&coins, 0), 0);
    }

    #[test]
    fn test_single_coin() {
        let coins = vec![1];
        assert_eq!(coin_change(&coins, 5), 5);
    }

    #[test]
    fn test_exact_match() {
        let coins = vec![1, 2, 5];
        assert_eq!(coin_change(&coins, 5), 1);
    }

    #[test]
    fn test_multiple_solutions() {
        let coins = vec![1, 3, 4];
        assert_eq!(coin_change(&coins, 6), 2);
    }

    #[test]
    fn test_large_denominations() {
        let coins = vec![25, 10, 5, 1];
        assert_eq!(coin_change(&coins, 41), 4);
    }

    #[test]
    fn test_greedy_fails() {
        let coins = vec![1, 3, 4];
        assert_eq!(coin_change(&coins, 6), 2);
    }

    #[test]
    fn test_large_amount() {
        let coins = vec![1, 5, 10, 25];
        let result = coin_change(&coins, 99);
        assert!(result <= 9);
    }

    #[test]
    fn test_can_make_amount() {
        let coins = vec![1, 2, 5];
        assert!(can_make_amount(&coins, 11));

        let coins2 = vec![2];
        assert!(!can_make_amount(&coins2, 3));
    }
}
