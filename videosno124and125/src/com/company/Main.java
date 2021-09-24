package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Player dk = new Player("dk",10,15);
        System.out.println(dk.toString());
        saveObject(dk);
        dk.setHitPoint(8);
        System.out.println(dk);
        dk.setWeapon("Knife");
        saveObject(dk);
        loadObject(dk);
        System.out.println(dk);
         ISaveable monster = new Monster("Werewolf",20,50);
        System.out.println(monster);
        saveObject(monster);

    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++)
        {
            System.out.println(" Saving " + objectToSave.write().get(i) + " to storage device ");
        }
    }
    public static void loadObject(ISaveable objectToLoad)
    {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
