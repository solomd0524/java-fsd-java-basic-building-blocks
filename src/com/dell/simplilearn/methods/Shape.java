package com.dell.simplilearn.methods;

public abstract class Shape {
    abstract void draw();
}

class Triangle extends Shape {

    void draw() {
        System.out.println("drawing triangle");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("drawing rectangle");
    }
}
