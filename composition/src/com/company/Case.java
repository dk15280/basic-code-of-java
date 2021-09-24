package com.company;

import java.awt.*;

public class Case {
    private String Model;
    private String Manufacturer;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String Model,String Manufacturer,String powersupply,Dimensions dimensions)
    {
        this.Model = Model;
        this.Manufacturer = Manufacturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }
    public void PressPowerBottin()
    {
        System.out.println(" Press Power Supply Botton " );
    }
    public String getModel()
    {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
