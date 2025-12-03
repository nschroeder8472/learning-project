package com.learning.bigoanalysis;

import java.util.*;

/**
 * Exercise 2: Space Complexity Analysis (Easy)
 *
 * Analyze the space complexity of each method below. Space complexity measures
 * the additional memory an algorithm uses beyond the input.
 *
 * Remember:
 * - Input size doesn't count toward space complexity
 * - Count auxiliary space (variables, data structures, recursion stack)
 * - O(1) = constant space, O(n) = linear space, etc.
 *
 * Difficulty: Easy
 * Topics: Space Complexity, Memory Analysis
 */
public class ex2SpaceComplexity {

    /**
     * Snippet 1: Sum array elements
     */
    public static int snippet1(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static String getSpaceComplexitySnippet1() {
        // TODO: Return the space complexity of snippet1
        // Hint: How many extra variables do we use regardless of input size?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 2: Create a copy of the array
     */
    public static int[] snippet2(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static String getSpaceComplexitySnippet2() {
        // TODO: Return the space complexity of snippet2
        // Hint: How does the size of 'copy' relate to the input size?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 3: Recursive factorial
     */
    public static long snippet3(int n) {
        if (n <= 1) return 1;
        return n * snippet3(n - 1);
    }

    public static String getSpaceComplexitySnippet3() {
        // TODO: Return the space complexity of snippet3
        // Hint: Consider the call stack. How many recursive calls are made?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 4: Create 2D array
     */
    public static int[][] snippet4(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }

    public static String getSpaceComplexitySnippet4() {
        // TODO: Return the space complexity of snippet4
        // Hint: How many elements are in an n×n matrix?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 5: Filter array into list
     */
    public static List<Integer> snippet5(int[] arr, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num > threshold) {
                result.add(num);
            }
        }
        return result;
    }

    public static String getSpaceComplexitySnippet5() {
        // TODO: Return the space complexity of snippet5
        // Hint: In the worst case, how many elements might be in the result list?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 6: Fibonacci with memoization
     */
    public static long snippet6(int n, Map<Integer, Long> memo) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);

        long result = snippet6(n - 1, memo) + snippet6(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public static String getSpaceComplexitySnippet6() {
        // TODO: Return the space complexity of snippet6
        // Hint: Consider both the memo map size and the recursion stack depth
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        System.out.println("Big O Analysis - Exercise 2: Space Complexity");
        System.out.println("Implement getSpaceComplexity methods");

        try {
            System.out.println("Snippet 1 (sum array): " + getSpaceComplexitySnippet1());
            System.out.println("Snippet 2 (copy array): " + getSpaceComplexitySnippet2());
            System.out.println("Snippet 3 (recursive factorial): " + getSpaceComplexitySnippet3());
            System.out.println("Snippet 4 (2D array): " + getSpaceComplexitySnippet4());
            System.out.println("Snippet 5 (filter array): " + getSpaceComplexitySnippet5());
            System.out.println("Snippet 6 (fibonacci memoization): " + getSpaceComplexitySnippet6());
        } catch (UnsupportedOperationException e) {
            System.out.println("Not yet implemented!");
        }
    }
}
