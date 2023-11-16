package com.andrijaskontra.zadatak_1.data_save_load;

import com.andrijaskontra.zadatak_1.model.*;
import com.andrijaskontra.zadatak_1.utility.UtilityForArrays;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinFileManager implements SaveLoadStrategy{


    @Override
    public void save(String filepath, String arrayAsString) {
        List<CalcData> calcDataList = new ArrayList<>();

        // chat-gpt pomaze s ovom metodom
        Pattern pattern = Pattern.compile
                ("CalcData\\{firstNum=(\\d+\\.\\d+), secondNum=(\\d+\\.\\d+), calculation=([a-zA-Z]+), result=(\\d+\\.\\d+)\\}");

        Matcher matcher = pattern.matcher(arrayAsString);

        while (matcher.find()) {
            double firstNum = Double.parseDouble(matcher.group(1));
            double secondNum = Double.parseDouble(matcher.group(2));
            String calculationStr = matcher.group(3);
            double result = Double.parseDouble(matcher.group(4));

            Calculation calculation;
            switch (calculationStr) {
                case "AddCalculation":
                    calculation = new AddCalculation();
                    break;
                case "MultiplyCalculation":
                    calculation = new MultiplyCalculation();
                    break;
                case "PowerToCalculation":
                    calculation = new PowerToCalculation();
                    break;
                case "SubtractCalculation":
                    calculation = new SubtractCalculation();
                    break;
                case "DivideCalculation":
                    calculation = new DivisionCalculation();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported calculation type: " + calculationStr);
            }

            CalcData calcData = new CalcData(firstNum, secondNum, calculation);
            calcDataList.add(calcData);
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filepath);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

            out.writeObject(calcDataList);
            out.close();
            fileOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String load(File file) {

        try {
            FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            ArrayList<CalcData> calcDataList = (ArrayList<CalcData>) in.readObject();
            in.close();
            fileInputStream.close();
            return UtilityForArrays.getCalcDataListAsString(calcDataList);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Binary file";
    }
}
