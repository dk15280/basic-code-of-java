package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuffer abc = new StringBuffer("Dhananjay");
        abc.append(" Kumar ");
        abc.replace(2,5,"bbbb");
        System.out.println(abc);
    }
}
