package com.roaminggator.designpatterns.chapter2;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public abstract class AbstractDisplayElement implements ObserverInterface {
    public abstract void display();
    protected void noMeasurementsError() {
        System.out.println("No measurements received yet");
    }
}
