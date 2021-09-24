package com.company;

public class Main {

    public static void main(String[] args) {

      int newscor =  calculatescor("dhananjay",500);
        System.out.println(" New scor is :"  +newscor);
         calculatescor(100);
        calculatescor();

       double centimeters = calcFeetAndInchesToCentimeters(66,10);
       if(centimeters<0.0)
       {
           System.out.println("Invalid parameter");
       }
        calcFeetAndInchesToCentimeters(100);
    }
    public static int calculatescor(String playername,int scor)
    {
        System.out.println(" player " + playername + " scored " + scor + " points ");
        return scor*1000;
    }
    public static int calculatescor(int scor)
    {
        System.out.println("unnamed player scored " + scor + " points ");
        return scor*1000;
    }
    public static int calculatescor()
    {
        System.out.println("unnamed player with no score points ");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double Feet,double inches)
    {
        if((Feet<0) || (inches < 0) || (inches > 12) )
        {
            System.out.println("Invalid feet and inches parameters");
            return -1;
        }
       double centimeters = (Feet * 12) * 2.54;
        centimeters += inches*2.54;
        System.out.println(Feet + "feet" + inches +"inches" +" is equals to " + centimeters + " centimeters ");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches < 0)
        {
            return -1;

        }
        double Feet = (int) inches/12;
        double remaininginches = (int) inches%12;
        System.out.println(inches + " inches is equals to " + Feet + " feet and  " +remaininginches +" inches ");
        return calcFeetAndInchesToCentimeters(Feet,remaininginches);
    }

}
