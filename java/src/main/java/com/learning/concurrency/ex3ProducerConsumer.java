package com.learning.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Exercise 3: Producer-Consumer Pattern (Medium)
 *
 * Implement the classic producer-consumer pattern where one or more producers
 * create items and one or more consumers process them.
 *
 * This exercise covers:
 * - BlockingQueue for thread-safe producer-consumer
 * - Multiple producers and consumers
 * - Graceful shutdown of workers
 *
 * Difficulty: Medium
 * Topics: Producer-Consumer, BlockingQueue, Thread Coordination
 */
public class ex3ProducerConsumer {

    /**
     * Task 1: Simple producer that generates numbers
     */
    public static class Producer implements Runnable {
        private final BlockingQueue<Integer> queue;
        private final int itemsToProduce;

        public Producer(BlockingQueue<Integer> queue, int itemsToProduce) {
            this.queue = queue;
            this.itemsToProduce = itemsToProduce;
        }

        @Override
        public void run() {
            // TODO: Produce itemsToProduce numbers and put them in the queue
            // Hint: Use queue.put() which blocks if queue is full
            // Hint: Catch InterruptedException
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 2: Simple consumer that processes numbers
     */
    public static class Consumer implements Runnable {
        private final BlockingQueue<Integer> queue;
        private final int itemsToConsume;
        private int sum = 0;

        public Consumer(BlockingQueue<Integer> queue, int itemsToConsume) {
            this.queue = queue;
            this.itemsToConsume = itemsToConsume;
        }

        @Override
        public void run() {
            // TODO: Consume itemsToConsume numbers from the queue and sum them
            // Hint: Use queue.take() which blocks if queue is empty
            // Hint: Catch InterruptedException
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public int getSum() {
            return sum;
        }
    }

    /**
     * Task 3: Create a producer-consumer system with multiple producers and consumers
     *
     * @param numProducers Number of producer threads
     * @param numConsumers Number of consumer threads
     * @param itemsPerProducer Items each producer should produce
     * @return Total sum of all consumed items
     */
    public static int runProducerConsumer(int numProducers, int numConsumers, int itemsPerProducer)
            throws InterruptedException {
        // TODO: Create a BlockingQueue, start producers and consumers, wait for completion
        // Hint: Create bounded queue with capacity
        // Hint: Start all threads and join them
        // Hint: Collect sums from all consumers
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Task 4: URL Download Simulator
     * Producers add URLs to download, consumers "download" them
     */
    public static class DownloadTask {
        private final String url;
        private final int simulatedSizeKB;

        public DownloadTask(String url, int simulatedSizeKB) {
            this.url = url;
            this.simulatedSizeKB = simulatedSizeKB;
        }

        public String getUrl() {
            return url;
        }

        public int getSimulatedSizeKB() {
            return simulatedSizeKB;
        }
    }

    public static class DownloadProducer implements Runnable {
        private final BlockingQueue<DownloadTask> queue;
        private final String[] urls;

        public DownloadProducer(BlockingQueue<DownloadTask> queue, String[] urls) {
            this.queue = queue;
            this.urls = urls;
        }

        @Override
        public void run() {
            // TODO: Create DownloadTask for each URL and add to queue
            // Use random size between 100-1000 KB
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    public static class DownloadConsumer implements Runnable {
        private final BlockingQueue<DownloadTask> queue;
        private final int tasksToProcess;
        private long totalDownloadedKB = 0;

        public DownloadConsumer(BlockingQueue<DownloadTask> queue, int tasksToProcess) {
            this.queue = queue;
            this.tasksToProcess = tasksToProcess;
        }

        @Override
        public void run() {
            // TODO: Take tasks from queue and simulate download
            // Hint: Sleep for (sizeKB / 100) milliseconds to simulate download time
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public long getTotalDownloadedKB() {
            return totalDownloadedKB;
        }
    }

    /**
     * Task 5: Poison pill pattern for graceful shutdown
     * Use a special "poison pill" object to signal consumers to stop
     */
    public static class PoisonPillConsumer implements Runnable {
        private final BlockingQueue<Integer> queue;
        private final Integer poisonPill;
        private int itemsConsumed = 0;

        public PoisonPillConsumer(BlockingQueue<Integer> queue, Integer poisonPill) {
            this.queue = queue;
            this.poisonPill = poisonPill;
        }

        @Override
        public void run() {
            // TODO: Consume items until poison pill is received
            // Hint: Use queue.take() and check if item equals poisonPill
            // Hint: Put poison pill back for other consumers
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public int getItemsConsumed() {
            return itemsConsumed;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Concurrency - Exercise 3: Producer-Consumer\n");

        // Example: Simple producer-consumer with BlockingQueue
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.put("Item " + i);
                    System.out.println("Produced: Item " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    String item = queue.take();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();

        System.out.println("\nNow implement the TODO tasks!");
    }
}
