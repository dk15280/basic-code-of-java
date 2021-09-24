package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> linkedList = new LinkedList<String>();
        IntAddNewCity(linkedList,"Bihar");
        IntAddNewCity(linkedList,"Delhi");
        IntAddNewCity(linkedList,"Hydrabad");
        IntAddNewCity(linkedList,"Pune");
        IntAddNewCity(linkedList,"Mumbai");
        IntAddNewCity(linkedList,"Kalyan");
        printvalue(linkedList);

        IntAddNewCity(linkedList,"Mumbai");
        IntAddNewCity(linkedList,"Kolkata");


        printvalue(linkedList);
        printvalue(linkedList);

    }
    public static void printvalue(LinkedList<String> li)
    {
        Iterator<String> i = li.iterator();
        while (i.hasNext())
        {
            System.out.println(" Now visiting " + i.next());
        }
        System.out.println("=========================================================");
    }
    public static boolean IntAddNewCity(LinkedList<String> li,String newCity)
    {
        ListIterator<String> listIterator = li.listIterator();
        while (listIterator.hasNext())
        {
            int comparision = listIterator.next().compareTo(newCity);
            if(comparision==0)
            {
                System.out.println(newCity +" is already included in the destination ");
                return false;
            }
            else if(comparision>0)
            {
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }
            else if(comparision<0)
            {

            }
        }
        listIterator.add(newCity);
        return true;
    }
    public static void Printmenu()
    {
        System.out.println("Available action:\n press");
        System.out.println("0 to quit \n" +
                           "1 go to next city \n"+
                           "2 go to privious city\n"+
                           "3 print the menu option");
    }
}
