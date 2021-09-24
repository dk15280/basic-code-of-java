package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int twoD[][][] = new int[3][4][5];
        int i, j, k;
        for (i = 0; i < 3; i++)

            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    twoD[i][j][k] = i * j * k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)

                    System.out.println(twoD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }

        }
    }



