/// Exercise 3: Best, Worst, and Average Case Analysis (Medium)
///
/// For each algorithm below, determine the time complexity for:
/// - Best case: Most favorable input
/// - Worst case: Least favorable input
/// - Average case: Typical/random input
///
/// Return format: "O(...)" (e.g., "O(n)", "O(1)", "O(n^2)")
///
/// Difficulty: Medium
/// Topics: Big O Analysis, Algorithm Analysis, Case Analysis

/// Linear Search: Find target in array
pub fn linear_search(arr: &[i32], target: i32) -> Option<usize> {
    for (i, &val) in arr.iter().enumerate() {
        if val == target {
            return Some(i);
        }
    }
    None
}

pub fn linear_search_best_case() -> &'static str {
    // TODO: What's the best case? When is the target found fastest?
    unimplemented!("Not implemented yet")
}

pub fn linear_search_worst_case() -> &'static str {
    // TODO: What's the worst case? When do we search the longest?
    unimplemented!("Not implemented yet")
}

pub fn linear_search_average_case() -> &'static str {
    // TODO: On average, where might the target be in a random array?
    unimplemented!("Not implemented yet")
}

/// Insertion Sort: Sort array by inserting elements in correct position
pub fn insertion_sort(arr: &mut [i32]) {
    for i in 1..arr.len() {
        let key = arr[i];
        let mut j = i;
        while j > 0 && arr[j - 1] > key {
            arr[j] = arr[j - 1];
            j -= 1;
        }
        arr[j] = key;
    }
}

pub fn insertion_sort_best_case() -> &'static str {
    // TODO: When does insertion sort perform best? (Hint: what if array is already sorted?)
    unimplemented!("Not implemented yet")
}

pub fn insertion_sort_worst_case() -> &'static str {
    // TODO: When does insertion sort perform worst? (Hint: reverse sorted?)
    unimplemented!("Not implemented yet")
}

pub fn insertion_sort_average_case() -> &'static str {
    // TODO: What's the average case for random data?
    unimplemented!("Not implemented yet")
}

/// Quick Sort: Divide and conquer sorting
pub fn quick_sort(arr: &mut [i32], low: isize, high: isize) {
    if low < high {
        let pivot_index = partition(arr, low, high);
        quick_sort(arr, low, pivot_index - 1);
        quick_sort(arr, pivot_index + 1, high);
    }
}

fn partition(arr: &mut [i32], low: isize, high: isize) -> isize {
    let pivot = arr[high as usize];
    let mut i = low - 1;

    for j in low..high {
        if arr[j as usize] <= pivot {
            i += 1;
            arr.swap(i as usize, j as usize);
        }
    }
    arr.swap((i + 1) as usize, high as usize);
    i + 1
}

pub fn quick_sort_best_case() -> &'static str {
    // TODO: When does quicksort perform best? (Hint: balanced partitions)
    unimplemented!("Not implemented yet")
}

pub fn quick_sort_worst_case() -> &'static str {
    // TODO: When does quicksort perform worst? (Hint: unbalanced partitions)
    unimplemented!("Not implemented yet")
}

pub fn quick_sort_average_case() -> &'static str {
    // TODO: What's the average case complexity?
    unimplemented!("Not implemented yet")
}

/// Binary Search: Find target in sorted array
pub fn binary_search(arr: &[i32], target: i32) -> Option<usize> {
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

pub fn binary_search_best_case() -> &'static str {
    // TODO: Best case for binary search?
    unimplemented!("Not implemented yet")
}

pub fn binary_search_worst_case() -> &'static str {
    // TODO: Worst case for binary search?
    unimplemented!("Not implemented yet")
}

pub fn binary_search_average_case() -> &'static str {
    // TODO: Average case for binary search?
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_linear_search_cases() {
        assert_eq!(linear_search_best_case(), "O(1)",
            "Best case: target is first element");
        assert_eq!(linear_search_worst_case(), "O(n)",
            "Worst case: target is last or not present");
        assert_eq!(linear_search_average_case(), "O(n)",
            "Average case: still linear");
    }

    #[test]
    fn test_insertion_sort_cases() {
        assert_eq!(insertion_sort_best_case(), "O(n)",
            "Best case: already sorted array");
        assert_eq!(insertion_sort_worst_case(), "O(n^2)",
            "Worst case: reverse sorted array");
        assert_eq!(insertion_sort_average_case(), "O(n^2)",
            "Average case: quadratic");
    }

    #[test]
    fn test_quick_sort_cases() {
        assert_eq!(quick_sort_best_case(), "O(n log n)",
            "Best case: balanced partitions");
        assert_eq!(quick_sort_worst_case(), "O(n^2)",
            "Worst case: unbalanced partitions (e.g., already sorted with last element as pivot)");
        assert_eq!(quick_sort_average_case(), "O(n log n)",
            "Average case: typically balanced partitions");
    }

    #[test]
    fn test_binary_search_cases() {
        assert_eq!(binary_search_best_case(), "O(1)",
            "Best case: target is middle element");
        assert_eq!(binary_search_worst_case(), "O(log n)",
            "Worst case: target requires full binary divisions");
        assert_eq!(binary_search_average_case(), "O(log n)",
            "Average case: logarithmic");
    }
}
