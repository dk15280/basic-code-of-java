package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer aaa = new VipCustomer();
        System.out.println(" Name : " + aaa.getName());
        System.out.println(" Credit_limit : " + aaa.getCredit_limit());
        System.out.println(" Email_address : " + aaa.getEmailaddress());

        VipCustomer bbb = new VipCustomer("aaaaaaa",90000.0,"dhananjay15280@gmail.com");
        System.out.println(bbb.getName());
        System.out.println(bbb.getCredit_limit());
        System.out.println(bbb.getEmailaddress());
    }
}
