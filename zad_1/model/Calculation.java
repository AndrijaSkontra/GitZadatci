package com.andrijaskontra.zadatak_1.model;

import java.io.Serializable;

public interface Calculation extends Serializable {

    double calculate(double firstNum, double secondNum);
}
