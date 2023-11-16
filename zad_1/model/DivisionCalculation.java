package com.andrijaskontra.zadatak_1.model;

public class DivisionCalculation implements Calculation{

    @Override
    public double calculate(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    @Override
    public String toString() {
        return "DivisionCalculation";
    }
}
