/// Exercise: Strategy Pattern (Behavioral)
///
/// Implement the Strategy pattern to encapsulate different payment algorithms
/// and make them interchangeable at runtime.
///
/// Requirements:
/// 1. Create PaymentStrategy trait with pay() method
/// 2. Implement concrete strategies: CreditCardStrategy, PayPalStrategy, CryptoStrategy
/// 3. Create ShoppingCart that uses a payment strategy
/// 4. Strategy can be changed at runtime using trait objects
///
/// Example:
/// ```
/// let mut cart = ShoppingCart::new();
/// cart.set_payment_strategy(Box::new(CreditCardStrategy::new("1234-5678")));
/// cart.checkout(100.0);
/// ```
///
/// Use Cases: Different algorithms, sorting strategies, compression methods
///
/// Time Complexity: O(1) for strategy selection
/// Space Complexity: O(1)

pub trait PaymentStrategy {
    fn pay(&self, amount: f64) -> String;
}

/// CreditCardStrategy - pays with credit card.
pub struct CreditCardStrategy {
    card_number: String,
}

impl CreditCardStrategy {
    pub fn new(card_number: &str) -> Self {
        CreditCardStrategy {
            card_number: card_number.to_string(),
        }
    }
}

impl PaymentStrategy for CreditCardStrategy {
    /// TODO: Return "Paid ${amount} using Credit Card ending in {last 4 digits}"
    fn pay(&self, amount: f64) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// PayPalStrategy - pays with PayPal.
pub struct PayPalStrategy {
    email: String,
}

impl PayPalStrategy {
    pub fn new(email: &str) -> Self {
        PayPalStrategy {
            email: email.to_string(),
        }
    }
}

impl PaymentStrategy for PayPalStrategy {
    /// TODO: Return "Paid ${amount} using PayPal account: {email}"
    fn pay(&self, amount: f64) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// CryptoStrategy - pays with cryptocurrency.
pub struct CryptoStrategy {
    wallet_address: String,
    crypto_type: String,
}

impl CryptoStrategy {
    pub fn new(wallet_address: &str, crypto_type: &str) -> Self {
        CryptoStrategy {
            wallet_address: wallet_address.to_string(),
            crypto_type: crypto_type.to_string(),
        }
    }

    pub fn new_bitcoin(wallet_address: &str) -> Self {
        Self::new(wallet_address, "Bitcoin")
    }
}

impl PaymentStrategy for CryptoStrategy {
    /// TODO: Return "Paid ${amount} using {crypto_type} wallet: {wallet_address}"
    fn pay(&self, amount: f64) -> String {
        unimplemented!("Not implemented yet")
    }
}

/// ShoppingCart - context that uses a payment strategy.
pub struct ShoppingCart {
    payment_strategy: Option<Box<dyn PaymentStrategy>>,
    total_amount: f64,
}

impl ShoppingCart {
    pub fn new() -> Self {
        ShoppingCart {
            payment_strategy: None,
            total_amount: 0.0,
        }
    }

    /// TODO: Set the payment strategy
    pub fn set_payment_strategy(&mut self, strategy: Box<dyn PaymentStrategy>) {
        unimplemented!("Not implemented yet")
    }

    pub fn add_item(&mut self, price: f64) {
        self.total_amount += price;
    }

    pub fn get_total_amount(&self) -> f64 {
        self.total_amount
    }

    /// Checkout with total amount, resets total to 0.
    /// TODO: Implement checkout
    /// If no strategy is set, return "No payment method selected"
    /// Otherwise, use the strategy to pay total_amount and reset it to 0
    pub fn checkout(&mut self) -> String {
        unimplemented!("Not implemented yet")
    }

    /// Checkout with specific amount, doesn't reset total.
    /// TODO: Implement checkout_with_amount
    /// If no strategy is set, return "No payment method selected"
    /// Otherwise, use the strategy to pay the specified amount
    pub fn checkout_with_amount(&self, amount: f64) -> String {
        unimplemented!("Not implemented yet")
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_credit_card_payment() {
        let mut cart = ShoppingCart::new();
        cart.set_payment_strategy(Box::new(CreditCardStrategy::new("1234-5678-9012-3456")));
        let result = cart.checkout_with_amount(100.0);
        assert!(result.contains("100"));
        assert!(result.contains("Credit Card"));
        assert!(result.contains("3456"));
    }

    #[test]
    fn test_paypal_payment() {
        let mut cart = ShoppingCart::new();
        cart.set_payment_strategy(Box::new(PayPalStrategy::new("user@example.com")));
        let result = cart.checkout_with_amount(50.0);
        assert!(result.contains("50"));
        assert!(result.contains("PayPal"));
        assert!(result.contains("user@example.com"));
    }

    #[test]
    fn test_crypto_payment() {
        let mut cart = ShoppingCart::new();
        cart.set_payment_strategy(Box::new(CryptoStrategy::new_bitcoin("1A2B3C4D5E6F")));
        let result = cart.checkout_with_amount(200.0);
        assert!(result.contains("200"));
        assert!(result.contains("Bitcoin"));
        assert!(result.contains("1A2B3C4D5E6F"));
    }

    #[test]
    fn test_switch_strategy() {
        let mut cart = ShoppingCart::new();
        cart.set_payment_strategy(Box::new(CreditCardStrategy::new("1111-2222-3333-4444")));
        let result1 = cart.checkout_with_amount(100.0);
        assert!(result1.contains("Credit Card"));

        cart.set_payment_strategy(Box::new(PayPalStrategy::new("switched@example.com")));
        let result2 = cart.checkout_with_amount(50.0);
        assert!(result2.contains("PayPal"));
    }

    #[test]
    fn test_no_payment_method() {
        let mut cart = ShoppingCart::new();
        let result = cart.checkout();
        assert_eq!(result, "No payment method selected");
    }

    #[test]
    fn test_add_items_and_checkout() {
        let mut cart = ShoppingCart::new();
        cart.add_item(25.0);
        cart.add_item(35.0);
        cart.add_item(40.0);
        assert!((cart.get_total_amount() - 100.0).abs() < 0.01);

        cart.set_payment_strategy(Box::new(CreditCardStrategy::new("9999-8888-7777-6666")));
        let result = cart.checkout();
        assert!(result.contains("100"));
        assert!((cart.get_total_amount() - 0.0).abs() < 0.01);
    }

    #[test]
    fn test_checkout_with_amount_preserves_total() {
        let mut cart = ShoppingCart::new();
        cart.add_item(50.0);
        cart.add_item(50.0);
        cart.set_payment_strategy(Box::new(PayPalStrategy::new("test@example.com")));
        cart.checkout_with_amount(75.0);
        assert!((cart.get_total_amount() - 100.0).abs() < 0.01);
    }
}
