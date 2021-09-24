package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("State Bank of India");
        bank.addBranch("Pandarak");
        bank.addCustomer("Pandarak","Dhananjay Kumar ",5000);
        bank.addCustomer("Pandarak","Angira prasad",20000.0);
        bank.addCustomer("Pandarak","Dhramveer prasad",100000.0);
        bank.addBranch("Barh");
        bank.addCustomer("Barh","Kajal ",2000.0);
        bank.addCustomer("Barh","Angira prasad",3000.0);
        bank.addCustomer("Barh","Arvind kumar",50000000.0);
        bank.addCustomerTransaction("Pandarak","Dhananjay Kumar ",500000);
        bank.addCustomerTransaction("Barh","Kajal ",2000.0);
        bank.listCustomers("Pandarak",true);
        bank.listCustomers("Barh",true);


    }
}
