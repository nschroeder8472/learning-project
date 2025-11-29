package com.learning.designpatterns;

/**
 * Exercise: Factory Pattern (Creational)
 *
 * Implement the Factory pattern to create different types of shapes
 * without specifying their exact classes.
 *
 * Requirements:
 * 1. Create a Shape interface with a draw() method
 * 2. Implement concrete shape classes: Circle, Square, Triangle
 * 3. Create a ShapeFactory with a getShape() method that returns the appropriate shape
 * 4. The factory should handle invalid shape types gracefully
 *
 * Example:
 * ShapeFactory factory = new ShapeFactory();
 * Shape circle = factory.getShape("CIRCLE");
 * circle.draw(); // Output: Drawing a Circle
 *
 * Use Cases: Object creation when exact class isn't known until runtime,
 * plugin systems, cross-platform UI components
 *
 * Time Complexity: O(1) for object creation
 * Space Complexity: O(1)
 */
public class ex2_Factory {

    /**
     * Shape interface that all concrete shapes must implement.
     */
    public interface Shape {
        /**
         * Draws the shape.
         * @return A string describing what is being drawn
         */
        String draw();

        /**
         * Calculates the area of the shape.
         * @param dimension The dimension(s) needed to calculate area
         * @return The calculated area
         */
        double calculateArea(double... dimension);
    }

    /**
     * Circle implementation of Shape.
     */
    public static class Circle implements Shape {
        // TODO: Implement the draw() method
        // Should return "Drawing a Circle"
        @Override
        public String draw() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement calculateArea
        // For circle: area = π * radius²
        // dimension[0] should be radius
        @Override
        public double calculateArea(double... dimension) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Square implementation of Shape.
     */
    public static class Square implements Shape {
        // TODO: Implement the draw() method
        // Should return "Drawing a Square"
        @Override
        public String draw() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement calculateArea
        // For square: area = side²
        // dimension[0] should be side length
        @Override
        public double calculateArea(double... dimension) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Triangle implementation of Shape.
     */
    public static class Triangle implements Shape {
        // TODO: Implement the draw() method
        // Should return "Drawing a Triangle"
        @Override
        public String draw() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement calculateArea
        // For triangle: area = 0.5 * base * height
        // dimension[0] should be base, dimension[1] should be height
        @Override
        public double calculateArea(double... dimension) {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * ShapeFactory class that creates shapes based on type.
     */
    public static class ShapeFactory {
        /**
         * Creates and returns a Shape object based on the shapeType.
         *
         * @param shapeType The type of shape to create (case-insensitive)
         * @return A Shape object, or null if invalid type
         */
        public Shape getShape(String shapeType) {
            // TODO: Implement factory logic
            // Hint: Use switch or if-else to create appropriate shape
            // Hint: Handle null and invalid input
            // Hint: Make comparison case-insensitive
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
