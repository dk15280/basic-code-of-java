package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of element:");
        int a = scanner.nextInt();
        int[]b=new int[a];
        for(int i=0;i<b.length;i++)
        {
            b[i] = scanner.nextInt();
        }
        for(int ele:b)
        {
            System.out.println("Elements are:"+ele);
        }
    }
}
