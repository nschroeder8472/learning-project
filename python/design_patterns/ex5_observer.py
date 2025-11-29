"""
Exercise: Observer Pattern (Behavioral)

Implement the Observer pattern where multiple display devices observe
a weather station and get notified when weather data changes.

Requirements:
1. Create Observer base class with update() method
2. Create Subject base class with attach(), detach(), and notify_observers() methods
3. Implement WeatherStation as concrete Subject
4. Implement display classes as concrete Observers (PhoneDisplay, TVDisplay, WebDisplay)
5. When weather data changes, all observers should be notified

Example:
    station = WeatherStation()
    phone = PhoneDisplay()
    station.attach(phone)
    station.set_weather_data(25.5, 65.0)  # Phone gets notified

Use Cases: Event handling systems, MVC pattern, pub-sub messaging

Time Complexity: O(n) for notifying n observers
Space Complexity: O(n) for storing n observers
"""

from abc import ABC, abstractmethod
from typing import List


class Observer(ABC):
    """Base class for all observers."""

    @abstractmethod
    def update(self, temperature: float, humidity: float) -> None:
        """
        Called when the subject's state changes.
        Args:
            temperature: The new temperature
            humidity: The new humidity
        """
        pass


class Subject(ABC):
    """Base class for subjects that maintain observers."""

    @abstractmethod
    def attach(self, observer: Observer) -> None:
        """Attaches an observer to the subject."""
        pass

    @abstractmethod
    def detach(self, observer: Observer) -> None:
        """Detaches an observer from the subject."""
        pass

    @abstractmethod
    def notify_observers(self) -> None:
        """Notifies all attached observers of state changes."""
        pass


class WeatherStation(Subject):
    """Concrete subject that holds weather data."""

    def __init__(self):
        """
        TODO: Initialize the observers list
        """
        self._observers: List[Observer] = []
        self._temperature: float = 0.0
        self._humidity: float = 0.0
        raise NotImplementedError("Not implemented yet")

    def attach(self, observer: Observer) -> None:
        """
        TODO: Add observer to the list if not already present
        """
        raise NotImplementedError("Not implemented yet")

    def detach(self, observer: Observer) -> None:
        """
        TODO: Remove observer from the list
        """
        raise NotImplementedError("Not implemented yet")

    def notify_observers(self) -> None:
        """
        TODO: Call update() on all observers with current temperature and humidity
        """
        raise NotImplementedError("Not implemented yet")

    def set_weather_data(self, temperature: float, humidity: float) -> None:
        """
        TODO: Update temperature and humidity, then notify observers
        """
        raise NotImplementedError("Not implemented yet")

    def get_temperature(self) -> float:
        return self._temperature

    def get_humidity(self) -> float:
        return self._humidity

    def get_observer_count(self) -> int:
        return len(self._observers)


class PhoneDisplay(Observer):
    """Concrete observer that displays weather on phone."""

    def __init__(self):
        self._temperature: float = 0.0
        self._humidity: float = 0.0
        self._update_count: int = 0

    def update(self, temperature: float, humidity: float) -> None:
        """
        TODO: Store temperature and humidity, increment update_count
        """
        raise NotImplementedError("Not implemented yet")

    def display(self) -> str:
        return f"Phone Display: {self._temperature:.1f}°C, {self._humidity:.1f}% humidity"

    def get_update_count(self) -> int:
        return self._update_count

    def get_temperature(self) -> float:
        return self._temperature

    def get_humidity(self) -> float:
        return self._humidity


class TVDisplay(Observer):
    """Concrete observer that displays weather on TV."""

    def __init__(self):
        self._temperature: float = 0.0
        self._humidity: float = 0.0
        self._update_count: int = 0

    def update(self, temperature: float, humidity: float) -> None:
        """
        TODO: Store temperature and humidity, increment update_count
        """
        raise NotImplementedError("Not implemented yet")

    def display(self) -> str:
        return f"TV Display: Temperature {self._temperature:.1f}°C | Humidity {self._humidity:.1f}%"

    def get_update_count(self) -> int:
        return self._update_count

    def get_temperature(self) -> float:
        return self._temperature

    def get_humidity(self) -> float:
        return self._humidity


class WebDisplay(Observer):
    """Concrete observer that displays weather on website."""

    def __init__(self):
        self._temperature: float = 0.0
        self._humidity: float = 0.0
        self._update_count: int = 0

    def update(self, temperature: float, humidity: float) -> None:
        """
        TODO: Store temperature and humidity, increment update_count
        """
        raise NotImplementedError("Not implemented yet")

    def display(self) -> str:
        return f"Web Display: Current conditions - {self._temperature:.1f}°C and {self._humidity:.1f}% humidity"

    def get_update_count(self) -> int:
        return self._update_count

    def get_temperature(self) -> float:
        return self._temperature

    def get_humidity(self) -> float:
        return self._humidity


if __name__ == "__main__":
    # Example usage
    station = WeatherStation()
    phone = PhoneDisplay()
    tv = TVDisplay()

    station.attach(phone)
    station.attach(tv)

    station.set_weather_data(25.5, 65.0)
    print(phone.display())
    print(tv.display())
