# Design Patterns

## Concept

Design patterns are reusable solutions to commonly occurring problems in software design. They represent best practices evolved over time and provide a shared vocabulary for developers to communicate design decisions.

### Key Characteristics
- **Reusability**: Proven solutions that can be applied to similar problems
- **Communication**: Provide a common language for developers
- **Flexibility**: Enable loose coupling and extensibility
- **Maintainability**: Make code easier to understand and modify

### Pattern Categories
- **Creational**: Deal with object creation mechanisms
- **Structural**: Deal with object composition and relationships
- **Behavioral**: Deal with communication between objects

## Exercises

### Creational Patterns

1. **Singleton Pattern** - Ensure a type has only one instance and provide global access to it
   - Use case: Database connection, logger, configuration manager
   - Key: Static instance with lazy initialization, thread-safety with Mutex/Once

2. **Factory Pattern** - Create objects without specifying exact type
   - Use case: Shape factory (Circle, Square, Triangle)
   - Key: Factory function returns trait object or enum

### Structural Patterns

3. **Decorator Pattern** - Add behavior to objects dynamically
   - Use case: Coffee with milk, sugar, whipped cream decorators
   - Key: Wrapper structs that add functionality
   - Note: In Rust, often implemented with composition or trait objects

4. **Adapter Pattern** - Make incompatible interfaces work together
   - Use case: Media player adapters for different formats
   - Key: Wrapper that translates one trait to another

### Behavioral Patterns

5. **Observer Pattern** - Define one-to-many dependency where observers are notified of state changes
   - Use case: Weather station notifying displays, event listeners
   - Key: Subject maintains Vec of observers (often as trait objects)

6. **Strategy Pattern** - Define family of algorithms and make them interchangeable
   - Use case: Different payment methods, sorting strategies
   - Key: Trait for strategy, concrete implementations, context uses trait object

## Rust-Specific Considerations

### Ownership and Borrowing
- Singleton: Use `lazy_static` or `std::sync::Once` for thread-safe initialization
- Observer: Use `Rc<RefCell<>>` or `Arc<Mutex<>>` for shared mutable state
- Strategy: Use trait objects (`Box<dyn Trait>`) for runtime polymorphism

### Thread Safety
- Use `Arc<Mutex<T>>` for thread-safe shared ownership
- Use `std::sync::Once` for one-time initialization
- Consider using channels for observer pattern in concurrent contexts

## Hints

**Singleton Pattern**: Use `lazy_static` crate or `std::sync::Once` with a static mut variable (unsafe) or use `OnceCell`. For simplicity in exercises, you can use simpler patterns.

**Factory Pattern**: Create a factory function that returns a trait object (`Box<dyn Trait>`) or use an enum to represent different types.

**Decorator Pattern**: Use composition where decorators wrap the base component. Often implemented with trait objects in Rust.

**Adapter Pattern**: Create an adapter struct that implements the target trait and wraps the adaptee.

**Observer Pattern**: Maintain a `Vec<Box<dyn Observer>>` in the subject. Use `Rc<RefCell<>>` if needed for shared mutable state.

**Strategy Pattern**: Define a strategy trait, create concrete implementations, and have the context hold a `Box<dyn Strategy>`.

## Testing Design Patterns

- **Singleton**: Verify instance uniqueness (address comparison)
- **Factory**: Verify correct types are created
- **Decorator**: Verify behaviors compose correctly
- **Adapter**: Verify interface compatibility
- **Observer**: Verify all observers are notified
- **Strategy**: Verify algorithms can be swapped and produce correct results
