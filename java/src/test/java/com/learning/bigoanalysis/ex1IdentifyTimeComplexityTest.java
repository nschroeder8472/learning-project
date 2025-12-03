package com.learning.bigoanalysis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ex1IdentifyTimeComplexityTest {

    @Test
    void testSnippet1Complexity() {
        assertEquals("O(1)", ex1IdentifyTimeComplexity.getComplexitySnippet1(),
            "Array access is constant time");
    }

    @Test
    void testSnippet2Complexity() {
        assertEquals("O(n)", ex1IdentifyTimeComplexity.getComplexitySnippet2(),
            "Linear search has linear time complexity");
    }

    @Test
    void testSnippet3Complexity() {
        assertEquals("O(log n)", ex1IdentifyTimeComplexity.getComplexitySnippet3(),
            "Binary search has logarithmic time complexity");
    }

    @Test
    void testSnippet4Complexity() {
        assertEquals("O(n^2)", ex1IdentifyTimeComplexity.getComplexitySnippet4(),
            "Nested loops over same array is quadratic");
    }

    @Test
    void testSnippet5Complexity() {
        assertEquals("O(n)", ex1IdentifyTimeComplexity.getComplexitySnippet5(),
            "Two sequential loops is linear (O(n + n) = O(2n) = O(n))");
    }

    @Test
    void testSnippet6Complexity() {
        assertEquals("O(n^2)", ex1IdentifyTimeComplexity.getComplexitySnippet6(),
            "Nested loop for finding duplicates is quadratic");
    }
}
