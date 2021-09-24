package com.company;

public class monitor {
    private String ManufacturingCompany;
    private String Model;
    private int size;
    private Resolution Theresolution;

    public monitor(String manufacturingCompany, String model, int size, Resolution theresolution) {
        ManufacturingCompany = manufacturingCompany;
        Model = model;
        this.size = size;
        Theresolution = theresolution;
    }
    public void drawPixelAt(int x,int y,String color)
    {
        System.out.println(" Drawing Pixel At " + x + "," + y + " in colour  " + color);
    }

    public String getManufacturingCompany() {
        return ManufacturingCompany;
    }

    public String getModel() {
        return Model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getTheresolution() {
        return Theresolution;
    }
}
