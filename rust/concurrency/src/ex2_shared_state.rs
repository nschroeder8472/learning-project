/// Exercise 2: Shared State (Medium)
///
/// Learn to share mutable state safely between threads.
/// This exercise covers:
/// - Mutex<T> for mutual exclusion
/// - Arc<T> for shared ownership
/// - RwLock<T> for read-write locking
///
/// Difficulty: Medium
/// Topics: Mutex, Arc, RwLock, Interior Mutability

use std::sync::{Arc, Mutex, RwLock};
use std::thread;

/// Task 1: Thread-safe counter using Mutex
///
/// TODO: Implement thread-safe counter with Arc<Mutex<i32>>
pub fn task1_mutex_counter(num_threads: usize, increments_per_thread: usize) -> i32 {
    // TODO: Create Arc<Mutex<i32>>, clone for each thread, increment
    unimplemented!("Not implemented yet")
}

/// Task 2: Shared vector with Mutex
///
/// TODO: Multiple threads add items to shared Vec
pub fn task2_shared_vector(num_threads: usize) -> Vec<i32> {
    // TODO: Share Vec<i32> with Arc<Mutex<...>>
    unimplemented!("Not implemented yet")
}

/// Task 3: Read-write lock for cache
///
/// TODO: Use RwLock for read-heavy workload
/// Hint: RwLock allows multiple readers OR one writer
pub fn task3_rwlock_cache() -> String {
    // TODO: Create Arc<RwLock<String>>, spawn readers and writers
    unimplemented!("Not implemented yet")
}

/// Task 4: Bank account transfers
///
/// TODO: Implement thread-safe transfers between accounts
pub struct BankAccount {
    balance: Arc<Mutex<f64>>,
}

impl BankAccount {
    pub fn new(initial: f64) -> Self {
        // TODO: Initialize with Arc<Mutex<...>>
        unimplemented!("Not implemented yet")
    }

    pub fn deposit(&self, amount: f64) {
        // TODO: Lock and add to balance
        unimplemented!("Not implemented yet")
    }

    pub fn withdraw(&self, amount: f64) -> bool {
        // TODO: Lock, check balance, withdraw if sufficient
        unimplemented!("Not implemented yet")
    }

    pub fn balance(&self) -> f64 {
        // TODO: Return current balance
        unimplemented!("Not implemented yet")
    }
}

/// Task 5: Deadlock-free transfer
///
/// TODO: Transfer between accounts without deadlock
/// Hint: Use consistent lock ordering
pub fn transfer(from: &BankAccount, to: &BankAccount, amount: f64) -> bool {
    // TODO: Implement deadlock-free transfer
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_mutex_counter() {
        let count = task1_mutex_counter(10, 1000);
        assert_eq!(count, 10000);
    }

    #[test]
    fn test_shared_vector() {
        let vec = task2_shared_vector(10);
        assert_eq!(vec.len(), 10);
    }

    #[test]
    fn test_rwlock_cache() {
        let result = task3_rwlock_cache();
        assert!(!result.is_empty());
    }

    #[test]
    fn test_bank_account() {
        let account = BankAccount::new(1000.0);
        account.deposit(500.0);
        assert_eq!(account.balance(), 1500.0);
        assert!(account.withdraw(200.0));
        assert_eq!(account.balance(), 1300.0);
    }

    #[test]
    fn test_transfer() {
        let acc1 = BankAccount::new(1000.0);
        let acc2 = BankAccount::new(500.0);
        assert!(transfer(&acc1, &acc2, 300.0));
        assert_eq!(acc1.balance(), 700.0);
        assert_eq!(acc2.balance(), 800.0);
    }
}
