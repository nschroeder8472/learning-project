package com.learning.datastructures.arrays;

/**
 * Exercise: Trapping Rain Water (Hard)
 *
 * Given an array representing elevation of bars, calculate how much water
 * can be trapped after raining.
 *
 * Example:
 * Input: [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 * Output: 6
 *
 * Visualization:
 *                █
 *        █       █ █   █
 *    █   █ █   █ █ █   █ █
 *  █ █ █ █ █ █ █ █ █ █ █ █
 * [0,1,0,2,1,0,1,3,2,1,2,1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) for optimal solution
 */
public class ex5_TrappingRainWater {

    public int trap(int[] height) {
        // TODO: Implement this method
        // Hint: For each position, water level = min(max_left, max_right) - current_height
        // Approach 1: Precompute max_left and max_right arrays
        // Approach 2: Use two pointers for O(1) space
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
