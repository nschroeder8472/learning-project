import pytest
import sys
from pathlib import Path
import queue
import threading

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from concurrency.ex3_producer_consumer import *


def test_producer_consumer():
    """Test basic producer-consumer"""
    q = queue.Queue()
    producer = Producer(q, 10)
    consumer = Consumer(q, 10)

    t1 = threading.Thread(target=producer.run)
    t2 = threading.Thread(target=consumer.run)

    t1.start()
    t2.start()
    t1.join()
    t2.join()

    expected = sum(range(10))
    assert consumer.get_sum() == expected


def test_multiple_producers_consumers():
    """Test multiple producers and consumers"""
    result = run_producer_consumer(2, 2, 50)
    expected = 2 * sum(range(50))
    assert result == expected


def test_poison_pill():
    """Test poison pill pattern"""
    q = queue.Queue()
    poison_pill = None

    # Producer
    def produce():
        for i in range(10):
            q.put(i)
        q.put(poison_pill)

    consumer = PoisonPillConsumer(q, poison_pill)

    t1 = threading.Thread(target=produce)
    t2 = threading.Thread(target=consumer.run)

    t1.start()
    t2.start()
    t1.join()
    t2.join()

    assert consumer.get_items_consumed() == 10


def test_priority_queue():
    """Test priority task queue"""
    pq = PriorityTaskQueue()
    pq.add_task(3, "low")
    pq.add_task(1, "high")
    pq.add_task(2, "medium")

    results = pq.process_tasks(3)
    assert results == ["high", "medium", "low"]
