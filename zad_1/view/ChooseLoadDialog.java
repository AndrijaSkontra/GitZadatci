package com.andrijaskontra.zadatak_1.view;

import com.andrijaskontra.zadatak_1.data_save_load.SaveLoadStrategy;
import com.andrijaskontra.zadatak_1.model.CalcDataList;

import javax.swing.*;
import java.io.File;

public class ChooseLoadDialog extends ChooseSaveDialog{

    private String text;

    public ChooseLoadDialog(MainFrame mainFrame, String arrayAsString) {
        super(mainFrame, arrayAsString);
    }

    @Override
    protected void activateComponents() {
        okButton.addActionListener(e -> {
            SaveLoadStrategy saveLoadStrategy = (SaveLoadStrategy) saveLoadStrategyComboBox.getSelectedItem();

            JFileChooser fileChooser = new JFileChooser();
            int userSelection = fileChooser.showOpenDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File loadFromFile = fileChooser.getSelectedFile();
                text = saveLoadStrategy.load(loadFromFile);
            }

            dispose();
        });
    }

    public String getText() {
        return text;
    }
}
