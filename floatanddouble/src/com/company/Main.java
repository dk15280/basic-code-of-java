package com.company;

public class Main {

    public static void main(String[] args) {

        float myminfloatvalue = Float.MIN_VALUE;
        float mymaxfloatvalue = Float.MAX_VALUE;

        System.out.println("my min float value = " + myminfloatvalue);
        System.out.println("my max float value = " + mymaxfloatvalue);

        double mymindoublevalue = Double.MIN_VALUE;
        double mymaxdoublevalue = Double.MAX_VALUE;

        System.out.println("my min double value = " + mymindoublevalue);
        System.out.println("my max double value = " + mymaxdoublevalue);

        int myintvalue = 5/2;
        float myfloatvalue = 5f/2f;
        double mydoublevalue = 5d/2d;
        System.out.println("Integer value =" + myintvalue);
        System.out.println("Float value =" + myfloatvalue);
        System.out.println("Double value =" + mydoublevalue);
        double mytotaldouble = (mydoublevalue) + (myfloatvalue);
        System.out.println(mytotaldouble);

        float mytotalfloat = (float) (mydoublevalue + myfloatvalue);
        System.out.println(mytotalfloat);
    }
}
