package com.learning.designpatterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.learning.designpatterns.ex3_Decorator.*;

class ex3DecoratorTest {

    @Test
    void testSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();
        assertEquals(2.0, coffee.cost(), 0.01, "Simple coffee should cost $2.0");
        assertEquals("Simple Coffee", coffee.description());
    }

    @Test
    void testCoffeeWithMilk() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);

        assertEquals(2.5, coffee.cost(), 0.01, "Coffee with milk should cost $2.5");
        assertEquals("Simple Coffee, Milk", coffee.description());
    }

    @Test
    void testCoffeeWithSugar() {
        Coffee coffee = new SimpleCoffee();
        coffee = new SugarDecorator(coffee);

        assertEquals(2.3, coffee.cost(), 0.01, "Coffee with sugar should cost $2.3");
        assertEquals("Simple Coffee, Sugar", coffee.description());
    }

    @Test
    void testCoffeeWithWhippedCream() {
        Coffee coffee = new SimpleCoffee();
        coffee = new WhippedCreamDecorator(coffee);

        assertEquals(2.7, coffee.cost(), 0.01, "Coffee with whipped cream should cost $2.7");
        assertEquals("Simple Coffee, Whipped Cream", coffee.description());
    }

    @Test
    void testMultipleDecorators() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        assertEquals(2.8, coffee.cost(), 0.01, "Coffee with milk and sugar should cost $2.8");
        assertEquals("Simple Coffee, Milk, Sugar", coffee.description());
    }

    @Test
    void testAllDecorators() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        assertEquals(3.5, coffee.cost(), 0.01, "Coffee with all decorators should cost $3.5");
        assertEquals("Simple Coffee, Milk, Sugar, Whipped Cream", coffee.description());
    }

    @Test
    void testDecoratorOrder() {
        Coffee coffee1 = new SimpleCoffee();
        coffee1 = new SugarDecorator(coffee1);
        coffee1 = new MilkDecorator(coffee1);

        Coffee coffee2 = new SimpleCoffee();
        coffee2 = new MilkDecorator(coffee2);
        coffee2 = new SugarDecorator(coffee2);

        // Cost should be same regardless of order
        assertEquals(coffee1.cost(), coffee2.cost(), 0.01, "Cost should be same regardless of decorator order");
    }

    @Test
    void testDuplicateDecorators() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new MilkDecorator(coffee); // Double milk

        assertEquals(3.0, coffee.cost(), 0.01, "Double milk should cost $3.0");
        assertEquals("Simple Coffee, Milk, Milk", coffee.description());
    }
}
