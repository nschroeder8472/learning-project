/// Exercise: Reverse Array (Easy)
///
/// Reverse a mutable slice in-place.
///
/// Example:
/// Input: &mut [1, 2, 3, 4, 5]
/// Output: [5, 4, 3, 2, 1]
///
/// Time Complexity: O(n)
/// Space Complexity: O(1)

pub fn reverse(arr: &mut [i32]) {
    // TODO: Implement this function
    // Hint: Use two pointers, one at start and one at end
    // Swap elements and move pointers toward center
    // Alternative: Use the built-in reverse() method
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        let mut arr = [1, 2, 3, 4, 5];
        reverse(&mut arr);
        assert_eq!(arr, [5, 4, 3, 2, 1]);
    }

    #[test]
    fn test_even_length() {
        let mut arr = [1, 2, 3, 4];
        reverse(&mut arr);
        assert_eq!(arr, [4, 3, 2, 1]);
    }

    #[test]
    fn test_odd_length() {
        let mut arr = [1, 2, 3];
        reverse(&mut arr);
        assert_eq!(arr, [3, 2, 1]);
    }

    #[test]
    fn test_single_element() {
        let mut arr = [42];
        reverse(&mut arr);
        assert_eq!(arr, [42]);
    }

    #[test]
    fn test_two_elements() {
        let mut arr = [1, 2];
        reverse(&mut arr);
        assert_eq!(arr, [2, 1]);
    }

    #[test]
    fn test_empty_array() {
        let mut arr: [i32; 0] = [];
        reverse(&mut arr);
        assert_eq!(arr, []);
    }
}
