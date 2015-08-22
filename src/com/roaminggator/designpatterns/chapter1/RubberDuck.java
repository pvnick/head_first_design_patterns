package com.roaminggator.designpatterns.chapter1;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super("Rubber Duck");
        setFlyingBehavior(new FlyNoWay());
        setQuackingBehavior(new QuackInanimate());
    }

    public void display() {
        OutputBehavior outputBehavior = OutputController.getInstance().getOutputBehavior();
        outputBehavior.println(name + ": \"Here I am!\"");
    }
}
