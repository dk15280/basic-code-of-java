package com.company;

public class car extends vehicle {

    private int gears;
    private int doors;
    private int wheels;
    private boolean ismanual;
    private int currentgear;

    public car(String name, String size, int gears, int doors, int wheels, boolean ismanual) {
        super(name, size);
        this.gears = gears;
        this.doors = doors;
        this.wheels = wheels;
        this.ismanual = ismanual;
        this.currentgear = 1;
    }

    public void changrgear(int currentgear) {
        this.currentgear = currentgear;
        System.out.println(" car setcurrentgear(). changed to " + this.currentgear + " grar ");
    }
    public void changevelocity(int speed,int direction)
    {
        System.out.println(" car .changeVelocity() : velocity " + speed  +" direction "  + direction);
        move(speed, direction);
    }
}
