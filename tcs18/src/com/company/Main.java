package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
            //System.out.println(a[i][j] + " ");
        }
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j] = sc.nextInt();
            }
            //System.out.println(b[i][j] + " ");
        }
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j] =0;
                for(int k=0;k<n;k++)
                {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


    }
}
