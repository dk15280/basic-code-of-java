package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int bin = 0;
        int base = 1;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number : ");
        int num = sc.nextInt();

        while (num>0)
        {
            int rem = num%2;
            if(rem == 1){
                count++;
            }
            bin = bin + rem*base;
            num = num/2;
            base = base*10;
        }
        System.out.println("Required binary number : " + bin);
        System.out.println("Number of 1 :" +count);

    }
}
