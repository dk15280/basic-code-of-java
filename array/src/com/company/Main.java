package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

     /* int[] Myintarray = new int[25];
        for(int i =0;i<Myintarray.length;i++){
            Myintarray[i] = i*10;
        }
       PrintArray(Myintarray);
    }
    public static void PrintArray(int[] array)
    {
        for (int i =0;i< array.length;i++)
        {
            System.out.println("Element " +i + " value is " + array[i]);
        }

      */
      int[] myIntegers = getIntegers(5);
      for (int i= 0;i<myIntegers.length;i++)
      {
          System.out.println("Element " + i + ", Entered value is "  + myIntegers[i]);
      }
        System.out.println("Average is " +getAverage(myIntegers));

    }
    public static int[] getIntegers(int number)
    {
        System.out.println(" Enter " + number +" Integer value.\r");
        int[] value = new int[number];
        for (int i =0;i<value.length;i++)
        {
            value[i] = scanner.nextInt();
        }
        return value;
    }
    public static double getAverage(int[] array)
    {
        int sum = 0;
        for (int i = 0;i<array.length;i++)
        {
           sum += array[i];
        }
        return (double) sum/ (double) array.length;


    }
}
