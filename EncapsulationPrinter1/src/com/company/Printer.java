package com.company;

public class Printer {

    private int tonerLevel;
    private int noOfPagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int noOfPagePrinted, boolean duplex) {
        if (tonerLevel>-1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.noOfPagePrinted = noOfPagePrinted;
        this.duplex = duplex;
    }

    public int addtoner(int tonerAmount) {
        // System.out.println(" Remaining toner level = " +tonerLevel);
        if (tonerAmount > 0 && tonerAmount <=100) {
            if (this.tonerLevel + tonerAmount > 100) {
                 return  -1;
            }
            tonerLevel = tonerLevel+tonerAmount;
            return tonerLevel;

        }else {
            return -1;
        }
    }
    public int Printpage( int pages)
    {
         int printingpages = pages;
         if (this.duplex)
         {
            printingpages /= 2;
             System.out.println(" Printing in duplex mode");
         }
        this.noOfPagePrinted += printingpages;
         return noOfPagePrinted;
    }



    public int getNoOfPagePrinted() {
        return noOfPagePrinted;
    }


}
