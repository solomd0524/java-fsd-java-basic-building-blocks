package com.dell.simplilearn.diamond_problem;

public interface DemoInterface {

    default void display() {
        System.out.println("The dispaly() method invoked");
    }
}
