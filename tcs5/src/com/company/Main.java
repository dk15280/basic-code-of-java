package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter base and height :");
        int b = sc.nextInt();
        int h = sc.nextInt();
        float arae = (b*h/2);
        System.out.println(arae);
    }
}
