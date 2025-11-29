"""
Exercise: Decorator Pattern (Structural)

Implement the Decorator pattern to dynamically add features to a coffee order
without modifying the base Coffee class.

Requirements:
1. Create a Coffee base class with cost() and description() methods
2. Create a SimpleCoffee class as the base implementation
3. Create decorator classes: MilkDecorator, SugarDecorator, WhippedCreamDecorator
4. Decorators should wrap other Coffee objects and add to their cost/description

Example:
    coffee = SimpleCoffee()
    coffee = MilkDecorator(coffee)
    coffee = SugarDecorator(coffee)
    print(f"{coffee.description()} costs ${coffee.cost()}")
    # Output: Simple Coffee, Milk, Sugar costs $2.8

Use Cases: Adding features to objects dynamically, GUI components

Time Complexity: O(n) where n is number of decorators
Space Complexity: O(n) for the decorator chain
"""

from abc import ABC, abstractmethod


class Coffee(ABC):
    """Base class for all coffee types and decorators."""

    @abstractmethod
    def cost(self) -> float:
        """Returns the cost of the coffee."""
        pass

    @abstractmethod
    def description(self) -> str:
        """Returns the description of the coffee."""
        pass


class SimpleCoffee(Coffee):
    """Base coffee implementation."""

    def cost(self) -> float:
        """
        TODO: Implement cost method
        Base coffee costs $2.0
        """
        raise NotImplementedError("Not implemented yet")

    def description(self) -> str:
        """
        TODO: Implement description method
        Should return "Simple Coffee"
        """
        raise NotImplementedError("Not implemented yet")


class CoffeeDecorator(Coffee):
    """Abstract decorator class that wraps a Coffee object."""

    def __init__(self, coffee: Coffee):
        self._coffee = coffee

    def cost(self) -> float:
        return self._coffee.cost()

    def description(self) -> str:
        return self._coffee.description()


class MilkDecorator(CoffeeDecorator):
    """Decorator that adds milk to coffee."""

    def cost(self) -> float:
        """
        TODO: Override to add $0.5 for milk
        """
        raise NotImplementedError("Not implemented yet")

    def description(self) -> str:
        """
        TODO: Override to append ", Milk" to description
        """
        raise NotImplementedError("Not implemented yet")


class SugarDecorator(CoffeeDecorator):
    """Decorator that adds sugar to coffee."""

    def cost(self) -> float:
        """
        TODO: Override to add $0.3 for sugar
        """
        raise NotImplementedError("Not implemented yet")

    def description(self) -> str:
        """
        TODO: Override to append ", Sugar" to description
        """
        raise NotImplementedError("Not implemented yet")


class WhippedCreamDecorator(CoffeeDecorator):
    """Decorator that adds whipped cream to coffee."""

    def cost(self) -> float:
        """
        TODO: Override to add $0.7 for whipped cream
        """
        raise NotImplementedError("Not implemented yet")

    def description(self) -> str:
        """
        TODO: Override to append ", Whipped Cream" to description
        """
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    coffee = SimpleCoffee()
    print(f"{coffee.description()} - ${coffee.cost()}")

    coffee = MilkDecorator(coffee)
    print(f"{coffee.description()} - ${coffee.cost()}")

    coffee = SugarDecorator(coffee)
    print(f"{coffee.description()} - ${coffee.cost()}")

    coffee = WhippedCreamDecorator(coffee)
    print(f"{coffee.description()} - ${coffee.cost()}")
