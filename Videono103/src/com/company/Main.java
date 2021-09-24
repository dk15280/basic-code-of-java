package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(" Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println(" Reverse array = " +Arrays.toString(array));

    }
    private static void reverse(int[] array)
    {
       int Maxindex = array.length-1;
       int halfindex = Maxindex/2+Maxindex%2;
       for(int i=0;i<halfindex;i++)
       {
           int temp = array[i];
           array[i] = array[Maxindex-i];
           array[Maxindex-i]=temp;
       }
    }
}
