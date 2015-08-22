package com.roaminggator.designpatterns.chapter1;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public class ReadheadDuck extends Duck {
    public ReadheadDuck() {
        super("Redhead");
        setFlyingBehavior(new FlyWithWings());
        setQuackingBehavior(new QuackLoudly());
    }

    public void display() {
        OutputBehavior outputBehavior = OutputController.getInstance().getOutputBehavior();
        outputBehavior.println(name + ": \"Here I am!\"");
    }
}
