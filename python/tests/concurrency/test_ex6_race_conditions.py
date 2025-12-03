import pytest
import sys
from pathlib import Path
import threading
import time

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from concurrency.ex6_race_conditions import *


def test_fixed_counter():
    """Test thread-safe counter"""
    counter = FixedCounter()
    threads = []

    for _ in range(10):
        t = threading.Thread(target=lambda: [counter.increment() for _ in range(1000)])
        threads.append(t)
        t.start()

    for t in threads:
        t.join()

    assert counter.get_count() == 10000


def test_thread_local_storage():
    """Test thread-local storage"""
    tls = ThreadLocalStorage()
    results = {}

    def worker(thread_id):
        for _ in range(100):
            tls.increment()
        results[thread_id] = tls.get_count()

    threads = []
    for i in range(5):
        t = threading.Thread(target=worker, args=(i,))
        threads.append(t)
        t.start()

    for t in threads:
        t.join()

    # Each thread should have its own count of 100
    assert all(count == 100 for count in results.values())


def test_lazy_initializer():
    """Test thread-safe lazy initialization"""
    initializer = LazyInitializer()
    resources = []

    def get_resource():
        resources.append(initializer.get_resource())

    threads = [threading.Thread(target=get_resource) for _ in range(10)]
    for t in threads:
        t.start()
    for t in threads:
        t.join()

    # All should get the same resource instance
    assert all(r == resources[0] for r in resources)


def test_thread_safe_list():
    """Test thread-safe list operations"""
    ts_list = ThreadSafeList()

    threads = []
    for _ in range(10):
        t = threading.Thread(target=lambda: [ts_list.add_if_not_present(i) for i in range(100)])
        threads.append(t)
        t.start()

    for t in threads:
        t.join()

    assert ts_list.size() == 100


def test_deadlock_free():
    """Test deadlock-free implementation"""
    obj = DeadlockFree()

    def method1_loop():
        for _ in range(100):
            obj.method1()

    def method2_loop():
        for _ in range(100):
            obj.method2()

    t1 = threading.Thread(target=method1_loop)
    t2 = threading.Thread(target=method2_loop)

    t1.start()
    t2.start()
    t1.join(timeout=5)
    t2.join(timeout=5)

    assert not t1.is_alive() and not t2.is_alive(), "Should not deadlock"


def test_rate_limiter():
    """Test rate limiter"""
    limiter = RateLimiter(5)  # 5 per second

    # First 5 should succeed
    for _ in range(5):
        assert limiter.acquire() == True

    # 6th should fail (within same second)
    assert limiter.acquire() == False

    # After 1 second, should work again
    time.sleep(1.1)
    assert limiter.acquire() == True
