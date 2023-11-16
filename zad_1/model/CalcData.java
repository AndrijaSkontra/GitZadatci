package com.andrijaskontra.zadatak_1.model;

import java.io.Serializable;

public class CalcData implements Serializable {

    private double firstNum;
    private double secondNum;
    private Calculation calculation;
    private double result;

    public CalcData(double firstNum, double secondNum, Calculation calculation) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.calculation = calculation;
        this.result = calculation.calculate(firstNum, secondNum);
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "CalcData{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                ", calculation=" + calculation +
                ", result=" + result +
                '}';
    }
}
