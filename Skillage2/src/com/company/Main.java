package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.println(" Enter String :" );
        String str = sc.next();
        // it convert String to upper case
        String str1 = str.toUpperCase();
        System.out.println(" Upper case string : " + str1);


        // convert to lower case
        String str2 = str1.toLowerCase();

        System.out.println(" Lower case string : " + str2);

    }
}
/*

      OUTPUT:

     Enter String :
dhananjay
 Upper case string : DHANANJAY
 Lower case string : dhananjay

 */
