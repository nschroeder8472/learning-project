"""
Exercise: Singleton Pattern (Creational)

Implement a thread-safe Singleton pattern that ensures only one instance
of the DatabaseConnection class exists throughout the application.

Requirements:
1. Implement __new__ method to control instance creation
2. Ensure thread-safety
3. Provide a way to get the single instance
4. The instance should hold a connection string and provide access to it

Example:
    db1 = DatabaseConnection()
    db2 = DatabaseConnection()
    # db1 and db2 should reference the same object
    assert db1 is db2

Use Cases: Database connections, loggers, configuration managers

Time Complexity: O(1) for instance creation/retrieval
Space Complexity: O(1)
"""

import threading


class DatabaseConnection:
    """
    DatabaseConnection class that implements the Singleton pattern.
    This class ensures only one instance exists.
    """
    _instance = None
    _lock = threading.Lock()

    def __new__(cls):
        """
        Controls instance creation to ensure singleton behavior.
        TODO: Implement thread-safe singleton pattern using __new__
        Hint: Use the _lock for thread safety
        Hint: Check if _instance is None before creating a new instance
        """
        raise NotImplementedError("Not implemented yet")

    def __init__(self):
        """Initialize the connection string if not already initialized."""
        if not hasattr(self, 'connection_string'):
            self.connection_string = "postgresql://localhost:5432/mydb"

    def get_connection_string(self) -> str:
        """Returns the connection string."""
        return self.connection_string

    def set_connection_string(self, connection_string: str) -> None:
        """Sets a new connection string."""
        self.connection_string = connection_string


class Logger:
    """
    Logger class demonstrating singleton using class variable.
    Implement using eager initialization or __new__ method.
    """
    _instance = None

    def __new__(cls):
        """
        TODO: Implement singleton pattern
        Create instance if it doesn't exist, otherwise return existing instance
        """
        raise NotImplementedError("Not implemented yet")

    def __init__(self):
        """Initialize logger if needed."""
        pass

    def log(self, message: str) -> None:
        """Logs a message."""
        print(f"[LOG] {message}")


if __name__ == "__main__":
    # Example usage
    db1 = DatabaseConnection()
    db2 = DatabaseConnection()
    print(f"db1 is db2: {db1 is db2}")  # Should be True

    logger1 = Logger()
    logger2 = Logger()
    print(f"logger1 is logger2: {logger1 is logger2}")  # Should be True