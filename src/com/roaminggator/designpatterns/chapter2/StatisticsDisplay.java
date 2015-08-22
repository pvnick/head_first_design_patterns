package com.roaminggator.designpatterns.chapter2;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class StatisticsDisplay extends AbstractDisplayElement {
    float oldTemperature = 0;
    float oldPressure = 0;
    float oldHumidity = 0;
    float newTemperature = 0;
    float newPressure = 0;
    float newHumidity = 0;
    long measurementsReceived = 0;

    public StatisticsDisplay() {
        super("Statistics Display");
    }

    public void display() {
        if (measurementsReceived < 2) {
            insufficientMeasurementsError();
        } else {
            OutputBehavior outputBehavior = OutputController.getInstance().getOutputBehavior();
            outputBehavior.println("Condition Deltas: \n" +
                            "\tTemperature: " + String.valueOf(newTemperature - oldTemperature) + "\n" +
                            "\tPressure: " + String.valueOf(newPressure - oldPressure) + "\n" +
                            "\tHumidity: " + String.valueOf(newHumidity - oldHumidity) + "\n"
            );
        }
    }

    public void update(float temperature, float pressure, float humidity) {
        oldTemperature = newTemperature;
        newTemperature = temperature;
        oldPressure = newPressure;
        newPressure = pressure;
        oldHumidity = newHumidity;
        newHumidity = humidity;
        ++measurementsReceived;
    }
}
