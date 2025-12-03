# Concurrency

## Overview

Concurrency is the ability to execute multiple tasks simultaneously, enabling programs to handle multiple operations at once. Understanding concurrency is essential for building high-performance applications, responsive user interfaces, and scalable systems.

## Key Concepts

### Threads
A thread is the smallest unit of execution within a process. Multiple threads can run concurrently within the same process, sharing memory and resources.

### Synchronization
Coordinating thread access to shared resources to prevent race conditions and ensure data consistency:
- **Locks/Mutexes**: Mutual exclusion to protect critical sections
- **Semaphores**: Control access to a limited number of resources
- **Condition Variables**: Wait for specific conditions to be met

### Common Patterns

#### Producer-Consumer
One or more threads produce data that other threads consume, typically using a queue or buffer.

#### Thread Pools
Reusable pool of threads to execute tasks, avoiding the overhead of creating/destroying threads repeatedly.

#### Async/Await
Write asynchronous code that looks synchronous, improving readability and avoiding callback hell.

### Common Pitfalls

#### Race Conditions
When multiple threads access shared data concurrently, and the outcome depends on timing.

#### Deadlocks
Two or more threads waiting for each other to release resources, causing all to be stuck.

#### Livelocks
Threads continuously change state in response to each other without making progress.

#### Starvation
A thread is perpetually denied access to resources it needs.

## Why Concurrency Matters

1. **Performance**: Utilize multiple CPU cores effectively
2. **Responsiveness**: Keep UI responsive while performing background work
3. **Throughput**: Handle more requests/operations per second
4. **Resource Utilization**: Make better use of available hardware
5. **Scalability**: Scale applications to handle increasing load

## Language-Specific Notes

### Java
- Built-in threading with `Thread` class and `Runnable` interface
- High-level concurrency utilities in `java.util.concurrent`
- `synchronized` keyword for simple locking
- `ExecutorService` for thread pools
- `CompletableFuture` for async operations

### Python
- `threading` module for thread-based concurrency
- `multiprocessing` for process-based parallelism (bypasses GIL)
- `asyncio` for async/await patterns
- **Note**: Global Interpreter Lock (GIL) limits CPU-bound parallelism with threads
- Use threads for I/O-bound tasks, processes for CPU-bound tasks

### Rust
- Ownership system prevents many concurrency bugs at compile time
- `std::thread` for threading
- `Mutex`, `RwLock` for synchronization
- `Arc` (Atomic Reference Counting) for shared ownership
- Channels (`mpsc`) for message passing
- `async`/`await` with runtimes like Tokio
- **Send** and **Sync** traits ensure thread safety

## Exercises

1. **ex1_basic_threading** (Easy): Create and manage threads, basic parallel execution
2. **ex2_shared_state** (Medium): Synchronize access to shared state with locks/mutexes
3. **ex3_producer_consumer** (Medium): Implement producer-consumer pattern with queues
4. **ex4_thread_pools** (Medium): Use thread pools to manage concurrent tasks efficiently
5. **ex5_async_await** (Hard): Implement async/await patterns for concurrent I/O
6. **ex6_race_conditions** (Hard): Identify and fix race conditions in concurrent code

## Best Practices

- **Keep critical sections small**: Hold locks for the shortest time possible
- **Avoid nested locks**: Prevent deadlocks by acquiring locks in consistent order
- **Use higher-level abstractions**: Thread pools, channels, async/await over raw threads
- **Immutability**: Prefer immutable data to avoid synchronization issues
- **Message passing**: Consider passing messages between threads instead of sharing state
- **Test thoroughly**: Concurrency bugs can be timing-dependent and hard to reproduce

## Tips

- Start simple with basic threading before moving to complex patterns
- Understand your language's concurrency model and limitations
- Use debugging tools designed for concurrent programs
- Be aware of the performance overhead of synchronization
- Consider whether you need parallelism (CPU-bound) or concurrency (I/O-bound)
