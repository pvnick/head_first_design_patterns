package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class OutputToConsole implements OutputBehavior {
    private String lastOutput;

    public <T> void print(T output) {
        lastOutput = String.valueOf(output);
        System.out.print(lastOutput);
    }

    public <T> void println(T output) {
        lastOutput = String.valueOf(output);
        System.out.println(lastOutput + "\n");
    }

    public String getLastOutput() {
        return lastOutput;
    }
}
