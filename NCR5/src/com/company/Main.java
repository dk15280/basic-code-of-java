package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scanner.nextInt();
        while (a!=0)
        {
            int rem = a%10;
            sum = sum+rem;
            a = a/10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
