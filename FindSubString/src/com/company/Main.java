package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
       Scanner sc = new Scanner(System.in);
        System.out.println(" Enter two Strings: ");
       String s1 = sc.nextLine();
       String s2 = sc.nextLine();

       // Find two length of two String
        int l1 = s1.length();
        int l2 = s2.length();
        System.out.println(l1 + " " + l2 );
        // Concatinate two Strings
         String s3 = s1.concat(s2);
        System.out.println(s3);

        // Convert String in Upper case
        s1 = s1.toUpperCase();
        System.out.println(s1);


    }
}
