package com.company;

public class DeluxHamburger extends Hamhurger {
    public DeluxHamburger() {
        super("Delux ","White", " Sausage & Bacon", 14.25);
        super.AdditionalItem1(" Chips",2.5);
        super.AdditionalItem2("Drink",1.81);
    }

    @Override
    public void AdditionalItem1(String name, double price) {
        System.out.println(" Can not add additional item to a delux burger");
    }

    @Override
    public void AdditionalItem2(String name, double price) {
        System.out.println(" Can not add additional item to a delux burger");
    }

    @Override
    public void AdditionalItem3(String name, double price) {
        System.out.println(" Can not add additional item to a delux burger");

    }

    @Override
    public void AdditionalItem4(String name, double price) {
        System.out.println(" Can not add additional item to a delux burger");

    }
}
