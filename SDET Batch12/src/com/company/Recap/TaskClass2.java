package com.company.Recap;

public class TaskClass2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric characters are there in the String.
        String s="23818244@i3okjfljmlfg";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9]", "").length());


    }
}
