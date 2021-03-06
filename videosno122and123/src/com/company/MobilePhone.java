package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up ");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println(" Now ringig " + phoneNumber + " on Mobile phone ");
        }else {
            System.out.println(" Mobile phone switched off ");

        }

    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println(" Answer the Mobile phone ");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn)
        {
            isRinging = true;
            System.out.println(" Melody ring ");
        }else {
            isRinging = false;
            System.out.println(" Mobile phone is off");
        }
        return isRinging;
    }

    @Override
    public boolean isRringing() {
        return isRinging;
    }
}

