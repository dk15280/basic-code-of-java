package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "HELLO";
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            for(int j = i;j<arr.length;j++)
            {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
    }
}
