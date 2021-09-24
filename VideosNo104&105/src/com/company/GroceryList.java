package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();
    public void addgroceryItem(String imem)
    {
        groceryList.add(imem);
    }
    public void printgroceryList() {
        System.out.println(" you have " + groceryList.size() + " items in the grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }
    public void modifygroceryItem(String currentItem,String newItem)
    {
        int position = findItem(currentItem);
        if(position>=0)
        {
            modifygroceryItem(position,newItem);
        }
    }
    private void modifygroceryItem(int position,String newItem)
    {
        groceryList.set(position,newItem);
        System.out.println(" Grocery Item "+(position+1)+" has been modified");
    }
    public void removegroceryItem(String item)
    {
        int position = findItem(item);
        if(position>=0)
        {
            removegroceryItem(position);
        }
    }
    private void removegroceryItem(int position)
    {
        groceryList.remove(position);
    }
    private int findItem(String searchItem)
    {
        return groceryList.indexOf(searchItem);

        }
        public boolean onFile(String searchItem)
        {
            int position = findItem(searchItem);
            if(position>=0)
            {
                return true;
            }
            return false;
        }
    }

