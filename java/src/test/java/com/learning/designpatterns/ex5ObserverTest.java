package com.learning.designpatterns;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.learning.designpatterns.ex5_Observer.*;

class ex5ObserverTest {

    private WeatherStation station;
    private PhoneDisplay phoneDisplay;
    private TVDisplay tvDisplay;
    private WebDisplay webDisplay;

    @BeforeEach
    void setUp() {
        station = new WeatherStation();
        phoneDisplay = new PhoneDisplay();
        tvDisplay = new TVDisplay();
        webDisplay = new WebDisplay();
    }

    @Test
    void testAttachSingleObserver() {
        station.attach(phoneDisplay);
        assertEquals(1, station.getObserverCount());
    }

    @Test
    void testAttachMultipleObservers() {
        station.attach(phoneDisplay);
        station.attach(tvDisplay);
        station.attach(webDisplay);
        assertEquals(3, station.getObserverCount());
    }

    @Test
    void testDetachObserver() {
        station.attach(phoneDisplay);
        station.attach(tvDisplay);
        station.detach(phoneDisplay);
        assertEquals(1, station.getObserverCount());
    }

    @Test
    void testNotifySingleObserver() {
        station.attach(phoneDisplay);
        station.setWeatherData(25.5f, 65.0f);

        assertEquals(25.5f, phoneDisplay.getTemperature(), 0.01);
        assertEquals(65.0f, phoneDisplay.getHumidity(), 0.01);
        assertEquals(1, phoneDisplay.getUpdateCount());
    }

    @Test
    void testNotifyMultipleObservers() {
        station.attach(phoneDisplay);
        station.attach(tvDisplay);
        station.attach(webDisplay);

        station.setWeatherData(30.0f, 70.0f);

        assertEquals(30.0f, phoneDisplay.getTemperature(), 0.01);
        assertEquals(30.0f, tvDisplay.getTemperature(), 0.01);
        assertEquals(30.0f, webDisplay.getTemperature(), 0.01);

        assertEquals(1, phoneDisplay.getUpdateCount());
        assertEquals(1, tvDisplay.getUpdateCount());
        assertEquals(1, webDisplay.getUpdateCount());
    }

    @Test
    void testMultipleUpdates() {
        station.attach(phoneDisplay);
        station.setWeatherData(20.0f, 60.0f);
        station.setWeatherData(25.0f, 65.0f);
        station.setWeatherData(30.0f, 70.0f);

        assertEquals(30.0f, phoneDisplay.getTemperature(), 0.01);
        assertEquals(70.0f, phoneDisplay.getHumidity(), 0.01);
        assertEquals(3, phoneDisplay.getUpdateCount());
    }

    @Test
    void testDetachedObserverNotNotified() {
        station.attach(phoneDisplay);
        station.attach(tvDisplay);

        station.setWeatherData(20.0f, 60.0f);
        assertEquals(1, phoneDisplay.getUpdateCount());
        assertEquals(1, tvDisplay.getUpdateCount());

        station.detach(phoneDisplay);
        station.setWeatherData(25.0f, 65.0f);

        // Phone should still have old data and count
        assertEquals(1, phoneDisplay.getUpdateCount());
        assertEquals(20.0f, phoneDisplay.getTemperature(), 0.01);

        // TV should have new data
        assertEquals(2, tvDisplay.getUpdateCount());
        assertEquals(25.0f, tvDisplay.getTemperature(), 0.01);
    }

    @Test
    void testDisplayFormats() {
        phoneDisplay.update(25.0f, 65.0f);
        tvDisplay.update(25.0f, 65.0f);
        webDisplay.update(25.0f, 65.0f);

        assertTrue(phoneDisplay.display().contains("25.0"));
        assertTrue(tvDisplay.display().contains("25.0"));
        assertTrue(webDisplay.display().contains("25.0"));
    }

    @Test
    void testReattachObserver() {
        station.attach(phoneDisplay);
        station.detach(phoneDisplay);
        station.attach(phoneDisplay);

        station.setWeatherData(20.0f, 60.0f);
        assertEquals(1, phoneDisplay.getUpdateCount());
    }
}
