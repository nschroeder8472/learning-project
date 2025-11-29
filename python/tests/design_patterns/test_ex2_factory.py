"""Tests for Factory Pattern."""

import pytest
import math
from design_patterns.ex2_factory import ShapeFactory, Circle, Square, Triangle


def test_create_circle():
    """Test creating a Circle through factory."""
    factory = ShapeFactory()
    shape = factory.get_shape("CIRCLE")
    assert shape is not None
    assert isinstance(shape, Circle)
    assert shape.draw() == "Drawing a Circle"


def test_create_square():
    """Test creating a Square through factory."""
    factory = ShapeFactory()
    shape = factory.get_shape("SQUARE")
    assert shape is not None
    assert isinstance(shape, Square)
    assert shape.draw() == "Drawing a Square"


def test_create_triangle():
    """Test creating a Triangle through factory."""
    factory = ShapeFactory()
    shape = factory.get_shape("TRIANGLE")
    assert shape is not None
    assert isinstance(shape, Triangle)
    assert shape.draw() == "Drawing a Triangle"


def test_case_insensitive():
    """Test that factory handles case-insensitive input."""
    factory = ShapeFactory()
    circle1 = factory.get_shape("circle")
    circle2 = factory.get_shape("Circle")
    circle3 = factory.get_shape("CIRCLE")

    assert circle1 is not None
    assert circle2 is not None
    assert circle3 is not None


def test_invalid_shape_type():
    """Test that factory returns None for invalid shape type."""
    factory = ShapeFactory()
    shape = factory.get_shape("HEXAGON")
    assert shape is None


def test_none_input():
    """Test that factory handles None input."""
    factory = ShapeFactory()
    shape = factory.get_shape(None)
    assert shape is None


def test_circle_area():
    """Test circle area calculation."""
    factory = ShapeFactory()
    circle = factory.get_shape("CIRCLE")
    area = circle.calculate_area(5.0)
    expected = math.pi * 25
    assert abs(area - expected) < 0.001


def test_square_area():
    """Test square area calculation."""
    factory = ShapeFactory()
    square = factory.get_shape("SQUARE")
    area = square.calculate_area(4.0)
    assert abs(area - 16.0) < 0.001


def test_triangle_area():
    """Test triangle area calculation."""
    factory = ShapeFactory()
    triangle = factory.get_shape("TRIANGLE")
    area = triangle.calculate_area(6.0, 4.0)
    assert abs(area - 12.0) < 0.001
