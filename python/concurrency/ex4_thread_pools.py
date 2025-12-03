"""
Exercise 4: Thread Pools (Medium)

Learn to use thread pools to efficiently manage concurrent tasks.
This exercise covers:
- concurrent.futures.ThreadPoolExecutor
- concurrent.futures.ProcessPoolExecutor (for CPU-bound tasks)
- Future objects and result collection
- Map and submit patterns

Difficulty: Medium
Topics: Thread Pools, Executors, Futures, Parallel Processing
"""

from concurrent.futures import ThreadPoolExecutor, ProcessPoolExecutor, as_completed
from typing import List, Callable
import time


def task1_execute_with_thread_pool(tasks: List[Callable], max_workers: int):
    """
    Task 1: Execute tasks using a thread pool

    Args:
        tasks: List of callable tasks
        max_workers: Maximum number of threads

    TODO: Create ThreadPoolExecutor and execute all tasks
    Hint: Use 'with ThreadPoolExecutor() as executor:'
    Hint: Use executor.submit() for each task
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def task2_parallel_sum(numbers: List[int], num_workers: int) -> int:
    """
    Task 2: Calculate sum using thread pool and futures

    Args:
        numbers: List of numbers to sum
        num_workers: Number of worker threads

    Returns:
        Total sum

    TODO: Divide work among threads and collect results with futures
    Hint: Submit callable that sums a slice of the list
    Hint: Use future.result() to get results
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def task3_map_with_thread_pool(items: List[int]) -> List[int]:
    """
    Task 3: Use executor.map() to process items in parallel

    Args:
        items: List of numbers

    Returns:
        List of squared numbers

    TODO: Use executor.map() to square all numbers
    Hint: executor.map(function, iterable) returns results in order
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def cpu_intensive_task(n: int) -> int:
    """Helper: CPU-intensive task for testing"""
    return sum(i * i for i in range(n))


def task4_process_pool(items: List[int]) -> List[int]:
    """
    Task 4: Use ProcessPoolExecutor for CPU-bound work

    Args:
        items: List of numbers

    Returns:
        Results of CPU-intensive computation

    TODO: Use ProcessPoolExecutor for true parallelism
    Hint: Same API as ThreadPoolExecutor
    Hint: Use for CPU-bound tasks to bypass GIL
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def task5_as_completed(urls: List[str]) -> List[str]:
    """
    Task 5: Process results as they complete

    Args:
        urls: List of URLs to "fetch"

    Returns:
        List of results in completion order

    TODO: Use as_completed() to process results as they finish
    Hint: from concurrent.futures import as_completed
    Hint: Iterate over as_completed(futures)
    """
    def fetch_url(url: str) -> str:
        time.sleep(0.1)  # Simulate network delay
        return f"Response from {url}"

    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def task6_timeout_handling(tasks: List[Callable], timeout_seconds: float) -> List:
    """
    Task 6: Handle timeouts with futures

    Args:
        tasks: List of tasks to execute
        timeout_seconds: Maximum time to wait for each task

    Returns:
        List of results (None for timed out tasks)

    TODO: Execute tasks with timeout handling
    Hint: future.result(timeout=...) raises TimeoutError
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Concurrency - Exercise 4: Thread Pools\n")

    # Example: Using ThreadPoolExecutor
    with ThreadPoolExecutor(max_workers=3) as executor:
        futures = [executor.submit(lambda x: x * x, i) for i in range(5)]
        results = [f.result() for f in futures]
        print(f"Squares: {results}")

    # Example: Using executor.map()
    with ThreadPoolExecutor(max_workers=3) as executor:
        results = list(executor.map(lambda x: x * 2, range(5)))
        print(f"Doubled: {results}")

    print("\nNow implement the TODO tasks!")
