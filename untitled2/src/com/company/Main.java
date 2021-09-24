package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("Model is " +porsche.getModel());
        porsche.setDoors(4);
        System.out.println("Number of doors are :" +porsche.getDoors());
        porsche.setColour("Red");
        System.out.println("Colour is " +porsche.getColour());
        porsche.setWheels(4);
        System.out.println("Number of Wheels are :" +porsche.getWheels());
    }
}
