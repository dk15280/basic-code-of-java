package com.company;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken , desk phone does not have a power botton ");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println(" Now ringig " + phoneNumber + " on desk phone ");
    }

    @Override
    public void answer() {
     if (isRinging)
     {
         System.out.println(" Answer the desk phone ");
         isRinging = false;
     }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println(" Ring ring ");
        }else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRringing() {
        return isRinging;
    }
}
