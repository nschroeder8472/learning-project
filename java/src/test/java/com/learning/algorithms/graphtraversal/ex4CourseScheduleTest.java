package com.learning.algorithms.graphtraversal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Course Schedule (Cycle Detection) implementation.
 */
public class ex4CourseScheduleTest {

    @Test
    public void testSimpleValidSchedule() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        assertTrue(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testSimpleCycle() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        assertFalse(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testNoPrerequisites() {
        int numCourses = 3;
        int[][] prerequisites = {};
        assertTrue(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testComplexValidSchedule() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        assertTrue(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testLargeCycle() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}, {0, 3}}; // 0->1->2->3->0
        assertFalse(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testSelfLoop() {
        int numCourses = 2;
        int[][] prerequisites = {{0, 0}}; // Self dependency
        assertFalse(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testDisconnectedGraph() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {3, 2}};
        assertTrue(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testComplexCycle() {
        int numCourses = 5;
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}, {1, 3}}; // Cycle: 1->2->3->1
        assertFalse(ex4_CourseSchedule.canFinish(numCourses, prerequisites));
    }

    @Test
    public void testFindOrderValid() {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] order = ex4_CourseSchedule.findOrder(numCourses, prerequisites);
        assertEquals(4, order.length);

        // Verify order is valid - prerequisite comes before course
        int pos0 = -1, pos1 = -1, pos2 = -1, pos3 = -1;
        for (int i = 0; i < order.length; i++) {
            if (order[i] == 0) pos0 = i;
            if (order[i] == 1) pos1 = i;
            if (order[i] == 2) pos2 = i;
            if (order[i] == 3) pos3 = i;
        }
        assertTrue(pos0 < pos1); // 0 before 1
        assertTrue(pos0 < pos2); // 0 before 2
        assertTrue(pos1 < pos3); // 1 before 3
        assertTrue(pos2 < pos3); // 2 before 3
    }

    @Test
    public void testFindOrderWithCycle() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        int[] order = ex4_CourseSchedule.findOrder(numCourses, prerequisites);
        assertEquals(0, order.length); // Empty array for impossible schedule
    }

    @Test
    public void testFindOrderNoPrerequisites() {
        int numCourses = 3;
        int[][] prerequisites = {};
        int[] order = ex4_CourseSchedule.findOrder(numCourses, prerequisites);
        assertEquals(3, order.length);
    }
}
