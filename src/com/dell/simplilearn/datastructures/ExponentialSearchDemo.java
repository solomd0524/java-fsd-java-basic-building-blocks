package com.dell.simplilearn.datastructures;

import java.util.Arrays;

public class ExponentialSearchDemo {
    public static void main(String[] args) {
        int[] arr = {6, 12, 18, 24, 32};
        int length = arr.length;
        int value = 18;

        System.out.println("length = " + length);
        System.out.println("value = " + value);
        int outcome = exponentialSearch(arr, length, value);

        if (outcome < 0) {

            System.out.println("Element is not present in the array");

        } else {

            System.out.println("Element is  present in the array at index :" + outcome);
        }
    }

    public static int exponentialSearch(int[] arr, int length, int value) {
        if (arr[0] == value) {
            return 0;
        }
        int i = 1;
        while (i < length && arr[i] <= value) {
            System.out.println("i = " + i);

            i = i * 2;
        }

        int binarySearcher = Arrays.binarySearch(arr, i / 2, Math.min(i, length), value);
        System.out.println("binary searcher = " + binarySearcher);

        return binarySearcher;
    }
}
