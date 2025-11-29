/// Exercise: Decorator Pattern (Structural)
///
/// Implement the Decorator pattern in Rust to dynamically add features to coffee.
/// In Rust, decorators are typically implemented using composition with trait objects.
///
/// Requirements:
/// 1. Create a Coffee trait with cost() and description() methods
/// 2. Create SimpleCoffee as the base implementation
/// 3. Create decorator structs that wrap Coffee trait objects
/// 4. Decorators add to cost and modify description
///
/// Example:
/// ```
/// let coffee: Box<dyn Coffee> = Box::new(SimpleCoffee);
/// let coffee = Box::new(MilkDecorator::new(coffee));
/// println!("{} costs ${}", coffee.description(), coffee.cost());
/// ```
///
/// Use Cases: Adding features dynamically, middleware patterns
///
/// Time Complexity: O(n) where n is number of decorators
/// Space Complexity: O(n) for the decorator chain

pub trait Coffee {
    fn cost(&self) -> f64;
    fn description(&self) -> String;
}

/// SimpleCoffee - the base coffee implementation.
pub struct SimpleCoffee;

impl Coffee for SimpleCoffee {
    /// TODO: Implement cost() to return 2.0
    fn cost(&self) -> f64 {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Implement description() to return "Simple Coffee"
    fn description(&self) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// MilkDecorator adds milk to coffee.
pub struct MilkDecorator {
    coffee: Box<dyn Coffee>,
}

impl MilkDecorator {
    pub fn new(coffee: Box<dyn Coffee>) -> Self {
        MilkDecorator { coffee }
    }
}

impl Coffee for MilkDecorator {
    /// TODO: Add $0.5 to the wrapped coffee's cost
    fn cost(&self) -> f64 {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Append ", Milk" to the wrapped coffee's description
    fn description(&self) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// SugarDecorator adds sugar to coffee.
pub struct SugarDecorator {
    coffee: Box<dyn Coffee>,
}

impl SugarDecorator {
    pub fn new(coffee: Box<dyn Coffee>) -> Self {
        SugarDecorator { coffee }
    }
}

impl Coffee for SugarDecorator {
    /// TODO: Add $0.3 to the wrapped coffee's cost
    fn cost(&self) -> f64 {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Append ", Sugar" to the wrapped coffee's description
    fn description(&self) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// WhippedCreamDecorator adds whipped cream to coffee.
pub struct WhippedCreamDecorator {
    coffee: Box<dyn Coffee>,
}

impl WhippedCreamDecorator {
    pub fn new(coffee: Box<dyn Coffee>) -> Self {
        WhippedCreamDecorator { coffee }
    }
}

impl Coffee for WhippedCreamDecorator {
    /// TODO: Add $0.7 to the wrapped coffee's cost
    fn cost(&self) -> f64 {
        unimplemented!("Not implemented yet")
    }

    /// TODO: Append ", Whipped Cream" to the wrapped coffee's description
    fn description(&self) -> String {
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_simple_coffee() {
        let coffee = SimpleCoffee;
        assert!((coffee.cost() - 2.0).abs() < 0.01);
        assert_eq!(coffee.description(), "Simple Coffee");
    }

    #[test]
    fn test_coffee_with_milk() {
        let coffee: Box<dyn Coffee> = Box::new(SimpleCoffee);
        let coffee = MilkDecorator::new(coffee);
        assert!((coffee.cost() - 2.5).abs() < 0.01);
        assert_eq!(coffee.description(), "Simple Coffee, Milk");
    }

    #[test]
    fn test_coffee_with_sugar() {
        let coffee: Box<dyn Coffee> = Box::new(SimpleCoffee);
        let coffee = SugarDecorator::new(coffee);
        assert!((coffee.cost() - 2.3).abs() < 0.01);
        assert_eq!(coffee.description(), "Simple Coffee, Sugar");
    }

    #[test]
    fn test_coffee_with_whipped_cream() {
        let coffee: Box<dyn Coffee> = Box::new(SimpleCoffee);
        let coffee = WhippedCreamDecorator::new(coffee);
        assert!((coffee.cost() - 2.7).abs() < 0.01);
        assert_eq!(coffee.description(), "Simple Coffee, Whipped Cream");
    }

    #[test]
    fn test_multiple_decorators() {
        let coffee: Box<dyn Coffee> = Box::new(SimpleCoffee);
        let coffee: Box<dyn Coffee> = Box::new(MilkDecorator::new(coffee));
        let coffee = SugarDecorator::new(coffee);
        assert!((coffee.cost() - 2.8).abs() < 0.01);
        assert_eq!(coffee.description(), "Simple Coffee, Milk, Sugar");
    }

    #[test]
    fn test_all_decorators() {
        let coffee: Box<dyn Coffee> = Box::new(SimpleCoffee);
        let coffee: Box<dyn Coffee> = Box::new(MilkDecorator::new(coffee));
        let coffee: Box<dyn Coffee> = Box::new(SugarDecorator::new(coffee));
        let coffee = WhippedCreamDecorator::new(coffee);
        assert!((coffee.cost() - 3.5).abs() < 0.01);
        assert_eq!(coffee.description(), "Simple Coffee, Milk, Sugar, Whipped Cream");
    }

    #[test]
    fn test_duplicate_decorators() {
        let coffee: Box<dyn Coffee> = Box::new(SimpleCoffee);
        let coffee: Box<dyn Coffee> = Box::new(MilkDecorator::new(coffee));
        let coffee = MilkDecorator::new(coffee);
        assert!((coffee.cost() - 3.0).abs() < 0.01);
        assert_eq!(coffee.description(), "Simple Coffee, Milk, Milk");
    }
}
