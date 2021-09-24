package com.company;

//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void merge(int[]a,int l,int m,int r)
    {
        
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element:");
        int n = sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
    }
}
