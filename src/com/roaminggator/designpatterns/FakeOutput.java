package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class FakeOutput implements OutputBehavior {
    private Object lastOutput;

    public <T> void print(T output) {
        lastOutput = output;
    }

    public <T> void println(T output) {
        lastOutput = output;
    }

    public Object getLastOutput() {
        return lastOutput;
    }
}
