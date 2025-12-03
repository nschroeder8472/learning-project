/// Exercise 6: Send and Sync Traits (Hard)
///
/// Understand Rust's thread safety guarantees through Send and Sync.
/// This exercise explores what makes types thread-safe.
///
/// - Send: Can be transferred across thread boundaries
/// - Sync: Can be referenced from multiple threads (T is Sync if &T is Send)
///
/// Difficulty: Hard
/// Topics: Send, Sync, Thread Safety, Type System

use std::cell::RefCell;
use std::rc::Rc;
use std::sync::{Arc, Mutex};
use std::thread;

/// Task 1: Identify Send types
///
/// TODO: Which of these can be sent between threads?
pub fn task1_send_types() {
    // Vec<i32> is Send
    let vec = vec![1, 2, 3];
    thread::spawn(move || {
        println!("{:?}", vec);
    }).join().unwrap();

    // String is Send
    let string = String::from("hello");
    thread::spawn(move || {
        println!("{}", string);
    }).join().unwrap();

    // TODO: Try uncommenting - Rc is NOT Send
    // let rc = Rc::new(5);
    // thread::spawn(move || {
    //     println!("{}", rc);
    // });

    // Arc IS Send
    let arc = Arc::new(5);
    let arc_clone = Arc::clone(&arc);
    thread::spawn(move || {
        println!("{}", arc_clone);
    }).join().unwrap();
}

/// Task 2: Identify Sync types
///
/// TODO: Which types can be shared across threads?
pub fn task2_sync_types() {
    // i32 is Sync (& i32 is Send)
    let num = 42;
    let handle = thread::spawn(move || {
        let reference = &num;  // Can reference from new thread
    });

    // TODO: RefCell is NOT Sync
    // let cell = RefCell::new(5);
    // thread::spawn(|| {
    //     let _ = &cell; // Won't compile!
    // });

    // Mutex IS Sync
    let mutex = Arc::new(Mutex::new(5));
    let mutex_clone = Arc::clone(&mutex);
    thread::spawn(move || {
        let _guard = mutex_clone.lock().unwrap();
    }).join().unwrap();
}

/// Task 3: Create Send + Sync wrapper
///
/// TODO: Implement a thread-safe counter
pub struct ThreadSafeCounter {
    count: Arc<Mutex<i32>>,
}

impl ThreadSafeCounter {
    pub fn new() -> Self {
        // TODO: Initialize with Arc<Mutex<...>>
        unimplemented!("Not implemented yet")
    }

    pub fn increment(&self) {
        // TODO: Increment counter
        unimplemented!("Not implemented yet")
    }

    pub fn get(&self) -> i32 {
        // TODO: Get current value
        unimplemented!("Not implemented yet")
    }
}

// ThreadSafeCounter is automatically Send + Sync because Arc<Mutex<i32>> is

/// Task 4: Demonstrate why RefCell isn't Sync
///
/// This shows that interior mutability without synchronization isn't thread-safe
pub fn task4_refcell_not_sync() {
    // RefCell allows interior mutability but isn't thread-safe
    // It's designed for single-threaded scenarios

    let cell = RefCell::new(vec![1, 2, 3]);

    // This works in single thread:
    cell.borrow_mut().push(4);
    println!("{:?}", cell.borrow());

    // But can't share across threads:
    // let cell_clone = &cell;
    // thread::spawn(move || {
    //     cell_clone.borrow_mut().push(5); // Won't compile!
    // });
}

/// Task 5: Safe shared mutable state
///
/// TODO: Share mutable Vec across threads safely
pub fn task5_shared_mutable_state() -> Vec<i32> {
    // TODO: Create Arc<Mutex<Vec<i32>>>
    // TODO: Spawn threads that add elements
    // TODO: Return final vector
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_send_types() {
        task1_send_types();
    }

    #[test]
    fn test_sync_types() {
        task2_sync_types();
    }

    #[test]
    fn test_thread_safe_counter() {
        let counter = ThreadSafeCounter::new();

        let handles: Vec<_> = (0..10).map(|_| {
            let counter_clone = counter.clone();
            thread::spawn(move || {
                for _ in 0..100 {
                    counter_clone.increment();
                }
            })
        }).collect();

        for handle in handles {
            handle.join().unwrap();
        }

        assert_eq!(counter.get(), 1000);
    }

    #[test]
    fn test_refcell_not_sync() {
        task4_refcell_not_sync();
    }

    #[test]
    fn test_shared_mutable_state() {
        let vec = task5_shared_mutable_state();
        assert!(vec.len() > 0);
    }
}

// Needed for Clone on ThreadSafeCounter
impl Clone for ThreadSafeCounter {
    fn clone(&self) -> Self {
        ThreadSafeCounter {
            count: Arc::clone(&self.count),
        }
    }
}
