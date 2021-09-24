package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " +result);
        int previousresult = result;
        System.out.println("previousresult = " +previousresult);

        result = result -1;
        System.out.println("result - 1 = " + result);

        result = result * 10;
        System.out.println("result * 10 = " +result);

        result = result / 5;
        System.out.println("result / 5 = " + result);

        result = result % 3;
        System.out.println("result % 3 = " + result);

        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " +result);

        result--;
        System.out.println("2 - 1 = " + result);
        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " +result);

        result /=3;
        System.out.println("30 / 3 = " + result);
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens");
        }

        int topscore = 80;
        if(topscore < 100)
        {
            System.out.println("you got the high scor!");
        }
        int secondscor = 81;
        if((topscore >secondscor) && (topscore < 100))
        {
            System.out.println("Greater than second top score and less 100");
        }
        if((topscore > 90) || (secondscor <=90))
        {
            System.out.println("Either or both of the condition are true");
        }
        int newvalue = 50;
        if(newvalue == 50)
        {
            System.out.println("This is true");

        }
        boolean iscar = false;
        if(iscar)
        {
            System.out.println("This is not suppose to happen");
        }
        iscar = true;
        boolean wascar = iscar ? true : false;
        if(wascar){
            System.out.println("wascar is true");
        }
    }
}
