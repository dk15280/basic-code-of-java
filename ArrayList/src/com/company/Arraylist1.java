package com.company;




import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Arraylist1 {
    ArrayList<Integer> ar = new ArrayList<>();
    void AddInteger(int a){
        ar.add(a);
        System.out.println(ar);
    }
    void RemoveItem(int position)
    {
        ar.remove(position);
        System.out.println(ar);
    }
    void GetIndex(int index)
    {
        ar.get(index);
        System.out.println(ar);
    }


}
