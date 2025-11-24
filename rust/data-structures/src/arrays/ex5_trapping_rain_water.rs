/// Exercise: Trapping Rain Water (Hard)
///
/// Given a slice representing elevation of bars, calculate how much water
/// can be trapped after raining.
///
/// Example:
/// Input: &[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
/// Output: 6
///
/// Visualization:
///        █
///    █   █ █   █
///  █ █ █ █ █ █ █
/// [0,1,0,2,1,0,1,3,2,1,2,1]
///
/// Time Complexity: O(n)
/// Space Complexity: O(1) for optimal solution

pub fn trap(height: &[i32]) -> i32 {
    // TODO: Implement this function
    // Hint: For each position, water level = min(max_left, max_right) - current_height
    // Approach 1: Precompute max_left and max_right vectors (O(n) space)
    // Approach 2: Use two pointers for O(1) space
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_basic_case() {
        assert_eq!(trap(&[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]), 6);
    }

    #[test]
    fn test_no_water_trapped() {
        assert_eq!(trap(&[1, 2, 3, 4, 5]), 0);
    }

    #[test]
    fn test_simple_case() {
        assert_eq!(trap(&[3, 0, 2, 0, 4]), 7);
    }

    #[test]
    fn test_two_barriers() {
        assert_eq!(trap(&[4, 0, 0, 0, 4]), 12);
    }

    #[test]
    fn test_empty_slice() {
        assert_eq!(trap(&[]), 0);
    }

    #[test]
    fn test_single_element() {
        assert_eq!(trap(&[5]), 0);
    }

    #[test]
    fn test_two_elements() {
        assert_eq!(trap(&[3, 2]), 0);
    }

    #[test]
    fn test_descending_then_ascending() {
        assert_eq!(trap(&[5, 2, 1, 2, 1, 5]), 14);
    }
}
