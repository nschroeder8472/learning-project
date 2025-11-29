"""Tests for Decorator Pattern."""

import pytest
from design_patterns.ex3_decorator import (
    SimpleCoffee, MilkDecorator, SugarDecorator, WhippedCreamDecorator
)


def test_simple_coffee():
    """Test simple coffee without decorators."""
    coffee = SimpleCoffee()
    assert abs(coffee.cost() - 2.0) < 0.01
    assert coffee.description() == "Simple Coffee"


def test_coffee_with_milk():
    """Test coffee with milk decorator."""
    coffee = SimpleCoffee()
    coffee = MilkDecorator(coffee)
    assert abs(coffee.cost() - 2.5) < 0.01
    assert coffee.description() == "Simple Coffee, Milk"


def test_coffee_with_sugar():
    """Test coffee with sugar decorator."""
    coffee = SimpleCoffee()
    coffee = SugarDecorator(coffee)
    assert abs(coffee.cost() - 2.3) < 0.01
    assert coffee.description() == "Simple Coffee, Sugar"


def test_coffee_with_whipped_cream():
    """Test coffee with whipped cream decorator."""
    coffee = SimpleCoffee()
    coffee = WhippedCreamDecorator(coffee)
    assert abs(coffee.cost() - 2.7) < 0.01
    assert coffee.description() == "Simple Coffee, Whipped Cream"


def test_multiple_decorators():
    """Test coffee with multiple decorators."""
    coffee = SimpleCoffee()
    coffee = MilkDecorator(coffee)
    coffee = SugarDecorator(coffee)
    assert abs(coffee.cost() - 2.8) < 0.01
    assert coffee.description() == "Simple Coffee, Milk, Sugar"


def test_all_decorators():
    """Test coffee with all decorators."""
    coffee = SimpleCoffee()
    coffee = MilkDecorator(coffee)
    coffee = SugarDecorator(coffee)
    coffee = WhippedCreamDecorator(coffee)
    assert abs(coffee.cost() - 3.5) < 0.01
    assert coffee.description() == "Simple Coffee, Milk, Sugar, Whipped Cream"


def test_decorator_order_cost():
    """Test that cost is same regardless of decorator order."""
    coffee1 = SimpleCoffee()
    coffee1 = SugarDecorator(coffee1)
    coffee1 = MilkDecorator(coffee1)

    coffee2 = SimpleCoffee()
    coffee2 = MilkDecorator(coffee2)
    coffee2 = SugarDecorator(coffee2)

    assert abs(coffee1.cost() - coffee2.cost()) < 0.01


def test_duplicate_decorators():
    """Test coffee with duplicate decorators."""
    coffee = SimpleCoffee()
    coffee = MilkDecorator(coffee)
    coffee = MilkDecorator(coffee)
    assert abs(coffee.cost() - 3.0) < 0.01
    assert coffee.description() == "Simple Coffee, Milk, Milk"
