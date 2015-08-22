package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class OutputToConsole implements OutputBehavior {
    public <T> void print(T output) {
        System.out.print(output);
    }

    public <T> void println(T output) {
        System.out.println(output);
    }
}
