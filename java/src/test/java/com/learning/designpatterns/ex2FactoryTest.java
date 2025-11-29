package com.learning.designpatterns;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.learning.designpatterns.ex2_Factory.*;

class ex2FactoryTest {

    private ShapeFactory factory;

    @BeforeEach
    void setUp() {
        factory = new ShapeFactory();
    }

    @Test
    void testCreateCircle() {
        Shape shape = factory.getShape("CIRCLE");
        assertNotNull(shape, "Factory should create a Circle");
        assertTrue(shape instanceof Circle, "Should be an instance of Circle");
        assertEquals("Drawing a Circle", shape.draw());
    }

    @Test
    void testCreateSquare() {
        Shape shape = factory.getShape("SQUARE");
        assertNotNull(shape, "Factory should create a Square");
        assertTrue(shape instanceof Square, "Should be an instance of Square");
        assertEquals("Drawing a Square", shape.draw());
    }

    @Test
    void testCreateTriangle() {
        Shape shape = factory.getShape("TRIANGLE");
        assertNotNull(shape, "Factory should create a Triangle");
        assertTrue(shape instanceof Triangle, "Should be an instance of Triangle");
        assertEquals("Drawing a Triangle", shape.draw());
    }

    @Test
    void testCaseInsensitive() {
        Shape circle1 = factory.getShape("circle");
        Shape circle2 = factory.getShape("Circle");
        Shape circle3 = factory.getShape("CIRCLE");

        assertNotNull(circle1, "Should handle lowercase");
        assertNotNull(circle2, "Should handle mixed case");
        assertNotNull(circle3, "Should handle uppercase");
    }

    @Test
    void testInvalidShapeType() {
        Shape shape = factory.getShape("HEXAGON");
        assertNull(shape, "Should return null for invalid shape type");
    }

    @Test
    void testNullInput() {
        Shape shape = factory.getShape(null);
        assertNull(shape, "Should return null for null input");
    }

    @Test
    void testCircleArea() {
        Shape circle = factory.getShape("CIRCLE");
        double area = circle.calculateArea(5.0); // radius = 5
        assertEquals(Math.PI * 25, area, 0.001, "Circle area should be π * r²");
    }

    @Test
    void testSquareArea() {
        Shape square = factory.getShape("SQUARE");
        double area = square.calculateArea(4.0); // side = 4
        assertEquals(16.0, area, 0.001, "Square area should be side²");
    }

    @Test
    void testTriangleArea() {
        Shape triangle = factory.getShape("TRIANGLE");
        double area = triangle.calculateArea(6.0, 4.0); // base = 6, height = 4
        assertEquals(12.0, area, 0.001, "Triangle area should be 0.5 * base * height");
    }
}
