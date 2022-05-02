package com.dell.simplilearn.methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Hello {

    public static void main(String[] args) {

        //Class
        System.out.println("hello");
        Student.change();

        Student s1 = new Student(111, "Paul");
        Student s2 = new Student(112, "Dave");

        Student.college = "VJT1";
        s1.Display();
        s2.Display();

        Employee e1 = new Employee("David Solomon", 1000000F);
        e1.display();

        Shape s = new Rectangle();
        s.draw();

        Shape t = new Triangle();
        t.draw();

        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Error : " + e.getMessage());
        }

        String sa = "Hello";
        String sb = "Hello";
        String sc = "Meklo";
        String sd = "Hemlo";
        String se = "Flag";

        System.out.println(sa.compareTo(sb));
        System.out.println(sb.compareTo(sc));
        System.out.println(sa.compareTo(sd));
        System.out.println(sa.compareTo(se));

        Child child1 = new Child(3);
        Child child2 = new Child(2);
        Child child3 = new Child(7);
        Child child4 = new Child(10);
        Child child5 = new Child(6);
        Child child6 = new Child(9);
        Child child7 = new Child(8);

        List<Child> childs = Arrays.asList(child1, child2, child3, child4, child5, child6, child7);
        List<Child> filtered = ChildPredicate.filterChilds(childs, ChildPredicate.filterByAge(8));
        for (Child child : filtered) {
            System.out.println("filter by age : age = " + child.getAge());
        }

        // threads
        HelloRunner r = new HelloRunner();
        Thread th = new Thread(r);
        th.start();

        Hello m2 = new Hello();
        m2.operation(Hello::multiply, 22, 22);
        m2.operation(Hello::add, 130, 25);
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public void operation(IntBinaryOperator operator, int a, int b) {
        System.out.println(operator.applyAsInt(a, b));
    }
}
