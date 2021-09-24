package com.company;

public abstract class Bird extends Animal {
    public Bird(String name)
    {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" is eating ");
    }

    @Override
    public void breathe() {
        System.out.println(" Bird can breathe in and breathe out repeatdly ");
    }
    public abstract void fly();
}
