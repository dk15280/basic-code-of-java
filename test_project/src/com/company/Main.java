package com.company;

import java.util.Scanner;

public class Main {

    public static int abc(int a,int b)
    {
        if(a == b || a <= b)
        {
            return 0;
        }

        if(a >= b)
        {
            return 1;
        }

        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(abc(a,b));
    }
}
