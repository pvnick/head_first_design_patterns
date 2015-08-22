package com.roaminggator.designpatterns.chapter1;

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
        System.out.println(name + ": \"Here I am!\"");
    }
}
