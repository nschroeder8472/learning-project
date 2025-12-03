/// Exercise 1: Basic Threading (Easy)
///
/// Learn the fundamentals of creating and managing threads in Rust.
/// This exercise covers:
/// - Creating threads with thread::spawn()
/// - Joining threads with JoinHandle
/// - Moving data into threads
/// - Basic parallel execution
///
/// Difficulty: Easy
/// Topics: Threads, JoinHandle, Ownership

use std::thread;
use std::time::Duration;

/// Task 1: Create and run a simple thread
///
/// TODO: Spawn a thread that prints numbers 1-5
/// Hint: Use thread::spawn() with a closure
pub fn task1_simple_thread() {
    // TODO: Implement this
    unimplemented!("Not implemented yet")
}

/// Task 2: Create multiple threads and wait for all to complete
///
/// TODO: Spawn num_threads threads and return their names/ids
/// Hint: Store JoinHandles and call .join() on each
pub fn task2_multiple_threads(num_threads: usize) -> Vec<String> {
    // TODO: Implement this
    unimplemented!("Not implemented yet")
}

/// Task 3: Move data into thread
///
/// TODO: Move a vector into a thread and compute its sum
/// Hint: Use 'move' keyword in closure
pub fn task3_move_into_thread(data: Vec<i32>) -> i32 {
    // TODO: Implement this
    unimplemented!("Not implemented yet")
}

/// Task 4: Parallel sum using multiple threads
///
/// TODO: Divide array into chunks and sum each chunk in parallel
/// Hint: Split the slice and spawn thread for each chunk
pub fn task4_parallel_sum(data: &[i32], num_threads: usize) -> i32 {
    // TODO: Implement this
    unimplemented!("Not implemented yet")
}

/// Task 5: Thread builder with custom name
///
/// TODO: Use thread::Builder to create named thread
/// Hint: thread::Builder::new().name("custom").spawn(...)
pub fn task5_named_thread(name: &str) -> String {
    // TODO: Implement this - spawn named thread and return its name
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_simple_thread() {
        task1_simple_thread();
    }

    #[test]
    fn test_multiple_threads() {
        let names = task2_multiple_threads(5);
        assert_eq!(names.len(), 5);
    }

    #[test]
    fn test_move_into_thread() {
        let data = vec![1, 2, 3, 4, 5];
        let sum = task3_move_into_thread(data);
        assert_eq!(sum, 15);
    }

    #[test]
    fn test_parallel_sum() {
        let data: Vec<i32> = (1..=100).collect();
        let sum = task4_parallel_sum(&data, 4);
        assert_eq!(sum, 5050);
    }

    #[test]
    fn test_named_thread() {
        let name = task5_named_thread("my-thread");
        assert_eq!(name, "my-thread");
    }
}
