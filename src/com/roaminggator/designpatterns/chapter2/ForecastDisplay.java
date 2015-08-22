package com.roaminggator.designpatterns.chapter2;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class ForecastDisplay extends AbstractDisplayElement {
    float temperature = 0;
    float pressure = 0;
    float humidity = 0;
    boolean receivedMeasurements = false;

    public void display() {
        if ( ! receivedMeasurements) {
            noMeasurementsError();
        } else {
            // Everything's going up!
            System.out.print("Forecast: \n" +
                            "\tTemperature: " + String.valueOf(temperature + 1f) + "\n" +
                            "\tPressure: " + String.valueOf(pressure + 1.5f) + "\n" +
                            "\tHumidity: " + String.valueOf(temperature + 0.5f) + "\n"
            );
        }
    }

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        receivedMeasurements = true;
    }
}
