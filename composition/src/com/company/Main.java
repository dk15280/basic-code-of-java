package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case thecase = new Case("AB12","ACER","ALPHA",dimensions);
        Resolution theresolution = new Resolution(1800,2100);
        monitor theMonitor = new monitor("DELL","AC125",24,theresolution);
        motherboard theMotherboard = new motherboard("AD123","INTEL",4,2,"Windows");
        PC thePC = new PC(thecase,theMonitor,theMotherboard);;
        thePC.getTheMonitor().drawPixelAt(1800,2100,"Yellow");
        thePC.getTheMotherboard().loadprogram("windows 10");
        thePC.getTheCase().PressPowerBottin();
        thePC.getTheMotherboard().getCardSlots();

    }
}
