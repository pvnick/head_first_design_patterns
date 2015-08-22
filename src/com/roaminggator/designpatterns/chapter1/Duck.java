package com.roaminggator.designpatterns.chapter1;

import com.roaminggator.designpatterns.OutputBehavior;
import com.roaminggator.designpatterns.OutputController;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public abstract class Duck {
    protected String name;

    public Duck(String name) {
        this.name = name;
    }

    public void swim() {
        OutputBehavior outputBehavior = OutputController.getInstance().getOutputBehavior();
        outputBehavior.println(name + ": Splash splash");
    }

    public void fly() { flyingBehavior.fly(name); }

    public void quack() {
        quackingBehavior.quack(name);
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) { this.flyingBehavior = flyingBehavior; }

    public void setQuackingBehavior(QuackingBehavior quackingBehavior) { this.quackingBehavior = quackingBehavior; }

    abstract public void display();
    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;
}
