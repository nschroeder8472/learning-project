/// Exercise 5: Async Basics (Hard)
///
/// Introduction to async/await in Rust.
/// This exercise demonstrates basic async concepts without external runtimes.
///
/// Note: For production use, you'd use tokio or async-std
/// Here we show basic async/await patterns
///
/// Difficulty: Hard
/// Topics: Async/Await, Futures, Tasks

use std::future::Future;
use std::pin::Pin;
use std::task::{Context, Poll};
use std::time::Duration;

/// Task 1: Simple async function
///
/// TODO: Create an async function that returns a value
pub async fn task1_simple_async() -> i32 {
    // TODO: Return a value (can be immediate for now)
    unimplemented!("Not implemented yet")
}

/// Task 2: Async with delay
///
/// TODO: Simulate async work with a delay
/// Note: We'll use a simple future for demonstration
pub async fn task2_async_delay(millis: u64) -> String {
    // TODO: Create future that completes after delay
    // For testing, we'll just return immediately
    unimplemented!("Not implemented yet")
}

/// Task 3: Combine multiple async operations
///
/// TODO: Run multiple async operations and combine results
pub async fn task3_combine_async(a: i32, b: i32) -> i32 {
    let result1 = task1_simple_async().await;
    let result2 = task1_simple_async().await;
    // TODO: Combine results
    unimplemented!("Not implemented yet")
}

/// Task 4: Custom Future implementation
///
/// TODO: Implement a simple custom Future
pub struct SimpleFuture {
    completed: bool,
}

impl SimpleFuture {
    pub fn new() -> Self {
        // TODO: Initialize
        unimplemented!("Not implemented yet")
    }
}

impl Future for SimpleFuture {
    type Output = i32;

    fn poll(mut self: Pin<&mut Self>, _cx: &mut Context<'_>) -> Poll<Self::Output> {
        // TODO: Implement poll
        // Return Poll::Ready(value) when done, Poll::Pending otherwise
        unimplemented!("Not implemented yet")
    }
}

/// Task 5: Async error handling
///
/// TODO: Handle errors in async functions
pub async fn task5_async_result(value: i32) -> Result<i32, String> {
    // TODO: Return Ok if value > 0, Err otherwise
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_simple_async() {
        // Using futures::executor::block_on would be typical
        // For now, we'll test that it compiles
        let future = task1_simple_async();
        // Can't easily test without runtime, but ensures it compiles
    }

    #[test]
    fn test_async_result() {
        let future = task5_async_result(5);
        // Compiles and type-checks
    }
}
