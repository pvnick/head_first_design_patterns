package com.roaminggator.designpatterns.chapter2;

import java.util.ArrayList;
import java.util.Observer;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class WeatherData implements SubjectInterface {
    private ArrayList<ObserverInterface> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public void registerObserver(ObserverInterface observer) {
        if ( ! observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public boolean removeObserver(ObserverInterface observer) {
        return observers.remove(observer);
    }

    public void notifyObservers() {
        float temperature = this.getTemperature();
        float pressure = this.getPressure();
        float humidity = this.getHumidity();
        for (ObserverInterface observer : observers) {
            observer.update(temperature, pressure, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        if (temperature != this.temperature) {
            this.temperature = temperature;
            measurementsChanged();
        }
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        if (pressure != this.pressure) {
            this.pressure = pressure;
            measurementsChanged();
        }
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        if (humidity != this.humidity) {
            this.humidity = humidity;
            measurementsChanged();
        }
    }

}
