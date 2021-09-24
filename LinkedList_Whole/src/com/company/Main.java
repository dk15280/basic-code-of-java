package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {4,2,8,6,3,7,9};
        int b =0 , c = a.length-1;
        int mid = (b + c)/2;
        Arrays.sort(a);
        int key = 3;
        while(b<=c)
        {
            if(a[mid] < key)
                mid = mid +1;
            else if(a[mid] == key) {
                System.out.println("element found at" + mid);
                break;
            }
            else
                mid = mid-1;

            mid = (b+c)/2;
        }
       if(b>c)
           System.out.println("element not found");
    }
}
