"""Test cases for Course Schedule (Cycle Detection) implementation."""

import pytest
from algorithms.graph_traversal.ex4_course_schedule import can_finish, find_order


def test_simple_valid_schedule():
    num_courses = 2
    prerequisites = [[1, 0]]
    assert can_finish(num_courses, prerequisites) is True


def test_simple_cycle():
    num_courses = 2
    prerequisites = [[1, 0], [0, 1]]
    assert can_finish(num_courses, prerequisites) is False


def test_no_prerequisites():
    num_courses = 3
    prerequisites = []
    assert can_finish(num_courses, prerequisites) is True


def test_complex_valid_schedule():
    num_courses = 4
    prerequisites = [[1, 0], [2, 0], [3, 1], [3, 2]]
    assert can_finish(num_courses, prerequisites) is True


def test_large_cycle():
    num_courses = 4
    prerequisites = [[1, 0], [2, 1], [3, 2], [0, 3]]  # 0->1->2->3->0
    assert can_finish(num_courses, prerequisites) is False


def test_self_loop():
    num_courses = 2
    prerequisites = [[0, 0]]  # Self dependency
    assert can_finish(num_courses, prerequisites) is False


def test_disconnected_graph():
    num_courses = 4
    prerequisites = [[1, 0], [3, 2]]
    assert can_finish(num_courses, prerequisites) is True


def test_complex_cycle():
    num_courses = 5
    prerequisites = [[1, 0], [2, 1], [3, 2], [1, 3]]  # Cycle: 1->2->3->1
    assert can_finish(num_courses, prerequisites) is False


def test_linear_dependencies():
    num_courses = 5
    prerequisites = [[1, 0], [2, 1], [3, 2], [4, 3]]
    assert can_finish(num_courses, prerequisites) is True


def test_find_order_valid():
    num_courses = 4
    prerequisites = [[1, 0], [2, 0], [3, 1], [3, 2]]
    order = find_order(num_courses, prerequisites)
    assert len(order) == 4

    # Verify order is valid - prerequisite comes before course
    pos = {course: i for i, course in enumerate(order)}
    assert pos[0] < pos[1]  # 0 before 1
    assert pos[0] < pos[2]  # 0 before 2
    assert pos[1] < pos[3]  # 1 before 3
    assert pos[2] < pos[3]  # 2 before 3


def test_find_order_with_cycle():
    num_courses = 2
    prerequisites = [[1, 0], [0, 1]]
    order = find_order(num_courses, prerequisites)
    assert order == []  # Empty list for impossible schedule


def test_find_order_no_prerequisites():
    num_courses = 3
    prerequisites = []
    order = find_order(num_courses, prerequisites)
    assert len(order) == 3
    assert set(order) == {0, 1, 2}


def test_find_order_linear():
    num_courses = 4
    prerequisites = [[1, 0], [2, 1], [3, 2]]
    order = find_order(num_courses, prerequisites)
    assert order == [0, 1, 2, 3]


def test_find_order_multiple_valid():
    num_courses = 3
    prerequisites = [[1, 0], [2, 0]]
    order = find_order(num_courses, prerequisites)
    assert len(order) == 3
    pos = {course: i for i, course in enumerate(order)}
    assert pos[0] < pos[1]  # 0 before 1
    assert pos[0] < pos[2]  # 0 before 2
