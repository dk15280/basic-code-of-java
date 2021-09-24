package com.company;

public class Bankaccount {
    private String Number;
    private double balance;
    private String name;
    public String email;
    public String phonenumber;

    public Bankaccount()
    {
        this("58967",2.50,"Aryan","aryan08251@gmail.com","9529899618");
        System.out.println("Empty constructor called");
    }
    public Bankaccount(String Number,double balance,String name,String email,String phonenumber)
    {
        System.out.println("Bankaccount constructor with parameter called");
        this.Number = Number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    public Bankaccount(String name,String email,String phonenumber){
        this("999999",100.55,name,email,phonenumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(" Deposit of " +depositAmount +" Made New balance is " +this.balance);

    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <= 0){
            System.out.println(" only " + this.balance + " available, withdrawal not processed ");
        }else
        {
            this.balance -= withdrawalAmount;
            System.out.println(" withdrawal of " + withdrawalAmount + " processed, Remaining balance " + this.balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}