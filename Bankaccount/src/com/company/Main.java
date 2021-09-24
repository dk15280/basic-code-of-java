package com.company;

public class Main {

    public static void main(String[] args) {

        Bankaccount abc = new Bankaccount();//"12345",0.00,"Dhananjay kumar","dhananjay15280@gmail.com","8292013383");
        System.out.println(" Account Number : " + abc.getNumber());
        System.out.println(" Account balance : " + abc.getBalance());
        System.out.println(" Name of account holder : " + abc.getName());
        System.out.println(" Email address of account holder : " + abc.getEmail());
        System.out.println(" Phonenumber of account holder : " + abc.getPhonenumber());
        abc.withdrawal(100.0);
        abc.deposit(50.0);
        abc.withdrawal(100.0);
        abc.deposit(51.0);
        abc.withdrawal(100.0);
        Bankaccount aaa = new Bankaccount(" Deva "," account@gmail.com "," 257796248201 ");
        System.out.println(" Account number is "  + aaa.getNumber() + " Name is " + aaa.getName() + " Email is " + aaa.getEmail() + " Phone number :" + aaa.getPhonenumber());

    }
}
