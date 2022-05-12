package com.dell.simplilearn.access_modifiers;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello world");
        short myShort = 100;
        double myDouble = 200;
        int myInt = 300;

        shortToLong(myShort);
        doubleToLong(myDouble);
        shortToFloat(myShort);
        intToLong(myInt);
        doubleToInt(myInt);
    }

    public static void shortToLong(short myShort) {
        long myLong = 300;
        System.out.println("shortToLong");
        System.out.println("myLong before = " + myLong);

        myLong = myShort;
        System.out.println("myLong after =  " + myLong);
    }

    public static void doubleToLong(double myDouble) {
        System.out.println("doubleToLong");
        System.out.println("myDouble before = " + myDouble);

        long myLong = 400;
        myDouble = myLong;
        System.out.println("myDouble after = " + myDouble);
    }

    public static void shortToFloat(short myShort) {

        System.out.println("floatToShort");
        System.out.println("myShort before = " + myShort);

        float myFloat = 500;
        myShort = (short) myFloat;
        System.out.println("myShort after = " + myShort);
    }

    public static void intToLong(int myInt) {

        System.out.println("intToLong");
        System.out.println("myInt before = " + myInt);

        long myLong = 600;
        myInt = (int) myLong;
        System.out.println("myInt after = " + myInt);
    }

    public static void doubleToInt(double myDouble) {

        System.out.println("doubleToInt");
        System.out.println("myDouble before = " + myDouble);

        int myInt = 700;
        myDouble = myInt;
        System.out.println("myInt after = " + myDouble);
    }
}

