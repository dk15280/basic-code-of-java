package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static void countFre(int[] a,int n)
    {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(a[i]))
            {
                m.put(a[i],m.get(a[i]) + 1);
            }
            else
            {
                m.put(a[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        countFre(a,n);

    }
}
