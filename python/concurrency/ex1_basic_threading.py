"""
Exercise 1: Basic Threading (Easy)

Learn the fundamentals of creating and managing threads in Python.
This exercise covers:
- Creating threads using Thread class
- Starting and joining threads
- Basic parallel execution
- Thread naming and identification

Difficulty: Easy
Topics: Threads, threading module, Parallel Execution
"""

import threading
import time
from typing import List


def task1_simple_thread():
    """
    Task 1: Create and run a simple thread that prints numbers 1-5

    TODO: Create a thread that prints numbers 1-5 with thread name
    Hint: Use threading.Thread with a target function
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def task2_multiple_threads(num_threads: int) -> List[str]:
    """
    Task 2: Create and run multiple threads, return their names

    Args:
        num_threads: Number of threads to create

    Returns:
        List of thread names that completed

    TODO: Create num_threads threads, start them, wait for completion
    Hint: Use Thread.join() to wait for completion
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def task3_parallel_sum(arr: List[int], num_threads: int) -> int:
    """
    Task 3: Calculate sum of array using multiple threads

    Divide the array into chunks and sum each chunk in parallel.

    Args:
        arr: Array to sum
        num_threads: Number of threads to use

    Returns:
        Total sum

    TODO: Divide array into chunks and sum each chunk in a separate thread
    Hint: Use a shared list to store partial sums
    Hint: Calculate chunk size and distribute work
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


class WorkerThread(threading.Thread):
    """
    Task 4: Implement a worker thread that processes tasks

    TODO: Override run() method to process tasks while running
    """

    def __init__(self, tasks: List[callable]):
        super().__init__()
        self.tasks = tasks
        self.running = True

    def run(self):
        # TODO: Process all tasks while self.running is True
        raise NotImplementedError("Not implemented yet")

    def shutdown(self):
        self.running = False


def task5_daemon_thread():
    """
    Task 5: Create a daemon thread that runs in background

    TODO: Create a daemon thread that prints every 0.5 seconds
    Hint: Set daemon=True when creating thread
    Hint: Main thread should wait 2 seconds then exit
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Concurrency - Exercise 1: Basic Threading\n")

    # Example: Creating a simple thread
    def print_hello():
        print(f"Hello from thread: {threading.current_thread().name}")

    thread = threading.Thread(target=print_hello, name="MyThread")
    thread.start()
    thread.join()

    print("\nNow implement the TODO tasks!")
