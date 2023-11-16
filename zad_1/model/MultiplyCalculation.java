package com.andrijaskontra.zadatak_1.model;

public class MultiplyCalculation implements Calculation{

    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    @Override
    public String toString() {
        return "MultiplyCalculation";
    }
}
