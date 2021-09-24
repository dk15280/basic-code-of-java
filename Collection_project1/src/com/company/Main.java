package com.company;

import java.util.*;
//import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Integer> val = new TreeSet<>();
        val.add(1200);
        val.add(55);
        val.add(1000);
        val.add(585);
        val.add(580);
        val.add(450);
       // val.add(2,68);

        //Collections.sort(val);
       // Collections.reverse(val);
        //Collections.

       /* Set<Integer> val = new HashSet<>();
        val.add(1200);
        val.add(55);
        val.add(1000);
        val.add(585);
        val.add(580);
        val.add(450);
        val.add(255);*/

        for(int i : val)
        {
            System.out.print(i + ",");
        }
    }
}
