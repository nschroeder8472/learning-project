"""Exercise 1: Caching Strategies"""
from typing import Optional, Dict, Any
from collections import OrderedDict
import time

class LRUCache:
    def __init__(self, capacity: int):
        # TODO: Implement LRU cache
        raise NotImplementedError()

    def get(self, key: Any) -> Optional[Any]:
        raise NotImplementedError()

    def put(self, key: Any, value: Any):
        raise NotImplementedError()

class WriteThroughCache:
    def __init__(self, database: Dict):
        # TODO: Implement write-through cache
        raise NotImplementedError()

    def get(self, key: Any) -> Optional[Any]:
        raise NotImplementedError()

    def put(self, key: Any, value: Any):
        raise NotImplementedError()

class TTLCache:
    def __init__(self, ttl_seconds: float):
        # TODO: Implement cache with TTL
        raise NotImplementedError()

    def get(self, key: Any) -> Optional[Any]:
        raise NotImplementedError()

    def put(self, key: Any, value: Any):
        raise NotImplementedError()
