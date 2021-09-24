package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int k=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               int l = k++%2;
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
