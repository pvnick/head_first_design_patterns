package com.roaminggator.designpatterns;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public interface OutputBehavior {
    public <T> void print(T output);
    public <T> void println(T output);
    public String getLastOutput();
}
