package com.andrijaskontra.zadatak_1.model;

public class PowerToCalculation implements Calculation{

    @Override
    public double calculate(double firstNum, double secondNum) {

        float result;
        System.out.println("Casting -> " + secondNum + " to int type!");
        int secondNumInt = (int) secondNum;
        result = (float) Math.pow(firstNum, secondNumInt);

        return result;
    }

    @Override
    public String toString() {
        return "PowerToCalculation";
    }
}
