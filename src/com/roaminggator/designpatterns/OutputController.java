package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class OutputController {
    private static OutputController instance = null;
    public static OutputController getInstance() {
        if (instance == null) {
            instance = new OutputController();
            instance.setOutputBehavior(new FakeOutput()); //initialize with placeholder output behavior
        }
        return instance;
    }
    private OutputBehavior outputBehavior;
    public void setOutputBehavior(OutputBehavior outputBehavior) {
        this.outputBehavior = outputBehavior;
    }
    public OutputBehavior getOutputBehavior() {
        return this.outputBehavior;
    }
}
