package com.dell.simplilearn.methods;

public class Employee extends Person {

    float salary;

    Employee(String name, Float salary) {
        super(name);
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee name = " + name + ", salary = " + salary);
    }

}
