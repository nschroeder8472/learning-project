import pytest
import sys
from pathlib import Path
import threading
import time

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from concurrency.ex1_basic_threading import *


def test_simple_thread():
    """Test that simple thread executes without errors"""
    # Should not raise exception
    task1_simple_thread()


def test_multiple_threads():
    """Test creating and running multiple threads"""
    thread_names = task2_multiple_threads(5)
    assert len(thread_names) == 5, "Should return 5 thread names"
    assert len(set(thread_names)) == 5, "Thread names should be unique"


def test_parallel_sum():
    """Test parallel sum calculation"""
    arr = list(range(1, 101))  # 1 to 100
    expected = sum(arr)

    result = task3_parallel_sum(arr, 4)
    assert result == expected, f"Expected {expected}, got {result}"


def test_parallel_sum_single_thread():
    """Test parallel sum with single thread"""
    arr = [1, 2, 3, 4, 5]
    result = task3_parallel_sum(arr, 1)
    assert result == 15


def test_worker_thread():
    """Test worker thread processes tasks"""
    results = []
    tasks = [
        lambda: results.append(1),
        lambda: results.append(2),
        lambda: results.append(3)
    ]

    worker = WorkerThread(tasks)
    worker.start()
    time.sleep(0.1)  # Give it time to process
    worker.shutdown()
    worker.join(timeout=1)

    assert not worker.is_alive(), "Worker should stop after shutdown"
    assert len(results) == 3, "Should process all tasks"


def test_daemon_thread():
    """Test daemon thread creation"""
    # Should complete without hanging
    task5_daemon_thread()
