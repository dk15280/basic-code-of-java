package com.company;

public class HealthyBurger extends Hamhurger {
    private String healthyburger1Name;
    private double healthyburger1Price;

    private String healthyburger2Name;
    private double healthyburger2Price;

    public HealthyBurger(String name, String breadrolltype, String meat, double price) {
        super("Healthy", "Brown Rye", meat, price);
    }
    public void addHealthAddition1(String name,double price)
    {
        this.healthyburger1Name = name;
        this.healthyburger1Price = price;
    }
    public void addHealthAddition2(String name,double price)
    {
        this.healthyburger2Name = name;
        this.healthyburger2Price = price;
    }

    @Override
    public double ItemizeHamburger() {
        double hamburgerprice = super.ItemizeHamburger();
        if(healthyburger1Name != null)
        {
            hamburgerprice += healthyburger1Price;
            System.out.println(" Added "+ this.healthyburger1Name +" for an extra "+ this.healthyburger1Price);
        }

        if(healthyburger2Name != null)
        {
            hamburgerprice += healthyburger2Price;
            System.out.println(" Added "+ this.healthyburger2Name +" for an extra "+ this.healthyburger2Price);
        }
        return hamburgerprice;
    }
}
