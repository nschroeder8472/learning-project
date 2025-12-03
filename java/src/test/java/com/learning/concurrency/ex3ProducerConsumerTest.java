package com.learning.concurrency;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.*;
import static org.junit.jupiter.api.Assertions.*;

class ex3ProducerConsumerTest {

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testSimpleProducerConsumer() throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        int itemCount = 100;

        ex3ProducerConsumer.Producer producer = new ex3ProducerConsumer.Producer(queue, itemCount);
        ex3ProducerConsumer.Consumer consumer = new ex3ProducerConsumer.Consumer(queue, itemCount);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        int expectedSum = itemCount * (itemCount - 1) / 2; // Sum of 0 to 99
        assertEquals(expectedSum, consumer.getSum());
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testMultipleProducersConsumers() throws InterruptedException {
        int result = ex3ProducerConsumer.runProducerConsumer(2, 3, 50);
        int expectedSum = 2 * (50 * 49 / 2); // 2 producers, each producing 0 to 49
        assertEquals(expectedSum, result);
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testDownloadSimulation() throws InterruptedException {
        BlockingQueue<ex3ProducerConsumer.DownloadTask> queue = new LinkedBlockingQueue<>();
        String[] urls = {"url1", "url2", "url3", "url4", "url5"};

        ex3ProducerConsumer.DownloadProducer producer =
            new ex3ProducerConsumer.DownloadProducer(queue, urls);
        ex3ProducerConsumer.DownloadConsumer consumer =
            new ex3ProducerConsumer.DownloadConsumer(queue, urls.length);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        assertTrue(consumer.getTotalDownloadedKB() > 0, "Should have downloaded some data");
    }

    @Test
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testPoisonPill() throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Integer poisonPill = -1;

        // Producer puts items then poison pill
        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.put(i);
                }
                queue.put(poisonPill);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        ex3ProducerConsumer.PoisonPillConsumer consumer =
            new ex3ProducerConsumer.PoisonPillConsumer(queue, poisonPill);
        Thread consumerThread = new Thread(consumer);

        producer.start();
        consumerThread.start();

        producer.join();
        consumerThread.join();

        assertEquals(10, consumer.getItemsConsumed(), "Should consume exactly 10 items before poison pill");
    }
}
