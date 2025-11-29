package com.learning.designpatterns;

/**
 * Exercise: Decorator Pattern (Structural)
 *
 * Implement the Decorator pattern to dynamically add features to a coffee order
 * without modifying the base Coffee class.
 *
 * Requirements:
 * 1. Create a Coffee interface with cost() and description() methods
 * 2. Create a SimpleCoffee class as the base implementation
 * 3. Create decorator classes: MilkDecorator, SugarDecorator, WhippedCreamDecorator
 * 4. Decorators should wrap other Coffee objects and add to their cost/description
 *
 * Example:
 * Coffee coffee = new SimpleCoffee();
 * coffee = new MilkDecorator(coffee);
 * coffee = new SugarDecorator(coffee);
 * System.out.println(coffee.description() + " costs $" + coffee.cost());
 * // Output: Simple Coffee, Milk, Sugar costs $3.5
 *
 * Use Cases: Adding features to objects dynamically, GUI components with borders/scrollbars
 *
 * Time Complexity: O(n) where n is number of decorators
 * Space Complexity: O(n) for the decorator chain
 */
public class ex3_Decorator {

    /**
     * Coffee interface that all concrete coffees and decorators implement.
     */
    public interface Coffee {
        /**
         * Gets the cost of the coffee.
         * @return The total cost
         */
        double cost();

        /**
         * Gets the description of the coffee.
         * @return A string describing the coffee and its additions
         */
        String description();
    }

    /**
     * SimpleCoffee - the base coffee implementation.
     */
    public static class SimpleCoffee implements Coffee {
        // TODO: Implement cost() method
        // Base coffee costs $2.0
        @Override
        public double cost() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement description() method
        // Should return "Simple Coffee"
        @Override
        public String description() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * Abstract decorator class that implements Coffee and wraps another Coffee.
     */
    public static abstract class CoffeeDecorator implements Coffee {
        protected Coffee decoratedCoffee;

        public CoffeeDecorator(Coffee coffee) {
            this.decoratedCoffee = coffee;
        }

        @Override
        public double cost() {
            return decoratedCoffee.cost();
        }

        @Override
        public String description() {
            return decoratedCoffee.description();
        }
    }

    /**
     * MilkDecorator adds milk to the coffee.
     */
    public static class MilkDecorator extends CoffeeDecorator {
        public MilkDecorator(Coffee coffee) {
            super(coffee);
        }

        // TODO: Override cost() to add $0.5 for milk
        @Override
        public double cost() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Override description() to append ", Milk"
        @Override
        public String description() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * SugarDecorator adds sugar to the coffee.
     */
    public static class SugarDecorator extends CoffeeDecorator {
        public SugarDecorator(Coffee coffee) {
            super(coffee);
        }

        // TODO: Override cost() to add $0.3 for sugar
        @Override
        public double cost() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Override description() to append ", Sugar"
        @Override
        public String description() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

    /**
     * WhippedCreamDecorator adds whipped cream to the coffee.
     */
    public static class WhippedCreamDecorator extends CoffeeDecorator {
        public WhippedCreamDecorator(Coffee coffee) {
            super(coffee);
        }

        // TODO: Override cost() to add $0.7 for whipped cream
        @Override
        public double cost() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Override description() to append ", Whipped Cream"
        @Override
        public String description() {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
