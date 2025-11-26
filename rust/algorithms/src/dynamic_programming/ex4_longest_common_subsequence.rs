/// Exercise 4: Longest Common Subsequence (LCS)
/// Difficulty: Medium
///
/// Given two strings, find the length of their longest common subsequence.
/// A subsequence is a sequence that appears in the same relative order,
/// but not necessarily contiguous.
///
/// # Examples
///
/// ```
/// use algorithms::dynamic_programming::ex4_longest_common_subsequence::longest_common_subsequence;
///
/// assert_eq!(longest_common_subsequence("abcde", "ace"), 3); // LCS is "ace"
/// assert_eq!(longest_common_subsequence("abc", "def"), 0); // No common subsequence
/// ```
///
/// Time Complexity: O(m × n) where m, n are string lengths
/// Space Complexity: O(m × n) for DP table

/// Find length of longest common subsequence.
pub fn longest_common_subsequence(text1: &str, text2: &str) -> usize {
    // TODO: Implement LCS using 2D DP
    // Create 2D vector dp[m+1][n+1]
    // dp[i][j] = LCS length of text1[0..i-1] and text2[0..j-1]
    // If text1[i-1] == text2[j-1]:
    //   dp[i][j] = dp[i-1][j-1] + 1
    // Else:
    //   dp[i][j] = max(dp[i-1][j], dp[i][j-1])
    unimplemented!("Not implemented yet")
}

/// Find the actual LCS string (not just length).
#[allow(dead_code)]
pub fn find_lcs(text1: &str, text2: &str) -> String {
    // TODO: Optional - reconstruct the actual LCS string
    // Build DP table, then backtrack to find the sequence
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_lcs() {
        assert_eq!(longest_common_subsequence("abcde", "ace"), 3);
    }

    #[test]
    fn test_identical_strings() {
        assert_eq!(longest_common_subsequence("abc", "abc"), 3);
    }

    #[test]
    fn test_no_common_subsequence() {
        assert_eq!(longest_common_subsequence("abc", "def"), 0);
    }

    #[test]
    fn test_empty_string() {
        assert_eq!(longest_common_subsequence("", "abc"), 0);
        assert_eq!(longest_common_subsequence("abc", ""), 0);
        assert_eq!(longest_common_subsequence("", ""), 0);
    }

    #[test]
    fn test_single_char_match() {
        assert_eq!(longest_common_subsequence("a", "a"), 1);
        assert_eq!(longest_common_subsequence("a", "b"), 0);
    }

    #[test]
    fn test_partial_match() {
        assert_eq!(longest_common_subsequence("abcdef", "aecbdf"), 4);
    }

    #[test]
    fn test_longer_strings() {
        assert_eq!(longest_common_subsequence("AGGTAB", "GXTXAYB"), 4);
    }

    #[test]
    fn test_reversed_strings() {
        assert_eq!(longest_common_subsequence("abc", "cba"), 1);
    }

    #[test]
    fn test_one_substring_of_other() {
        assert_eq!(longest_common_subsequence("abc", "aXbXcX"), 3);
    }

    #[test]
    fn test_repeated_characters() {
        assert_eq!(longest_common_subsequence("aaa", "aaa"), 3);
        assert_eq!(longest_common_subsequence("aaa", "aa"), 2);
    }
}
