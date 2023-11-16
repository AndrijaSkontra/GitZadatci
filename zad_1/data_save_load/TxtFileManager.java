package com.andrijaskontra.zadatak_1.data_save_load;

import java.io.*;

public class TxtFileManager implements SaveLoadStrategy{
    @Override
    public void save(String filepath, String arrayAsString) {
        System.out.println(arrayAsString);
        try {
            FileWriter fileWriter = new FileWriter(new File(filepath));
            fileWriter.write(arrayAsString);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String load(File file) {
        String result = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
        return result;
    }


    @Override
    public String toString() {
        return "Txt file";
    }
}
