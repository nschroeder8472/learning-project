package com.learning.concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 1: Basic Threading (Easy)
 *
 * Learn the fundamentals of creating and managing threads in Java.
 * This exercise covers:
 * - Creating threads using Thread class and Runnable interface
 * - Starting and joining threads
 * - Basic parallel execution
 *
 * Difficulty: Easy
 * Topics: Threads, Parallel Execution
 */
public class ex1BasicThreading {

    /**
     * Task 1: Create and run a simple thread that prints numbers 1-5
     * Use the Thread class directly (override run() method)
     */
    public static class NumberPrinterThread extends Thread {
        // TODO: Implement this class
        // Hint: Override the run() method to print numbers 1-5
        // Use Thread.currentThread().getName() to print which thread is running
    }

    /**
     * Task 2: Create a runnable task that counts down from a given number
     * Implement the Runnable interface (preferred approach)
     */
    public static class CountdownTask implements Runnable {
        private final int start;

        public CountdownTask(int start) {
            this.start = start;
        }

        @Override
        public void run() {
            // TODO: Implement countdown from 'start' to 1
            // Hint: Print each number with the thread name
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 3: Run multiple threads in parallel and wait for all to complete
     *
     * @param numThreads Number of threads to create
     * @return List of thread names that completed
     */
    public static List<String> runParallelThreads(int numThreads) throws InterruptedException {
        // TODO: Create numThreads threads, start them all, and wait for completion
        // Hint 1: Use Thread.join() to wait for a thread to complete
        // Hint 2: Store thread names and return them
        // Hint 3: Each thread should do some simple work (e.g., sleep for 100ms)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 4: Calculate sum of array using multiple threads
     * Divide the array into chunks and sum each chunk in parallel
     *
     * @param arr Array to sum
     * @param numThreads Number of threads to use
     * @return Total sum
     */
    public static long parallelSum(int[] arr, int numThreads) throws InterruptedException {
        // TODO: Divide array into chunks and sum each chunk in a separate thread
        // Hint 1: Create a class to store partial sums from each thread
        // Hint 2: Divide array indices among threads
        // Hint 3: Join all threads and combine results
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 5: Implement a simple worker thread that processes tasks
     */
    public static class WorkerThread extends Thread {
        private final List<Runnable> tasks;
        private volatile boolean running = true;

        public WorkerThread(List<Runnable> tasks) {
            this.tasks = tasks;
        }

        public void shutdown() {
            running = false;
        }

        @Override
        public void run() {
            // TODO: Process all tasks while running is true
            // Hint: Iterate through tasks and execute each one
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Concurrency - Exercise 1: Basic Threading\n");

        // Example: Creating a simple thread
        Thread simpleThread = new Thread(() -> {
            System.out.println("Hello from thread: " + Thread.currentThread().getName());
        });
        simpleThread.start();
        simpleThread.join();

        System.out.println("\nImplement the TODO tasks above!");
    }
}
