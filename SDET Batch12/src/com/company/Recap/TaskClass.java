package com.company.Recap;

public class TaskClass {
    public static void main(String[] args) {
        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String s="This is a sentence";
        String newStr=s.replace(" ", "");
        System.out.println(newStr);
    }
}
