import pytest
import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from concurrency.ex4_thread_pools import *


def test_execute_with_thread_pool():
    """Test executing tasks with thread pool"""
    results = []
    tasks = [lambda: results.append(i) for i in range(5)]
    task1_execute_with_thread_pool(tasks, 3)
    assert len(results) == 5


def test_parallel_sum():
    """Test parallel sum with thread pool"""
    numbers = list(range(1, 101))
    result = task2_parallel_sum(numbers, 4)
    assert result == sum(numbers)


def test_map_with_thread_pool():
    """Test executor.map()"""
    items = [1, 2, 3, 4, 5]
    results = task3_map_with_thread_pool(items)
    assert results == [1, 4, 9, 16, 25]


def test_process_pool():
    """Test process pool for CPU-bound tasks"""
    items = [1000, 2000, 3000]
    results = task4_process_pool(items)
    expected = [cpu_intensive_task(n) for n in items]
    assert results == expected


def test_as_completed():
    """Test processing results as they complete"""
    urls = ["url1", "url2", "url3"]
    results = task5_as_completed(urls)
    assert len(results) == 3
    assert all("Response" in r for r in results)


def test_timeout_handling():
    """Test timeout handling"""
    fast_task = lambda: "done"
    slow_task = lambda: time.sleep(2) or "done"

    tasks = [fast_task, slow_task]
    results = task6_timeout_handling(tasks, 0.5)

    assert results[0] == "done"  # Fast task completes
    assert results[1] is None  # Slow task times out
