package com.learning.systemdesign;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Exercise 2: Load Balancing (Medium)
 *
 * Implement load balancing algorithms for distributing requests.
 * 
 * Difficulty: Medium
 * Topics: Load Balancing, Distribution Algorithms, Scalability
 */
public class ex2LoadBalancing {

    public interface Server {
        String getId();
        int getActiveConnections();
        void incrementConnections();
        void decrementConnections();
        boolean isHealthy();
    }

    public static class SimpleServer implements Server {
        private final String id;
        private final AtomicInteger connections = new AtomicInteger(0);
        private boolean healthy = true;

        public SimpleServer(String id) {
            this.id = id;
        }

        @Override
        public String getId() { return id; }

        @Override
        public int getActiveConnections() { return connections.get(); }

        @Override
        public void incrementConnections() { connections.incrementAndGet(); }

        @Override
        public void decrementConnections() { connections.decrementAndGet(); }

        @Override
        public boolean isHealthy() { return healthy; }

        public void setHealthy(boolean healthy) { this.healthy = healthy; }
    }

    /**
     * Task 1: Round Robin Load Balancer
     */
    public static class RoundRobinLoadBalancer {
        private final List<Server> servers;

        public RoundRobinLoadBalancer(List<Server> servers) {
            this.servers = new ArrayList<>(servers);
        }

        public Server getNextServer() {
            // TODO: Return next server in round-robin fashion
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 2: Least Connections Load Balancer
     */
    public static class LeastConnectionsLoadBalancer {
        private final List<Server> servers;

        public LeastConnectionsLoadBalancer(List<Server> servers) {
            this.servers = new ArrayList<>(servers);
        }

        public Server getNextServer() {
            // TODO: Return server with fewest active connections
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 3: Weighted Load Balancer
     */
    public static class WeightedLoadBalancer {
        private final Map<Server, Integer> serverWeights;

        public WeightedLoadBalancer(Map<Server, Integer> serverWeights) {
            this.serverWeights = new HashMap<>(serverWeights);
        }

        public Server getNextServer() {
            // TODO: Distribute based on weights
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 4: IP Hash Load Balancer
     */
    public static class IPHashLoadBalancer {
        private final List<Server> servers;

        public IPHashLoadBalancer(List<Server> servers) {
            this.servers = new ArrayList<>(servers);
        }

        public Server getServer(String clientIP) {
            // TODO: Route based on client IP hash
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Task 5: Load Balancer with Health Checks
     */
    public static class HealthAwareLoadBalancer {
        private final List<Server> servers;

        public HealthAwareLoadBalancer(List<Server> servers) {
            this.servers = new ArrayList<>(servers);
        }

        public Server getNextServer() {
            // TODO: Return healthy server using round-robin
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
