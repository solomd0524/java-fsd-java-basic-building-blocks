package com.dell.simplilearn.regular_expression_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {


    public static void main(String[] args) {

        System.out.println("  ");
        System.out.println("Pattern matching 1 ");
        String patternToCheck1 = "Simplilearn Java is fun";
        String stringMatcher1 = "Simplilearn Java is fun";
        checkIfPatternMatches(patternToCheck1, stringMatcher1);
        System.out.println("  ");

        System.out.println("Pattern matching 2 ");
        String patternToCheck2 = "Simplilearn Java is fun";
        String stringMatcher2 = "Simpli Java is fun";
        checkIfPatternMatches(patternToCheck2, stringMatcher2);
        System.out.println("  ");

        System.out.println("Pattern Check  sub string ");
        String pattern = "[a-z]+";
        String check = "Regular Expressions";
        Pattern p = Pattern.compile(pattern);
        Matcher c = p.matcher(check);

        while (c.find())
            System.out.println(check.substring(c.start(), c.end()));

        System.out.println("  ");
        System.out.println("Pattern matching whole pattern versus incomplete pattern ");
        System.out.println(Pattern.matches("david solomon", "david solomon"));
        System.out.println(Pattern.matches("dav solo", "david solomon"));
        System.out.println(Pattern.matches("david solomon", "dav sol"));


        System.out.println("  ");
        System.out.println("messing around with expressions ");
        System.out.println(Pattern.matches("david solomon", "david solomon"));
        System.out.println(Pattern.matches("dav solo", "david solomon"));
        System.out.println(Pattern.matches("david solomon", "dav sol"));

        System.out.println("Pattern Check numbers ");
        String pattern1 = "[0-9]+";
        String check1 = "10010001";
        Pattern p1 = Pattern.compile(pattern1);
        checkIfPatternMatches(pattern1, check1);

    }

    public static void checkIfPatternMatches(String patternToCheck, String stringMatcher) {

        int patternToUse = Pattern.CASE_INSENSITIVE;
        if (doesPatternMatch(patternToCheck, patternToUse, stringMatcher)) {
            System.out.println("pattern " + patternToCheck + " does match " + stringMatcher);
        } else {
            System.out.println("no match found ");
        }
    }

    private static boolean doesPatternMatch(String patternToCheck, int patternToUse, String stringMatcher) {
        Pattern pattern = Pattern.compile(patternToCheck, patternToUse);
        Matcher matcher = pattern.matcher(stringMatcher);
        return matcher.find();
    }

}
