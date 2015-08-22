package com.roaminggator.designpatterns.chapter2;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public abstract class AbstractDisplayElement implements ObserverInterface {
    protected AbstractDisplayElement(String displayName) {
        this.displayName = displayName;
    }
    public abstract void display();
    protected void insufficientMeasurementsError() {
        OutputBehavior outputBehavior = OutputController.getInstance().getOutputBehavior();
        outputBehavior.println(this.getDisplayName() + ": Not enough measurements received yet");
    }
    protected String displayName;
    public String getDisplayName() {
        return displayName;
    }
}
