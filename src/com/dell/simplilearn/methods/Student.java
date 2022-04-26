package com.dell.simplilearn.methods;

public class Student {
    int rollnum;
    String name;
    static String college = "MGT";

    static void change() {
        college = "MGTIT";
    }

    Student(int r, String n) {
        rollnum = r;
        name = n;
    }

    void Display() {
        System.out.println("rollnum = " + rollnum + ", name = " + name + ", college = " + college);
    }


}
