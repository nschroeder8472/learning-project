package com.learning.bigoanalysis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ex2SpaceComplexityTest {

    @Test
    void testSnippet1SpaceComplexity() {
        assertEquals("O(1)", ex2SpaceComplexity.getSpaceComplexitySnippet1(),
            "Only uses a single sum variable - constant space");
    }

    @Test
    void testSnippet2SpaceComplexity() {
        assertEquals("O(n)", ex2SpaceComplexity.getSpaceComplexitySnippet2(),
            "Creates a copy array of size n - linear space");
    }

    @Test
    void testSnippet3SpaceComplexity() {
        assertEquals("O(n)", ex2SpaceComplexity.getSpaceComplexitySnippet3(),
            "Recursion stack depth is n - linear space");
    }

    @Test
    void testSnippet4SpaceComplexity() {
        assertEquals("O(n^2)", ex2SpaceComplexity.getSpaceComplexitySnippet4(),
            "Creates n×n matrix - quadratic space");
    }

    @Test
    void testSnippet5SpaceComplexity() {
        assertEquals("O(n)", ex2SpaceComplexity.getSpaceComplexitySnippet5(),
            "Worst case: all elements pass filter - linear space");
    }

    @Test
    void testSnippet6SpaceComplexity() {
        assertEquals("O(n)", ex2SpaceComplexity.getSpaceComplexitySnippet6(),
            "Memo stores n values and stack depth is O(n) - linear space");
    }
}
