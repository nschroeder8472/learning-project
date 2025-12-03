/// Exercise 4: Parallelism and Thread Pools (Medium)
///
/// Learn about parallel iteration and thread pools.
/// This exercise uses rayon for data parallelism.
///
/// Note: This requires adding 'rayon' to Cargo.toml
/// For now, we'll implement manual thread pool patterns.
///
/// Difficulty: Medium
/// Topics: Thread Pools, Parallel Iteration, Work Distribution

use std::sync::{Arc, Mutex};
use std::sync::mpsc;
use std::thread;

/// Task 1: Simple thread pool
///
/// TODO: Create a fixed number of worker threads that process jobs
pub struct ThreadPool {
    workers: Vec<thread::JoinHandle<()>>,
    sender: Option<mpsc::Sender<Job>>,
}

type Job = Box<dyn FnOnce() + Send + 'static>;

impl ThreadPool {
    pub fn new(size: usize) -> ThreadPool {
        // TODO: Create workers and channel for jobs
        unimplemented!("Not implemented yet")
    }

    pub fn execute<F>(&self, f: F)
    where
        F: FnOnce() + Send + 'static,
    {
        // TODO: Send job to workers
        unimplemented!("Not implemented yet")
    }
}

impl Drop for ThreadPool {
    fn drop(&mut self) {
        // TODO: Signal workers to shut down and join them
        unimplemented!("Not implemented yet")
    }
}

/// Task 2: Parallel map
///
/// TODO: Apply function to each element in parallel
pub fn task2_parallel_map<F>(data: Vec<i32>, f: F) -> Vec<i32>
where
    F: Fn(i32) -> i32 + Send + Sync + 'static,
{
    // TODO: Split data, process in parallel, combine results
    unimplemented!("Not implemented yet")
}

/// Task 3: Parallel reduce
///
/// TODO: Sum all elements using multiple threads
pub fn task3_parallel_reduce(data: &[i32], num_threads: usize) -> i32 {
    // TODO: Divide work among threads, sum partial results
    unimplemented!("Not implemented yet")
}

/// Task 4: Parallel filter
///
/// TODO: Filter elements in parallel
pub fn task4_parallel_filter<F>(data: Vec<i32>, predicate: F) -> Vec<i32>
where
    F: Fn(&i32) -> bool + Send + Sync + 'static,
{
    // TODO: Filter in parallel and combine results
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_thread_pool() {
        let pool = ThreadPool::new(4);
        let counter = Arc::new(Mutex::new(0));

        for _ in 0..10 {
            let counter = Arc::clone(&counter);
            pool.execute(move || {
                let mut num = counter.lock().unwrap();
                *num += 1;
            });
        }

        // Give threads time to complete
        std::thread::sleep(std::time::Duration::from_millis(100));
        assert_eq!(*counter.lock().unwrap(), 10);
    }

    #[test]
    fn test_parallel_map() {
        let data = vec![1, 2, 3, 4, 5];
        let results = task2_parallel_map(data, |x| x * 2);
        assert_eq!(results, vec![2, 4, 6, 8, 10]);
    }

    #[test]
    fn test_parallel_reduce() {
        let data: Vec<i32> = (1..=100).collect();
        let sum = task3_parallel_reduce(&data, 4);
        assert_eq!(sum, 5050);
    }

    #[test]
    fn test_parallel_filter() {
        let data = vec![1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
        let results = task4_parallel_filter(data, |&x| x % 2 == 0);
        assert_eq!(results, vec![2, 4, 6, 8, 10]);
    }
}
