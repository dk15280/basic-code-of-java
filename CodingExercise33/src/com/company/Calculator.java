package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost()
    {
        double TotalCost = floor.getArea()*carpet.getCost();
        return TotalCost;
    }
}
