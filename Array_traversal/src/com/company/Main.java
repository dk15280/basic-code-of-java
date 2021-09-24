package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of Array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" ");
    }
}
