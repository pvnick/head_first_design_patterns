package com.roaminggator.designpatterns.chapter1;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public class QuackInanimate implements QuackingBehavior {
    public void quack(String name) {
        OutputBehavior outputBehavior = OutputController.getInstance().getOutputBehavior();
        outputBehavior.println(name + ": \"Squeek!\"");
    }
}
