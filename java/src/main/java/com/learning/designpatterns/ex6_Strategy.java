package com.learning.designpatterns;

/**
 * Exercise: Strategy Pattern (Behavioral)
 *
 * Implement the Strategy pattern to encapsulate different payment algorithms
 * and make them interchangeable at runtime.
 *
 * Requirements:
 * 1. Create PaymentStrategy interface with pay() method
 * 2. Implement concrete strategies: CreditCardStrategy, PayPalStrategy, CryptoStrategy
 * 3. Create ShoppingCart that uses a payment strategy
 * 4. Strategy can be changed at runtime
 *
 * Example:
 * ShoppingCart cart = new ShoppingCart();
 * cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9012-3456"));
 * cart.checkout(100.0); // Pays with credit card
 *
 * Use Cases: Sorting algorithms, compression algorithms, navigation routes
 *
 * Time Complexity: O(1) for strategy selection, depends on strategy implementation
 * Space Complexity: O(1)
 */
public class ex6_Strategy {

    /**
     * PaymentStrategy interface that all payment methods implement.
     */
    public interface PaymentStrategy {
        /**
         * Processes a payment.
         * @param amount The amount to pay
         * @return A message confirming the payment
         */
        String pay(double amount);
    }

    /**
     * CreditCardStrategy - pays with credit card.
     */
    public static class CreditCardStrategy implements PaymentStrategy {
        private String cardNumber;
        private String cvv;
        private String expiryDate;

        public CreditCardStrategy(String cardNumber, String cvv, String expiryDate) {
            this.cardNumber = cardNumber;
            this.cvv = cvv;
            this.expiryDate = expiryDate;
        }

        // Simplified constructor
        public CreditCardStrategy(String cardNumber) {
            this(cardNumber, "123", "12/25");
        }

        // TODO: Implement pay method
        // Return: "Paid $[amount] using Credit Card ending in [last 4 digits]"
        @Override
        public String pay(double amount) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String getCardNumber() {
            return cardNumber;
        }
    }

    /**
     * PayPalStrategy - pays with PayPal.
     */
    public static class PayPalStrategy implements PaymentStrategy {
        private String email;
        private String password;

        public PayPalStrategy(String email, String password) {
            this.email = email;
            this.password = password;
        }

        // Simplified constructor
        public PayPalStrategy(String email) {
            this(email, "password");
        }

        // TODO: Implement pay method
        // Return: "Paid $[amount] using PayPal account: [email]"
        @Override
        public String pay(double amount) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String getEmail() {
            return email;
        }
    }

    /**
     * CryptoStrategy - pays with cryptocurrency.
     */
    public static class CryptoStrategy implements PaymentStrategy {
        private String walletAddress;
        private String cryptoType;

        public CryptoStrategy(String walletAddress, String cryptoType) {
            this.walletAddress = walletAddress;
            this.cryptoType = cryptoType;
        }

        // Simplified constructor (defaults to Bitcoin)
        public CryptoStrategy(String walletAddress) {
            this(walletAddress, "Bitcoin");
        }

        // TODO: Implement pay method
        // Return: "Paid $[amount] using [cryptoType] wallet: [walletAddress]"
        @Override
        public String pay(double amount) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String getWalletAddress() {
            return walletAddress;
        }

        public String getCryptoType() {
            return cryptoType;
        }
    }

    /**
     * ShoppingCart - context class that uses a payment strategy.
     */
    public static class ShoppingCart {
        private PaymentStrategy paymentStrategy;
        private double totalAmount;

        public ShoppingCart() {
            this.totalAmount = 0.0;
        }

        // TODO: Implement setPaymentStrategy
        public void setPaymentStrategy(PaymentStrategy strategy) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public void addItem(double price) {
            totalAmount += price;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        /**
         * Processes checkout using the current payment strategy.
         * @return The payment confirmation message
         */
        public String checkout() {
            // TODO: Implement checkout
            // If no payment strategy is set, return "No payment method selected"
            // Otherwise, use the strategy to pay the total amount and reset total to 0
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Processes checkout with a specific amount.
         * @param amount The amount to pay
         * @return The payment confirmation message
         */
        public String checkout(double amount) {
            // TODO: Implement checkout with specific amount
            // If no payment strategy is set, return "No payment method selected"
            // Otherwise, use the strategy to pay the specified amount
            // Don't reset total in this case
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
