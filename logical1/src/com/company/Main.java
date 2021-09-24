package com.company;

//import java.util.Scanner;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
     int m = sc.nextInt();
     int n = sc.nextInt();
     sumOfPrimaryNumber(m,n);

    }

    public static int sumOfPrimaryNumber(int m,int n)
    {
        int sum = 0;
        boolean count = true;
       for(int i=m;i<=n;i++)
       {
           if(i<=1)
           {
               count = false;
           }
               for(int j=2;j<=Math.sqrt(i);j++)
               {
                   if(i%j == 0)
                   {
                       count = false;
                   }
                   else{
                       count = true;
                       sum = sum +i;
                   }
               }
       }
       return  sum;
    }

}
