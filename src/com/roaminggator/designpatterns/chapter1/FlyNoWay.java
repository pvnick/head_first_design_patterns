package com.roaminggator.designpatterns.chapter1;

/**
 * Created by pvnic_000 on 8/18/2015.
 */
public class FlyNoWay implements FlyingBehavior {
    public void fly(String name) {
        System.out.println(name + ": No flying here!");
    }
}
