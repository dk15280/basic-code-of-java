package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter String : ");
        String str = sc.next();
        int length = str.length();
        int flag = 0;
        int i;
        for(i=0;i<length/2;i++)
        {
            if(str.charAt(i) == str.charAt(length-i-1))
            {
                   flag++;
            }
        }
        if(flag == i)
        {
            System.out.println(" String is pelindromic ");
        }
        else {
            System.out.println(" String is not pelindromic ");
        }
    }
}
