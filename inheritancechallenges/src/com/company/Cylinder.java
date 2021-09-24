package com.company;

import java.awt.geom.Area;

public class Cylinder extends Circle {

    private double height =0;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height>0) {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }


    public double getVolume()
    {
        double Volume = getArea()*height;
        return Volume;
    }


}
