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

1. **Singleton Pattern** - Ensure a class has only one instance and provide global access to it
   - Use case: Database connection, logger, configuration manager
   - Key: Private constructor, static instance, thread-safety

2. **Factory Pattern** - Create objects without specifying exact class
   - Use case: Shape factory (Circle, Square, Triangle)
   - Key: Factory method returns interface/abstract type

### Structural Patterns

3. **Decorator Pattern** - Add behavior to objects dynamically without affecting other objects
   - Use case: Coffee with milk, sugar, whipped cream decorators
   - Key: Wrapper objects that add functionality

4. **Adapter Pattern** - Make incompatible interfaces work together
   - Use case: USB-C to USB-A adapter, media player adapters
   - Key: Wrapper that translates one interface to another

### Behavioral Patterns

5. **Observer Pattern** - Define one-to-many dependency where observers are notified of state changes
   - Use case: Weather station notifying displays, event listeners
   - Key: Subject maintains list of observers, notifies them of changes

6. **Strategy Pattern** - Define family of algorithms and make them interchangeable
   - Use case: Different sorting strategies, payment methods
   - Key: Encapsulate algorithms, select at runtime

## Hints

**Singleton Pattern**: Use a private constructor and a static method to control instance creation. Consider thread-safety with synchronized blocks or eager initialization.

**Factory Pattern**: Create a factory class with a method that returns objects based on input parameters. The factory returns a common interface or abstract class.

**Decorator Pattern**: Create a base component interface, concrete components, and decorators that wrap components while implementing the same interface.

**Adapter Pattern**: Create an adapter class that implements the target interface and wraps the adaptee, translating calls appropriately.

**Observer Pattern**: Maintain a list of observers in the subject. When state changes, iterate through observers and call their update method.

**Strategy Pattern**: Define a strategy interface with an algorithm method. Create concrete strategy classes. The context class uses a strategy instance to execute the algorithm.

## Testing Design Patterns

- **Singleton**: Verify the same instance is always returned
- **Factory**: Verify correct object types are created based on input
- **Decorator**: Verify behaviors stack correctly and base functionality is preserved
- **Adapter**: Verify interface compatibility and correct method translation
- **Observer**: Verify all observers are notified when subject changes
- **Strategy**: Verify algorithms can be swapped at runtime and produce correct results
