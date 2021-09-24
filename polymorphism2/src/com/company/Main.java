package com.company;

import java.util.concurrent.Callable;

class Car{
     private String name;
     private int wheels;
     private int cylienders;
     private boolean engine;

     public Car(String name,  int cylienders) {
         this.name = name;
         this.wheels = 4;
         this.cylienders = cylienders;
         this.engine = true;
     }

     public String getName() {
         return name;
     }

     public int getCylienders() {
         return cylienders;
     }

     public String startEngine()
     {
         return "Car -> StartCar() ";
     }
     public String accelerate()
     {
          return " Car -> Accelerate() ";
     }
     public String brake()
     {
          return "Car -> Brake()";
     }
 }
 class honda extends Car{

     public honda(String name, int cylienders) {
         super(name, cylienders);
     }

     @Override
     public String startEngine() {
         return "Honda -> StartCar()";
     }

     @Override
     public String accelerate() {
         return "Honda -> Accelerate()";

     }

     @Override
     public String brake() {
         return "Honda -> Brake()";

     }
 }
 class bmw extends Car{
     public bmw(String name, int cylienders) {
         super(name, cylienders);
     }

     @Override
     public String startEngine() {
         return "BMW -> StartCar()";
     }

     @Override
     public String accelerate() {
         return " BMW -> Accelerate() ";
     }

     @Override
     public String brake() {
         return "BMW -> Brake()";
     }
 }
 class maruti extends Car{
     public maruti(String name, int cylienders) {
         super(name, cylienders);
     }

     @Override
     public String startEngine() {
         return "Maruti -> StartCar()";
     }

     @Override
     public String accelerate() {
         return " Maruti -> Accelerate() ";
     }

     @Override
     public String brake() {
         return "Maruti -> Brake()";
     }
 }


public class Main {

    public static void main(String[] args) {

       Car car = new Car("Car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        honda h = new honda("HondaCity",6);
        System.out.println(h.startEngine());
        System.out.println(h.accelerate());
        System.out.println(h.brake());
        bmw b= new bmw("BMW456",10);
        System.out.println(b.startEngine());
        System.out.println(b.accelerate());
        System.out.println(b.brake());
        maruti m = new maruti("Maruti tesla", 5);
        System.out.println(m.startEngine());
        System.out.println(m.accelerate());
        System.out.println(m.brake());

        System.out.println(" Number of cyliender are = "+car.getCylienders());

    }
}
