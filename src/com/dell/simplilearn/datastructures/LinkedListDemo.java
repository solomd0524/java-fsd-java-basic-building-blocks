package com.dell.simplilearn.datastructures;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        Long numberOne = 2L;
        Long numberTwo = 7L;
        Long numberThree = 11L;
        Long numberFour = 15L;

        LinkedList<Long> longLinkedList = new LinkedList<>();

        longLinkedList.add(numberOne);
        longLinkedList.add(numberTwo);
        longLinkedList.add(numberThree);
        longLinkedList.add(numberFour);

        for (Long j : longLinkedList) {
            System.out.println("num = " + j);
        }

        for (int i = 0; i < longLinkedList.size(); i++) {
            longLinkedList.removeLast();
        }

        for (Long i : longLinkedList) {
            System.out.println("after removing = " + i);
        }
    }


}


