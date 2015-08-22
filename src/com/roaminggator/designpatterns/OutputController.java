package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class OutputController {
    private static OutputController instance = null;
    public static OutputController getInstance() {
        if (instance == null) {
            instance = new OutputController();
        }
        return instance;
    }
    private OutputBehavior outputBehavior;
    public void setOutputBehavior(OutputBehavior outputBehavior) {
        this.outputBehavior = outputBehavior;
    }
    public OutputBehavior getOutputBehavior() {
        if (this.outputBehavior == null) {
            System.out.println("Output behavior hasn't yet been set");
            return null;
        }
        return this.outputBehavior;
    }
}
