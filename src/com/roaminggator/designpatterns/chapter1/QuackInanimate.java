package com.roaminggator.designpatterns.chapter1;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public class QuackInanimate implements QuackingBehavior {
    public void quack(String name) {
        System.out.println(name + ": \"Squeek!\"");
    }
}
