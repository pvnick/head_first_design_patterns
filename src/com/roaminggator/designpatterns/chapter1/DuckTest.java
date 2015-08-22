package com.roaminggator.designpatterns.chapter1;

import com.roaminggator.designpatterns.OutputController;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DuckTest {
    private class FakeDuck extends Duck {
        FakeDuck() {
            super("FakeDuck");
        }

        public void display() { }
    }

    @Test
    public void duckShouldSplashWhenSwimming() {
        Duck duck = new FakeDuck();
        duck.swim();
        assertEquals("FakeDuck: Splash splash", OutputController.getInstance().getOutputBehavior().getLastOutput());
    }

    @Test
    public void noFlyDuckShouldntFly() {
        Duck duck = new FakeDuck();
        duck.setFlyingBehavior(new FlyNoWay());
        duck.fly();
        assertEquals("FakeDuck: No flying here!", OutputController.getInstance().getOutputBehavior().getLastOutput());
    }

    @Test
    public void wingedDuckShouldFly() {
        Duck duck = new FakeDuck();
        duck.setFlyingBehavior(new FlyWithWings());
        duck.fly();
        assertEquals("FakeDuck: Flies away!", OutputController.getInstance().getOutputBehavior().getLastOutput());
    }

    @Test
    public void inanimateDuckShouldSqueekWhenQuacking() {
        Duck duck = new FakeDuck();
        duck.setQuackingBehavior(new QuackInanimate());
        duck.quack();
        assertEquals("FakeDuck: \"Squeek!\"", OutputController.getInstance().getOutputBehavior().getLastOutput());
    }

    @Test
    public void livingDuckQuackShouldBeLoud() {
        Duck duck = new FakeDuck();
        duck.setQuackingBehavior(new QuackLoudly());
        duck.quack();
        assertEquals("FakeDuck: \"QUACK!\"", OutputController.getInstance().getOutputBehavior().getLastOutput());
    }
}