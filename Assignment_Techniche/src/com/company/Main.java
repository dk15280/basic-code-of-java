package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] num = new String[n];
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                 if(num[i].equals(num[i]))
                     System.out.println("Duplicate number" + num[j]);
            }
        }

    }
}
