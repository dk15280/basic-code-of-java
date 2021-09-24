package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double x,double y)
    {
        real = this.real +x;
        imaginary = this.imaginary+y;
    }
    public void add(ComplexNumber c)
    {
        add(c.real,c.imaginary);
    }
    public void subtract(double x,double y)
    {
        real = this.real-x;
        imaginary = this.imaginary-y;
    }
    public void subtract(ComplexNumber c)
    {
        subtract(c.real,c.imaginary);
    }
}
