package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int IntegerNumber = 10;
        int OnotherIntegerNumber = IntegerNumber;
        System.out.println(" IntegerNumber = " +IntegerNumber );
        System.out.println(" OnotherIntegerNumber = " + OnotherIntegerNumber );
        OnotherIntegerNumber++;
        System.out.println(" IntegerNumber = " +IntegerNumber );
        System.out.println(" OnotherIntegerNumber = " + OnotherIntegerNumber );
        int[] abc = new int[5];
        int[] ab = abc;
        System.out.println(" IntegerNumber = " + Arrays.toString(abc) );
        System.out.println(" OnotherIntegerNumber = " + Arrays.toString(ab) );

        ab[0] = 1;
        System.out.println(" After change IntegerNumber = " + Arrays.toString(abc) );
        System.out.println(" After change OnotherIntegerNumber = " + Arrays.toString(ab) );
        ab = new int[] {4,5,6,7,8};
        modifyArray(abc);
        System.out.println(" After modify IntegerNumber = " + Arrays.toString(abc) );
        System.out.println(" After modify OnotherIntegerNumber = " + Arrays.toString(ab) );

    }
    private static void modifyArray(int[] Array)
    {
        Array[0] = 2;
        Array = new int[] {1,2,3,4,5};
    }
}
