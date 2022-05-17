package com.dell.simplilearn.datastructures;

public class SelectionSortDemo {
    public static void main(String[] args) {

        int[] arr = {9, 6, 3, 1, 2, 4, 5};
        int length = arr.length;
        selectionSort(arr);
        System.out.println("The sorted elements are:");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] arr) {
        System.out.println("length = " + arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("i = " + i);
            System.out.println("arr contents = " + arr[i]);
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("j = " + j);
                if (arr[j] < arr[index]) {

                    index = j;
                    System.out.println("index = " + index);
                }

            }
            int smallNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallNumber;
        }
    }
}
