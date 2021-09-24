package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        int[]a={10,20,30,40,50};
        System.out.println("Enter key:");
        int key = scanner.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key) {
                System.out.println("Found at location: " + i);
                found = true;
                break;
            }

        }
        if(!found)
        {
            System.out.println("Element not found");
        }
    }
}
