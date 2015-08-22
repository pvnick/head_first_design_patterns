package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class FakeOutput implements OutputBehavior {
    private String lastOutput;

    public <T> void print(T output) {
        lastOutput = String.valueOf(output);
    }

    public <T> void println(T output) {
        lastOutput = String.valueOf(output);
    }

    public String getLastOutput() {
        return lastOutput;
    }
}
