package com.roaminggator.designpatterns.chapter2;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class CurrentConditionsDisplay extends AbstractDisplayElement {
    float temperature = 0;
    float pressure = 0;
    float humidity = 0;
    boolean receivedMeasurements = false;

    public CurrentConditionsDisplay() {
        super("Current Conditions");
    }

    public void display() {
        if ( ! receivedMeasurements) {
            insufficientMeasurementsError();
        } else {
            OutputBehavior outputBehavior = OutputController.getInstance().getOutputBehavior();
            outputBehavior.println("Current Conditions: \n" +
                            "\tTemperature: " + String.valueOf(temperature) + "\n" +
                            "\tPressure: " + String.valueOf(pressure) + "\n" +
                            "\tHumidity: " + String.valueOf(temperature) + "\n"
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
