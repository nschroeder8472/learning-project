package com.learning.systemdesign;

import java.util.*;

public class ex3RateLimiting {
    public static class TokenBucketRateLimiter {
        public TokenBucketRateLimiter(int capacity, int refillRate) {
            // TODO: Implement token bucket algorithm
        }
        public boolean allowRequest() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    public static class SlidingWindowRateLimiter {
        public SlidingWindowRateLimiter(int maxRequests, long windowMs) {
            // TODO: Implement sliding window
        }
        public boolean allowRequest() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
