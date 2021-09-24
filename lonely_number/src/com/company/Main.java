package com.company;
import java.util.*;
class Main {

    public static void main(String[] args) {

        int decimal_value = 0;
        int base = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Binary value in 0 & 1 format: ");
        int b = sc.nextInt();
        while(b>0){

            int rem = b%10;
            decimal_value = decimal_value + rem*base;
            b = b/10;
            base = base*2;
        }
        System.out.println("Equivalent decimal velue : " +decimal_value);
       }
    }

