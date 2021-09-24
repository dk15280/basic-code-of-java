package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "abcdef";
        String b = "";
        for(int i=a.length()-1;i>=0;i--)
        {
            b = b + a.charAt(i);

        }
        System.out.println(b);
    }
}
