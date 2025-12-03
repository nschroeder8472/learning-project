package com.learning.systemdesign;

import java.util.*;

public class ex4Sharding {
    public static class ConsistentHashing {
        public ConsistentHashing(int virtualNodes) {
            // TODO: Implement consistent hashing
        }
        public String getNode(String key) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
        public void addNode(String node) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    public static class RangeBasedSharding {
        public RangeBasedSharding(List<String> shards) {
            // TODO: Partition by key ranges
        }
        public String getShard(int key) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
