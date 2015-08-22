package com.roaminggator;

import com.roaminggator.designpatterns.chapter1.*;
import com.roaminggator.designpatterns.chapter2.*;

public class Main {
    public static void testChapter1() {
        Duck[] ducks = new Duck[3];
        ducks[0] = new MallardDuck();
        ducks[1] = new ReadheadDuck();
        ducks[2] = new RubberDuck();
        for (int i = 0; i != 3; ++i) {
            ducks[i].fly();
            ducks[i].quack();
            ducks[i].swim();
            ducks[i].display();
        }
    }

    public static void testChapter2() {
        
    }

    public static void main(String[] args) {
        testChapter2();
    }
}
