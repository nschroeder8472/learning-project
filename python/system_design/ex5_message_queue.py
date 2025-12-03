"""Exercise 5: Message Queue"""
from typing import Callable, Dict, List
from queue import Queue
import threading

class SimpleMessageQueue:
    def __init__(self):
        # TODO: Implement simple message queue
        raise NotImplementedError()

    def publish(self, message):
        raise NotImplementedError()

    def consume(self):
        raise NotImplementedError()

class PubSubMessageQueue:
    def __init__(self):
        # TODO: Implement pub/sub
        raise NotImplementedError()

    def subscribe(self, topic: str, callback: Callable):
        raise NotImplementedError()

    def publish(self, topic: str, message):
        raise NotImplementedError()
