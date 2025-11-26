package com.learning.algorithms.searching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Find Peak Element.
 */
public class ex4FindPeakElementTest {

    @Test
    public void testSinglePeak() {
        int[] arr = {1, 2, 3, 1};
        int peak = ex4_FindPeakElement.findPeakElement(arr);
        assertEquals(2, peak);
    }

    @Test
    public void testMultiplePeaks() {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        int peak = ex4_FindPeakElement.findPeakElement(arr);
        // Either index 1 (element 2) or index 5 (element 6) is valid
        assertTrue(peak == 1 || peak == 5);
        // Verify it's actually a peak
        if (peak > 0 && peak < arr.length - 1) {
            assertTrue(arr[peak] > arr[peak - 1] && arr[peak] > arr[peak + 1]);
        }
    }

    @Test
    public void testSingleElement() {
        int[] arr = {1};
        assertEquals(0, ex4_FindPeakElement.findPeakElement(arr));
    }

    @Test
    public void testTwoElements() {
        int[] arr = {1, 2};
        assertEquals(1, ex4_FindPeakElement.findPeakElement(arr));
    }

    @Test
    public void testAscendingArray() {
        int[] arr = {1, 2, 3, 4, 5};
        // Last element should be peak
        assertEquals(4, ex4_FindPeakElement.findPeakElement(arr));
    }

    @Test
    public void testDescendingArray() {
        int[] arr = {5, 4, 3, 2, 1};
        // First element should be peak
        assertEquals(0, ex4_FindPeakElement.findPeakElement(arr));
    }

    @Test
    public void testPeakAtBeginning() {
        int[] arr = {5, 4, 3, 2, 1};
        int peak = ex4_FindPeakElement.findPeakElement(arr);
        assertEquals(0, peak);
    }

    @Test
    public void testPeakAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        int peak = ex4_FindPeakElement.findPeakElement(arr);
        assertEquals(4, peak);
    }

    @Test
    public void testAllSameElements() {
        int[] arr = {2, 2, 2, 2};
        int peak = ex4_FindPeakElement.findPeakElement(arr);
        // Any element could be considered a peak in this case
        assertTrue(peak >= 0 && peak < arr.length);
    }

    @Test
    public void testValidPeak() {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = ex4_FindPeakElement.findPeakElement(arr);
        assertEquals(2, peak);
        // Verify it's a peak
        assertTrue(arr[peak] > arr[peak - 1] && arr[peak] > arr[peak + 1]);
    }
}
