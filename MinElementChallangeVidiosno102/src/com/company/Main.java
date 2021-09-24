package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMIN = findMin(returnedArray);
        System.out.println(" Min :" +returnedMIN);

    }
    public static int[] readIntegers(int count)
    {
        int[] array = new int[count];
        for(int i=0;i<array.length;i++)
        {
            System.out.println(" Entered a Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
    public static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            int value = array[i];
            if(value < min)
            {
                min=value;
            }
        }
        return min;
    }

}
