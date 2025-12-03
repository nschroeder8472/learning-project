import pytest
import sys
from pathlib import Path
import threading
import time

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from concurrency.ex2_shared_state import *


def test_synchronized_counter():
    """Test thread-safe counter"""
    counter = SynchronizedCounter()
    threads = []

    for _ in range(10):
        t = threading.Thread(target=lambda: [counter.increment() for _ in range(1000)])
        threads.append(t)
        t.start()

    for t in threads:
        t.join()

    assert counter.get_count() == 10000, "Counter should be exactly 10000"


def test_bank_account():
    """Test thread-safe bank account"""
    account = BankAccount(1000.0)

    def depositor():
        for _ in range(100):
            account.deposit(10.0)

    def withdrawer():
        for _ in range(100):
            account.withdraw(5.0)

    t1 = threading.Thread(target=depositor)
    t2 = threading.Thread(target=withdrawer)

    t1.start()
    t2.start()
    t1.join()
    t2.join()

    expected = 1000.0 + (100 * 10.0) - (100 * 5.0)
    assert abs(account.get_balance() - expected) < 0.01


def test_bank_transfer():
    """Test thread-safe account transfers"""
    account1 = BankAccount(1000.0)
    account2 = BankAccount(1000.0)

    def transfer1():
        for _ in range(100):
            account1.transfer_to(account2, 10.0)

    def transfer2():
        for _ in range(100):
            account2.transfer_to(account1, 10.0)

    t1 = threading.Thread(target=transfer1)
    t2 = threading.Thread(target=transfer2)

    t1.start()
    t2.start()
    t1.join()
    t2.join()

    total = account1.get_balance() + account2.get_balance()
    assert abs(total - 2000.0) < 0.01, "Total money should remain constant"


def test_shared_buffer():
    """Test shared buffer with condition variables"""
    buffer = SharedBuffer()
    results = []

    def producer():
        for i in range(5):
            buffer.put(i)
            time.sleep(0.01)

    def consumer():
        for _ in range(5):
            value = buffer.take()
            results.append(value)
            time.sleep(0.01)

    t1 = threading.Thread(target=producer)
    t2 = threading.Thread(target=consumer)

    t1.start()
    t2.start()
    t1.join()
    t2.join()

    assert len(results) == 5


def test_singleton():
    """Test thread-safe singleton"""
    instances = []

    def get_instance():
        instances.append(ThreadSafeSingleton())

    threads = [threading.Thread(target=get_instance) for _ in range(10)]
    for t in threads:
        t.start()
    for t in threads:
        t.join()

    # All instances should be the same object
    assert all(inst is instances[0] for inst in instances)
