package com.dell.simplilearn.search_email_ids;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailSearch {


    public static void main(String[] args) {

        ArrayList<String> emailIdList = new ArrayList<>();
        emailIdList.add("davidsolomon@gmail.com");
        emailIdList.add("beckysolomon@gmail.com");
        emailIdList.add("mattsolomon@gmail.com");
        emailIdList.add("noahsolomon@gmail.com");
        emailIdList.add("annasolomon@gmail.com");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email id to search: \n");
        String emailIdToCheck = sc.nextLine();

        if (emailValidator(emailIdToCheck)) {

            boolean doesExist = true;

            for (int i = 0; i < emailIdList.size(); i++) {
                int index = emailIdList.indexOf(emailIdToCheck);
                if (index == -1) {
                    doesExist = false;
                }
            }

            if (doesExist) {
                System.out.println(emailIdToCheck + " does exist in the existing email list\n");
            } else {
                System.out.println(emailIdToCheck + " does not exist in the existing email list\n");
            }


        } else {
            System.out.println("\nemail is not valid");
        }


    }

    public static boolean emailValidator(String emailId) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean result = emailId.matches(regex);
        if (result) {
            return true;
        } else {
            return false;
        }
    }
}

