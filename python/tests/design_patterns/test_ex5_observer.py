"""Tests for Observer Pattern."""

import pytest
from design_patterns.ex5_observer import (
    WeatherStation, PhoneDisplay, TVDisplay, WebDisplay
)


def test_attach_single_observer():
    """Test attaching a single observer."""
    station = WeatherStation()
    phone = PhoneDisplay()
    station.attach(phone)
    assert station.get_observer_count() == 1


def test_attach_multiple_observers():
    """Test attaching multiple observers."""
    station = WeatherStation()
    phone = PhoneDisplay()
    tv = TVDisplay()
    web = WebDisplay()

    station.attach(phone)
    station.attach(tv)
    station.attach(web)
    assert station.get_observer_count() == 3


def test_detach_observer():
    """Test detaching an observer."""
    station = WeatherStation()
    phone = PhoneDisplay()
    tv = TVDisplay()

    station.attach(phone)
    station.attach(tv)
    station.detach(phone)
    assert station.get_observer_count() == 1


def test_notify_single_observer():
    """Test notifying a single observer."""
    station = WeatherStation()
    phone = PhoneDisplay()
    station.attach(phone)

    station.set_weather_data(25.5, 65.0)

    assert abs(phone.get_temperature() - 25.5) < 0.01
    assert abs(phone.get_humidity() - 65.0) < 0.01
    assert phone.get_update_count() == 1


def test_notify_multiple_observers():
    """Test notifying multiple observers."""
    station = WeatherStation()
    phone = PhoneDisplay()
    tv = TVDisplay()
    web = WebDisplay()

    station.attach(phone)
    station.attach(tv)
    station.attach(web)

    station.set_weather_data(30.0, 70.0)

    assert abs(phone.get_temperature() - 30.0) < 0.01
    assert abs(tv.get_temperature() - 30.0) < 0.01
    assert abs(web.get_temperature() - 30.0) < 0.01

    assert phone.get_update_count() == 1
    assert tv.get_update_count() == 1
    assert web.get_update_count() == 1


def test_multiple_updates():
    """Test multiple weather updates."""
    station = WeatherStation()
    phone = PhoneDisplay()
    station.attach(phone)

    station.set_weather_data(20.0, 60.0)
    station.set_weather_data(25.0, 65.0)
    station.set_weather_data(30.0, 70.0)

    assert abs(phone.get_temperature() - 30.0) < 0.01
    assert abs(phone.get_humidity() - 70.0) < 0.01
    assert phone.get_update_count() == 3


def test_detached_observer_not_notified():
    """Test that detached observer is not notified."""
    station = WeatherStation()
    phone = PhoneDisplay()
    tv = TVDisplay()

    station.attach(phone)
    station.attach(tv)

    station.set_weather_data(20.0, 60.0)
    assert phone.get_update_count() == 1
    assert tv.get_update_count() == 1

    station.detach(phone)
    station.set_weather_data(25.0, 65.0)

    # Phone should still have old data
    assert phone.get_update_count() == 1
    assert abs(phone.get_temperature() - 20.0) < 0.01

    # TV should have new data
    assert tv.get_update_count() == 2
    assert abs(tv.get_temperature() - 25.0) < 0.01


def test_display_formats():
    """Test display output formats."""
    phone = PhoneDisplay()
    tv = TVDisplay()
    web = WebDisplay()

    phone.update(25.0, 65.0)
    tv.update(25.0, 65.0)
    web.update(25.0, 65.0)

    assert "25.0" in phone.display()
    assert "25.0" in tv.display()
    assert "25.0" in web.display()


def test_reattach_observer():
    """Test reattaching a previously detached observer."""
    station = WeatherStation()
    phone = PhoneDisplay()

    station.attach(phone)
    station.detach(phone)
    station.attach(phone)

    station.set_weather_data(20.0, 60.0)
    assert phone.get_update_count() == 1
