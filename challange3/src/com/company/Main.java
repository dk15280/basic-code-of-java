package com.company;

public class Main {

    public static void main(String[] args) {

        double a = 20.00d;
        double b = 80.00d;
        double doubletotal = 100.00d * (a + b);
        double remainder = (doubletotal % 40.00d);
        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);
        System.out.println("value of doubletotal = " +doubletotal);
        System.out.println("remainder = " + remainder);

        boolean isnoremainder = (remainder == 0) ? true : false;
        System.out.println("isnoremainder = " +isnoremainder);
        if(isnoremainder == false)
        {
            System.out.println("Got some remainder");
        }
    }
}
