package com.dell.simplilearn.datastructures;

public class ArrayDemo {
    public static void main(String[] args) {

        //single dimensional
        int[] intArray = new int[3];
        intArray[0] = 30;
        intArray[1] = 40;
        intArray[2] = 50;

        System.out.println("Single Dimensional intArray output");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println(" ");

        String[] myStringArray = new String[]{"Debora", "Charlene", "David", "Tommy"};

        System.out.println("Single Dimensional : myStringArray");
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
        System.out.println(" ");

        //multi dimensional
        System.out.println("MultiDimensional");
        int[][] multiDemArray = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {
                System.out.println(multiDemArray[i][j]);
            }
            System.out.println(" ");
        }

    }
}
