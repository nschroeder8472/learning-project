/// Exercise 6: Edit Distance (Levenshtein Distance)
/// Difficulty: Hard
///
/// Given two strings word1 and word2, find the minimum number of operations
/// required to convert word1 to word2.
///
/// You have the following three operations:
/// 1. Insert a character
/// 2. Delete a character
/// 3. Replace a character
///
/// # Examples
///
/// ```
/// use algorithms::dynamic_programming::ex6_edit_distance::min_distance;
///
/// assert_eq!(min_distance("horse", "ros"), 3);
/// // horse -> rorse -> rose -> ros
///
/// assert_eq!(min_distance("intention", "execution"), 5);
/// ```
///
/// Time Complexity: O(m × n) where m, n are string lengths
/// Space Complexity: O(m × n) for DP table

/// Find minimum edit distance between two strings.
pub fn min_distance(word1: &str, word2: &str) -> usize {
    // TODO: Implement edit distance using 2D DP
    // Create 2D vector dp[m+1][n+1]
    // dp[i][j] = min operations to convert word1[0..i-1] to word2[0..j-1]
    //
    // Base cases:
    //   dp[0][j] = j (insert j characters)
    //   dp[i][0] = i (delete i characters)
    //
    // If word1[i-1] == word2[j-1]:
    //   dp[i][j] = dp[i-1][j-1] (no operation needed)
    // Else:
    //   dp[i][j] = 1 + min(
    //     dp[i-1][j],    // delete from word1
    //     dp[i][j-1],    // insert into word1
    //     dp[i-1][j-1]   // replace in word1
    //   )
    unimplemented!("Not implemented yet")
}

/// Space-optimized version using only O(n) space.
#[allow(dead_code)]
pub fn min_distance_optimized(word1: &str, word2: &str) -> usize {
    // TODO: Optional - implement space-optimized version
    // Use only two rows of the DP table
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        assert_eq!(min_distance("horse", "ros"), 3);
    }

    #[test]
    fn test_longer_strings() {
        assert_eq!(min_distance("intention", "execution"), 5);
    }

    #[test]
    fn test_identical_strings() {
        assert_eq!(min_distance("abc", "abc"), 0);
    }

    #[test]
    fn test_empty_strings() {
        assert_eq!(min_distance("abc", ""), 3);
        assert_eq!(min_distance("", "abc"), 3);
        assert_eq!(min_distance("", ""), 0);
    }

    #[test]
    fn test_single_character() {
        assert_eq!(min_distance("a", "a"), 0);
        assert_eq!(min_distance("a", "b"), 1);
        assert_eq!(min_distance("a", ""), 1);
        assert_eq!(min_distance("", "a"), 1);
    }

    #[test]
    fn test_only_inserts() {
        assert_eq!(min_distance("", "abc"), 3);
    }

    #[test]
    fn test_only_deletes() {
        assert_eq!(min_distance("abc", ""), 3);
    }

    #[test]
    fn test_only_replaces() {
        assert_eq!(min_distance("abc", "def"), 3);
    }

    #[test]
    fn test_partial_match() {
        assert_eq!(min_distance("sea", "eat"), 2);
    }

    #[test]
    fn test_one_is_substring_of_other() {
        assert_eq!(min_distance("abc", "abcde"), 2);
    }

    #[test]
    fn test_reversed_strings() {
        assert_eq!(min_distance("abc", "cba"), 2);
    }

    #[test]
    fn test_case_matters() {
        assert_eq!(min_distance("Hello", "hello"), 1);
    }
}
