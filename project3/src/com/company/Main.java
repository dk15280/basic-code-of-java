package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
