package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter year :");
        int year = sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            System.out.println(year+" is lip year ");
        }
        else {
            System.out.println(year+" is not lip year ");
        }
    }
}
