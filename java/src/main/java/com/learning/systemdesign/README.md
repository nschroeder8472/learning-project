# System Design

## Overview

System design is the process of defining the architecture, components, modules, interfaces, and data for a system to satisfy specified requirements. It involves making high-level decisions about how to structure and scale applications to handle real-world demands.

## Key Concepts

### Scalability
- **Vertical Scaling**: Adding more power (CPU, RAM) to existing machines
- **Horizontal Scaling**: Adding more machines to distribute load
- **Load Balancing**: Distributing traffic across multiple servers

### Performance Optimization
- **Caching**: Store frequently accessed data in fast storage (Redis, Memcached)
- **CDN**: Content Delivery Networks for static assets
- **Database Indexing**: Speed up queries with proper indexes

### Reliability
- **Redundancy**: Duplicate critical components to prevent single points of failure
- **Replication**: Copy data across multiple servers
- **Failover**: Automatic switching to backup systems

### Data Management
- **Database Sharding**: Partition data across multiple databases
- **Replication**: Master-slave, master-master patterns
- **Consistency**: CAP theorem - Consistency, Availability, Partition tolerance

### Common Patterns

#### Caching Strategies
- **Cache-Aside**: Application manages cache explicitly
- **Write-Through**: Write to cache and database simultaneously
- **Write-Behind**: Write to cache, async write to database
- **LRU/LFU**: Eviction policies

#### Load Balancing Algorithms
- **Round Robin**: Distribute requests sequentially
- **Least Connections**: Send to server with fewest active connections
- **IP Hash**: Route based on client IP
- **Weighted**: Distribute based on server capacity

#### Rate Limiting
- **Token Bucket**: Tokens refill at fixed rate
- **Leaky Bucket**: Requests processed at constant rate
- **Sliding Window**: Track requests in time window
- **Fixed Window**: Reset counter at intervals

#### Message Queues
- **Pub/Sub**: Publishers and subscribers communicate asynchronously
- **Work Queues**: Distribute tasks among workers
- **Priority Queues**: Process high-priority messages first

## Design Principles

### CAP Theorem
In distributed systems, you can only guarantee 2 of 3:
- **Consistency**: All nodes see same data
- **Availability**: System responds to requests
- **Partition Tolerance**: System works despite network failures

### Trade-offs
- **Consistency vs Availability**: Strong consistency or high availability?
- **Read vs Write Optimization**: Optimize for reads or writes?
- **Latency vs Throughput**: Fast individual requests or high volume?
- **Normalization vs Denormalization**: Storage efficiency or query speed?

## Real-World Systems

### URL Shortener
- Requirements: Shorten URLs, redirect, track clicks
- Components: Hash function, database, cache, analytics
- Scale: Billions of URLs, millions of requests/second

### Social Media Feed
- Requirements: Post updates, view feed, follow users
- Components: Timeline service, fanout service, cache
- Scale: Millions of users, billions of posts

### Ride Sharing
- Requirements: Match drivers and riders, track location, pricing
- Components: Geo-spatial indexing, matching algorithm, pricing service
- Scale: Real-time location updates, millions of concurrent users

## Exercises

1. **ex1_caching_strategies** (Medium): Implement LRU cache, write-through cache, cache invalidation
2. **ex2_load_balancing** (Medium): Implement round-robin, least connections, weighted balancing
3. **ex3_rate_limiting** (Medium): Implement token bucket, sliding window rate limiters
4. **ex4_sharding** (Hard): Implement consistent hashing, range-based sharding
5. **ex5_message_queue** (Hard): Implement simple message queue with pub/sub
6. **ex6_system_design** (Hard): Design complete systems (URL shortener, key-value store)

## Best Practices

- **Start with requirements**: Define functional and non-functional requirements
- **Estimate scale**: Users, requests/second, data size
- **Identify bottlenecks**: What will fail first under load?
- **Design for failure**: Assume components will fail
- **Monitor and measure**: Metrics, logging, alerting
- **Iterate**: Start simple, scale incrementally

## Tips

- Draw diagrams to visualize architecture
- Calculate rough numbers (back-of-envelope estimation)
- Consider all layers: client, load balancer, app servers, cache, database
- Think about data flow: writes, reads, updates
- Plan for monitoring and observability
