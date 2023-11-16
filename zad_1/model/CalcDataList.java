package com.andrijaskontra.zadatak_1.model;

import java.util.ArrayList;

public class CalcDataList {

    private ArrayList<CalcData> calcDataList;

    public CalcDataList() {
        calcDataList = new ArrayList<>();
    }

    public void addCalcData(CalcData calcData) {
        calcDataList.add(calcData);
    }

    public ArrayList<CalcData> getCalcDataList() {
        return calcDataList;
    }
}
