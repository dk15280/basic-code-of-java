package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag =0;
        if(n<=1)
            System.out.println(n + " is not prime");
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) {
                System.out.println(n + " is not prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println(n + " is prime");
        }
    }
}
