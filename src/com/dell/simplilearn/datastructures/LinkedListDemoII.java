package com.dell.simplilearn.datastructures;

public class LinkedListDemoII {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

  /*  You are given two non-empty linked lists representing two non-negative integers.
      The digits are stored in reverse order, and each of their nodes contains a single digit.
      Add the two numbers and return the sum as a linked list.
      You may assume the two numbers do not contain any leading zero, except the number 0 itself. */

  /*  Input: l1 = [2,4,3], l2 = [5,6,4]
      Output: [7,0,8]
      Explanation: 342 + 465 = 807.*/

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;

        if (l1 == null && l2 == null) {
            return new ListNode(0);
        }

        int carry = 0;

        while (l1 != null || l2 != null) { // stattement ? expression_true : expression_false
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;


            ListNode currentSum = new ListNode();

            currentSum.val = (sum % 10);

            carry = sum / 10;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            result.next = currentSum;

            result = result.next;
        }

        if (carry != 0) {
            result.next = new ListNode(carry);
        }

        return head.next;
    }

  /*  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

    public boolean isValid(String s) {

    }

    Input: s = "()[]{}"
    Output: true

    Input: s = "(]"
    Output: false*/


}
