package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class OutputToConsole implements OutputBehavior {
    private Object lastOutput;

    public <T> void print(T output) {
        lastOutput = output;
        System.out.print(output);
    }

    public <T> void println(T output) {
        lastOutput = output;
        System.out.println(output);
    }

    public Object getLastOutput() {
        return lastOutput;
    }
}
