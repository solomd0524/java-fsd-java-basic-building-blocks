package com.dell.simplilearn.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {
    public static void main(String args[]) throws FileNotFoundException, IOException {

        String inputString = "Once upon a time in the Land of oz";
        String inputAppend = " with Dorothy and Scarecrow and Lion and Tin man";
        fileWrite(inputString);
        new readFile();
        fileAppend(inputAppend);
        new readFile();
        String inputString2 = "Make way for the Ducklings";
        fileWrite(inputString2);
        new readFile();
    }

    public static void fileWrite(String input) {

        try {

            String source = input;
            File f = new File("fileDemo.txt");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            FileWriter f0 = new FileWriter(f, false);
            f.delete();
            f.createNewFile();
            f0.write(source);
            f0.close();

        } catch (Exception e) {

            System.out.println("Error : ");
            e.printStackTrace();

        }
    }

    public static void fileAppend(String input) {
        String source = input;
        File f = new File("fileDemo.txt");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileWriter f0 = new FileWriter(f, true);
            f0.append(source);
            f0.close();

        } catch (Exception e) {
            System.out.println("Error : ");
            e.printStackTrace();
        }
    }

    static class readFile {
        public static String str = "";

        public readFile() {

            try {
                File f5 = new File("fileDemo.txt");
                if (!f5.exists())
                    f5.createNewFile();
                FileReader fl = new FileReader(f5);
                BufferedReader bf = new BufferedReader(fl);

                while ((str = bf.readLine()) != null) {
                    System.out.println(str);
                }
                fl.close();
            } catch (Exception e) {
                System.out.println("Error : ");
                e.printStackTrace();
            }
        }
    }
}



