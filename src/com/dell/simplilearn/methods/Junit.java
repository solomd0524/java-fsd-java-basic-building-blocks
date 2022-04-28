package com.dell.simplilearn.methods;

public class Junit {
    private String message;

    public Junit(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println("message = " + message);
        return message;
    }

}
