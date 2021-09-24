package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int d = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for(int i =0;i<d;i++)
        {
            System.out.println(a);
            c= a+b;
            a = b;
            b = c;

        }

    }
}
