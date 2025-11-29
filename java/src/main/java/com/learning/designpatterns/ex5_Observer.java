package com.learning.designpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: Observer Pattern (Behavioral)
 *
 * Implement the Observer pattern where multiple display devices observe
 * a weather station and get notified when weather data changes.
 *
 * Requirements:
 * 1. Create Observer interface with update() method
 * 2. Create Subject interface with attach(), detach(), and notifyObservers() methods
 * 3. Implement WeatherStation as concrete Subject
 * 4. Implement display classes as concrete Observers (PhoneDisplay, TVDisplay, WebDisplay)
 * 5. When weather data changes, all observers should be notified
 *
 * Example:
 * WeatherStation station = new WeatherStation();
 * PhoneDisplay phone = new PhoneDisplay();
 * station.attach(phone);
 * station.setWeatherData(25.5f, 65.0f); // Phone gets notified
 *
 * Use Cases: Event handling systems, MVC pattern, pub-sub messaging
 *
 * Time Complexity: O(n) for notifying n observers
 * Space Complexity: O(n) for storing n observers
 */
public class ex5_Observer {

    /**
     * Observer interface that all concrete observers must implement.
     */
    public interface Observer {
        /**
         * Called when the subject's state changes.
         * @param temperature The new temperature
         * @param humidity The new humidity
         */
        void update(float temperature, float humidity);
    }

    /**
     * Subject interface that maintains observers and notifies them.
     */
    public interface Subject {
        /**
         * Attaches an observer to the subject.
         */
        void attach(Observer observer);

        /**
         * Detaches an observer from the subject.
         */
        void detach(Observer observer);

        /**
         * Notifies all attached observers of state changes.
         */
        void notifyObservers();
    }

    /**
     * WeatherStation - concrete subject that holds weather data.
     */
    public static class WeatherStation implements Subject {
        private List<Observer> observers;
        private float temperature;
        private float humidity;

        public WeatherStation() {
            // TODO: Initialize the observers list
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement attach method
        // Add observer to the list if not already present
        @Override
        public void attach(Observer observer) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement detach method
        // Remove observer from the list
        @Override
        public void detach(Observer observer) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        // TODO: Implement notifyObservers method
        // Call update() on all observers with current temperature and humidity
        @Override
        public void notifyObservers() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /**
         * Sets new weather data and notifies observers.
         */
        public void setWeatherData(float temperature, float humidity) {
            // TODO: Update temperature and humidity, then notify observers
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public float getTemperature() {
            return temperature;
        }

        public float getHumidity() {
            return humidity;
        }

        public int getObserverCount() {
            return observers != null ? observers.size() : 0;
        }
    }

    /**
     * PhoneDisplay - concrete observer that displays weather on phone.
     */
    public static class PhoneDisplay implements Observer {
        private float temperature;
        private float humidity;
        private int updateCount = 0;

        // TODO: Implement update method
        // Store the temperature and humidity, increment updateCount
        @Override
        public void update(float temperature, float humidity) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String display() {
            return String.format("Phone Display: %.1f°C, %.1f%% humidity", temperature, humidity);
        }

        public int getUpdateCount() {
            return updateCount;
        }

        public float getTemperature() {
            return temperature;
        }

        public float getHumidity() {
            return humidity;
        }
    }

    /**
     * TVDisplay - concrete observer that displays weather on TV.
     */
    public static class TVDisplay implements Observer {
        private float temperature;
        private float humidity;
        private int updateCount = 0;

        // TODO: Implement update method
        @Override
        public void update(float temperature, float humidity) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String display() {
            return String.format("TV Display: Temperature %.1f°C | Humidity %.1f%%", temperature, humidity);
        }

        public int getUpdateCount() {
            return updateCount;
        }

        public float getTemperature() {
            return temperature;
        }

        public float getHumidity() {
            return humidity;
        }
    }

    /**
     * WebDisplay - concrete observer that displays weather on website.
     */
    public static class WebDisplay implements Observer {
        private float temperature;
        private float humidity;
        private int updateCount = 0;

        // TODO: Implement update method
        @Override
        public void update(float temperature, float humidity) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        public String display() {
            return String.format("Web Display: Current conditions - %.1f°C and %.1f%% humidity",
                               temperature, humidity);
        }

        public int getUpdateCount() {
            return updateCount;
        }

        public float getTemperature() {
            return temperature;
        }

        public float getHumidity() {
            return humidity;
        }
    }
}
