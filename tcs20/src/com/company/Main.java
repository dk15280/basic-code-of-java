package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String final_String = str1+""+str2;
        String str3 = final_String.toUpperCase();
        System.out.println(str3);
        String str4 = str3.toLowerCase();
        System.out.println(str4);
        String str5 = final_String.contains();
    }
}
