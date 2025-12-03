"""Exercise 6: System Design - Complete Systems"""
from typing import Optional
import hashlib

class URLShortener:
    def __init__(self):
        # TODO: Implement URL shortener
        raise NotImplementedError()

    def shorten(self, long_url: str) -> str:
        raise NotImplementedError()

    def expand(self, short_url: str) -> Optional[str]:
        raise NotImplementedError()

class KeyValueStore:
    def __init__(self):
        # TODO: Implement key-value store
        raise NotImplementedError()

    def put(self, key: str, value: str):
        raise NotImplementedError()

    def get(self, key: str) -> Optional[str]:
        raise NotImplementedError()
