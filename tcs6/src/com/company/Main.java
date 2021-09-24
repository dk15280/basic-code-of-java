package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num>0)
        {
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(temp == rev)
        {
            System.out.println(temp +" is pelindrome number ");
        }
        else
        {
            System.out.println(temp +" is not pelindrome number ");
        }
    }
}
