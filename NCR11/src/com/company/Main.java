package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit : ");
        int limit = scanner.nextInt();
        for(int i=1;i<=limit;i++)
        {
            int sum = 0;
            int temp = i;
            while (i!=0)
            {
                int rem = i%10;
                int fact = 1;
                for (int j=1;j<=rem;j++)
                {
                    fact = fact*j;
                }
                sum = sum+fact;
                i = i/10;
            }
            if(temp == sum )
            {
                System.out.println(temp + "is Strong numbeer ");
            }
        }
    }
}
