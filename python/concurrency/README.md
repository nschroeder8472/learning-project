# Concurrency

## Overview

Concurrency in Python comes in several flavors due to the Global Interpreter Lock (GIL). Understanding when to use threading, multiprocessing, or async/await is crucial for building efficient Python applications.

## Key Concepts

### The Global Interpreter Lock (GIL)
Python's GIL allows only one thread to execute Python bytecode at a time. This means:
- **Threading**: Good for I/O-bound tasks (network, file operations)
- **Multiprocessing**: Necessary for CPU-bound parallel tasks
- **Asyncio**: Excellent for concurrent I/O without threading overhead

### Threading (`threading` module)
- Lightweight concurrency for I/O-bound tasks
- Threads share memory space
- Limited by GIL for CPU-bound work
- Use `Lock`, `RLock`, `Semaphore` for synchronization

### Multiprocessing (`multiprocessing` module)
- True parallelism using separate processes
- Each process has its own Python interpreter and memory
- Bypasses the GIL
- Higher overhead than threading
- Use for CPU-intensive tasks

### Async/Await (`asyncio` module)
- Single-threaded cooperative multitasking
- Excellent for I/O-bound and high-level structured network code
- Uses `async`/`await` syntax
- Event loop manages coroutines

## Common Patterns

### Thread Pools (`concurrent.futures.ThreadPoolExecutor`)
Reusable pool of threads for executing tasks concurrently.

### Process Pools (`concurrent.futures.ProcessPoolExecutor`)
Pool of worker processes for parallel execution.

### Queues (`queue.Queue`, `multiprocessing.Queue`)
Thread-safe and process-safe queues for producer-consumer patterns.

### Async Tasks
Coroutines that run concurrently in an event loop.

## Best Practices

- **I/O-bound**: Use `asyncio` or `threading`
- **CPU-bound**: Use `multiprocessing`
- **Mixed workload**: Combine approaches appropriately
- **Always use context managers** for locks and pools
- **Be careful with shared state** in threading
- **Use queues** for inter-thread/process communication

## Exercises

1. **ex1_basic_threading** (Easy): Thread creation and management
2. **ex2_shared_state** (Medium): Thread synchronization with locks
3. **ex3_producer_consumer** (Medium): Queue-based producer-consumer
4. **ex4_thread_pools** (Medium): Thread and process pools
5. **ex5_async_await** (Hard): Asyncio for concurrent I/O
6. **ex6_race_conditions** (Hard): Identify and fix concurrency bugs

## Testing

```bash
cd python
pytest tests/concurrency/ -v
```
