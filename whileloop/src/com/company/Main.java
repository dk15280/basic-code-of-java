package com.company;

public class Main {

    public static void main(String[] args) {

        int a =4;
        int lasta = 25;
        while(a<=lasta)
        {
            a++;

            if(!isEvenNumber(a))
            {
                continue;
            }
            System.out.println(" The number is = " +a);
        }
    }
    public static boolean isEvenNumber(int a)
    {

            if(a%2==0) {
                return true;
            }
            else
            {
                return false;
            }

    }
}
