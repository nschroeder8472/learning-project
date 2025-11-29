"""Tests for Strategy Pattern."""

import pytest
from design_patterns.ex6_strategy import (
    ShoppingCart, CreditCardStrategy, PayPalStrategy, CryptoStrategy
)


def test_credit_card_payment():
    """Test payment with credit card strategy."""
    cart = ShoppingCart()
    strategy = CreditCardStrategy("1234-5678-9012-3456")
    cart.set_payment_strategy(strategy)
    result = cart.checkout(100.0)

    assert "100" in result
    assert "Credit Card" in result
    assert "3456" in result


def test_paypal_payment():
    """Test payment with PayPal strategy."""
    cart = ShoppingCart()
    strategy = PayPalStrategy("user@example.com")
    cart.set_payment_strategy(strategy)
    result = cart.checkout(50.0)

    assert "50" in result
    assert "PayPal" in result
    assert "user@example.com" in result


def test_crypto_payment():
    """Test payment with cryptocurrency strategy."""
    cart = ShoppingCart()
    strategy = CryptoStrategy("1A2B3C4D5E6F")
    cart.set_payment_strategy(strategy)
    result = cart.checkout(200.0)

    assert "200" in result
    assert "Bitcoin" in result
    assert "1A2B3C4D5E6F" in result


def test_crypto_payment_with_type():
    """Test cryptocurrency payment with specific type."""
    cart = ShoppingCart()
    strategy = CryptoStrategy("WALLET123", "Ethereum")
    cart.set_payment_strategy(strategy)
    result = cart.checkout(150.0)

    assert "150" in result
    assert "Ethereum" in result
    assert "WALLET123" in result


def test_switch_strategy():
    """Test switching payment strategies."""
    cart = ShoppingCart()

    # First payment with credit card
    strategy1 = CreditCardStrategy("1111-2222-3333-4444")
    cart.set_payment_strategy(strategy1)
    result1 = cart.checkout(100.0)
    assert "Credit Card" in result1

    # Switch to PayPal
    strategy2 = PayPalStrategy("switched@example.com")
    cart.set_payment_strategy(strategy2)
    result2 = cart.checkout(50.0)
    assert "PayPal" in result2
    assert "switched@example.com" in result2


def test_no_payment_method():
    """Test checkout without setting payment method."""
    cart = ShoppingCart()
    result = cart.checkout(100.0)
    assert result == "No payment method selected"


def test_add_items_and_checkout():
    """Test adding items and checking out."""
    cart = ShoppingCart()
    cart.add_item(25.0)
    cart.add_item(35.0)
    cart.add_item(40.0)

    assert abs(cart.get_total_amount() - 100.0) < 0.01

    cart.set_payment_strategy(CreditCardStrategy("9999-8888-7777-6666"))
    result = cart.checkout()

    assert "100" in result
    assert abs(cart.get_total_amount() - 0.0) < 0.01


def test_checkout_with_amount_does_not_reset_total():
    """Test that checkout with specific amount doesn't reset total."""
    cart = ShoppingCart()
    cart.add_item(50.0)
    cart.add_item(50.0)

    cart.set_payment_strategy(PayPalStrategy("test@example.com"))
    cart.checkout(75.0)  # Partial payment

    assert abs(cart.get_total_amount() - 100.0) < 0.01


def test_multiple_checkouts():
    """Test multiple checkout operations."""
    cart = ShoppingCart()
    cart.set_payment_strategy(CreditCardStrategy("1234-5678-9012-3456"))

    cart.add_item(100.0)
    cart.checkout()
    assert abs(cart.get_total_amount() - 0.0) < 0.01

    cart.add_item(50.0)
    cart.checkout()
    assert abs(cart.get_total_amount() - 0.0) < 0.01
