/// Exercise: First Non-Repeating Character (Medium)
///
/// Given a string s, find the first non-repeating character in it and return its index.
/// If it does not exist, return None.
///
/// Example:
/// Input: s = "leetcode"
/// Output: Some(0)
/// Explanation: 'l' is the first character that does not repeat
///
/// Example 2:
/// Input: s = "loveleetcode"
/// Output: Some(2)
/// Explanation: 'v' is the first non-repeating character
///
/// Example 3:
/// Input: s = "aabb"
/// Output: None
///
/// Time Complexity: O(n)
/// Space Complexity: O(1) - at most 26 lowercase English letters

pub fn first_uniq_char(s: &str) -> Option<usize> {
    // TODO: Implement this function
    // Hint: First pass - count character frequencies using a HashMap
    // Second pass - find the first character with count 1
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        assert_eq!(first_uniq_char("leetcode"), Some(0));
    }

    #[test]
    fn test_middle_character() {
        assert_eq!(first_uniq_char("loveleetcode"), Some(2));
    }

    #[test]
    fn test_all_duplicates() {
        assert_eq!(first_uniq_char("aabb"), None);
    }

    #[test]
    fn test_single_character() {
        assert_eq!(first_uniq_char("a"), Some(0));
    }

    #[test]
    fn test_all_unique() {
        assert_eq!(first_uniq_char("abcd"), Some(0));
    }

    #[test]
    fn test_last_character_unique() {
        assert_eq!(first_uniq_char("aabbccz"), Some(6));
    }

    #[test]
    fn test_repeating_pattern() {
        assert_eq!(first_uniq_char("dddccdbba"), Some(8));
    }
}
