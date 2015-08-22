package com.roaminggator.designpatterns.chapter1;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super("Mallard");
        setFlyingBehavior(new FlyWithWings());
        setQuackingBehavior(new QuackLoudly());
    }

    public void display() {
        System.out.println(name + ": \"Here I am!\"");
    }
}
