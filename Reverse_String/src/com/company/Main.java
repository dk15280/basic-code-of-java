package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println(s);
        System.out.println(rev);

    }
}
