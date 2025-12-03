"""
Exercise 2: Shared State and Synchronization (Medium)

Learn how to safely share state between threads using synchronization.
This exercise covers:
- Lock and RLock for thread safety
- Condition variables for coordination
- Thread-safe data structures

Difficulty: Medium
Topics: Thread Safety, Locks, Synchronization, Race Conditions
"""

import threading
from typing import Optional


class SynchronizedCounter:
    """
    Task 1: Thread-safe counter using Lock

    TODO: Use threading.Lock to make operations thread-safe
    """

    def __init__(self):
        self.count = 0
        # TODO: Create a lock
        self.lock = None

    def increment(self):
        # TODO: Acquire lock, increment, release lock
        # Hint: Use 'with self.lock:' context manager
        raise NotImplementedError("Not implemented yet")

    def decrement(self):
        # TODO: Make this thread-safe
        raise NotImplementedError("Not implemented yet")

    def get_count(self) -> int:
        # TODO: Make this thread-safe
        raise NotImplementedError("Not implemented yet")


class BankAccount:
    """
    Task 2: Thread-safe bank account

    TODO: Implement thread-safe deposit, withdraw, and transfer operations
    """

    def __init__(self, initial_balance: float):
        self.balance = initial_balance
        self.lock = threading.Lock()

    def deposit(self, amount: float):
        # TODO: Thread-safe deposit
        raise NotImplementedError("Not implemented yet")

    def withdraw(self, amount: float) -> bool:
        # TODO: Thread-safe withdraw, return False if insufficient funds
        raise NotImplementedError("Not implemented yet")

    def get_balance(self) -> float:
        # TODO: Thread-safe balance retrieval
        raise NotImplementedError("Not implemented yet")

    def transfer_to(self, other: 'BankAccount', amount: float) -> bool:
        # TODO: Thread-safe transfer between accounts
        # Hint: Need to lock both accounts - avoid deadlock by ordering locks
        # Hint: Use id(self) and id(other) to determine lock order
        raise NotImplementedError("Not implemented yet")


class SharedBuffer:
    """
    Task 3: Shared buffer with wait/notify pattern

    TODO: Implement put/take with Condition variable
    """

    def __init__(self):
        self.value = None
        self.has_value = False
        self.condition = threading.Condition()

    def put(self, item):
        # TODO: Wait while buffer has value, then put new value
        # Hint: Use self.condition.wait() and self.condition.notify_all()
        raise NotImplementedError("Not implemented yet")

    def take(self):
        # TODO: Wait while buffer is empty, then take value
        raise NotImplementedError("Not implemented yet")


class ThreadSafeSingleton:
    """
    Task 4: Thread-safe singleton pattern

    TODO: Implement double-checked locking
    """

    _instance = None
    _lock = threading.Lock()

    def __new__(cls):
        # TODO: Implement double-checked locking pattern
        # Hint: Check instance without lock, then with lock
        raise NotImplementedError("Not implemented yet")


class ReadWriteLock:
    """
    Task 5: Read-write lock implementation

    Multiple readers can access simultaneously, but writers get exclusive access.

    TODO: Implement using Condition variables
    """

    def __init__(self):
        self.readers = 0
        self.writers = 0
        self.condition = threading.Condition()

    def acquire_read(self):
        # TODO: Acquire read lock (wait if writer is active)
        raise NotImplementedError("Not implemented yet")

    def release_read(self):
        # TODO: Release read lock
        raise NotImplementedError("Not implemented yet")

    def acquire_write(self):
        # TODO: Acquire write lock (wait if any readers or writers)
        raise NotImplementedError("Not implemented yet")

    def release_write(self):
        # TODO: Release write lock
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Concurrency - Exercise 2: Shared State\n")

    # Example: Demonstrating race condition
    print("Without synchronization (race condition):")

    class UnsafeCounter:
        def __init__(self):
            self.count = 0

        def increment(self):
            self.count += 1

    unsafe = UnsafeCounter()
    threads = []
    for _ in range(10):
        t = threading.Thread(target=lambda: [unsafe.increment() for _ in range(1000)])
        threads.append(t)
        t.start()

    for t in threads:
        t.join()

    print(f"Expected: 10000, Actual: {unsafe.count}")
    print("(Likely less than 10000 due to race condition)\n")
    print("Implement the TODO tasks to make operations thread-safe!")
