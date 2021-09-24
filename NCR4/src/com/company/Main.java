package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int digits = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scanner.nextInt();
        while (a!=0)
        {
            a = a/10;
            digits++;

        }
        System.out.println(digits);
    }
}
