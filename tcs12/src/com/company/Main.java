package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter char : ");
        char ch = sc.next().charAt(0);
       /* if(ch >= 'A' && ch<= 'Z')
        {
            ch = 'a';
        }*/
        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println(" Vovel ");
        }
        else
        {
            System.out.println(" Consonent ");
        }
    }
}
