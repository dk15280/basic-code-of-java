package com.company;

//import java.util.Arrays;

public class Main {


       public static void main(String[] args){


           int count = 0;
           String a = "My Dhananjay name is Dhananjay Dhananjay kumar";
           String[] b = a.split(" ");
           for(int i =0;i< b.length;i++)
           {
               if(b[i].equals("Dhananjay"))
               {
                   count++;
               }
           }
           System.out.println(count);
    }
}
