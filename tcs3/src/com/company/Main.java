package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float pi = (float) 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Radius of a circle :");
        float r = sc.nextFloat();

        float area = pi*r*r;
        System.out.println(" Area of a circle = "+area);
    }
}
