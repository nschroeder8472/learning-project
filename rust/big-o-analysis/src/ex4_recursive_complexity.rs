/// Exercise 4: Recursive Complexity Analysis (Medium)
///
/// Analyze the time complexity of recursive algorithms. For each function,
/// determine its time complexity by analyzing the recurrence relation.
///
/// Tips:
/// - Count how many recursive calls are made
/// - Determine how the problem size decreases with each call
/// - Draw a recursion tree if helpful
/// - Use Master Theorem when applicable: T(n) = aT(n/b) + f(n)
///
/// Difficulty: Medium
/// Topics: Recursion, Recurrence Relations, Master Theorem

/// Recursive 1: Simple factorial
pub fn factorial(n: u32) -> u64 {
    if n <= 1 {
        return 1;
    }
    n as u64 * factorial(n - 1)
}

pub fn get_complexity_factorial() -> &'static str {
    // TODO: Analyze factorial's time complexity
    // Hint: How many recursive calls? T(n) = T(n-1) + O(1)
    unimplemented!("Not implemented yet")
}

/// Recursive 2: Naive Fibonacci
pub fn fibonacci(n: u32) -> u64 {
    if n <= 1 {
        return n as u64;
    }
    fibonacci(n - 1) + fibonacci(n - 2)
}

pub fn get_complexity_fibonacci() -> &'static str {
    // TODO: Analyze naive fibonacci's time complexity
    // Hint: Each call makes 2 recursive calls. Draw the tree!
    unimplemented!("Not implemented yet")
}

/// Recursive 3: Binary search (recursive version)
pub fn binary_search(arr: &[i32], target: i32, left: usize, right: usize) -> Option<usize> {
    if left >= right {
        return None;
    }
    let mid = left + (right - left) / 2;
    if arr[mid] == target {
        return Some(mid);
    }
    if arr[mid] > target {
        return binary_search(arr, target, left, mid);
    }
    binary_search(arr, target, mid + 1, right)
}

pub fn get_complexity_binary_search() -> &'static str {
    // TODO: Analyze recursive binary search complexity
    // Hint: How does the search space change? T(n) = T(n/2) + O(1)
    unimplemented!("Not implemented yet")
}

/// Recursive 4: Merge sort
pub fn merge_sort(arr: &mut [i32]) {
    let len = arr.len();
    if len <= 1 {
        return;
    }

    let mid = len / 2;
    merge_sort(&mut arr[0..mid]);
    merge_sort(&mut arr[mid..len]);

    let mut temp = arr.to_vec();
    merge(&arr[0..mid], &arr[mid..len], &mut temp);
    arr.copy_from_slice(&temp);
}

fn merge(left: &[i32], right: &[i32], result: &mut [i32]) {
    let mut i = 0;
    let mut j = 0;
    let mut k = 0;

    while i < left.len() && j < right.len() {
        if left[i] <= right[j] {
            result[k] = left[i];
            i += 1;
        } else {
            result[k] = right[j];
            j += 1;
        }
        k += 1;
    }

    while i < left.len() {
        result[k] = left[i];
        i += 1;
        k += 1;
    }

    while j < right.len() {
        result[k] = right[j];
        j += 1;
        k += 1;
    }
}

pub fn get_complexity_merge_sort() -> &'static str {
    // TODO: Analyze merge sort complexity
    // Hint: T(n) = 2T(n/2) + O(n). Use Master Theorem!
    unimplemented!("Not implemented yet")
}

/// Recursive 5: Tower of Hanoi
pub fn tower_of_hanoi(n: u32, _source: char, _destination: char, _auxiliary: char) {
    if n == 1 {
        return; // Move one disk
    }
    tower_of_hanoi(n - 1, _source, _auxiliary, _destination);
    // Move disk from source to destination
    tower_of_hanoi(n - 1, _auxiliary, _destination, _source);
}

pub fn get_complexity_tower_of_hanoi() -> &'static str {
    // TODO: Analyze Tower of Hanoi complexity
    // Hint: Each call makes 2 recursive calls with n-1. T(n) = 2T(n-1) + O(1)
    unimplemented!("Not implemented yet")
}

/// Recursive 6: Sum of array (divide and conquer)
pub fn sum_array(arr: &[i32], left: usize, right: usize) -> i32 {
    if left == right {
        return arr[left];
    }
    let mid = left + (right - left) / 2;
    sum_array(arr, left, mid) + sum_array(arr, mid + 1, right)
}

pub fn get_complexity_sum_array() -> &'static str {
    // TODO: Analyze divide-and-conquer sum complexity
    // Hint: T(n) = 2T(n/2) + O(1). Compare with merge sort!
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_factorial_complexity() {
        assert_eq!(get_complexity_factorial(), "O(n)",
            "Factorial makes n recursive calls");
    }

    #[test]
    fn test_fibonacci_complexity() {
        assert_eq!(get_complexity_fibonacci(), "O(2^n)",
            "Naive Fibonacci has exponential complexity");
    }

    #[test]
    fn test_binary_search_complexity() {
        assert_eq!(get_complexity_binary_search(), "O(log n)",
            "Binary search halves the problem each time");
    }

    #[test]
    fn test_merge_sort_complexity() {
        assert_eq!(get_complexity_merge_sort(), "O(n log n)",
            "Merge sort: T(n) = 2T(n/2) + O(n)");
    }

    #[test]
    fn test_tower_of_hanoi_complexity() {
        assert_eq!(get_complexity_tower_of_hanoi(), "O(2^n)",
            "Tower of Hanoi: T(n) = 2T(n-1) + O(1) = O(2^n)");
    }

    #[test]
    fn test_sum_array_complexity() {
        assert_eq!(get_complexity_sum_array(), "O(n)",
            "Divide-and-conquer sum: T(n) = 2T(n/2) + O(1) = O(n)");
    }
}
