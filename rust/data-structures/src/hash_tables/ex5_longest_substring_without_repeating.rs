/// Exercise: Longest Substring Without Repeating Characters (Medium)
///
/// Given a string s, find the length of the longest substring without repeating characters.
///
/// Example:
/// Input: s = "abcabcbb"
/// Output: 3
/// Explanation: The answer is "abc", with the length of 3.
///
/// Example 2:
/// Input: s = "bbbbb"
/// Output: 1
/// Explanation: The answer is "b", with the length of 1.
///
/// Example 3:
/// Input: s = "pwwkew"
/// Output: 3
/// Explanation: The answer is "wke", with the length of 3.
/// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
///
/// Time Complexity: O(n)
/// Space Complexity: O(min(m, n)) where m is the charset size

pub fn length_of_longest_substring(s: &str) -> usize {
    // TODO: Implement this function
    // Hint: Use sliding window technique with a HashSet
    // Expand window by adding characters, shrink when you find a duplicate
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        assert_eq!(length_of_longest_substring("abcabcbb"), 3);
    }

    #[test]
    fn test_all_same() {
        assert_eq!(length_of_longest_substring("bbbbb"), 1);
    }

    #[test]
    fn test_mixed_case() {
        assert_eq!(length_of_longest_substring("pwwkew"), 3);
    }

    #[test]
    fn test_empty_string() {
        assert_eq!(length_of_longest_substring(""), 0);
    }

    #[test]
    fn test_single_character() {
        assert_eq!(length_of_longest_substring("a"), 1);
    }

    #[test]
    fn test_all_unique() {
        assert_eq!(length_of_longest_substring("abcdef"), 6);
    }

    #[test]
    fn test_with_spaces() {
        assert_eq!(length_of_longest_substring("a b c a b c"), 3);
    }

    #[test]
    fn test_long_string() {
        assert_eq!(length_of_longest_substring("dvdf"), 3);
    }
}
