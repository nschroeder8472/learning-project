package com.learning.systemdesign;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ex2LoadBalancingTest {
    @Test
    void testRoundRobin() {
        List<ex2LoadBalancing.Server> servers = Arrays.asList(
            new ex2LoadBalancing.SimpleServer("s1"),
            new ex2LoadBalancing.SimpleServer("s2")
        );
        ex2LoadBalancing.RoundRobinLoadBalancer lb = new ex2LoadBalancing.RoundRobinLoadBalancer(servers);
        
        assertEquals("s1", lb.getNextServer().getId());
        assertEquals("s2", lb.getNextServer().getId());
        assertEquals("s1", lb.getNextServer().getId());
    }
}
