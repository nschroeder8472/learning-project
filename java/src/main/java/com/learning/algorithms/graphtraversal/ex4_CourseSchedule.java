package com.learning.algorithms.graphtraversal;

import java.util.*;

/**
 * Exercise 4: Course Schedule (Cycle Detection)
 * Difficulty: Medium
 *
 * There are a total of numCourses courses labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi]
 * indicates that you must take course bi before course ai.
 *
 * Return true if you can finish all courses, false otherwise.
 * (This is equivalent to detecting if the course dependency graph has a cycle)
 *
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: Take course 0, then course 1
 *
 * Example 2:
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: Circular dependency - cannot complete
 *
 * Example 3:
 * Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 * Output: true
 * Explanation: Valid ordering: [0,1,2,3] or [0,2,1,3]
 *
 * Time Complexity: O(V + E) where V is courses and E is prerequisites
 * Space Complexity: O(V + E) for the graph and recursion stack
 */
public class ex4_CourseSchedule {

    /**
     * Determines if all courses can be completed given the prerequisites.
     *
     * @param numCourses total number of courses
     * @param prerequisites array of [course, prerequisite] pairs
     * @return true if all courses can be completed, false if there's a cycle
     */
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO: Implement cycle detection using DFS
        // Hint: Build adjacency list from prerequisites
        // Hint: Use DFS with three states: unvisited, visiting (in current path), visited
        // Hint: If you encounter a node in "visiting" state, there's a cycle
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Helper method to detect cycle using DFS.
     * Returns true if cycle is detected.
     */
    private static boolean hasCycleDFS(Map<Integer, List<Integer>> graph, int course,
                                        Set<Integer> visiting, Set<Integer> visited) {
        // TODO: Implement cycle detection DFS
        // Hint: If course is in visiting set, cycle detected
        // Hint: If course is in visited set, already processed, no cycle from here
        // Hint: Add to visiting, check all neighbors, then move to visited
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Returns a valid course order if possible, empty array if impossible.
     * This is topological sorting.
     *
     * @param numCourses total number of courses
     * @param prerequisites array of [course, prerequisite] pairs
     * @return array representing valid course order, empty if impossible
     */
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        // TODO: Implement topological sort
        // Hint: Use DFS and add courses to result in reverse order of completion
        // Hint: Return empty array if cycle is detected
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
