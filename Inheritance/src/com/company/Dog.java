package com.company;

public class Dog extends Animal {

    private int eyes;
    private  int legs;
    private  int tail;
    private  int teeth;
    private String colour;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String colour) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.colour = colour;
    }
    private void chew()
    {
        System.out.println(" dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println(" Dog.eat() called ");
        chew();
        super.eat();
    }
    public void walk()
    {
        System.out.println(" Dog.walk() called");
        super.move(5);
    }
    public void run()
    {
        System.out.println(" Dog.run() called");
        super.move(15);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.movelegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
