package com.company;

public class PC {
    private Case theCase;
    private monitor theMonitor;
    private motherboard theMotherboard;

    public PC(Case theCase, monitor theMonitor, motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public monitor getTheMonitor() {
        return theMonitor;
    }

    public motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
