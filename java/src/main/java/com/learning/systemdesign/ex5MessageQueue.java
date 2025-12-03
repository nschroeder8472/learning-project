package com.learning.systemdesign;

import java.util.*;
import java.util.concurrent.*;

public class ex5MessageQueue {
    public static class SimpleMessageQueue<T> {
        public void publish(T message) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
        public T consume() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    public static class PubSubMessageQueue<T> {
        public void subscribe(String topic, Consumer<T> subscriber) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
        public void publish(String topic, T message) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    interface Consumer<T> {
        void accept(T message);
    }
}
