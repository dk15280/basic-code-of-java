package com.company;

public class Main {

    public static void main(String[] args) {

          Printer printer = new Printer(60,0,false);
        System.out.println(" Initial page count " + printer.getNoOfPagePrinted());
        int noOfPagePrinted = printer.Printpage(4);
        System.out.println(" Pages printed was = " + noOfPagePrinted + " No of total count = " + printer.getNoOfPagePrinted());

        noOfPagePrinted = printer.Printpage(2);
        System.out.println(" Pages printed was " + noOfPagePrinted + " and No of total count = " + printer.getNoOfPagePrinted());
    }
}
