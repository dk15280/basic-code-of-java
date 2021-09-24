package com.company;

public class vehicle {
    private String name;
    private String size;

    private int currentvelocity;
    private int currentDirection;
    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentvelocity = 0;
        this.currentDirection = 0;

    }
    public void steer(int direction)
    {
        this.currentDirection += direction;
        System.out.println(" vecale steer(). steering at " + currentDirection + " degree ");
    }
    public void move(int velocity,int direction)
    {
        currentvelocity = velocity;
        currentDirection = direction;
        System.out.println(" vehicle move(). moving at " + currentvelocity + " in the direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop()
    {
        this.currentvelocity = 0;
    }
}