package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(100,1000));
    }
    public static boolean isOdd(int a)
    {
        if(a<0)
        {
            return false;
        }
        else if(a % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static int sumOdd(int start,int end)
    {
        int sum = 0;
        for(int i=start;i<=end;i++)
        {
          if(isOdd(i))
          {
              sum = sum +i;
              //return sum;
          }
        }
        if((end<start) || (start < 0) || (end < 0))
        {
            return  -1;
        }
        return  sum;
    }

}
