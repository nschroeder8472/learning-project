/// Exercise: Group Anagrams (Medium)
///
/// Given a slice of strings strs, group the anagrams together.
/// You can return the answer in any order.
///
/// An Anagram is a word or phrase formed by rearranging the letters of a
/// different word or phrase, typically using all the original letters exactly once.
///
/// Example:
/// Input: strs = &["eat", "tea", "tan", "ate", "nat", "bat"]
/// Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]] (in any order)
///
/// Example 2:
/// Input: strs = &[""]
/// Output: [[""]]
///
/// Example 3:
/// Input: strs = &["a"]
/// Output: [["a"]]
///
/// Time Complexity: O(n * k log k) where n is the number of strings and k is the max length
/// Space Complexity: O(n * k)

pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {
    // TODO: Implement this function
    // Hint: Sort each string to use as a key in a HashMap
    // Strings with the same sorted form are anagrams
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;
    use std::collections::HashSet;

    #[test]
    fn test_basic_case() {
        let strs = vec![
            "eat".to_string(),
            "tea".to_string(),
            "tan".to_string(),
            "ate".to_string(),
            "nat".to_string(),
            "bat".to_string(),
        ];
        let result = group_anagrams(strs);
        assert_eq!(result.len(), 3);

        // Convert to sets for easier comparison
        let result_sets: HashSet<HashSet<String>> = result
            .into_iter()
            .map(|group| group.into_iter().collect())
            .collect();

        assert!(result_sets.contains(&["eat", "tea", "ate"].iter().map(|s| s.to_string()).collect()));
        assert!(result_sets.contains(&["tan", "nat"].iter().map(|s| s.to_string()).collect()));
        assert!(result_sets.contains(&["bat"].iter().map(|s| s.to_string()).collect()));
    }

    #[test]
    fn test_empty_string() {
        let strs = vec!["".to_string()];
        let result = group_anagrams(strs);
        assert_eq!(result.len(), 1);
        assert_eq!(result[0].len(), 1);
        assert_eq!(result[0][0], "");
    }

    #[test]
    fn test_single_string() {
        let strs = vec!["a".to_string()];
        let result = group_anagrams(strs);
        assert_eq!(result.len(), 1);
        assert_eq!(result[0].len(), 1);
        assert_eq!(result[0][0], "a");
    }

    #[test]
    fn test_no_anagrams() {
        let strs = vec!["abc".to_string(), "def".to_string(), "ghi".to_string()];
        let result = group_anagrams(strs);
        assert_eq!(result.len(), 3);
    }

    #[test]
    fn test_all_anagrams() {
        let strs = vec!["abc".to_string(), "bca".to_string(), "cab".to_string()];
        let result = group_anagrams(strs);
        assert_eq!(result.len(), 1);
        assert_eq!(result[0].len(), 3);
    }

    #[test]
    fn test_different_lengths() {
        let strs = vec![
            "a".to_string(),
            "ab".to_string(),
            "ba".to_string(),
            "abc".to_string(),
            "bca".to_string(),
        ];
        let result = group_anagrams(strs);
        assert_eq!(result.len(), 3);
    }
}
