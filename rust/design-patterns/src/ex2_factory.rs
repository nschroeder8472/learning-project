/// Exercise: Factory Pattern (Creational)
///
/// Implement the Factory pattern in Rust using traits and trait objects.
/// Create different types of shapes without specifying their exact types.
///
/// Requirements:
/// 1. Create a Shape trait with draw() and calculate_area() methods
/// 2. Implement concrete shapes: Circle, Square, Triangle
/// 3. Create a ShapeFactory that returns Box<dyn Shape>
/// 4. Handle invalid shape types gracefully
///
/// Example:
/// ```
/// let factory = ShapeFactory;
/// let circle = factory.create_shape("circle").unwrap();
/// println!("{}", circle.draw());
/// ```
///
/// Use Cases: Plugin systems, object creation with runtime type selection
///
/// Time Complexity: O(1) for object creation
/// Space Complexity: O(1)

use std::f64::consts::PI;

/// Shape trait that all concrete shapes must implement.
pub trait Shape {
    fn draw(&self) -> String;
    fn calculate_area(&self, dimensions: &[f64]) -> f64;
}

/// Circle implementation.
pub struct Circle;

impl Shape for Circle {
    /// TODO: Implement draw() to return "Drawing a Circle"
    fn draw(&self) -> String {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Implement calculate_area for circle
    /// dimensions[0] should be radius
    /// area = π * radius²
    fn calculate_area(&self, dimensions: &[f64]) -> f64 {
        unimplemented!("Not implemented yet")
    }
}

/// Square implementation.
pub struct Square;

impl Shape for Square {
    /// TODO: Implement draw() to return "Drawing a Square"
    fn draw(&self) -> String {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Implement calculate_area for square
    /// dimensions[0] should be side length
    /// area = side²
    fn calculate_area(&self, dimensions: &[f64]) -> f64 {
        unimplemented!("Not implemented yet")
    }
}

/// Triangle implementation.
pub struct Triangle;

impl Shape for Triangle {
    /// TODO: Implement draw() to return "Drawing a Triangle"
    fn draw(&self) -> String {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Implement calculate_area for triangle
    /// dimensions[0] should be base, dimensions[1] should be height
    /// area = 0.5 * base * height
    fn calculate_area(&self, dimensions: &[f64]) -> f64 {
        unimplemented!("Not implemented yet")
    }
}

/// ShapeFactory that creates shapes based on type string.
pub struct ShapeFactory;

impl ShapeFactory {
    /// Creates and returns a Shape trait object based on shape_type.
    ///
    /// TODO: Implement factory logic
    /// Hint: Use match on shape_type (convert to lowercase for case-insensitivity)
    /// Hint: Return Some(Box::new(Shape)) for valid types
    /// Hint: Return None for invalid types
    pub fn create_shape(&self, shape_type: &str) -> Option<Box<dyn Shape>> {
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_create_circle() {
        let factory = ShapeFactory;
        let shape = factory.create_shape("circle");
        assert!(shape.is_some());
        assert_eq!(shape.unwrap().draw(), "Drawing a Circle");
    }

    #[test]
    fn test_create_square() {
        let factory = ShapeFactory;
        let shape = factory.create_shape("square");
        assert!(shape.is_some());
        assert_eq!(shape.unwrap().draw(), "Drawing a Square");
    }

    #[test]
    fn test_create_triangle() {
        let factory = ShapeFactory;
        let shape = factory.create_shape("triangle");
        assert!(shape.is_some());
        assert_eq!(shape.unwrap().draw(), "Drawing a Triangle");
    }

    #[test]
    fn test_case_insensitive() {
        let factory = ShapeFactory;
        assert!(factory.create_shape("CIRCLE").is_some());
        assert!(factory.create_shape("Circle").is_some());
        assert!(factory.create_shape("circle").is_some());
    }

    #[test]
    fn test_invalid_shape() {
        let factory = ShapeFactory;
        assert!(factory.create_shape("hexagon").is_none());
    }

    #[test]
    fn test_circle_area() {
        let factory = ShapeFactory;
        let circle = factory.create_shape("circle").unwrap();
        let area = circle.calculate_area(&[5.0]);
        assert!((area - PI * 25.0).abs() < 0.001);
    }

    #[test]
    fn test_square_area() {
        let factory = ShapeFactory;
        let square = factory.create_shape("square").unwrap();
        let area = square.calculate_area(&[4.0]);
        assert!((area - 16.0).abs() < 0.001);
    }

    #[test]
    fn test_triangle_area() {
        let factory = ShapeFactory;
        let triangle = factory.create_shape("triangle").unwrap();
        let area = triangle.calculate_area(&[6.0, 4.0]);
        assert!((area - 12.0).abs() < 0.001);
    }
}
