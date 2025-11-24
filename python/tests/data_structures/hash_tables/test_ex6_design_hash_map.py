"""Tests for Design HashMap exercise."""

import pytest
from data_structures.hash_tables.ex6_design_hash_map import MyHashMap


def test_put_and_get():
    hash_map = MyHashMap()
    hash_map.put(1, 1)
    assert hash_map.get(1) == 1


def test_get_non_existent():
    hash_map = MyHashMap()
    assert hash_map.get(1) == -1


def test_update_value():
    hash_map = MyHashMap()
    hash_map.put(2, 1)
    hash_map.put(2, 2)
    assert hash_map.get(2) == 2


def test_multiple_puts():
    hash_map = MyHashMap()
    hash_map.put(1, 1)
    hash_map.put(2, 2)
    hash_map.put(3, 3)
    assert hash_map.get(1) == 1
    assert hash_map.get(2) == 2
    assert hash_map.get(3) == 3


def test_remove():
    hash_map = MyHashMap()
    hash_map.put(2, 1)
    hash_map.remove(2)
    assert hash_map.get(2) == -1


def test_remove_non_existent():
    hash_map = MyHashMap()
    hash_map.remove(1)
    assert hash_map.get(1) == -1


def test_complex_sequence():
    hash_map = MyHashMap()
    hash_map.put(1, 1)
    hash_map.put(2, 2)
    assert hash_map.get(1) == 1
    assert hash_map.get(3) == -1
    hash_map.put(2, 1)
    assert hash_map.get(2) == 1
    hash_map.remove(2)
    assert hash_map.get(2) == -1


def test_collisions():
    # These keys should hash to the same bucket (1 and 1001 with size=1000)
    hash_map = MyHashMap()
    hash_map.put(1, 100)
    hash_map.put(1001, 200)
    assert hash_map.get(1) == 100
    assert hash_map.get(1001) == 200


def test_many_insertions():
    hash_map = MyHashMap()
    for i in range(100):
        hash_map.put(i, i * 10)
    for i in range(100):
        assert hash_map.get(i) == i * 10
