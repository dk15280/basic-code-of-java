package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int binary_number;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter decimal number : ");
        int d = sc.nextInt();
        while (d>0)
        {
            int rem = d%2;
            int binary_number = rem;
            d = d/2;
            System.out.print( binary_number);

        }
    }
}
