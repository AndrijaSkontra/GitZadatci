package com.andrijaskontra.zadatak_1.utility;

import com.andrijaskontra.zadatak_1.model.CalcData;

import java.util.ArrayList;

public class UtilityForArrays {

    public static String getCalcDataListAsString(ArrayList<CalcData> calcDataList) {
        String result = "";
        for (CalcData calcData : calcDataList) {
            result += calcData.toString() + "\n===================================\n";
        }
        return result;
    }
}
