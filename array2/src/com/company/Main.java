package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myInteger = getInteger(5);
        int[] sorted = sortInteger(myInteger);
        PrintArray(sorted);
    }
    public static int[] getInteger(int number)
    {
        System.out.println(" Enetr " + number +" Integer value. \r");
        int[] value = new int[number];
        for (int i= 0;i<value.length;i++)
        {
            value[i] = scanner.nextInt();
        }
        return value;
    }
    public static void PrintArray(int[] array)
    {
        for (int i = 0;i<array.length;i++)
        {
            System.out.println(" Element " +i  +",value is " +array[i]);
        }
    }
    public static int[] sortInteger(int[] array)
    {
        int[] newarray = new int[array.length];
        for (int i=0;i<array.length;i++)
        {
            newarray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while (flag)
        {
            flag = false;
            for (int i=0;i<newarray.length-1;i++)
            {
                if (newarray[i]<newarray[i+1])
                {
                    temp = newarray[i];
                    newarray[i] = newarray[i+1];
                    newarray[i+1] = temp;
                    flag=true;
                }
            }
        }
            return newarray;
    }
}
