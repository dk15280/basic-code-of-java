package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String colour;

    public void setModel(String model){
        this.model = model;
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("comedore")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public String getModel(){
        return this.model;
    }
    public int getDoors(){
        return this.doors;
    }
    public String getColour(){
        return this.colour;
    }
    public int getWheels(){
        return this.wheels;
    }

}
