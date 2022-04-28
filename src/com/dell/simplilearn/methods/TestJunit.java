package com.dell.simplilearn.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    String message = "Hello World";
    Junit junit = new Junit("Hello World");

    @Test
    public void testPrintMessage() {
        assertEquals(message, junit.printMessage());
    }

}
