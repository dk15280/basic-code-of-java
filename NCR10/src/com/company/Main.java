package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //perfect number
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter number: ");
        //int num = scanner.nextInt();

        int n = 1;
        for (n = 1; n <= 1000; n++) {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                }

            }
            if (sum == n) {
                System.out.println("perfect");

            }

        }

    }
}

