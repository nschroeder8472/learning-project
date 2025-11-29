"""
Exercise: Strategy Pattern (Behavioral)

Implement the Strategy pattern to encapsulate different payment algorithms
and make them interchangeable at runtime.

Requirements:
1. Create PaymentStrategy base class with pay() method
2. Implement concrete strategies: CreditCardStrategy, PayPalStrategy, CryptoStrategy
3. Create ShoppingCart that uses a payment strategy
4. Strategy can be changed at runtime

Example:
    cart = ShoppingCart()
    cart.set_payment_strategy(CreditCardStrategy("1234-5678-9012-3456"))
    cart.checkout(100.0)  # Pays with credit card

Use Cases: Sorting algorithms, compression algorithms, navigation routes

Time Complexity: O(1) for strategy selection
Space Complexity: O(1)
"""

from abc import ABC, abstractmethod
from typing import Optional


class PaymentStrategy(ABC):
    """Base class for all payment strategies."""

    @abstractmethod
    def pay(self, amount: float) -> str:
        """
        Processes a payment.
        Args:
            amount: The amount to pay
        Returns:
            A message confirming the payment
        """
        pass


class CreditCardStrategy(PaymentStrategy):
    """Strategy for paying with credit card."""

    def __init__(self, card_number: str, cvv: str = "123", expiry_date: str = "12/25"):
        self.card_number = card_number
        self.cvv = cvv
        self.expiry_date = expiry_date

    def pay(self, amount: float) -> str:
        """
        TODO: Implement payment with credit card
        Return: "Paid ${amount} using Credit Card ending in {last 4 digits}"
        Hint: Use card_number[-4:] to get last 4 digits
        """
        raise NotImplementedError("Not implemented yet")

    def get_card_number(self) -> str:
        return self.card_number


class PayPalStrategy(PaymentStrategy):
    """Strategy for paying with PayPal."""

    def __init__(self, email: str, password: str = "password"):
        self.email = email
        self.password = password

    def pay(self, amount: float) -> str:
        """
        TODO: Implement payment with PayPal
        Return: "Paid ${amount} using PayPal account: {email}"
        """
        raise NotImplementedError("Not implemented yet")

    def get_email(self) -> str:
        return self.email


class CryptoStrategy(PaymentStrategy):
    """Strategy for paying with cryptocurrency."""

    def __init__(self, wallet_address: str, crypto_type: str = "Bitcoin"):
        self.wallet_address = wallet_address
        self.crypto_type = crypto_type

    def pay(self, amount: float) -> str:
        """
        TODO: Implement payment with cryptocurrency
        Return: "Paid ${amount} using {crypto_type} wallet: {wallet_address}"
        """
        raise NotImplementedError("Not implemented yet")

    def get_wallet_address(self) -> str:
        return self.wallet_address

    def get_crypto_type(self) -> str:
        return self.crypto_type


class ShoppingCart:
    """Context class that uses a payment strategy."""

    def __init__(self):
        self._payment_strategy: Optional[PaymentStrategy] = None
        self._total_amount: float = 0.0

    def set_payment_strategy(self, strategy: PaymentStrategy) -> None:
        """
        TODO: Set the payment strategy
        """
        raise NotImplementedError("Not implemented yet")

    def add_item(self, price: float) -> None:
        """Adds an item's price to the total."""
        self._total_amount += price

    def get_total_amount(self) -> float:
        """Returns the current total amount."""
        return self._total_amount

    def checkout(self, amount: Optional[float] = None) -> str:
        """
        Processes checkout using the current payment strategy.

        Args:
            amount: Optional specific amount to pay. If None, pays total_amount.

        Returns:
            The payment confirmation message

        TODO: Implement checkout
        If no payment strategy is set, return "No payment method selected"
        If amount is None, use total_amount and reset it to 0
        If amount is provided, use that amount (don't reset total)
        """
        raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    # Example usage
    cart = ShoppingCart()
    cart.add_item(50.0)
    cart.add_item(30.0)

    # Pay with credit card
    cart.set_payment_strategy(CreditCardStrategy("1234-5678-9012-3456"))
    print(cart.checkout())

    # Add more items and pay with PayPal
    cart.add_item(100.0)
    cart.set_payment_strategy(PayPalStrategy("user@example.com"))
    print(cart.checkout())
