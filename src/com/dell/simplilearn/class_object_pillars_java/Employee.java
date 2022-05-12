package com.dell.simplilearn.class_object_pillars_java;

public class Employee extends Person {

    float salary;

    public Employee(String name, Float salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }


    public String toString() {
        return ("Hi my name is" + this.getName() + "and I make " + this.getSalary() + " / year");
    }

    public String toString2() {
        return ("Hi my name is" + this.getName() + "and I'm unemployeed !");
    }

    public static void main(String[] args) {

        String name = " David Solomon ";
        float salary = 1000000F;

        Employee emp1 = new Employee(name, salary);
        System.out.println(emp1.toString());

        Employee emp2 = new Employee(name, salary);
        System.out.println(emp2.toString2());

        Employee emp3 = new Employee(name);
        System.out.println(emp3.toString());

    }

}


