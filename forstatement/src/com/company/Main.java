package com.company;

public class Main {

    public static void main(String[] args) {

            for(int i=2;i<9;i++)
            {
                System.out.println("10000 at "+ i+"% interest " +calculateInterest(10000,i));
            }
        System.out.println("*************************************************************");
for(int i=8;i>1;i--)
{
    System.out.println("10000 at "+ i+"% interest " +calculateInterest(10000,i));
}
        System.out.println("*****************************************************************");
         boolean newval = Isprime(50);
        System.out.println(" Is it prime :" +newval);

       int count = 0;

           for (int i = 10; i < 50; i++) {
               if (Isprime(i)) {
                   count++;
                   System.out.println("Number " + i + " is prime number ");
                   if(count == 11)
                   {
                       System.out.println("Exiting the for loop");
                       break;
                   }
               }
           }
    }
    public static double calculateInterest(double amount,double Interestrate) {


        return (amount * (Interestrate / 100));
    }
    public static boolean Isprime(int n)
    {
        if (n==1)
        {
            return false;
        }
        for(int i=2;(long)i<=Math.sqrt(n);i++)        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;
    }

}
