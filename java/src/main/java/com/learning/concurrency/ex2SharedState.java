package com.learning.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Exercise 2: Shared State and Synchronization (Medium)
 *
 * Learn how to safely share state between threads using synchronization mechanisms.
 * This exercise covers:
 * - The synchronized keyword
 * - ReentrantLock
 * - Volatile variables
 * - Atomic operations
 *
 * Difficulty: Medium
 * Topics: Thread Safety, Synchronization, Race Conditions
 */
public class ex2SharedState {

    /**
     * Task 1: Thread-safe counter using synchronized keyword
     */
    public static class SynchronizedCounter {
        private int count = 0;

        public void increment() {
            // TODO: Make this method thread-safe using synchronized
            // Hint: Add synchronized keyword to method or use synchronized block
            count++;
        }

        public void decrement() {
            // TODO: Make this method thread-safe
            count--;
        }

        public int getCount() {
            // TODO: Make this thread-safe
            return count;
        }
    }

    /**
     * Task 2: Thread-safe counter using ReentrantLock
     */
    public static class LockedCounter {
        private int count = 0;
        private final Lock lock = new ReentrantLock();

        public void increment() {
            // TODO: Use lock to protect the increment operation
            // Hint: lock.lock() before, lock.unlock() in finally block
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void decrement() {
            // TODO: Use lock to protect the decrement operation
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public int getCount() {
            // TODO: Use lock to protect read operation
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 3: Thread-safe bank account with transfer operations
     */
    public static class BankAccount {
        private double balance;
        private final Object lock = new Object();

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            // TODO: Implement thread-safe deposit
            // Hint: Use synchronized(lock) block
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public boolean withdraw(double amount) {
            // TODO: Implement thread-safe withdrawal
            // Return true if successful, false if insufficient funds
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public double getBalance() {
            // TODO: Implement thread-safe balance retrieval
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Transfer money from this account to another account
         * This is tricky - need to avoid deadlocks!
         */
        public boolean transferTo(BankAccount other, double amount) {
            // TODO: Implement thread-safe transfer between accounts
            // Hint 1: Need to lock both accounts
            // Hint 2: Always lock in same order to avoid deadlock
            // Hint 3: Use System.identityHashCode() to determine lock order
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 4: Shared buffer with thread-safe operations
     */
    public static class SharedBuffer<T> {
        private T value;
        private boolean hasValue = false;

        /**
         * Put a value in the buffer (blocks if buffer is full)
         */
        public synchronized void put(T item) throws InterruptedException {
            // TODO: Wait while buffer has a value, then put the new value
            // Hint: Use wait() and notifyAll()
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Take a value from the buffer (blocks if buffer is empty)
         */
        public synchronized T take() throws InterruptedException {
            // TODO: Wait while buffer is empty, then take the value
            // Hint: Use wait() and notifyAll()
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 5: Thread-safe singleton pattern (Double-checked locking)
     */
    public static class ThreadSafeSingleton {
        private static volatile ThreadSafeSingleton instance;
        private final String data;

        private ThreadSafeSingleton() {
            // Simulate expensive initialization
            data = "Initialized at " + System.currentTimeMillis();
        }

        public static ThreadSafeSingleton getInstance() {
            // TODO: Implement double-checked locking pattern
            // Hint 1: Check if instance is null without locking (first check)
            // Hint 2: If null, synchronize and check again (second check)
            // Hint 3: Create instance only if still null
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String getData() {
            return data;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Concurrency - Exercise 2: Shared State\n");

        // Example: Demonstrating race condition
        System.out.println("Without synchronization (race condition):");
        class UnsafeCounter {
            int count = 0;
            void increment() { count++; }
            int getCount() { return count; }
        }

        UnsafeCounter unsafeCounter = new UnsafeCounter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) unsafeCounter.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) unsafeCounter.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected: 2000, Actual: " + unsafeCounter.getCount());
        System.out.println("(Likely less than 2000 due to race condition)\n");

        System.out.println("Implement the TODO tasks to make operations thread-safe!");
    }
}
