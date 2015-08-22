package com.roaminggator.designpatterns.chapter1;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public abstract class Duck {
    protected String name;

    public Duck(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + ": Splash splash");
    }

    public void fly() {
        flyingBehavior.fly(name);
    }

    public void quack() {
        quackingBehavior.quack(name);
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) { this.flyingBehavior = flyingBehavior; }

    public void setQuackingBehavior(QuackingBehavior quackingBehavior) { this.quackingBehavior = quackingBehavior; }

    abstract public void display();
    FlyingBehavior flyingBehavior;
    QuackingBehavior quackingBehavior;
}
