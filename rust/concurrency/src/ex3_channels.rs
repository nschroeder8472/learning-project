/// Exercise 3: Message Passing with Channels (Medium)
///
/// Learn to use channels for thread communication.
/// This exercise covers:
/// - mpsc (multiple producer, single consumer) channels
/// - Sending and receiving messages
/// - Producer-consumer patterns
///
/// Difficulty: Medium
/// Topics: Channels, Message Passing, Producer-Consumer

use std::sync::mpsc;
use std::thread;
use std::time::Duration;

/// Task 1: Simple producer-consumer
///
/// TODO: Producer sends numbers, consumer receives and sums them
pub fn task1_simple_channel(count: usize) -> i32 {
    // TODO: Create channel, spawn producer and consumer threads
    unimplemented!("Not implemented yet")
}

/// Task 2: Multiple producers, single consumer
///
/// TODO: Multiple threads send messages to one receiver
pub fn task2_multiple_producers(num_producers: usize, msgs_per_producer: usize) -> Vec<String> {
    // TODO: Clone sender for each producer
    unimplemented!("Not implemented yet")
}

/// Task 3: Bounded channel (rendezvous)
///
/// TODO: Use sync_channel for bounded buffer
/// Hint: mpsc::sync_channel(capacity)
pub fn task3_bounded_channel(capacity: usize) -> usize {
    // TODO: Create sync_channel with limited capacity
    unimplemented!("Not implemented yet")
}

/// Task 4: Fan-out pattern
///
/// TODO: One producer, multiple consumers (requires multiple channels)
pub fn task4_fan_out(num_consumers: usize) -> Vec<i32> {
    // TODO: Create channel for each consumer, distribute work
    unimplemented!("Not implemented yet")
}

/// Task 5: Pipeline pattern
///
/// TODO: Chain threads with channels (A -> B -> C)
pub fn task5_pipeline(input: Vec<i32>) -> Vec<i32> {
    // TODO: Stage 1: receive and multiply by 2
    // TODO: Stage 2: receive and add 10
    // TODO: Stage 3: collect results
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_simple_channel() {
        let sum = task1_simple_channel(10);
        assert_eq!(sum, 45); // Sum of 0..10
    }

    #[test]
    fn test_multiple_producers() {
        let messages = task2_multiple_producers(5, 10);
        assert_eq!(messages.len(), 50);
    }

    #[test]
    fn test_bounded_channel() {
        let count = task3_bounded_channel(5);
        assert!(count > 0);
    }

    #[test]
    fn test_fan_out() {
        let results = task4_fan_out(3);
        assert_eq!(results.len(), 3);
    }

    #[test]
    fn test_pipeline() {
        let input = vec![1, 2, 3, 4, 5];
        let output = task5_pipeline(input);
        // Each number: *2, then +10
        assert_eq!(output, vec![12, 14, 16, 18, 20]);
    }
}
