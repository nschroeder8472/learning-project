package com.learning.bigoanalysis;

/**
 * Exercise 4: Recursive Complexity Analysis (Medium)
 *
 * Analyze the time complexity of recursive algorithms. For each function,
 * determine its time complexity by analyzing the recurrence relation.
 *
 * Tips:
 * - Count how many recursive calls are made
 * - Determine how the problem size decreases with each call
 * - Draw a recursion tree if helpful
 * - Use Master Theorem when applicable: T(n) = aT(n/b) + f(n)
 *
 * Difficulty: Medium
 * Topics: Recursion, Recurrence Relations, Master Theorem
 */
public class ex4RecursiveComplexity {

    /**
     * Recursive 1: Simple factorial
     */
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static String getComplexityFactorial() {
        // TODO: Analyze factorial's time complexity
        // Hint: How many recursive calls? T(n) = T(n-1) + O(1)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Recursive 2: Naive Fibonacci
     */
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static String getComplexityFibonacci() {
        // TODO: Analyze naive fibonacci's time complexity
        // Hint: Each call makes 2 recursive calls. Draw the tree!
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Recursive 3: Binary search (recursive version)
     */
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, right);
    }

    public static String getComplexityBinarySearch() {
        // TODO: Analyze recursive binary search complexity
        // Hint: How does the search space change? T(n) = T(n/2) + O(1)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Recursive 4: Merge sort
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static String getComplexityMergeSort() {
        // TODO: Analyze merge sort complexity
        // Hint: T(n) = 2T(n/2) + O(n). Use Master Theorem!
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Recursive 5: Tower of Hanoi
     */
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            return; // Move one disk
        }
        towerOfHanoi(n - 1, source, auxiliary, destination);
        // Move disk from source to destination
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static String getComplexityTowerOfHanoi() {
        // TODO: Analyze Tower of Hanoi complexity
        // Hint: Each call makes 2 recursive calls with n-1. T(n) = 2T(n-1) + O(1)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Recursive 6: Sum of array (divide and conquer)
     */
    public static int sumArray(int[] arr, int left, int right) {
        if (left == right) return arr[left];
        int mid = left + (right - left) / 2;
        return sumArray(arr, left, mid) + sumArray(arr, mid + 1, right);
    }

    public static String getComplexitySumArray() {
        // TODO: Analyze divide-and-conquer sum complexity
        // Hint: T(n) = 2T(n/2) + O(1). Compare with merge sort!
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        System.out.println("Big O Analysis - Exercise 4: Recursive Complexity");

        try {
            System.out.println("Factorial: " + getComplexityFactorial());
            System.out.println("Fibonacci (naive): " + getComplexityFibonacci());
            System.out.println("Binary Search: " + getComplexityBinarySearch());
            System.out.println("Merge Sort: " + getComplexityMergeSort());
            System.out.println("Tower of Hanoi: " + getComplexityTowerOfHanoi());
            System.out.println("Sum Array (D&C): " + getComplexitySumArray());
        } catch (UnsupportedOperationException e) {
            System.out.println("Not yet implemented!");
        }
    }
}
