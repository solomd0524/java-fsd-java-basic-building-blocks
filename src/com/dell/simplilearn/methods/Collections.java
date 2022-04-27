package com.dell.simplilearn.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
        List<String> obj = new ArrayList<String>();
        obj.add("Ajit");
        obj.add("Sam");
        obj.add("Robert");
        obj.add("Steve");
        obj.add("Soumya");
        System.out.println("has the following elements " + obj);
        obj.add("Rahul");
        obj.add("Justin");
        System.out.println("now has following elements" + obj);

        HashMap<Integer, String> hmap = new HashMap<>();
        Iterator<Map.Entry<Integer, String>> it = hmap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> e = it.next();
            System.out.println("key is : " + e.getKey() + " and value = " + e.getValue());
        }

        String var = hmap.get(2);
        System.out.println("value at index 2 = " + var);


    }
}
