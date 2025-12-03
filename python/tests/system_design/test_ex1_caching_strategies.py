import pytest
import sys
from pathlib import Path
sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from system_design.ex1_caching_strategies import *

def test_lru_cache():
    cache = LRUCache(3)
    cache.put(1, "one")
    cache.put(2, "two")
    cache.put(3, "three")
    assert cache.get(1) == "one"
    cache.put(4, "four")  # Evicts 2
    assert cache.get(2) is None
