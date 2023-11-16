package com.andrijaskontra.zadatak_1.data_save_load;

import com.andrijaskontra.zadatak_1.model.CalcData;

import java.io.File;
import java.util.ArrayList;

public interface SaveLoadStrategy {

    void save(String filepath, String arrayAsString);

    String load(File file);
}
