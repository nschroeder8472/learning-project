"""
Exercise 6: Race Conditions and Debugging (Hard)

Learn to identify and fix common concurrency bugs.
This exercise covers:
- Identifying race conditions
- Using threading.local() for thread-local storage
- Atomic operations considerations
- Debugging concurrent code

Difficulty: Hard
Topics: Race Conditions, Thread Safety, Debugging, GIL
"""

import threading
from typing import List


class BuggyCounter:
    """
    BUGGY CODE - DO NOT USE AS IS!
    This demonstrates a race condition
    """

    def __init__(self):
        self.count = 0

    def increment(self):
        self.count += 1  # NOT atomic!


class FixedCounter:
    """
    Task 1: Fix the race condition using Lock

    TODO: Implement thread-safe counter
    """

    def __init__(self):
        self.count = 0
        # TODO: Add lock

    def increment(self):
        # TODO: Make this thread-safe
        raise NotImplementedError("Not implemented yet")

    def get_count(self) -> int:
        # TODO: Make this thread-safe
        raise NotImplementedError("Not implemented yet")


class ThreadLocalStorage:
    """
    Task 2: Use threading.local() for thread-local data

    TODO: Each thread should have its own counter
    """

    def __init__(self):
        self.local = threading.local()

    def increment(self):
        # TODO: Increment thread-local counter
        # Hint: Initialize if not exists: if not hasattr(self.local, 'count')
        raise NotImplementedError("Not implemented yet")

    def get_count(self) -> int:
        # TODO: Return thread-local count
        raise NotImplementedError("Not implemented yet")


class LazyInitializer:
    """
    Task 3: Fix check-then-act race condition

    TODO: Implement thread-safe lazy initialization
    """

    def __init__(self):
        self.resource = None
        self.lock = threading.Lock()

    def get_resource(self) -> str:
        # TODO: Thread-safe lazy initialization
        # Hint: Double-checked locking pattern
        raise NotImplementedError("Not implemented yet")


class ThreadSafeList:
    """
    Task 4: Thread-safe list with compound operations

    TODO: Make add_if_not_present atomic
    """

    def __init__(self):
        self.items = []
        self.lock = threading.Lock()

    def add(self, item):
        with self.lock:
            self.items.append(item)

    def contains(self, item) -> bool:
        with self.lock:
            return item in self.items

    def add_if_not_present(self, item):
        # TODO: Make check-and-add atomic
        # Hint: Single synchronized block for both check and add
        raise NotImplementedError("Not implemented yet")

    def size(self) -> int:
        with self.lock:
            return len(self.items)


class DeadlockRisk:
    """
    BUGGY: Can cause deadlock
    """

    def __init__(self):
        self.lock1 = threading.Lock()
        self.lock2 = threading.Lock()

    def method1(self):
        with self.lock1:
            with self.lock2:
                pass  # Do work

    def method2(self):
        with self.lock2:  # Different order - DEADLOCK RISK!
            with self.lock1:
                pass


class DeadlockFree:
    """
    Task 5: Fix deadlock by ensuring consistent lock ordering

    TODO: Always acquire locks in same order
    """

    def __init__(self):
        self.lock1 = threading.Lock()
        self.lock2 = threading.Lock()

    def method1(self):
        # TODO: Acquire locks in consistent order
        raise NotImplementedError("Not implemented yet")

    def method2(self):
        # TODO: Acquire locks in same order as method1
        raise NotImplementedError("Not implemented yet")


class RateLimiter:
    """
    Task 6: Implement a thread-safe rate limiter

    TODO: Allow at most N operations per second across all threads
    """

    def __init__(self, max_per_second: int):
        self.max_per_second = max_per_second
        # TODO: Add necessary synchronization primitives
        self.lock = threading.Lock()
        self.timestamps = []

    def acquire(self) -> bool:
        """
        Try to acquire permission for one operation.

        Returns:
            True if allowed, False if rate limit exceeded

        TODO: Implement rate limiting logic
        Hint: Track timestamps of recent operations
        Hint: Remove timestamps older than 1 second
        Hint: Check if we can add another operation
        """
        # TODO: Implement this
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Concurrency - Exercise 6: Race Conditions\n")

    # Demonstrate race condition
    print("Demonstrating race condition:")
    buggy = BuggyCounter()

    threads = []
    for _ in range(10):
        t = threading.Thread(target=lambda: [buggy.increment() for _ in range(1000)])
        threads.append(t)
        t.start()

    for t in threads:
        t.join()

    print(f"Expected: 10000, Actual: {buggy.count}")
    print("(Likely less than 10000 due to race condition)\n")

    print("Now implement the TODO tasks to fix these issues!")
