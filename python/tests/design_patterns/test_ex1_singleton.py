"""Tests for Singleton Pattern."""

import pytest
from concurrent.futures import ThreadPoolExecutor
from design_patterns.ex1_singleton import DatabaseConnection, Logger


def test_database_connection_single_instance():
    """Test that DatabaseConnection returns the same instance."""
    db1 = DatabaseConnection()
    db2 = DatabaseConnection()
    assert db1 is db2


def test_database_connection_not_none():
    """Test that instance is not None."""
    db = DatabaseConnection()
    assert db is not None


def test_database_connection_string():
    """Test connection string functionality."""
    db = DatabaseConnection()
    assert db.get_connection_string() is not None
    assert "postgresql" in db.get_connection_string()


def test_logger_single_instance():
    """Test that Logger returns the same instance."""
    logger1 = Logger()
    logger2 = Logger()
    assert logger1 is logger2


def test_logger_not_none():
    """Test that Logger instance is not None."""
    logger = Logger()
    assert logger is not None


def test_thread_safety_database():
    """Test thread safety of DatabaseConnection singleton."""
    instances = []

    def get_instance():
        instances.append(DatabaseConnection())

    with ThreadPoolExecutor(max_workers=10) as executor:
        futures = [executor.submit(get_instance) for _ in range(100)]
        for future in futures:
            future.result()

    # All instances should be the same
    first_instance = instances[0]
    for instance in instances:
        assert instance is first_instance


def test_thread_safety_logger():
    """Test thread safety of Logger singleton."""
    instances = []

    def get_instance():
        instances.append(Logger())

    with ThreadPoolExecutor(max_workers=10) as executor:
        futures = [executor.submit(get_instance) for _ in range(100)]
        for future in futures:
            future.result()

    # All instances should be the same
    first_instance = instances[0]
    for instance in instances:
        assert instance is first_instance


def test_connection_string_modification():
    """Test that connection string can be modified."""
    db = DatabaseConnection()
    original = db.get_connection_string()
    db.set_connection_string("mysql://localhost:3306/testdb")
    assert db.get_connection_string() != original
    assert "mysql" in db.get_connection_string()
