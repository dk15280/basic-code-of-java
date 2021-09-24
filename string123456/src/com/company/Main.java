package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] a = {6,7,4,8,3,1,2};
         int n = a.length;
        int total = (n+1)*(n+2)/2;
        for(int i=0;i<n;i++)
        {
          total = total - a[i];
        }
        System.out.println(total);
    }
}


