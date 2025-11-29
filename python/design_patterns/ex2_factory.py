"""
Exercise: Factory Pattern (Creational)

Implement the Factory pattern to create different types of shapes
without specifying their exact classes.

Requirements:
1. Create a Shape base class (or ABC) with draw() method
2. Implement concrete shape classes: Circle, Square, Triangle
3. Create a ShapeFactory with a get_shape() method
4. The factory should handle invalid shape types gracefully

Example:
    factory = ShapeFactory()
    circle = factory.get_shape("CIRCLE")
    print(circle.draw())  # Output: Drawing a Circle

Use Cases: Object creation when exact class isn't known until runtime

Time Complexity: O(1) for object creation
Space Complexity: O(1)
"""

from abc import ABC, abstractmethod
from typing import Optional


class Shape(ABC):
    """Base class for all shapes."""

    @abstractmethod
    def draw(self) -> str:
        """
        Draws the shape.
        Returns:
            A string describing what is being drawn
        """
        pass

    @abstractmethod
    def calculate_area(self, *dimensions: float) -> float:
        """
        Calculates the area of the shape.
        Args:
            dimensions: The dimension(s) needed to calculate area
        Returns:
            The calculated area
        """
        pass


class Circle(Shape):
    """Circle implementation of Shape."""

    def draw(self) -> str:
        """TODO: Implement - should return 'Drawing a Circle'"""
        raise NotImplementedError("Not implemented yet")

    def calculate_area(self, *dimensions: float) -> float:
        """
        TODO: Implement area calculation for circle
        For circle: area = π * radius²
        dimensions[0] should be radius
        """
        raise NotImplementedError("Not implemented yet")


class Square(Shape):
    """Square implementation of Shape."""

    def draw(self) -> str:
        """TODO: Implement - should return 'Drawing a Square'"""
        raise NotImplementedError("Not implemented yet")

    def calculate_area(self, *dimensions: float) -> float:
        """
        TODO: Implement area calculation for square
        For square: area = side²
        dimensions[0] should be side length
        """
        raise NotImplementedError("Not implemented yet")


class Triangle(Shape):
    """Triangle implementation of Shape."""

    def draw(self) -> str:
        """TODO: Implement - should return 'Drawing a Triangle'"""
        raise NotImplementedError("Not implemented yet")

    def calculate_area(self, *dimensions: float) -> float:
        """
        TODO: Implement area calculation for triangle
        For triangle: area = 0.5 * base * height
        dimensions[0] should be base, dimensions[1] should be height
        """
        raise NotImplementedError("Not implemented yet")


class ShapeFactory:
    """Factory class that creates shapes based on type."""

    def get_shape(self, shape_type: str) -> Optional[Shape]:
        """
        Creates and returns a Shape object based on the shape_type.

        Args:
            shape_type: The type of shape to create (case-insensitive)

        Returns:
            A Shape object, or None if invalid type

        TODO: Implement factory logic
        Hint: Use if-elif to create appropriate shape
        Hint: Handle None and invalid input
        Hint: Make comparison case-insensitive with .upper() or .lower()
        """
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    factory = ShapeFactory()

    circle = factory.get_shape("CIRCLE")
    if circle:
        print(circle.draw())
        print(f"Circle area (radius=5): {circle.calculate_area(5.0)}")

    square = factory.get_shape("square")
    if square:
        print(square.draw())
        print(f"Square area (side=4): {square.calculate_area(4.0)}")
