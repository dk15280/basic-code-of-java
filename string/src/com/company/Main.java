package com.company;

public class Main {

    public static void main(String[] args) {

        String mystring = "my name is Dhananjay kumar";
        System.out.println("what is your name. " +mystring);
        mystring = mystring + ".I am reading in engineering third year.";
        System.out.println(mystring);
        mystring = mystring + "\u00A9 2019";
        System.out.println(mystring);

        String Numberstring = "250.55";
        Numberstring = Numberstring + "49.95";
        System.out.println(Numberstring);

        String laststring = "10";
        int myint = 50;
        laststring = laststring + myint;
        System.out.println(laststring);

        double mydouble = 120.55d;
        laststring = laststring + mydouble;
        System.out.println(laststring);
    }
}
