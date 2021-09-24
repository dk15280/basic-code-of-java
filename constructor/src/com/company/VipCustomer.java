package com.company;

public class VipCustomer {

    private String name;
    private double credit_limit;
    private String emailaddress;

    public VipCustomer(){
        this("aryan",5000.0,"aryan1855@gmail.com");
        System.out.println(" Empty constructor called");
    }
    public VipCustomer(String name,double credit_limit)
    {
        System.out.println(" Constructor with parameter is called");
        this.name = name;
        this.credit_limit = credit_limit;

    }
    public VipCustomer(String name,double credit_limit,String emailaddress)
    {

        System.out.println(" This is 3rd constructor");
        this.name = name;
        this.credit_limit = credit_limit;
        this.emailaddress = emailaddress;
    }
    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
