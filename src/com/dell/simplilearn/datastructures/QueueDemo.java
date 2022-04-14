package com.dell.simplilearn.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        ArrayList<String> exclusionList = new ArrayList(Arrays.asList(11L, 15L));

        System.out.println("LinkedList Queue of Longs---------------");
        Queue<Long> queueOfLongs = new LinkedList<>();
        queueOfLongs.add(7L);
        queueOfLongs.add(11L);
        queueOfLongs.add(2L);
        queueOfLongs.add(15L);

        for (Long i : queueOfLongs) {
            System.out.println(i);
        }

        System.out.println("Que of longs after remove ---------------");

        queueOfLongs.removeIf(v -> exclusionList.contains(v));

        for (Long i : queueOfLongs) {
            System.out.println(i);
        }

        System.out.println("Priority Queue of Longs---------------");
        Queue<Long> priorityQueueOfLongs = new PriorityQueue<>();
        priorityQueueOfLongs.add(15L);
        priorityQueueOfLongs.add(2L);
        priorityQueueOfLongs.add(11L);
        priorityQueueOfLongs.add(7L);

        for (Long i : priorityQueueOfLongs) {
            System.out.println(i);
        }


        priorityQueueOfLongs.removeIf(p -> exclusionList.contains(p));

        System.out.println("Priority Queue of Longs after removal--------------");

        for (Long i : priorityQueueOfLongs) {
            System.out.println(i);
        }

    }


}
