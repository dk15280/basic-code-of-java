package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);

        DayOfTheWeekChallenge(0);
        DayOfTheWeekChallenge(1);
        DayOfTheWeekChallenge(2);
        DayOfTheWeekChallenge(3);
        DayOfTheWeekChallenge(4);
        DayOfTheWeekChallenge(5);
        DayOfTheWeekChallenge(6);
        DayOfTheWeekChallenge(7);

    }
    public static void printDayOfTheWeek(int day)
    {
        switch (day)
        {
            case 0:
                System.out.println("The day is sunday");
                break;
            case 1:
                System.out.println("The day is monday");
                break;
            case 2:
                System.out.println("The day is tuesday");
                break;
            case 3:
                System.out.println("The day is wednesday");
                break;
            case 4:
                System.out.println("The day is thursday");
                break;
            case 5:
                System.out.println("The day is friday");
                break;
            case 6:
                System.out.println("The day is saturday");
                break;
            default:
                System.out.println("Day is outoff range");
        }
    }

    public static void DayOfTheWeekChallenge(int day)
    {

        if (day==0)
        {
            System.out.println("The day is sunday");
        }
       else if (day==1)
        {
            System.out.println("The day is monday");
        }
        else if (day==2)
        {
            System.out.println("The day is tuesday");
        }
       else if (day==3)
        {
            System.out.println("The day is wednesday");
        }
        else if (day==4)
        {
            System.out.println("The day is thursday");
        }
        else if (day==5)
        {
            System.out.println("The day is friday");
        }
        else if (day==6)
        {
            System.out.println("The day is saturday");
        }
        else
        {
            System.out.println("Invalid day");
        }
    }
}
