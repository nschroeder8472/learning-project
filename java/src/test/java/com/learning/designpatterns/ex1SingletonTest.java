package com.learning.designpatterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.learning.designpatterns.ex1_Singleton.DatabaseConnection;
import com.learning.designpatterns.ex1_Singleton.Logger;

class ex1SingletonTest {

    @Test
    void testDatabaseConnectionSingleInstance() {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        assertSame(db1, db2, "Should return the same instance");
    }

    @Test
    void testDatabaseConnectionNotNull() {
        DatabaseConnection db = DatabaseConnection.getInstance();
        assertNotNull(db, "Instance should not be null");
    }

    @Test
    void testDatabaseConnectionString() {
        DatabaseConnection db = DatabaseConnection.getInstance();
        assertNotNull(db.getConnectionString(), "Connection string should not be null");
        assertTrue(db.getConnectionString().contains("jdbc"), "Should be a JDBC connection string");
    }

    @Test
    void testLoggerSingleInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2, "Should return the same Logger instance");
    }

    @Test
    void testLoggerNotNull() {
        Logger logger = Logger.getInstance();
        assertNotNull(logger, "Logger instance should not be null");
    }

    @Test
    void testThreadSafety() throws InterruptedException {
        int threadCount = 100;
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        CountDownLatch latch = new CountDownLatch(threadCount);
        List<DatabaseConnection> instances = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            executorService.execute(() -> {
                instances.add(DatabaseConnection.getInstance());
                latch.countDown();
            });
        }

        latch.await();
        executorService.shutdown();

        // All instances should be the same
        DatabaseConnection firstInstance = instances.get(0);
        for (DatabaseConnection instance : instances) {
            assertSame(firstInstance, instance, "All instances should be the same in multi-threaded environment");
        }
    }

    @Test
    void testLoggerThreadSafety() throws InterruptedException {
        int threadCount = 100;
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        CountDownLatch latch = new CountDownLatch(threadCount);
        List<Logger> instances = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            executorService.execute(() -> {
                instances.add(Logger.getInstance());
                latch.countDown();
            });
        }

        latch.await();
        executorService.shutdown();

        // All instances should be the same
        Logger firstInstance = instances.get(0);
        for (Logger instance : instances) {
            assertSame(firstInstance, instance, "All Logger instances should be the same in multi-threaded environment");
        }
    }
}
