package com.learning.bigoanalysis;

/**
 * Exercise 1: Identify Time Complexity (Easy)
 *
 * For each of the methods below, identify its time complexity in Big O notation.
 * Implement the getTimeComplexity() method to return the correct complexity as a string.
 *
 * Examples of valid return values: "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(n^2)", "O(2^n)"
 *
 * Difficulty: Easy
 * Topics: Big O Analysis, Algorithm Analysis
 */
public class ex1IdentifyTimeComplexity {

    /**
     * Snippet 1: Simple array access
     */
    public static int snippet1(int[] arr, int index) {
        return arr[index];
    }

    public static String getComplexitySnippet1() {
        // TODO: Return the time complexity of snippet1
        // Hint: How does the operation change when array size increases?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 2: Linear search
     */
    public static int snippet2(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static String getComplexitySnippet2() {
        // TODO: Return the time complexity of snippet2
        // Hint: How many elements might we need to check in the worst case?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 3: Binary search (assume arr is sorted)
     */
    public static int snippet3(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static String getComplexitySnippet3() {
        // TODO: Return the time complexity of snippet3
        // Hint: How does the search space change with each iteration?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 4: Nested loops - print all pairs
     */
    public static void snippet4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }

    public static String getComplexitySnippet4() {
        // TODO: Return the time complexity of snippet4
        // Hint: How many times does the print statement execute?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 5: Two separate loops
     */
    public static void snippet5(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
    }

    public static String getComplexitySnippet5() {
        // TODO: Return the time complexity of snippet5
        // Hint: The loops are independent. If arr1 has n elements and arr2 has m elements...
        // For this exercise, assume both arrays have size n, so express in terms of n only
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Snippet 6: Finding duplicates with nested loops
     */
    public static boolean snippet6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getComplexitySnippet6() {
        // TODO: Return the time complexity of snippet6
        // Hint: Even though j starts at i+1, this is still a nested loop pattern
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        System.out.println("Big O Analysis - Exercise 1");
        System.out.println("Implement getComplexity methods to identify time complexities");

        try {
            System.out.println("Snippet 1 (array access): " + getComplexitySnippet1());
            System.out.println("Snippet 2 (linear search): " + getComplexitySnippet2());
            System.out.println("Snippet 3 (binary search): " + getComplexitySnippet3());
            System.out.println("Snippet 4 (nested loops): " + getComplexitySnippet4());
            System.out.println("Snippet 5 (two loops): " + getComplexitySnippet5());
            System.out.println("Snippet 6 (find duplicates): " + getComplexitySnippet6());
        } catch (UnsupportedOperationException e) {
            System.out.println("Not yet implemented!");
        }
    }
}
