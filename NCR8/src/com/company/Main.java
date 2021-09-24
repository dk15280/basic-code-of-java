package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int temp = n;
        while (n != 0)
        {
            int fact = 1;
            int rem = n%10;
            for(int i=1;i<=rem;i++)
            {
                fact = fact*i;
            }
            sum = sum+fact;
            n = n/10;
        }
       if(temp == sum)
       {
           System.out.println("Strong");
       }
       else
       {
           System.out.println(" Not Strong");
       }
    }
}
