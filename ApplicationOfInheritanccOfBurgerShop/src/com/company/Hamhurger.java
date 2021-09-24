package com.company;

public class Hamhurger {
    private String name;
    private String breadrolltype;
    private String meat;
    private double price;

    private String additional1Item1Name;
    private double additional1Iten1Price;

    private String additional2Item1Name;
    private double additional2Iten1Price;

    private String additional3Item1Name;
    private double additional3Iten1Price;

    private String additional4Item1Name;
    private double additional4Iten1Price;


    public Hamhurger(String name, String breadrolltype, String meat, double price) {
        this.name = name;
        this.breadrolltype = breadrolltype;
        this.meat = meat;
        this.price = price;
    }

    public void AdditionalItem1(String name,double price)
    {
        this.additional1Item1Name = name;
        this.additional1Iten1Price = price;

    }
    public void AdditionalItem2(String name,double price)
    {
        this.additional2Item1Name = name;
        this.additional2Iten1Price = price;

    }
    public void AdditionalItem3(String name,double price)
    {
        this.additional3Item1Name = name;
        this.additional3Iten1Price = price;

    }
    public void AdditionalItem4(String name,double price)
    {
        this.additional4Item1Name = name;
        this.additional4Iten1Price = price;

    }
    public double ItemizeHamburger()
    {
       double hamburgerpricr = this.price;
        System.out.println(this.name +" Hamburger " + " on a "+ this.breadrolltype +" Roll " + " price is " + this.price);
        if(additional1Item1Name != null)
        {
            hamburgerpricr += this.additional1Iten1Price;
            System.out.println(" Added " +this.additional1Item1Name + " on extra " + this.additional1Iten1Price);
        }
        if(additional2Item1Name != null)
        {
            hamburgerpricr += this.additional2Iten1Price;
            System.out.println(" Added " +this.additional2Item1Name + " on extra " + this.additional2Iten1Price);
        }
        if(additional3Item1Name != null)
        {
            hamburgerpricr += this.additional3Iten1Price;
            System.out.println(" Added " +this.additional3Item1Name + " on extra " + this.additional3Iten1Price);
        }
        if(additional4Item1Name != null)
        {
            hamburgerpricr += this.additional4Iten1Price;
            System.out.println(" Added " +this.additional4Item1Name + " on extra " + this.additional4Iten1Price);
        }
        return hamburgerpricr;
    }
}
