package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone dkphone;
        dkphone = new DeskPhone(123456);
        dkphone.powerOn();
        dkphone.callPhone(123456);
        dkphone.answer();


        dkphone = new MobilePhone(789456);
        dkphone.powerOn();
        dkphone.callPhone(789456);
        dkphone.answer();

    }
}
