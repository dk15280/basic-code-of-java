package com.company;



import java.util.Scanner;

public class Main {
       private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        String j = scanner.nextLine();
        String s = scanner.nextLine();

        scanner.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}



