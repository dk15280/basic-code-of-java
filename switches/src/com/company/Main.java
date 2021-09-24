package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        if(a == 1)
        {
            System.out.println("value of a was 1");
        }
        else if(b == 2)
        {
            System.out.println("value of b was 2");
        }
        else
        {
            System.out.println("value of a was otherthan 1 and 2");
        }


        int switchvalue = 1;
        switch (switchvalue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:

                System.out.println("value was 3 or 4 or 5");
                System.out.println("actually value of switchvalue was " +switchvalue);
                break;
            default:
                System.out.println("value was not 1 and 2");
                break;
        }
        char charvalue = 'A';
        switch (charvalue)
        {
            case 'A':
                System.out.println("char value was A");
                break;

            case 'B':
                System.out.println("char value was B");
                break;
            case 'C':
                System.out.println("char value was C");
                break;
            case 'D':
                System.out.println("char value was D");
                break;
            case 'E':
                System.out.println("char value was E ");
                break;
            default:
                System.out.println("char value was other than A,B,C,D,E");
                break;
        }
        String month = "March";
        switch (month.toLowerCase())
        {
            case "january":
                System.out.println("Jan");
                break;
            case "march":
                System.out.println("march");
                break;
            default:
                System.out.println("not true");


        }
    }
}
