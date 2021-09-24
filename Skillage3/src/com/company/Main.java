package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        // Enter number
        System.out.println(" Enter value of n : ");
        int n = sc.nextInt();
        for(int i = 2;i<n;i++)
        {
            if(n%i)
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i == 0)
            {
                flag = 1;
                break;
            }

        }
        if(flag == 0)
        {
            System.out.println(" Prime ");
        }
    }
}
