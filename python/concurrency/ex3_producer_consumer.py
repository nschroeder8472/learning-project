"""
Exercise 3: Producer-Consumer Pattern (Medium)

Implement the classic producer-consumer pattern using queues.
This exercise covers:
- queue.Queue for thread-safe producer-consumer
- Multiple producers and consumers
- Graceful shutdown with sentinel values

Difficulty: Medium
Topics: Producer-Consumer, Queue, Thread Coordination
"""

import queue
import threading
import time
from typing import List


class Producer:
    """
    Task 1: Simple producer that generates numbers

    TODO: Implement run method to produce items
    """

    def __init__(self, q: queue.Queue, items_to_produce: int):
        self.queue = q
        self.items_to_produce = items_to_produce

    def run(self):
        # TODO: Produce items_to_produce numbers and put them in the queue
        # Hint: Use queue.put() which blocks if queue is full
        raise NotImplementedError("Not implemented yet")


class Consumer:
    """
    Task 2: Simple consumer that processes numbers

    TODO: Implement run method to consume items
    """

    def __init__(self, q: queue.Queue, items_to_consume: int):
        self.queue = q
        self.items_to_consume = items_to_consume
        self.sum = 0

    def run(self):
        # TODO: Consume items_to_consume numbers from queue and sum them
        # Hint: Use queue.get() which blocks if queue is empty
        raise NotImplementedError("Not implemented yet")

    def get_sum(self) -> int:
        return self.sum


def run_producer_consumer(num_producers: int, num_consumers: int, items_per_producer: int) -> int:
    """
    Task 3: Create a producer-consumer system

    Args:
        num_producers: Number of producer threads
        num_consumers: Number of consumer threads
        items_per_producer: Items each producer should produce

    Returns:
        Total sum of all consumed items

    TODO: Create queue, start producers and consumers, collect results
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


class PoisonPillConsumer:
    """
    Task 4: Consumer that stops on poison pill

    TODO: Consume items until poison pill is received
    """

    def __init__(self, q: queue.Queue, poison_pill):
        self.queue = q
        self.poison_pill = poison_pill
        self.items_consumed = 0

    def run(self):
        # TODO: Consume items until poison pill
        # Hint: Put poison pill back for other consumers
        raise NotImplementedError("Not implemented yet")

    def get_items_consumed(self) -> int:
        return self.items_consumed


class PriorityTaskQueue:
    """
    Task 5: Priority queue for tasks

    TODO: Use queue.PriorityQueue for priority-based task processing
    """

    def __init__(self):
        self.queue = queue.PriorityQueue()

    def add_task(self, priority: int, task: str):
        # TODO: Add task with priority (lower number = higher priority)
        raise NotImplementedError("Not implemented yet")

    def process_tasks(self, num_tasks: int) -> List[str]:
        # TODO: Process num_tasks tasks in priority order
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Concurrency - Exercise 3: Producer-Consumer\n")

    # Example: Simple producer-consumer with queue
    q = queue.Queue(maxsize=5)

    def producer():
        for i in range(10):
            q.put(f"Item {i}")
            print(f"Produced: Item {i}")
            time.sleep(0.1)

    def consumer():
        for _ in range(10):
            item = q.get()
            print(f"Consumed: {item}")
            q.task_done()
            time.sleep(0.15)

    t1 = threading.Thread(target=producer)
    t2 = threading.Thread(target=consumer)

    t1.start()
    t2.start()
    t1.join()
    t2.join()

    print("\nNow implement the TODO tasks!")
