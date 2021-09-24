package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Dhananjay Arvind Dharanveer Gunjan Sunita Kajal";
        //String rev = "";
        String[] a = s.split(" ");
        for(int i=a.length-1;i>=0;i--) {
            System.out.print(" " +a[i]);

        }
        System.out.println(" ");
    }
}
