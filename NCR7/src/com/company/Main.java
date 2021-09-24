package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
