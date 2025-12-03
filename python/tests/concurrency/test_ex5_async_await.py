import pytest
import sys
from pathlib import Path
import asyncio

sys.path.insert(0, str(Path(__file__).parent.parent.parent))

from concurrency.ex5_async_await import *


@pytest.mark.asyncio
async def test_simple_async():
    """Test simple async function"""
    result = await task1_simple_async()
    assert result == "Done"


@pytest.mark.asyncio
async def test_fetch_data():
    """Test async data fetching"""
    result = await task2_fetch_data("http://example.com")
    assert "example.com" in result


@pytest.mark.asyncio
async def test_gather_results():
    """Test gathering multiple async results"""
    urls = ["url1", "url2", "url3"]
    results = await task3_gather_results(urls)
    assert len(results) == 3


@pytest.mark.asyncio
async def test_async_with_timeout():
    """Test async timeout handling"""
    # Fast task
    async def fast():
        await asyncio.sleep(0.1)
        return "done"

    result1 = await task4_async_with_timeout(fast(), 1.0)
    assert result1 == "done"

    # Slow task
    async def slow():
        await asyncio.sleep(2.0)
        return "done"

    result2 = await task4_async_with_timeout(slow(), 0.1)
    assert result2 == "TIMEOUT"


@pytest.mark.asyncio
async def test_async_queue():
    """Test async queue"""
    await task5_async_queue()  # Should complete without error


@pytest.mark.asyncio
async def test_async_cache():
    """Test async cache"""
    cache = AsyncCache()

    # First access (slow)
    import time
    start = time.time()
    result1 = await cache.get("key1")
    time1 = time.time() - start

    # Second access (fast, cached)
    start = time.time()
    result2 = await cache.get("key1")
    time2 = time.time() - start

    assert result1 == result2
    assert time2 < time1 / 2  # Cached should be much faster


@pytest.mark.asyncio
async def test_process_as_completed():
    """Test processing results as they complete"""
    items = [1, 2, 3, 4, 5]
    results = await task7_process_as_completed(items)
    assert len(results) == 5
    assert set(results) == {2, 4, 6, 8, 10}
