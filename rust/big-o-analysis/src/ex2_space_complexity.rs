/// Exercise 2: Space Complexity Analysis (Easy)
///
/// Analyze the space complexity of each function below. Space complexity measures
/// the additional memory an algorithm uses beyond the input.
///
/// Remember:
/// - Input size doesn't count toward space complexity
/// - Count auxiliary space (variables, data structures, recursion stack)
/// - O(1) = constant space, O(n) = linear space, etc.
///
/// Difficulty: Easy
/// Topics: Space Complexity, Memory Analysis

use std::collections::HashMap;

/// Snippet 1: Sum array elements
pub fn snippet1(arr: &[i32]) -> i32 {
    let mut sum = 0;
    for &num in arr {
        sum += num;
    }
    sum
}

pub fn get_space_complexity_snippet1() -> &'static str {
    // TODO: Return the space complexity of snippet1
    // Hint: How many extra variables do we use regardless of input size?
    unimplemented!("Not implemented yet")
}

/// Snippet 2: Create a copy of the vector
pub fn snippet2(arr: &[i32]) -> Vec<i32> {
    let mut copy = Vec::new();
    for &num in arr {
        copy.push(num);
    }
    copy
}

pub fn get_space_complexity_snippet2() -> &'static str {
    // TODO: Return the space complexity of snippet2
    // Hint: How does the size of 'copy' relate to the input size?
    unimplemented!("Not implemented yet")
}

/// Snippet 3: Recursive factorial
pub fn snippet3(n: u32) -> u64 {
    if n <= 1 {
        return 1;
    }
    n as u64 * snippet3(n - 1)
}

pub fn get_space_complexity_snippet3() -> &'static str {
    // TODO: Return the space complexity of snippet3
    // Hint: Consider the call stack. How many recursive calls are made?
    unimplemented!("Not implemented yet")
}

/// Snippet 4: Create 2D matrix
pub fn snippet4(n: usize) -> Vec<Vec<i32>> {
    let mut matrix = Vec::new();
    for i in 0..n {
        let mut row = Vec::new();
        for j in 0..n {
            row.push((i + j) as i32);
        }
        matrix.push(row);
    }
    matrix
}

pub fn get_space_complexity_snippet4() -> &'static str {
    // TODO: Return the space complexity of snippet4
    // Hint: How many elements are in an n×n matrix?
    unimplemented!("Not implemented yet")
}

/// Snippet 5: Filter vector into new vector
pub fn snippet5(arr: &[i32], threshold: i32) -> Vec<i32> {
    let mut result = Vec::new();
    for &num in arr {
        if num > threshold {
            result.push(num);
        }
    }
    result
}

pub fn get_space_complexity_snippet5() -> &'static str {
    // TODO: Return the space complexity of snippet5
    // Hint: In the worst case, how many elements might be in the result vector?
    unimplemented!("Not implemented yet")
}

/// Snippet 6: Fibonacci with memoization
pub fn snippet6(n: u32, memo: &mut HashMap<u32, u64>) -> u64 {
    if n <= 1 {
        return n as u64;
    }
    if let Some(&result) = memo.get(&n) {
        return result;
    }

    let result = snippet6(n - 1, memo) + snippet6(n - 2, memo);
    memo.insert(n, result);
    result
}

pub fn get_space_complexity_snippet6() -> &'static str {
    // TODO: Return the space complexity of snippet6
    // Hint: Consider both the memo HashMap size and the recursion stack depth
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_snippet1_space_complexity() {
        assert_eq!(get_space_complexity_snippet1(), "O(1)",
            "Only uses a single sum variable - constant space");
    }

    #[test]
    fn test_snippet2_space_complexity() {
        assert_eq!(get_space_complexity_snippet2(), "O(n)",
            "Creates a copy vector of size n - linear space");
    }

    #[test]
    fn test_snippet3_space_complexity() {
        assert_eq!(get_space_complexity_snippet3(), "O(n)",
            "Recursion stack depth is n - linear space");
    }

    #[test]
    fn test_snippet4_space_complexity() {
        assert_eq!(get_space_complexity_snippet4(), "O(n^2)",
            "Creates n×n matrix - quadratic space");
    }

    #[test]
    fn test_snippet5_space_complexity() {
        assert_eq!(get_space_complexity_snippet5(), "O(n)",
            "Worst case: all elements pass filter - linear space");
    }

    #[test]
    fn test_snippet6_space_complexity() {
        assert_eq!(get_space_complexity_snippet6(), "O(n)",
            "Memo stores n values and stack depth is O(n) - linear space");
    }
}
