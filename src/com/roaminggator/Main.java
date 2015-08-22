package com.roaminggator;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;
import com.roaminggator.designpatterns.OutputToConsole;
import com.roaminggator.designpatterns.chapter1.*;
import com.roaminggator.designpatterns.chapter2.*;

import java.util.ArrayList;

public class Main {
    public static void testChapter1() {
        Duck[] ducks = new Duck[3];
        ducks[0] = new MallardDuck();
        ducks[1] = new ReadheadDuck();
        ducks[2] = new RubberDuck();
        for (int i = 0; i != 3; ++i) {
            ducks[i].fly();
            ducks[i].quack();
            ducks[i].swim();
            ducks[i].display();
        }
    }

    public static void testChapter2() {
        ArrayList<AbstractDisplayElement> displays  = new ArrayList<AbstractDisplayElement>();
        displays.add(new CurrentConditionsDisplay());
        displays.add(new ForecastDisplay());
        displays.add(new StatisticsDisplay());
        WeatherData weatherData = new WeatherData();
        for (ObserverInterface observer : displays) {
            weatherData.registerObserver(observer);
        }
        for (AbstractDisplayElement displayElement : displays) {
            displayElement.display();
        }
        weatherData.setTemperature(40f);
        weatherData.setPressure(2f);
        weatherData.setHumidity(33f);
        weatherData.measurementsChanged();
        for (AbstractDisplayElement displayElement : displays) {
            displayElement.display();
        }
        weatherData.setTemperature(43f);
        weatherData.setPressure(2.5f);
        weatherData.setHumidity(34f);
        weatherData.measurementsChanged();
        for (AbstractDisplayElement displayElement : displays) {
            displayElement.display();
        }
    }

    public static void main(String[] args) {
        OutputBehavior outputBehavior = new OutputToConsole();
        OutputController.getInstance().setOutputBehavior(outputBehavior);
        testChapter1();
        testChapter2();
    }
}
