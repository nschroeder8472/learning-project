import pytest
from data_structures.linked_lists._7_lru_cache import LRUCache


def test_basic_operations():
    cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    assert cache.get(1) == 1
    assert cache.get(2) == 2


def test_eviction():
    cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    cache.put(3, 3)  # Evicts key 1
    assert cache.get(1) == -1  # Not found
    assert cache.get(2) == 2
    assert cache.get(3) == 3


def test_get_updates_recency():
    cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    cache.get(1)  # Makes 1 recently used
    cache.put(3, 3)  # Should evict key 2, not 1
    assert cache.get(1) == 1
    assert cache.get(2) == -1  # Evicted
    assert cache.get(3) == 3


def test_update_existing_key():
    cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    cache.put(1, 10)  # Update key 1
    assert cache.get(1) == 10
    assert cache.get(2) == 2


def test_single_capacity():
    cache = LRUCache(1)
    cache.put(1, 1)
    assert cache.get(1) == 1
    cache.put(2, 2)  # Evicts key 1
    assert cache.get(1) == -1
    assert cache.get(2) == 2


def test_get_nonexistent():
    cache = LRUCache(2)
    assert cache.get(1) == -1
    cache.put(1, 1)
    assert cache.get(1) == 1
    assert cache.get(2) == -1


def test_complex_sequence():
    cache = LRUCache(2)
    cache.put(1, 1)
    cache.put(2, 2)
    assert cache.get(1) == 1
    cache.put(3, 3)  # Evicts key 2
    assert cache.get(2) == -1
    cache.put(4, 4)  # Evicts key 1
    assert cache.get(1) == -1
    assert cache.get(3) == 3
    assert cache.get(4) == 4
