package com.dell.simplilearn.datastructures;

import java.util.Stack;

public class StringValidDemo {

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "(";
        String s1Valid = "Hello";
        String s2 = ")";
        String s2Valid = "Goodbye";
        String s3 = "}";
        String s4 = "{";
        String s5 = "]";
        String s6 = "[";

        boolean s1IsValid = s.isValid(s2Valid);
        System.out.println("string is valid = " + s1IsValid);
    }

    public static class Solution {
        public boolean isValid(String s) {
            int length = s.length();
            char[] array = s.toCharArray();
            if (length == 0) return true;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < length; i++) {
                if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                    stack.push(array[i]);
                }
                if (array[i] == ')' || array[i] == '}' || array[i] == ']') {
                    if (stack.isEmpty()) return false;
                    char temp = stack.pop();
                    if ((temp == '(' && array[i] == ')') || (temp == '{' && array[i] == '}') || (temp == '[' && array[i] == ']')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
            if (!stack.isEmpty()) return false;
            return true;
        }
    }
}
