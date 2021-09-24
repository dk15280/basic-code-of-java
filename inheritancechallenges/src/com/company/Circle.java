package com.company;

public class Circle {
    private double radius=0;

    public Circle(double radius) {
        if (radius>0) {
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }
    public double getArea()
    {
        double Area = radius*radius*Math.PI;
        return Area;
    }
}
