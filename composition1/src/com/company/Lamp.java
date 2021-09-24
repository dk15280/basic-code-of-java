package com.company;

public class Lamp {
    private String style;
    private String colour;
    private int globrating;
    private boolean battery;

    public Lamp(String style, String colour, int globrating, boolean battery) {
        this.style = style;
        this.colour = colour;
        this.globrating = globrating;
        this.battery = battery;
    }
    public void turnon()
    {
        System.out.println(" Lamp -> turning ON");
    }

    public String getStyle() {
        return style;
    }

    public String getColour() {
        return colour;
    }

    public int getGlobrating() {
        return globrating;
    }

    public boolean isBattery() {
        return battery;
    }
}
