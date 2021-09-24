package com.company;

public class Bed {

    private int height;
    private String style;
    private String sape;
    private int piller;

    public Bed(int height, String style, String sape, int piller) {
        this.height = height;
        this.style = style;
        this.sape = sape;
        this.piller = piller;
    }
    public void make()
    {
        System.out.println(" Bed -> Making ");
    }

    public int getHeight() {
        return height;
    }

    public String getStyle() {
        return style;
    }

    public String getSape() {
        return sape;
    }

    public int getPiller() {
        return piller;
    }
}
