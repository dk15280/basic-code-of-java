package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 2;
        int b = a++;
        int c = a++ + ++b - ++a + b++;
        System.out.println(c);
    }
}
