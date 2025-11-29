package com.learning.designpatterns;

/**
 * Exercise: Singleton Pattern (Creational)
 *
 * Implement a thread-safe Singleton pattern that ensures only one instance
 * of the DatabaseConnection class exists throughout the application.
 *
 * Requirements:
 * 1. Private constructor to prevent external instantiation
 * 2. Static method getInstance() to get the single instance
 * 3. Thread-safe implementation
 * 4. The instance should hold a connection string and provide access to it
 *
 * Example:
 * DatabaseConnection db1 = DatabaseConnection.getInstance();
 * DatabaseConnection db2 = DatabaseConnection.getInstance();
 * // db1 and db2 should reference the same object
 *
 * Use Cases: Database connections, loggers, configuration managers
 *
 * Time Complexity: O(1) for getInstance()
 * Space Complexity: O(1)
 */
public class ex1_Singleton {

    /**
     * DatabaseConnection class that implements the Singleton pattern.
     * This class should ensure only one instance exists.
     */
    public static class DatabaseConnection {
        // TODO: Add a private static instance variable

        private String connectionString;

        // TODO: Make the constructor private
        public DatabaseConnection() {
            this.connectionString = "jdbc:postgresql://localhost:5432/mydb";
        }

        /**
         * Returns the single instance of DatabaseConnection.
         * This method should be thread-safe.
         */
        public static DatabaseConnection getInstance() {
            // TODO: Implement thread-safe singleton pattern
            // Hint: Consider using synchronized block or eager initialization
            // Hint: For double-checked locking, use volatile keyword
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String getConnectionString() {
            return connectionString;
        }

        public void setConnectionString(String connectionString) {
            this.connectionString = connectionString;
        }
    }

    /**
     * Logger class demonstrating an alternative singleton implementation.
     * Implement using eager initialization (instance created at class loading).
     */
    public static class Logger {
        // TODO: Create a private static final instance (eager initialization)

        // TODO: Make the constructor private
        public Logger() {
            // Initialize logger
        }

        public static Logger getInstance() {
            // TODO: Return the instance
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void log(String message) {
            System.out.println("[LOG] " + message);
        }
    }
}
