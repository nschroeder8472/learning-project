"""Exercise 3: Rate Limiting"""
import time
from collections import deque

class TokenBucketRateLimiter:
    def __init__(self, capacity: int, refill_rate: float):
        # TODO: Implement token bucket
        raise NotImplementedError()

    def allow_request(self) -> bool:
        raise NotImplementedError()

class SlidingWindowRateLimiter:
    def __init__(self, max_requests: int, window_seconds: float):
        # TODO: Implement sliding window
        raise NotImplementedError()

    def allow_request(self) -> bool:
        raise NotImplementedError()
