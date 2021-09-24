package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++)
        {
              if(isPrime(i))
                  System.out.println(i);
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return  true;
    }
}
