# Dynamic Programming

## Concept

Dynamic Programming (DP) is an algorithmic technique for solving optimization problems by breaking them down into simpler subproblems. It stores the results of subproblems to avoid redundant computations.

## Key Concepts

### Characteristics of DP Problems
1. **Optimal Substructure**: Optimal solution can be constructed from optimal solutions of subproblems
2. **Overlapping Subproblems**: Same subproblems are solved multiple times

### Two Main Approaches

#### Memoization (Top-Down)
- Start with the original problem
- Recursively break down into subproblems
- Cache results to avoid recomputation
- Uses recursion with a memo table

#### Tabulation (Bottom-Up)
- Start with smallest subproblems
- Build up solutions iteratively
- Store results in a table (usually an array)
- No recursion needed

## Common Patterns

| Pattern | Description | Example |
|---------|-------------|---------|
| 1D DP | Single array/variable | Fibonacci, Climbing Stairs |
| 2D DP | 2D array for two sequences | LCS, Edit Distance |
| Knapsack | Optimization with constraints | Coin Change, 0/1 Knapsack |
| Decision Making | Choose or skip elements | House Robber |

## Exercises

### Easy
1. **ex1_FibonacciNumber** - Classic DP introduction with memoization and tabulation
2. **ex2_ClimbingStairs** - Count ways to climb n stairs (1 or 2 steps at a time)

### Medium
3. **ex3_CoinChange** - Minimum coins to make an amount (return -1 if impossible)
4. **ex4_LongestCommonSubsequence** - Find LCS length of two strings
5. **ex5_HouseRobber** - Maximum money without robbing adjacent houses

### Hard
6. **ex6_EditDistance** - Minimum operations (insert/delete/replace) to convert strings

## Complexity Analysis

| Algorithm | Time | Space | Approach |
|-----------|------|-------|----------|
| Fibonacci (Naive) | O(2ⁿ) | O(n) | Recursion |
| Fibonacci (Memo) | O(n) | O(n) | Top-down DP |
| Fibonacci (Tab) | O(n) | O(n) or O(1) | Bottom-up DP |
| Coin Change | O(n×m) | O(n) | DP table |
| LCS | O(m×n) | O(m×n) | 2D DP |
| Edit Distance | O(m×n) | O(m×n) | 2D DP |

## Hints

1. **Fibonacci**: Base cases f(0)=0, f(1)=1. Recurrence: f(n) = f(n-1) + f(n-2)
2. **Climbing Stairs**: Same recurrence as Fibonacci! Ways to reach step n = ways(n-1) + ways(n-2)
3. **Coin Change**: For each amount, try each coin and take minimum. dp[i] = min(dp[i-coin]) + 1
4. **LCS**: If chars match, add 1 + LCS of rest. Else, max of skipping either char
5. **House Robber**: At each house, max(rob this + skip previous, skip this + previous)
6. **Edit Distance**: Three operations: insert, delete, replace. Take minimum cost + 1

## Testing Your Implementation

Run all dynamic programming tests:
```bash
./gradlew test --tests "com.learning.algorithms.dynamicprogramming.*"
```

Run specific test:
```bash
./gradlew test --tests "com.learning.algorithms.dynamicprogramming.ex1FibonacciNumberTest"
```
