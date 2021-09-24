package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int rev = 0;
        int temp = num;
        while (num!=0)
        {
            int rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        if(temp == rev)
        {
            System.out.println("Number is pelindromic");
        }
        else {
            System.out.println("Number is not pelindromic");
        }
    }
}
