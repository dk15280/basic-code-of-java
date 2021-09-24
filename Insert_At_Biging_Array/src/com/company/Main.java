package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        // int n = arr.length;
        System.out.println("Enter elements of Array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(" ");
        System.out.println("Enter element you want to insert: ");
        int a = sc.nextInt();
        System.out.println(" Enter position :");
        int p = sc.nextInt();

        if(p<0 || p>=n+1)
        {
            System.out.println("Invalid position");

        }
        else {


            for(int i=n-1;i>=0;i--)
            {
                arr[i+1] = arr[i];
            }
            arr[p-1] = a;
            //n++;
        }
        System.out.println("Array elements are:");
        for(int i=0;i<=n;i++)
        {
            System.out.print(" " + arr[i]);
        }

    }
}
