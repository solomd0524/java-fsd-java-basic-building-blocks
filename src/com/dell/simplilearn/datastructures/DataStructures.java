package com.dell.simplilearn.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class DataStructures {

  /*  Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
  public static void main(String[] args) {
    System.out.println("removingFromArrayList");
    removingFromArrayList();
    System.out.println("removeFromLinkedList");
    removeFromLinkedList();
  }

  public static void removingFromArrayList() {
    ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(2L, 7L, 11L, 15L));

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));

    //Add element at 1 index
    list.remove(list.get(2));
    list.remove(list.get(2));
    System.out.println(list);
  }

  public static void removeFromLinkedList() {
    LinkedList llist = new LinkedList();

    llist.push(2L);
    llist.push(7L);
    llist.push(11L);
    llist.push(15L);

    System.out.println("LinkedList before removal:");
    for (int i = 0; i < llist.size(); i++) {
      System.out.println(llist.get(i));
    }

    llist.remove(llist.get(0));
    llist.remove(llist.get(0));

    System.out.println("LinkedList after removal");
    for (int i = 0; i < llist.size(); i++) {
      System.out.println(llist.get(i));
    }

  }
}
