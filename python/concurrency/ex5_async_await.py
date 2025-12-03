"""
Exercise 5: Async/Await Patterns (Hard)

Master asynchronous programming with asyncio.
This exercise covers:
- async/await syntax
- Coroutines and tasks
- Gathering multiple async operations
- Async context managers and iterators

Difficulty: Hard
Topics: Asyncio, Async/Await, Coroutines, Event Loop
"""

import asyncio
from typing import List


async def task1_simple_async():
    """
    Task 1: Create a simple async function

    TODO: Create an async function that waits 0.1 seconds and returns "Done"
    Hint: Use await asyncio.sleep()
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


async def task2_fetch_data(url: str) -> str:
    """
    Task 2: Simulate async HTTP request

    TODO: Simulate fetching data from URL with async delay
    Hint: await asyncio.sleep() to simulate network delay
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


async def task3_gather_results(urls: List[str]) -> List[str]:
    """
    Task 3: Fetch multiple URLs concurrently

    Args:
        urls: List of URLs to fetch

    Returns:
        List of responses

    TODO: Use asyncio.gather() to run multiple fetches concurrently
    Hint: Create tasks with task2_fetch_data for each URL
    Hint: await asyncio.gather(*tasks)
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


async def task4_async_with_timeout(coro, timeout_seconds: float):
    """
    Task 4: Run async operation with timeout

    Args:
        coro: Coroutine to run
        timeout_seconds: Maximum time to wait

    Returns:
        Result or "TIMEOUT"

    TODO: Use asyncio.wait_for() with timeout
    Hint: Catch asyncio.TimeoutError
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


async def task5_async_queue():
    """
    Task 5: Producer-consumer with asyncio.Queue

    TODO: Create async producer-consumer pattern
    Hint: Use asyncio.Queue
    Hint: await queue.put() and await queue.get()
    """
    # TODO: Implement producer-consumer with asyncio.Queue
    raise NotImplementedError("Not implemented yet")


class AsyncCache:
    """
    Task 6: Async cache with locks

    TODO: Implement async cache with asyncio.Lock
    """

    def __init__(self):
        self.cache = {}
        self.lock = asyncio.Lock()

    async def get(self, key: str) -> str:
        # TODO: Return cached value or compute if missing
        # Hint: Use 'async with self.lock:'
        # Hint: Simulate expensive computation with asyncio.sleep()
        raise NotImplementedError("Not implemented yet")


async def task7_process_as_completed(items: List[int]) -> List[int]:
    """
    Task 7: Process items as they complete (not in order)

    Args:
        items: List of numbers

    Returns:
        Results in completion order

    TODO: Use asyncio.as_completed() to process results as they finish
    """
    async def process_item(item: int) -> int:
        await asyncio.sleep(0.1 * (item % 3))  # Variable delay
        return item * 2

    # TODO: Implement this using asyncio.as_completed()
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Concurrency - Exercise 5: Async/Await\n")

    # Example: Running async function
    async def example():
        print("Starting...")
        await asyncio.sleep(0.1)
        print("Done!")
        return "Result"

    result = asyncio.run(example())
    print(f"Result: {result}\n")

    # Example: Running multiple tasks concurrently
    async def example2():
        async def task(n):
            await asyncio.sleep(0.1)
            return n * 2

        results = await asyncio.gather(task(1), task(2), task(3))
        print(f"Results: {results}")

    asyncio.run(example2())

    print("\nNow implement the TODO tasks!")
