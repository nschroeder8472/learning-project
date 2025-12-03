/// Exercise 1: Identify Time Complexity (Easy)
///
/// For each function below, identify its time complexity in Big O notation.
/// Implement the get_complexity() functions to return the correct complexity as a string.
///
/// Examples of valid return values: "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(n^2)", "O(2^n)"
///
/// Difficulty: Easy
/// Topics: Big O Analysis, Algorithm Analysis

/// Snippet 1: Simple array access
pub fn snippet1(arr: &[i32], index: usize) -> i32 {
    arr[index]
}

pub fn get_complexity_snippet1() -> &'static str {
    // TODO: Return the time complexity of snippet1
    // Hint: How does the operation change when array size increases?
    unimplemented!("Not implemented yet")
}

/// Snippet 2: Linear search
pub fn snippet2(arr: &[i32], target: i32) -> Option<usize> {
    for (i, &val) in arr.iter().enumerate() {
        if val == target {
            return Some(i);
        }
    }
    None
}

pub fn get_complexity_snippet2() -> &'static str {
    // TODO: Return the time complexity of snippet2
    // Hint: How many elements might we need to check in the worst case?
    unimplemented!("Not implemented yet")
}

/// Snippet 3: Binary search (assume arr is sorted)
pub fn snippet3(arr: &[i32], target: i32) -> Option<usize> {
    let mut left = 0;
    let mut right = arr.len();

    while left < right {
        let mid = left + (right - left) / 2;
        if arr[mid] == target {
            return Some(mid);
        }
        if arr[mid] < target {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    None
}

pub fn get_complexity_snippet3() -> &'static str {
    // TODO: Return the time complexity of snippet3
    // Hint: How does the search space change with each iteration?
    unimplemented!("Not implemented yet")
}

/// Snippet 4: Nested loops - count all pairs
pub fn snippet4(arr: &[i32]) -> usize {
    let mut count = 0;
    for i in 0..arr.len() {
        for j in 0..arr.len() {
            count += 1;
        }
    }
    count
}

pub fn get_complexity_snippet4() -> &'static str {
    // TODO: Return the time complexity of snippet4
    // Hint: How many times does the inner loop execute?
    unimplemented!("Not implemented yet")
}

/// Snippet 5: Two separate loops
pub fn snippet5(arr1: &[i32], arr2: &[i32]) -> usize {
    let mut count = 0;
    for _ in arr1 {
        count += 1;
    }
    for _ in arr2 {
        count += 1;
    }
    count
}

pub fn get_complexity_snippet5() -> &'static str {
    // TODO: Return the time complexity of snippet5
    // Hint: The loops are independent. For this exercise, assume both arrays have size n.
    unimplemented!("Not implemented yet")
}

/// Snippet 6: Finding duplicates with nested loops
pub fn snippet6(arr: &[i32]) -> bool {
    for i in 0..arr.len() {
        for j in (i + 1)..arr.len() {
            if arr[i] == arr[j] {
                return true;
            }
        }
    }
    false
}

pub fn get_complexity_snippet6() -> &'static str {
    // TODO: Return the time complexity of snippet6
    // Hint: Even though j starts at i+1, this is still a nested loop pattern.
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_snippet1_complexity() {
        assert_eq!(get_complexity_snippet1(), "O(1)",
            "Array access is constant time");
    }

    #[test]
    fn test_snippet2_complexity() {
        assert_eq!(get_complexity_snippet2(), "O(n)",
            "Linear search has linear time complexity");
    }

    #[test]
    fn test_snippet3_complexity() {
        assert_eq!(get_complexity_snippet3(), "O(log n)",
            "Binary search has logarithmic time complexity");
    }

    #[test]
    fn test_snippet4_complexity() {
        assert_eq!(get_complexity_snippet4(), "O(n^2)",
            "Nested loops over same array is quadratic");
    }

    #[test]
    fn test_snippet5_complexity() {
        assert_eq!(get_complexity_snippet5(), "O(n)",
            "Two sequential loops is linear (O(n + n) = O(2n) = O(n))");
    }

    #[test]
    fn test_snippet6_complexity() {
        assert_eq!(get_complexity_snippet6(), "O(n^2)",
            "Nested loop for finding duplicates is quadratic");
    }
}
