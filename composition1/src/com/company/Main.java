package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("Naurth");
        Ceiling ceiling = new Ceiling(10,20);
        Bed bed = new Bed(1,"Modern","Round",4);
        Lamp lamp = new Lamp("Modern","Red",75,false);
        Bedroom bedroom = new Bedroom("Jannat",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makebed();
        bedroom.getLamp().turnon();
        bedroom.makebed();



    }
}
