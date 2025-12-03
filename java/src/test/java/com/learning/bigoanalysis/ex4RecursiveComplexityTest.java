package com.learning.bigoanalysis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ex4RecursiveComplexityTest {

    @Test
    void testFactorialComplexity() {
        assertEquals("O(n)", ex4RecursiveComplexity.getComplexityFactorial(),
            "Factorial makes n recursive calls");
    }

    @Test
    void testFibonacciComplexity() {
        assertEquals("O(2^n)", ex4RecursiveComplexity.getComplexityFibonacci(),
            "Naive Fibonacci has exponential complexity");
    }

    @Test
    void testBinarySearchComplexity() {
        assertEquals("O(log n)", ex4RecursiveComplexity.getComplexityBinarySearch(),
            "Binary search halves the problem each time");
    }

    @Test
    void testMergeSortComplexity() {
        assertEquals("O(n log n)", ex4RecursiveComplexity.getComplexityMergeSort(),
            "Merge sort: T(n) = 2T(n/2) + O(n)");
    }

    @Test
    void testTowerOfHanoiComplexity() {
        assertEquals("O(2^n)", ex4RecursiveComplexity.getComplexityTowerOfHanoi(),
            "Tower of Hanoi: T(n) = 2T(n-1) + O(1) = O(2^n)");
    }

    @Test
    void testSumArrayComplexity() {
        assertEquals("O(n)", ex4RecursiveComplexity.getComplexitySumArray(),
            "Divide-and-conquer sum: T(n) = 2T(n/2) + O(1) = O(n)");
    }
}
