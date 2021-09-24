package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int j = 1;
        int octal_number = 0;
        System.out.println(" Enter binary number: ");
        int b = sc.nextInt();
        while (b!=0)
        {
            int rem = b%8;
            octal_number = octal_number + rem*j;
            j= j*2;
            b = b/8;
        }
        System.out.println("Octal number :" +octal_number);
    }
}
