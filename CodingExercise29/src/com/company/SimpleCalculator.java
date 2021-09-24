package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult()
    {
        double sum = firstNumber + secondNumber;
        return sum;
    }
    public double getSubtractionResult()
    {
        double sub = firstNumber - secondNumber;
        return sub;
        }
        public double getMultiplicationResult()
        {
            double Mul = firstNumber*secondNumber;
            return Mul;
        }
     public double getDivisionResult()
     {
         double Div = firstNumber/secondNumber;
         if (secondNumber == 0)
         {
             return 0;
         }
         else {
             return Div;
         }
     }
}
