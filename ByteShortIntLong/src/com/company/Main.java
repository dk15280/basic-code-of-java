package com.company;

import java.sql.SQLOutput;

public class Main{

      public static void main(String[] args)
      {
          int muvalue = 10000;
          int myminintegervalue = Integer.MIN_VALUE;
          int mymaxintegervalue = Integer.MAX_VALUE;
          System.out.println("my min integer value=" + myminintegervalue);
          System.out.println("my max integer value=" + mymaxintegervalue);
          System.out.println("busted max value = " + (mymaxintegervalue + 1));
          System.out.println("busted min value = " + (myminintegervalue - 1));

          int myMaxtest = 2147483647;

          byte mybyteminvalue = Byte.MIN_VALUE;
          byte mybytemaxvalue = Byte.MAX_VALUE;
          System.out.println("my byte min value = " +mybyteminvalue);
          System.out.println("my byte max value = " +mybytemaxvalue);


          short myshortminvalue = Short.MIN_VALUE;
          short myshortmaxvalue = Short.MAX_VALUE;
          System.out.println("my short min value = " +myshortminvalue);
          System.out.println("my short max value = " +myshortmaxvalue);

          long mylongvalue = 100L;

          long mylongminvalue = Long.MIN_VALUE;
          long mylongmaxvalue = Long.MAX_VALUE;
          System.out.println("my shory min value = " +mylongminvalue);
          System.out.println("my long max value = " +mylongmaxvalue);

          long longbigvalue = 2147483647888888888L;
          System.out.println(longbigvalue);

          int mynewintvalue = (myminintegervalue/2);

          byte mybytenewvalue = (byte) (mybyteminvalue/2);

          short mynewshortvalue = (short) (myshortminvalue/2);

          long mynewlongvalue = (mylongminvalue/2);

          byte a = 10;
           short b = 20;
            int c = 10;
            long d = 50000L + (a*10) + (b*10) + (c*10);
          System.out.println("value of d =" + d);
      }
}