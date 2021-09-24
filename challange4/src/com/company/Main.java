package com.company;

public class Main {

    public static void main(String[] args) {

     String abc =   getDurationString(700,55);
        System.out.println(abc);
       String xyz = getDurationString(500000);
        System.out.println(xyz);
    }
    private static String getDurationString(int minutes,int seconds)
    {
       if((minutes < 0) || (seconds < 0) || (seconds > 59))
       {
           return "Invalid value";

       }
            int hour =  minutes/60;
            int remainingminutes = minutes%60;

           return hour + " h " + remainingminutes +" m " +seconds +" s ";
    }
    private static String getDurationString(int seconds)
    {
        if(seconds < 0)
        {
            return "Invalid value";
        }
        int minutes = seconds/60;
        int remainingseconds = seconds%60;

        return getDurationString(minutes,remainingseconds);
    }
}
