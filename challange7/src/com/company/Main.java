package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of digids of 125 = " +sumDigits(125));
        System.out.println("The sum of digids of 4 = " +sumDigits(4));

        System.out.println("The sum of digids of -125 = " +sumDigits(-125));

        System.out.println("The sum of digids of 1234582546 = " +sumDigits(1234582546));

    }
    public static int sumDigits(int number)
    {
        int sum = 0;
        if(number < 10)
        {
            return  -1;
        }
        while(number > 0)
        {
            int digit = number % 10;
            sum = sum + digit;

            number = number/10;
        }
        return sum;
    }
}
