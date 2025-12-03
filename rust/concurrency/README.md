# Concurrency

## Overview

Rust's ownership system and type system provide compile-time guarantees about thread safety. The `Send` and `Sync` traits ensure that data can be safely transferred or shared between threads.

## Key Concepts

### Ownership and Threads
- Ownership rules prevent data races at compile time
- **Send**: Types that can be transferred between threads
- **Sync**: Types that can be safely referenced from multiple threads

### Threading (`std::thread`)
- Native OS threads
- `thread::spawn()` creates new threads
- `JoinHandle` for waiting on threads

### Synchronization Primitives
- **Mutex<T>**: Mutual exclusion lock
- **RwLock<T>**: Read-write lock (multiple readers OR one writer)
- **Arc<T>**: Atomic Reference Counting for shared ownership

### Message Passing (`std::sync::mpsc`)
- Multiple Producer, Single Consumer channels
- `send()` and `recv()` for thread communication
- Ownership-based safety

### Async/Await
- Futures and async functions
- `async fn` and `await` keywords
- Requires runtime like Tokio or async-std
- Zero-cost abstractions

## Common Patterns

### Shared State with Arc<Mutex<T>>
Share mutable data between threads safely.

### Message Passing
Threads communicate by sending messages through channels.

### Scoped Threads
Borrow local data safely with scoped threads.

## Why Rust Concurrency is Safe

- **No data races**: Prevented by ownership and borrowing rules
- **No use-after-free**: Prevented by lifetime system
- **Type safety**: Send/Sync traits ensure thread-safe types
- **Fearless concurrency**: Compiler catches concurrency bugs

## Exercises

1. **ex1_basic_threading**: Thread creation, joining, parallel work
2. **ex2_shared_state**: Mutex, RwLock, Arc for shared state
3. **ex3_channels**: Message passing with mpsc channels
4. **ex4_thread_pools**: Using Rayon for parallel iterators
5. **ex5_async_await**: Async/await with basic runtime
6. **ex6_sync_traits**: Understanding Send and Sync

## Testing

```bash
cd rust/concurrency
cargo test
```
