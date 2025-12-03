package com.learning.bigoanalysis;

/**
 * Exercise 3: Best, Worst, and Average Case Analysis (Medium)
 *
 * For each algorithm below, determine the time complexity for:
 * - Best case: Most favorable input
 * - Worst case: Least favorable input
 * - Average case: Typical/random input
 *
 * Return format: "O(...)" (e.g., "O(n)", "O(1)", "O(n^2)")
 *
 * Difficulty: Medium
 * Topics: Big O Analysis, Algorithm Analysis, Case Analysis
 */
public class ex3BestWorstAverage {

    /**
     * Linear Search: Find target in array
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static String linearSearchBestCase() {
        // TODO: What's the best case? When is the target found fastest?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String linearSearchWorstCase() {
        // TODO: What's the worst case? When do we search the longest?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String linearSearchAverageCase() {
        // TODO: On average, where might the target be in a random array?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Insertion Sort: Sort array by inserting elements in correct position
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static String insertionSortBestCase() {
        // TODO: When does insertion sort perform best? (Hint: what if array is already sorted?)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String insertionSortWorstCase() {
        // TODO: When does insertion sort perform worst? (Hint: reverse sorted?)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String insertionSortAverageCase() {
        // TODO: What's the average case for random data?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Quick Sort: Divide and conquer sorting
     * (Simplified version shown for analysis)
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static String quickSortBestCase() {
        // TODO: When does quicksort perform best? (Hint: balanced partitions)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String quickSortWorstCase() {
        // TODO: When does quicksort perform worst? (Hint: unbalanced partitions)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String quickSortAverageCase() {
        // TODO: What's the average case complexity?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Binary Search: Find target in sorted array
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static String binarySearchBestCase() {
        // TODO: Best case for binary search?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String binarySearchWorstCase() {
        // TODO: Worst case for binary search?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static String binarySearchAverageCase() {
        // TODO: Average case for binary search?
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        System.out.println("Big O Analysis - Exercise 3: Best/Worst/Average Cases");
        System.out.println("\nLinear Search:");
        try {
            System.out.println("  Best: " + linearSearchBestCase());
            System.out.println("  Worst: " + linearSearchWorstCase());
            System.out.println("  Average: " + linearSearchAverageCase());
        } catch (UnsupportedOperationException e) {
            System.out.println("  Not yet implemented!");
        }

        System.out.println("\nInsertion Sort:");
        try {
            System.out.println("  Best: " + insertionSortBestCase());
            System.out.println("  Worst: " + insertionSortWorstCase());
            System.out.println("  Average: " + insertionSortAverageCase());
        } catch (UnsupportedOperationException e) {
            System.out.println("  Not yet implemented!");
        }

        System.out.println("\nQuick Sort:");
        try {
            System.out.println("  Best: " + quickSortBestCase());
            System.out.println("  Worst: " + quickSortWorstCase());
            System.out.println("  Average: " + quickSortAverageCase());
        } catch (UnsupportedOperationException e) {
            System.out.println("  Not yet implemented!");
        }

        System.out.println("\nBinary Search:");
        try {
            System.out.println("  Best: " + binarySearchBestCase());
            System.out.println("  Worst: " + binarySearchWorstCase());
            System.out.println("  Average: " + binarySearchAverageCase());
        } catch (UnsupportedOperationException e) {
            System.out.println("  Not yet implemented!");
        }
    }
}
