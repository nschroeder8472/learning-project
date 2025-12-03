package com.learning.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Exercise 6: Race Conditions and Debugging (Hard)
 *
 * Learn to identify and fix common concurrency bugs.
 * This exercise covers:
 * - Identifying race conditions
 * - Using atomic variables
 * - Read-write locks
 * - Avoiding deadlocks
 *
 * Difficulty: Hard
 * Topics: Race Conditions, Deadlocks, Atomic Operations, Debugging
 */
public class ex6RaceConditions {

    /**
     * Task 1: Fix the race condition in this counter
     * BUGGY CODE - DO NOT USE AS IS!
     */
    public static class BuggyCounter {
        private int count = 0;

        public void increment() {
            count++;  // This is NOT atomic!
        }

        public int getCount() {
            return count;
        }
    }

    /**
     * Task 1: Implement a correct counter using AtomicInteger
     */
    public static class AtomicCounter {
        // TODO: Use AtomicInteger for thread-safe operations
        // Hint: private final AtomicInteger count = new AtomicInteger(0);

        public void increment() {
            // TODO: Use atomic increment
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public int getCount() {
            // TODO: Return atomic value
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 2: Fix check-then-act race condition
     */
    public static class LazyInitializer {
        private String resource;

        /**
         * BUGGY VERSION - has race condition
         */
        public String getResourceBuggy() {
            if (resource == null) {
                // Race condition here! Multiple threads might initialize
                resource = "Expensive Resource " + System.nanoTime();
            }
            return resource;
        }

        /**
         * Fixed version with proper synchronization
         */
        public synchronized String getResourceFixed() {
            // TODO: Implement thread-safe lazy initialization
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 3: Implement a read-write lock for cache
     * Multiple readers can access simultaneously, but writers get exclusive access
     */
    public static class ReadWriteCache {
        private String data = "initial";
        private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

        public String read() {
            // TODO: Acquire read lock, read data, release lock
            // Hint: rwLock.readLock().lock() / unlock()
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void write(String newData) {
            // TODO: Acquire write lock, write data, release lock
            // Hint: rwLock.writeLock().lock() / unlock()
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 4: Fix potential deadlock
     * BUGGY CODE - Can cause deadlock!
     */
    public static class DeadlockRisk {
        private final Object lock1 = new Object();
        private final Object lock2 = new Object();

        public void method1() {
            synchronized (lock1) {
                synchronized (lock2) {
                    // Do work
                }
            }
        }

        public void method2() {
            synchronized (lock2) {  // Locks in different order - DEADLOCK RISK!
                synchronized (lock1) {
                    // Do work
                }
            }
        }
    }

    /**
     * Task 4: Fix the deadlock by ensuring consistent lock ordering
     */
    public static class DeadlockFree {
        private final Object lock1 = new Object();
        private final Object lock2 = new Object();

        public void method1() {
            // TODO: Always acquire locks in the same order
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void method2() {
            // TODO: Acquire locks in same order as method1
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 5: Fix visibility issue with volatile
     */
    public static class VisibilityExample {
        private boolean ready = false;
        private int value = 0;

        public void writer() {
            value = 42;
            ready = true;  // Without volatile, reader might see ready=true but value=0
        }

        public int reader() {
            while (!ready) {
                Thread.yield();
            }
            return value;
        }
    }

    /**
     * Task 5: Fixed version with proper volatile declaration
     */
    public static class VisibilityFixed {
        // TODO: Make 'ready' volatile to ensure visibility
        // TODO: Note: For this simple case, volatile is sufficient
        // For more complex cases, use synchronized or atomic variables

        private int value = 0;

        public void writer() {
            // TODO: Implement writer
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public int reader() {
            // TODO: Implement reader
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 6: Compound action race condition
     * Even with synchronized methods, compound actions can have race conditions
     */
    public static class ThreadSafeList {
        private final java.util.List<Integer> list = new java.util.ArrayList<>();

        public synchronized void add(Integer item) {
            list.add(item);
        }

        public synchronized int size() {
            return list.size();
        }

        /**
         * BUGGY: Check-then-act spans multiple synchronized methods
         */
        public void addIfNotPresentBuggy(Integer item) {
            if (!list.contains(item)) {  // Race condition!
                add(item);
            }
        }

        /**
         * Fixed version
         */
        public synchronized void addIfNotPresentFixed(Integer item) {
            // TODO: Implement thread-safe check-and-add in single synchronized block
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Concurrency - Exercise 6: Race Conditions\n");

        // Demonstrate race condition
        System.out.println("Demonstrating race condition:");
        BuggyCounter buggyCounter = new BuggyCounter();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    buggyCounter.increment();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Expected: 10000");
        System.out.println("Actual: " + buggyCounter.getCount());
        System.out.println("(Likely less due to race condition)\n");

        System.out.println("Now implement the TODO tasks to fix these issues!");
    }
}
