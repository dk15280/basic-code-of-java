package com.company;

public class Outlander extends car {
    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super(" Outlander ", " 4WD ", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }
    public void acclerate(int rate)
    {
        int newVelocity = getCurrentvelocity() + rate;
        if (newVelocity==0)
        {
            stop();
            changrgear(1);
        }
        else if(newVelocity>0 && newVelocity<=10)
        {
            changrgear(1);
        }
        else if (newVelocity>10 && newVelocity<=20)
        {
            changrgear(2);
        }
        else if (newVelocity>20 && newVelocity<=30)
        {
            changrgear(3);
        }
        else {
            changrgear(4);
        }
        if (newVelocity>0)
        {
            changevelocity(newVelocity,getCurrentDirection());
        }
    }
}
