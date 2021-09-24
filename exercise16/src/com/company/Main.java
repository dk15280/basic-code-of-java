
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(121));
    }
    public static int sumFirstAndLastDigit(int number)
    {

        if (number<0)
        {
            return  -1;
        }
       int sum = 0;
        while(number!=0)
        {
int temp = number;
            int digit = number%10;
            sum = sum+digit;
            temp = number/10;

        }


        return sum;
    }
}
