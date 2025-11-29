package com.learning.designpatterns;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.learning.designpatterns.ex6_Strategy.*;

class ex6StrategyTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void testCreditCardPayment() {
        PaymentStrategy creditCard = new CreditCardStrategy("1234-5678-9012-3456");
        cart.setPaymentStrategy(creditCard);
        String result = cart.checkout(100.0);

        assertTrue(result.contains("100"));
        assertTrue(result.contains("Credit Card"));
        assertTrue(result.contains("3456"), "Should show last 4 digits");
    }

    @Test
    void testPayPalPayment() {
        PaymentStrategy paypal = new PayPalStrategy("user@example.com");
        cart.setPaymentStrategy(paypal);
        String result = cart.checkout(50.0);

        assertTrue(result.contains("50"));
        assertTrue(result.contains("PayPal"));
        assertTrue(result.contains("user@example.com"));
    }

    @Test
    void testCryptoPayment() {
        PaymentStrategy crypto = new CryptoStrategy("1A2B3C4D5E6F");
        cart.setPaymentStrategy(crypto);
        String result = cart.checkout(200.0);

        assertTrue(result.contains("200"));
        assertTrue(result.contains("Bitcoin"));
        assertTrue(result.contains("1A2B3C4D5E6F"));
    }

    @Test
    void testCryptoPaymentWithType() {
        PaymentStrategy crypto = new CryptoStrategy("WALLET123", "Ethereum");
        cart.setPaymentStrategy(crypto);
        String result = cart.checkout(150.0);

        assertTrue(result.contains("150"));
        assertTrue(result.contains("Ethereum"));
        assertTrue(result.contains("WALLET123"));
    }

    @Test
    void testSwitchStrategy() {
        PaymentStrategy creditCard = new CreditCardStrategy("1111-2222-3333-4444");
        cart.setPaymentStrategy(creditCard);

        String result1 = cart.checkout(100.0);
        assertTrue(result1.contains("Credit Card"));

        // Switch to PayPal
        PaymentStrategy paypal = new PayPalStrategy("switched@example.com");
        cart.setPaymentStrategy(paypal);

        String result2 = cart.checkout(50.0);
        assertTrue(result2.contains("PayPal"));
        assertTrue(result2.contains("switched@example.com"));
    }

    @Test
    void testNoPaymentMethod() {
        String result = cart.checkout(100.0);
        assertEquals("No payment method selected", result);
    }

    @Test
    void testAddItemsAndCheckout() {
        cart.addItem(25.0);
        cart.addItem(35.0);
        cart.addItem(40.0);

        assertEquals(100.0, cart.getTotalAmount(), 0.01);

        cart.setPaymentStrategy(new CreditCardStrategy("9999-8888-7777-6666"));
        String result = cart.checkout();

        assertTrue(result.contains("100"));
        assertEquals(0.0, cart.getTotalAmount(), 0.01, "Total should be reset after checkout");
    }

    @Test
    void testCheckoutWithAmountDoesNotResetTotal() {
        cart.addItem(50.0);
        cart.addItem(50.0);

        cart.setPaymentStrategy(new PayPalStrategy("test@example.com"));
        cart.checkout(75.0); // Partial payment

        assertEquals(100.0, cart.getTotalAmount(), 0.01, "Total should not change with checkout(amount)");
    }

    @Test
    void testMultipleCheckouts() {
        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9012-3456"));

        cart.addItem(100.0);
        cart.checkout();
        assertEquals(0.0, cart.getTotalAmount(), 0.01);

        cart.addItem(50.0);
        cart.checkout();
        assertEquals(0.0, cart.getTotalAmount(), 0.01);
    }
}
