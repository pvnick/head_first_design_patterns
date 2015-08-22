package com.roaminggator.designpatterns.chapter2;

import static org.junit.Assert.*;
import org.junit.Test;

public class WeatherDataTest {
    private static int displayElementUpdateCallCount = 0;
    public static void incrementDisplayElementUpdateCallCount() { ++displayElementUpdateCallCount; }

    private class FakeDisplayElement extends AbstractDisplayElement {
        private float temperature;
        private float pressure;
        private float humidity;

        public FakeDisplayElement() {
            super("Fake Display Element");
        }
        public void display() { }
        public void update(float temperature, float pressure, float humidity) {
            WeatherDataTest.incrementDisplayElementUpdateCallCount();
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
        }

        float getTemperature() { return temperature; }
        float getPressure() { return pressure; }
        float getHumidity() { return humidity; }
    }

    @Test
    public void observersShouldReceiveWeatherUpdate() {
        WeatherData weatherData = new WeatherData();
        int numObservers = 5;
        for (int i = 0; i != numObservers; ++i) {
            weatherData.registerObserver(new FakeDisplayElement());
        }
        displayElementUpdateCallCount = 0;
        weatherData.measurementsChanged();
        assertEquals(displayElementUpdateCallCount, numObservers);
    }

    @Test
    public void displayElementShouldBeProperlyNamed() {
        FakeDisplayElement fakeDisplayElement = new FakeDisplayElement();
        assertEquals(fakeDisplayElement.getDisplayName(), "Fake Display Element");
    }

    @Test
    public void displayElementShouldReceiveProperMeasurements() {
        FakeDisplayElement fakeDisplayElement = new FakeDisplayElement();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(fakeDisplayElement);
        weatherData.setTemperature(1.1f);
        weatherData.setPressure(2.2f);
        weatherData.setHumidity(3.3f);
        weatherData.measurementsChanged();
        assertEquals(fakeDisplayElement.getTemperature(), weatherData.getTemperature(), 1e-15);
        assertEquals(fakeDisplayElement.getPressure(), weatherData.getPressure(), 1e-15);
        assertEquals(fakeDisplayElement.getHumidity(), weatherData.getHumidity(), 1e-15);

        weatherData.setTemperature(4.4f);
        weatherData.setPressure(5.5f);
        weatherData.setHumidity(6.6f);
        weatherData.measurementsChanged();
        assertEquals(fakeDisplayElement.getTemperature(), 4.4f, 1e-15);
        assertEquals(fakeDisplayElement.getPressure(), 5.5f, 1e-15);
        assertEquals(fakeDisplayElement.getHumidity(), 6.6f, 1e-15);
    }

    @Test
    public void removedObserverShouldntReceiveUpdates() {
        FakeDisplayElement fakeDisplayElement = new FakeDisplayElement();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(fakeDisplayElement);
        displayElementUpdateCallCount = 0;
        weatherData.setTemperature(1.1f);
        weatherData.setPressure(2.2f);
        weatherData.setHumidity(3.3f);
        weatherData.measurementsChanged();
        assertEquals(displayElementUpdateCallCount, 1);
        weatherData.removeObserver(fakeDisplayElement);
        weatherData.setTemperature(4.4f);
        weatherData.setPressure(5.5f);
        weatherData.setHumidity(6.6f);
        weatherData.measurementsChanged();
        assertEquals(displayElementUpdateCallCount, 1);
        assertEquals(fakeDisplayElement.getTemperature(), 1.1f, 1e-15);
        assertEquals(fakeDisplayElement.getPressure(), 2.2f, 1e-15);
        assertEquals(fakeDisplayElement.getHumidity(), 3.3f, 1e-15);
    }

}