package com.dell.simplilearn.stringdemo;

public class StringDemo {

    public static void main(String[] args) {

        String string1 = "Hello From Dave";
        String string2 = "Hello From Debora";
        String string3 = "Hello From Dave";
        String string4 = "";
        String string5 = "Hello From Bob";
        //length
        System.out.println("--length----------------------------");
        System.out.println(" ");
        System.out.println("string1 length =" + string1.length());
        System.out.println("string2 length =" + string2.length());
        System.out.println("string3 length =" + string3.length());
        System.out.println(" ");
        //equals
        System.out.println("--equals----------------------------");
        System.out.println(" ");
        if (string1.equals(string2)) {
            System.out.println("string1 equals string2");
        } else {
            System.out.println("string1 does not equal string2");
        }

        if (string1.equals(string3)) {
            System.out.println("string1 equals string3");
        } else {
            System.out.println("string1 does not equal string3");
        }
        System.out.println(" ");
        //subString
        System.out.println("--subString----------------------------");
        System.out.println(" ");
        System.out.println("String1 subString start 7 go to 10 (From) = " + string1.substring(6, 11));
        System.out.println("String1 subString start 7 go to 10  (Dave) = " + string1.substring(11, 15));
        System.out.println(" ");

        //Replace
        System.out.println("--replace----------------------------");
        System.out.println(" ");
        System.out.println("Hello from Dave becomes " + string1.replace("D", "C"));
        System.out.println(" ");

        //Compare
        System.out.println("--compare----------------------------");
        System.out.println(" ");
        System.out.println("string1 compares to String2 = " + string1.compareTo(string2));
        System.out.println("string1 compares to String3 = " + string1.compareTo(string3));
        System.out.println(" ");

        //isEmpty
        System.out.println("--isEmpty----------------------------");
        System.out.println(" ");
        System.out.println("string1 is empty  = " + string1.isEmpty());
        System.out.println("string4 is empty  = " + string4.isEmpty());
        System.out.println(" ");

        System.out.println("--Creating StringBuffer-----------------------");
        //Creating StringBuffer and append method
        System.out.println(" ");
        StringBuffer s = new StringBuffer(string1);
        s.append(" and " + string2);
        System.out.println(s);
        System.out.println(" ");

        System.out.println("--Insert-----------------------");
        //insert method
        System.out.println(" ");
        s.insert(0, string5 + " and ");
        System.out.println(s);
        System.out.println(" ");

        System.out.println("--Replace-----------------------");
        //replace method
        System.out.println(" ");
        StringBuffer sb = new StringBuffer(string1);
        sb.replace(0, 5, "Goodbye");
        System.out.println(sb);
        System.out.println(" ");

        System.out.println("--Delete-----------------------");
        //delete method
        System.out.println(" ");
        sb.delete(0, 4);
        System.out.println(sb);
        System.out.println(" ");

        System.out.println("--String Builder-----------------------");
        //StringBuilder
        System.out.println(" ");
        StringBuilder sb1 = new StringBuilder(string2);
        sb1.append(" and " + string5);
        System.out.println(sb1);
        System.out.println(sb1.delete(0, 6));
        System.out.println(sb1.insert(0, "Welcome "));
        System.out.println(sb1.reverse());

        //conversion
        System.out.println(" ");
        System.out.println("--Strings to StringBuffer and StringBuilder-----------");
        System.out.println(" ");
        String str = string1;
        System.out.println("Reverse");
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
        System.out.println(" ");
        System.out.println("Append");
        StringBuilder sbl = new StringBuilder(str);
        sbl.append(" and " + string2);
        System.out.println(sbl);

    }
}
