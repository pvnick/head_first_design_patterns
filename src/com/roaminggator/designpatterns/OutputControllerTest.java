package com.roaminggator.designpatterns;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by pvnic_000 on 8/22/2015.
 */
public class OutputControllerTest {
    @Test
    public void outputBehaviorShouldRememberOutput() {
        OutputController outputController = OutputController.getInstance();
        FakeOutput fakeOutput = new FakeOutput();
        outputController.setOutputBehavior(fakeOutput);
        outputController = OutputController.getInstance();
        OutputBehavior outputBehavior = outputController.getOutputBehavior();
        assertEquals(outputBehavior.getLastOutput(), null);
        outputBehavior.println("hello world");
        assertEquals(outputBehavior.getLastOutput(), "hello world");
        outputBehavior.print(1234);
        assertEquals(outputBehavior.getLastOutput(), "1234");
    }
}
