package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamhurger hamhurger = new Hamhurger("Basics","Brown","Sauces",2.5);
        hamhurger.AdditionalItem1("Tomato", 1.25);
        hamhurger.AdditionalItem2("Carrot ", 0.75);
        hamhurger.AdditionalItem3("Cheese",1.0);
        hamhurger.AdditionalItem4("Lettuce ",0.95);
        System.out.println(" Total price of burger after addition = "+hamhurger.ItemizeHamburger());
        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger"," Brown Rye"," Sauces",5.5);
        healthyBurger.addHealthAddition1("Fress Creem",0.75);
        healthyBurger.addHealthAddition2(" Cabaze ",0.85);
        System.out.println(" Total price of Healthy burger = "+healthyBurger.ItemizeHamburger());
        DeluxHamburger deluxHamburger = new DeluxHamburger();
        deluxHamburger.AdditionalItem3("Should not do this",50.23);
        deluxHamburger.ItemizeHamburger();


    }
}
